package com.chat.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AIService {

    private final WebClient webClient;

    public AIService() {
        this.webClient = WebClient.create("https://api.openai.com/v1/chat/completions");
    }

    public String getAIResponse(String message) {
        return this.webClient.post()
                .header("Authorization", "Bearer YOUR_OPENAI_API_KEY")
                .bodyValue(buildRequest(message))
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    private Object buildRequest(String message) {
        return new Object() {
            public final String model = "gpt-4";
            public final Object[] messages = new Object[]{
                    new Object() {
                        public final String role = "user";
                        public final String content = message;
                    }
            };
        };
    }
}
