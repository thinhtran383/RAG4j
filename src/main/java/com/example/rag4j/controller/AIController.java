package com.example.rag4j.controller;

import com.example.rag4j.chatmodel.Assistant;
import com.example.rag4j.model.Person;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class AIController {
    private final Assistant assistant;
    private final ChatLanguageModel chatLanguageModel;


    @GetMapping("/father/chat")
    public String father(String message, int memoryId) {
        return assistant.father(memoryId, message);
    }

    @GetMapping("/polite/chat")
    public String polite(String message) {
        return assistant.polite(message);
    }

    @GetMapping("/isPositive/chat")
    public boolean isPositive(String message) {
        return assistant.isPositive(message);
    }

    @GetMapping("/extractPersonFromText/chat")
    public ResponseEntity<Person> extractPersonFromText(String message) {
        return ResponseEntity.ok(assistant.extractPersonFromText(message));
    }

    @GetMapping("/chat")
    public String model(@RequestParam(value = "message", defaultValue = "Hello") String message) {
        return chatLanguageModel.generate(message);
    }

}
