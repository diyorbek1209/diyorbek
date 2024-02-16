package org.example.model;

import lombok.*;

public class User {
    private long chatId;
    private String fullName;
    private String username;
    private String phoneNumber;
    private BotState state;
    private double Balace;

    public User(long chatId, String fullName, String username, BotState state, double Balance) {
        this.chatId = chatId;
        this.fullName = fullName;
        this.username = username;
        this.state = state;
        this.Balace = Balance;
    }

    public User() {
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BotState getState() {
        return state;
    }

    public void setState(BotState state) {
        this.state = state;
    }

    public double getBalace() {
        return Balace;
    }

    public void setBalace(double balace) {
        Balace = balace;
    }
}
