package com.ht.commonactivity.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * <p>
 * 
 * </p>
 *
 * @author dyb
 * @since 2018-05-31
 */
@ApiModel
@TableName("act_model_call_log")
public class ModelCallLog extends Model<ModelCallLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableField("log_id")
	@ApiModelProperty(required= true,value = "主键")
	private Long logId;
    /**
     * 业务key
     */
	@TableField("business_key")
	@ApiModelProperty(required= true,value = "业务key")
	private String businessKey;
    /**
     * 模型编码
     */
	@TableField("process_defined_key")
	@ApiModelProperty(required= true,value = "模型编码")
	private String processDefinedKey;
    /**
     * 模型版本
     */
	@ApiModelProperty(required= true,value = "模型版本")
	private String version;
    /**
     * 实例id
     */
	@TableField("pro_inst_id")
	@ApiModelProperty(required= true,value = "实例id")
	private String proInstId;
    /**
     * 模型定义id
     */
	@TableField("model_procdef_id")
	@ApiModelProperty(required= true,value = "模型定义id")
	private String modelProcdefId;
    /**
     * 所属系统编码
     */
	@TableField("sys_code")
	@ApiModelProperty(required= true,value = "所属系统编码")
	private String sysCode;
    /**
     * 流程是否完成,0-Y,1-N
     */
	@TableField("is_end")
	@ApiModelProperty(required= true,value = "流程是否完成,0-Y,1-N")
	private String isEnd;
    /**
     * 状态 0-y,1-n
     */
	@ApiModelProperty(required= true,value = "状态 0-y,1-n")
	private String status;
    /**
     * 创建时间
     */
	@TableField("cre_time")
	@ApiModelProperty(required= true,value = "创建时间")
	private Date creTime;


	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getProcessDefinedKey() {
		return processDefinedKey;
	}

	public void setProcessDefinedKey(String processDefinedKey) {
		this.processDefinedKey = processDefinedKey;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getProInstId() {
		return proInstId;
	}

	public void setProInstId(String proInstId) {
		this.proInstId = proInstId;
	}

	public String getModelProcdefId() {
		return modelProcdefId;
	}

	public void setModelProcdefId(String modelProcdefId) {
		this.modelProcdefId = modelProcdefId;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getIsEnd() {
		return isEnd;
	}

	public void setIsEnd(String isEnd) {
		this.isEnd = isEnd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreTime() {
		return creTime;
	}

	public void setCreTime(Date creTime) {
		this.creTime = creTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.logId;
	}

	@Override
	public String toString() {
		return "ModelCallLog{" +
			"logId=" + logId +
			", businessKey=" + businessKey +
			", processDefinedKey=" + processDefinedKey +
			", version=" + version +
			", proInstId=" + proInstId +
			", modelProcdefId=" + modelProcdefId +
			", sysCode=" + sysCode +
			", isEnd=" + isEnd +
			", status=" + status +
			", creTime=" + creTime +
			"}";
	}
}
