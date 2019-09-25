package com.github.weixin.demo.config;




import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: WxJava-springmvc
 * @description:
 * @author: YuHaiming(小余)
 * @create: 2019-09-24 23:23
 **/

public class WechatAccountConfig {
    private  static Properties props =new Properties();
    static {
        props = new Properties();
        InputStream in = MenuConfig.class.getClassLoader().getResourceAsStream("wx.properties");
        if (in == null) {
            throw new RuntimeException("配置文件" + "不存在");
        }
        try {
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private String mpAppId;
    private String mpAppSecret;

    public String getMpAppId() {
        return mpAppId;
    }

    public void setMpAppId(String mpAppId) {
        this.mpAppId = props.get("appId").toString();
    }

    public String getMpAppSecret() {
        return mpAppSecret;
    }

    public void setMpAppSecret(String mpAppSecret) {
        this.mpAppSecret = props.get("appSecret").toString();
    }
}
