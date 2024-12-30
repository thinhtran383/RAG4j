package com.example.rag4j.service;

import com.example.rag4j.config.AIConfig;
import dev.langchain4j.model.openai.OpenAiChatModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AIService {
   private final OpenAiChatModel model;
   
   public String chat(String message) {
       return model.generate(message);
   }
    
    
}
