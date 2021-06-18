package day5Homework.core.concretes;

import day5Homework.core.abstracts.GoogleServices;
import day5Homework.googleApi.GoogleApiServices;

public class JGoogleManagerAdapter implements GoogleServices {

	@Override
	public void signGoogle(String email, String Password) {

		GoogleApiServices apiServices=new GoogleApiServices();
		apiServices.open(email, Password);
		
	}

}
