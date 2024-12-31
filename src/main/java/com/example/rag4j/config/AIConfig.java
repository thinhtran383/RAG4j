package com.example.rag4j.config;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI;

@Configuration
public class AIConfig {

    @Value("${openai.api-key}")
    private String apiKey;

    @Bean
    public OpenAiChatModel model() {
        return OpenAiChatModel.builder()
                .modelName(GPT_4_O_MINI)
                .apiKey(apiKey)
                .build();
    }
}
