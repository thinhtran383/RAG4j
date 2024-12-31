package com.example.rag4j.controller;

import com.example.rag4j.service.AIService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class AIController {
    private final AIService aiService;
    
    @RequestMapping("/chat")
    public String chat(String message) {
        return aiService.chat(message);
    }
    
}
