package com.epsoft.base.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ReturnResult {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String,Object> data = new HashMap<>();
    // 构造器私有
    private ReturnResult(){}
    // 通用返回成功
    public static ReturnResult ok(){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(ResultCodeEnum.SUCCESS.getCode());
        returnResult.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        returnResult.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return returnResult;
    }

    // 通用返回失败，未知错误
    public static ReturnResult error(){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setSuccess(ResultCodeEnum.UNKNOWN_ERROR.getSuccess());
        returnResult.setCode(ResultCodeEnum.UNKNOWN_ERROR.getCode());
        returnResult.setMessage(ResultCodeEnum.UNKNOWN_ERROR.getMessage());
        return returnResult;
    }
    // 设置结果，形参为结果枚举
    public static ReturnResult setResult(ResultCodeEnum resultCodeEnum){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setMessage(resultCodeEnum.getMessage());
        returnResult.setCode(resultCodeEnum.getCode());
        returnResult.setSuccess(resultCodeEnum.getSuccess());
        return returnResult;
    }
    /**------------使用链式编程，返回类本身-----------**/

    // 自定义返回数据
    public ReturnResult data(Map<String,Object> map){
        this.setData(map);
        return this;
    }

    // 通用设置data
    public ReturnResult data(String key,Object object){
        this.data.put(key, object);
        return this;
    }

    // 自定义状态信息
    public ReturnResult message(String message){
        this.message = message;
        return this;
    }

    // 自定义状态信息
    public ReturnResult code(Integer code){
        this.code = code;
        return this;
    }
    // 自定义状态码
    public ReturnResult success(Boolean success){
        this.success = success;
        return this;
    }
}
