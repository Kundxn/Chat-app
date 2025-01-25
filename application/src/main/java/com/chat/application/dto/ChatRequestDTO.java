package com.chat.application.dto;

public class ChatRequestDTO {
    private String sender;  // User sending the message
    private String message; // Content of the message

    // Default constructor
    public ChatRequestDTO() {}

    // Parameterized constructor
    public ChatRequestDTO(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    // Getters and Setters
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ChatRequestDTO{" +
                "sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

