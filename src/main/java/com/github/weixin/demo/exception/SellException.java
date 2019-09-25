package com.github.weixin.demo.exception;

import com.github.weixin.demo.enmu.ResultEnum;

/**
 * @program: WxJava-springmvc
 * @description:
 * @author: YuHaiming(小余)
 * @create: 2019-09-24 23:14
 **/
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
