package com.chat.application.dto;

public class ChatResponseDTO {
    private String response; // AI's response message

    // Default constructor
    public ChatResponseDTO() {}

    // Parameterized constructor
    public ChatResponseDTO(String response) {
        this.response = response;
    }

    // Getters and Setters
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ChatResponseDTO{" +
                "response='" + response + '\'' +
                '}';
    }
}
