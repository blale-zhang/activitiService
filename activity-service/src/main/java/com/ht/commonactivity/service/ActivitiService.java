package com.ht.commonactivity.service;

import com.ht.commonactivity.common.ModelParamter;
import com.ht.commonactivity.common.RpcDeployResult;
import com.ht.commonactivity.common.RpcStartParamter;
import com.ht.commonactivity.common.result.Result;
import com.ht.commonactivity.entity.ActProcRelease;
import com.ht.commonactivity.entity.ActRuTask;
import com.ht.commonactivity.vo.FindTaskBeanVo;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ht.commonactivity.vo.TaskVo;
import com.ht.commonactivity.vo.fileTypeVo;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.task.TaskDefinition;
import org.activiti.engine.repository.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface ActivitiService {

    /**
     * 获取模型信息
     *
     * @param modelId
     * @return
     */
    public Model getModelInfo(String modelId);


    /**
     * 新增流程模型
     *
     * @param paramter
     * @return
     */
    public String addModel(ModelParamter paramter) throws Exception;


    /**
     * 流程部署，发布测试版
     *
     * @param modelId
     * @return
     * @throws Exception
     */
    public RpcDeployResult deploy(String modelId) throws Exception;

    /**
     * 流程部署，发布测试版
     *
     * @param modelId
     * @return
     * @throws Exception
     */
    public RpcDeployResult deployZip(String modelId) throws Exception;


    /**
     * 流程启动
     *
     * @param paramter
     * @return
     */
    public String startProcess(RpcStartParamter paramter);

    public ObjectNode getEditorJson(String modelId) throws Exception;

    /**
     * 保存流程定义信息
     *
     * @param modelId
     * @param values
     * @throws Exception
     */
    public void saveModel(String modelId, MultiValueMap<String, String> values) throws Exception;

    /**
     * 查询流程中变量值
     *
     * @param processId
     * @param variableName
     * @return
     */
    public List<HistoricVariableInstance> getProcessVarByDeployIdAndName(String processId, String variableName);

    /**
     * 根据变量名模糊查询变量值
     *
     * @param processId
     * @param variableName
     * @return
     */
    public List<HistoricVariableInstance> getHisProcessVarByDeployIdAndNameLike(String processId, String variableName);

    /**
     * 创建规则任务
     *
     * @param map
     */
    public void createRuleTask(Map<String, Object> map);

    /**
     * 获取下一个用户节点信息
     *
     * @param taskId
     * @return
     */
    public TaskDefinition getNextTaskInfo(String taskId, Map<String, Object> data);

    public TaskDefinition getNextTaskInfoByProcessId(String taskId);

    /**
     * 根据名称或分组查询所有任务信息
     *
     * @param taskId
     * @return
     */
    public List<ActRuTask> findTaskByAssigneeOrGroup(FindTaskBeanVo vo);

    public ActProcRelease getModelLastedVersion(String processDefinedKey);

    public ActProcRelease getModelInfo(String modelCode, String modeVersion);

    public List<fileTypeVo> getFileTypeTree();

}
