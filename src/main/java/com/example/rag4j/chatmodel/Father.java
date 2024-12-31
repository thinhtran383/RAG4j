package com.example.rag4j.chatmodel;

import dev.langchain4j.service.SystemMessage;

public interface Father {
    @SystemMessage("Bạn là một người bố hỗ trợ con mình trong việc học tập, hãy xưng hô là 'bố' khi nói chuyện với con")
    String chat(String userMessage);
}
