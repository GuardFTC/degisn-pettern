package com.ftc.weixintest.controller;

import cn.hutool.log.StaticLog;
import com.ftc.weixintest.service.BaseService;
import com.ftc.weixintest.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-04-21 16:28:14
 * @describe: 接入微信公众号-服务器回调Controller
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/rest/wechat")
public class BaseController {

    private final BaseService baseService;

    private final MessageService messageService;

    @GetMapping
    public String checkToken(@RequestParam String signature,
                             @RequestParam String timestamp,
                             @RequestParam String nonce,
                             @RequestParam String echostr) {
        StaticLog.info("微信公众号接入URL验证接口入参 signature=[{}],timestamp=[{}],nonce=[{}],echostr=[{}]",
                signature, timestamp, nonce, echostr);

        //1.验证
        String checkStr = baseService.checkUrl(signature, timestamp, nonce, echostr);
        StaticLog.info("微信公众号接入URL验证接口出参:[{}]", checkStr);

        //2.返回
        return checkStr;
    }

    @PostMapping
    public String receiveMessage(@RequestParam String signature,
                                 @RequestParam String timestamp,
                                 @RequestParam String nonce,
                                 @RequestBody String msgStr) {
        StaticLog.info("接收微信服务器推送消息接口入参 signature=[{}],timestamp=[{}],nonce=[{}],msgStr=[{}]",
                signature, timestamp, nonce, msgStr);

        //1.处理消息
        String responseMessage = messageService.processMessage(signature, timestamp, nonce, msgStr);
        StaticLog.info("接收微信服务器推送消息接口出参 responseMessage=[{}]", responseMessage);

        //2.返回
        return responseMessage;
    }
}
