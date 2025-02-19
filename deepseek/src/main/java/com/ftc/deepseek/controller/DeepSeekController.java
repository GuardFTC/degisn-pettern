package com.ftc.deepseek.controller;

import io.github.pigmesh.ai.deepseek.core.DeepSeekClient;
import io.github.pigmesh.ai.deepseek.core.chat.ChatCompletionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2025-02-19 15:47:06
 * @describe: DeepSeekController
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/deepseek/")
public class DeepSeekController {

    private final DeepSeekClient deepSeekClient;

    @GetMapping(value = "/chat", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ChatCompletionResponse> chat(String prompt) {
        return deepSeekClient.chatFluxCompletion(prompt);
    }
}
