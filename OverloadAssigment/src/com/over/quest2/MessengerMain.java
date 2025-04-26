package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger messengers=new Messenger();
		String message="Hello,Welcome to JavaCourse";
		String toUserName="spriyanka1916.com";
		String Subject="Java FullStack";
		messengers.sendMail(message);
		messengers.sendMail(toUserName, message);
		messengers.sendMail(toUserName, message, Subject);

	}

}
