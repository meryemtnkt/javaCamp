package day5Homework.core.abstracts;

import day5Homework.entities.concretes.User;

public interface MailServices {
	
	void sendMail(User user);
	void verifyMail(User user);

}
