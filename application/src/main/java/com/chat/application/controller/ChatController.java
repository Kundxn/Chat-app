package com.chat.application.controller;

import com.chat.application.model.ChatMessage;
import com.chat.application.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/history")
    public List<ChatMessage> getChatHistory() {
        return chatService.getChatHistory();
    }
}
