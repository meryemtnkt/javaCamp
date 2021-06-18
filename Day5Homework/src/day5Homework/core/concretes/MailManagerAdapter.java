package day5Homework.core.concretes;

import day5Homework.core.abstracts.MailServices;
import day5Homework.entities.concretes.User;

public class MailManagerAdapter implements MailServices {


	@Override
	public void sendMail(User user)  {
		try {
			System.out.println(user.getEmail()+" : Maile doðrulama gönderildi");
			Thread.sleep(2000);
			verifyMail(user);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

	@Override
	public void verifyMail(User user) {
		System.out.println("Mail Dogrulandý");
		
		
	}

}
