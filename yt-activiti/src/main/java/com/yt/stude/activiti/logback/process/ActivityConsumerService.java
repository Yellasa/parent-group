package com.yt.stude.activiti.logback.process;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ActivityConsumerService
 * @Author: yangting@ty
 * @CreateDate: 2018/8/27 17:24
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/8/27 17:24
 * @UpdateRemark: 更新说明
 **/
@RestController
@RequestMapping("/activityService")
public interface ActivityConsumerService
{
    /**
     * 流程demo
     * @return
     */
    @RequestMapping(value="/startActivityDemo",method= RequestMethod.GET)
    boolean startActivityDemo();

}
