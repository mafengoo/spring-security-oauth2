package com.epsoft.oauth2.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.epsoft.oauth2.web.entities.Ce01;
import org.apache.ibatis.annotations.Param;


/**
 * @Auther: mafeng
 */
public interface Ce01Mapper extends BaseMapper<Ce01> {
    Ce01 findByUserName(@Param("username") String username);
}
