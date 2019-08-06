package com.momo.momopermissionsystemcoreweb.controller.aclmanager;

import com.momo.common.common.JSONResult;
import com.momo.mapper.req.aclmanager.UserGroupPageReq;
import com.momo.service.service.aclmanager.SysEnterpriseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: momo-cloud-permission
 * @description: 企业管理
 * @author: Jie Li
 * @create: 2019-08-06 13:03
 **/
@RestController
@RequestMapping(value = "/platform/enterprise", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
@Slf4j
public class SysEnterpriseController {

    @Autowired
    private SysEnterpriseService sysEnterpriseService;

    @RequestMapping("/getUserGroupPage/v1")
    public JSONResult getUserGroupPage(@RequestBody UserGroupPageReq userGroupPageReq) {
        return JSONResult.ok(sysEnterpriseService.getUserGroupPage(userGroupPageReq));
    }

}