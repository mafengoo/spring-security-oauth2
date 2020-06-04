package com.epsoft.base.result;

import lombok.Getter;

@Getter
public enum ResultCodeEnum {
    SUCCESS(true,2000,"成功"),
    UNKNOWN_ERROR(false,2001,"未知错误"),
    PARAM_ERROR(false,2003,"参数错误");

    // 响应是否成功
    private Boolean success;
    // 响应状态码
    private Integer code;
    // 响应信息
    private String message;

    ResultCodeEnum(boolean success,Integer code,String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

}
