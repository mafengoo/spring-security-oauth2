package com.epsoft.oauth2.web.controller;

import com.epsoft.base.result.ReturnResult;
import com.epsoft.oauth2.web.entities.Ce01;
import com.epsoft.oauth2.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: mafeng
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/list")
//    @PreAuthorize("hasAuthority('product')")
    public ReturnResult list() {
        List<String> list = new ArrayList<>();
        list.add("眼镜");
        list.add("格子衬衣");
        list.add("双肩包");
        Map<String,Object> returnMap =new HashMap<String,Object>();
        returnMap.put("list",list);
        return ReturnResult.ok().data(returnMap);
    }

    @GetMapping("/userinfo")
    public ReturnResult getUserInfo(String userName){
        Ce01 ce01 = userInfoService.findByUserName(userName);
        if(null==ce01){
            return ReturnResult.ok().message("未查询到相关信息");
        }else{
            Map<String,Object> returnMap =new HashMap<String,Object>();
            returnMap.put("aac002",ce01.getAac002());
            returnMap.put("aac003",ce01.getAac003());
            returnMap.put("aae005",ce01.getAae005());
            return ReturnResult.ok().data(returnMap);
        }
    }

}
