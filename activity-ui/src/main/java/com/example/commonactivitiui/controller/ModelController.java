package com.example.commonactivitiui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ModelController {

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(value = "indexDev", method = RequestMethod.GET)
    public String index() {
        return "index-dev";
    }

    /**
     * 模型新增
     *
     * @return
     */
    @RequestMapping(value = "/addView", method = RequestMethod.GET)
    public String addView() {
        return "model/modelAdd";
    }

    /**
     * 模型编辑页面
     *
     * @return
     */
    @RequestMapping(value = "/modelEdit", method = RequestMethod.GET)
    public String modelEdit() {
        return "modeler";
    }

    /**
     * 模型列表
     *
     * @return
     */
    @RequestMapping(value = "/modelIndex", method = RequestMethod.GET)
    public String modelIndex() {
        return "model/modelIndex";
    }

    /**
     * 流程历史列表
     *
     * @return
     */
    @RequestMapping(value = "/procIndex", method = RequestMethod.GET)
    public String procIndex() {
        return "proc/procIndex";
    }

    /**
     * 流程历史明细
     *
     * @return
     */
    @RequestMapping(value = "/procDetail", method = RequestMethod.GET)
    public String procDetail() {
        return "proc/procDetail";
    }

    /**
     * 流程跳转记录
     *
     * @return
     */
    @RequestMapping(value = "/procTzHis", method = RequestMethod.GET)
    public String procTzHis() {
        return "proc/procTzHis";
    }


    /**
     * 流程审批
     *
     * @return
     */
    @RequestMapping(value = "/procAudit", method = RequestMethod.GET)
    public String procAudit() {
        return "audit/procAuditList";
    }

    /**
     * 流程办理
     *
     * @return
     */
    @RequestMapping(value = "/procBl", method = RequestMethod.GET)
    public String procBl() {
        return "audit/procBl";
    }

    /**
     * 流程回退
     *
     * @return
     */
    @RequestMapping(value = "/procBack", method = RequestMethod.GET)
    public String procBack() {
        return "audit/procBack";
    }

    /**
     * 显示流程图
     *
     * @return
     */
    @RequestMapping(value = "/showProImg", method = RequestMethod.GET)
    public String showProImg() {
        return "audit/showProImg";
    }

    /**
     * 日志列表
     *
     * @return
     */
    @RequestMapping(value = "/modelLog", method = RequestMethod.GET)
    public String modelLog() {
        return "log/modelLog";
    }

    /**
     * 日志明细
     *
     * @return
     */
    @RequestMapping(value = "/modelLogDetail", method = RequestMethod.GET)
    public String modelLogDetail() {
        return "log/modelLogDetail";
    }

    /**
     * 业务线，参数配置
     *
     * @return
     */
    @RequestMapping(value = "/businessConfig", method = RequestMethod.GET)
    public String businessConfig() {
        return "paramConfig/param_config";
    }

    /**
     * 业务线、参数新增
     *
     * @return
     */
    @RequestMapping(value = "/paramAdd", method = RequestMethod.GET)
    public String paramAdd() {
        return "paramConfig/param-config-add";
    }

    /**
     * 业务线、参数编辑
     *
     * @return
     */
    @RequestMapping(value = "/paramEdit", method = RequestMethod.GET)
    public String paramEdit() {
        return "paramConfig/param-config-edit";
    }

}
