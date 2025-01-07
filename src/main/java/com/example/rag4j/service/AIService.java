//package com.example.rag4j.service;
//
//import com.example.rag4j.chatmodel.Father;
//import dev.langchain4j.model.openai.OpenAiChatModel;
//import dev.langchain4j.service.AiServices;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class AIService {
//   private final OpenAiChatModel model;
//
//   public String chat(String message) {
//       Father friend = AiServices.create(Father.class, model);
//
//       return friend.chat(message);
//   }
//
//
//}
