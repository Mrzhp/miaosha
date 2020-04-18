package com.example.demo.Error;

/**
 * @Author PengZhang
 * @Date 2020/4/13 21:44
 * @Version 1.0
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    //主要为了不重复构造错误，比如参数不合法
    public CommonError setErrMsg(String errMsg);
}
