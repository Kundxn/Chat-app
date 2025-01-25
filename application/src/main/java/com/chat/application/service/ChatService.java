package com.chat.application.service;

import com.chat.application.model.ChatMessage;
import com.chat.application.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    public List<ChatMessage> getChatHistory() {
        return chatMessageRepository.findAll();
    }

    public void saveChatMessage(ChatMessage message) {
        chatMessageRepository.save(message);
    }
}
