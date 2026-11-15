package com.flame.client;

public class Message {
	private String senderUsername;
	private String senderID;
	private String sendingTime;
	private String text;

	Message (String content, String time) {
		this.text = content;
		this.sendingTime = time;
	}
}
