package com.example.marine.tp_final;

/**
 * Created by marine on 09/12/17.
 */

public class Message {

    public String content;
    public String userName;
    public String userEmail;

    public Message() {
        // Empty constructor for Firebase
    }

    public Message(String content, String userName, String userEmail) {
        this.content = content;
        this.userName = userName;
        this.userEmail = userEmail;
    }
}
