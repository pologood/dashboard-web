package com.dianping.wed.monitor.web.action.monitor;

import com.dianping.wed.monitor.config.service.dto.MonitorPageConfigDTO;
import com.dianping.wed.monitor.service.MonitorService;
import com.dianping.wed.monitor.web.action.BaseAction;
import lombok.Getter;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dan.shan
 * @since 2015-07-06 17:52
 */
public class PageConfigListAction extends BaseAction {

    @Resource
    private MonitorService monitorService;

    @Getter
    List<MonitorPageConfigDTO> pageConfigs;


    @Override
    protected String doExecute() throws Exception {
        pageConfigs = monitorService.findPageConfigs();
        return SUCCESS;
    }

    @Override
    protected void doValidate() throws Exception {

    }

    @Override
    protected void doPrepare() throws Exception {

    }

}
