package com.epsoft.oauth2.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.epsoft.oauth2.web.entities.Ce01;

public interface UserInfoService extends IService<Ce01> {
    Ce01 findByUserName(String userName);
}
