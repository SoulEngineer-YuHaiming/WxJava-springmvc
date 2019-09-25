package com.github.weixin.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: sell
 * @description: 微信网页授权，手动获取用户openid
 * @author: 01
 * @create: 2018-05-15 13:35
 **/
@RestController
@RequestMapping("/weixin")
@Slf4j
class WeixinController {

    private Logger logger = LoggerFactory.getLogger(WeixinController.class);

    /**
     * 获取code
     * @param code
     */
    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        System.out.println("进入了"+code);
       /* logger.info("进入auth方法...");
        logger.info("code = {}", code);*/

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx1fd9b1e72767b520&secret=7107d7eb77ba5b7c7e484c400ee31108&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        logger.info("response = {}", response);
    }

    @GetMapping("/auth1")
    public void auth1() {
        System.out.println("进入了");
        logger.info("进入auth方法...");

    }


}
