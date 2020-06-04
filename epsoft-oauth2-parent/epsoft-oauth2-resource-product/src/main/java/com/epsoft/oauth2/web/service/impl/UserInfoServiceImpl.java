package com.epsoft.oauth2.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.epsoft.oauth2.web.entities.Ce01;
import com.epsoft.oauth2.web.mapper.Ce01Mapper;
import com.epsoft.oauth2.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<Ce01Mapper, Ce01> implements UserInfoService {

    @Autowired
    private Ce01Mapper ce01Mapper;

    @Override
    public Ce01 findByUserName(String userName) {
        Ce01 ce01 = ce01Mapper.findByUserName(userName);
        return ce01;
    }
}
