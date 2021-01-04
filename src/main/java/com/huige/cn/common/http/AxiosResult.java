package com.huige.cn.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

//异常处理

@Data
//转json的瑟吉欧鸡皮 只转值不为null的
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;

    private AxiosResult(){
    }



    //成功返回的方法
    public static <T> AxiosResult<T> success(){
        return setData(AxiosStatus.OK,null);
    }
    //成功返回的方法 带数据
    public static <T> AxiosResult<T> success(T data){
        return setData(AxiosStatus.OK,data);
    }
    //成功返回的方法 自定义状态码
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }
    //成功返回的方法 自定义状态码  带数据
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }




    //错误的返回
    public static <T> AxiosResult<T> error(){
        return setData(AxiosStatus.ERROE,null);
    }
    //错误返回的方法 带数据
    public static <T> AxiosResult<T> error(T data){
        return setData(AxiosStatus.ERROE,data);
    }
    //错误返回的方法 自定义状态码
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus){
        return setData(axiosStatus,null);
    }
    //错误返回的方法 自定义状态码  带数据
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus,T data){
        return setData(axiosStatus,data);
    }





    //封装数据公共方法
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus,T data){
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        return axiosResult;
    }
}
