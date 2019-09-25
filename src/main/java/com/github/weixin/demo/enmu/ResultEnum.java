package com.github.weixin.demo.enmu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @program: WxJava-springmvc
 * @description:
 * @author: YuHaiming(小余)
 * @create: 2019-09-24 23:09
 **/


public enum  ResultEnum {
    WECHAT_MP_ERROR(20, "微信公众账号出现异常");
    ;
    private Integer code;
    private String msg;
     ResultEnum(){


    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

     ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
