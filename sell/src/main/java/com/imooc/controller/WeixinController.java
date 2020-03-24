package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 钱坤
 * 2020/2/29 11:57
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法。。。");
        log.info("code={}", code);

        String url="https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx84a9b34259a13565&secret=e948a3553de04250205df7e9caf2d9dc&code="+code+"&grant_type=authorization_code";

        RestTemplate restTemplate=new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info(response);
    }
}
