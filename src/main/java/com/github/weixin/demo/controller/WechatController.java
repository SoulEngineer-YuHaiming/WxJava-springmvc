package com.github.weixin.demo.controller;

import com.github.weixin.demo.enmu.ResultEnum;
import com.github.weixin.demo.exception.SellException;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;


import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @program: WxJava-springmvc
 * @description:
 * @author: YuHaiming(小余)
 * @create: 2019-09-24 23:31
 **/
@Controller
@RequestMapping("/wechat")
@Slf4j
public class WechatController {

    @Autowired
    private WxMpService wxMpService;
    private Logger log = LoggerFactory.getLogger(WechatController.class);

    /**
     * 获取code参数
     *
     * @param returnUrl 需要跳转的url
     * @return
     */
    @GetMapping("/authorize")
    public String authorize(@RequestParam("returnUrl") String returnUrl) throws UnsupportedEncodingException {

        System.out.println("微信网页授权");
         String url = "https://ikcqdy.natappfree.cc/WxJava_springmvc_war_exploded/wechat/userInfo";

        // 获取微信返回的重定向url

        //String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_BASE, returnUrl);

        /*log.info("【微信网页授权】获取code，redirectUrl = {}", redirectUrl);*/

         String redirectUrl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAuth2Scope.SNSAPI_BASE, URLEncoder.encode(returnUrl));



        return "redirect:" + redirectUrl;
    }

    /**
     * 使用code参数换取access_token信息，并获取到openid
     *
     * @param code
     * @param returnUrl
     * @return
     */
    @GetMapping("/userInfo")
    public String userInfo(@RequestParam("code") String code, @RequestParam("state") String returnUrl) throws WxErrorException {
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);;

        // 从access_token信息中获取到用户的openid
        String openId = wxMpOAuth2AccessToken.getOpenId();
        log.info("【微信网页授权】获取openId，openId = {}", openId);

        // 重定向到我们要跳转的页面
        return "redirect:" + returnUrl + "?openid=" + openId;
    }
}
