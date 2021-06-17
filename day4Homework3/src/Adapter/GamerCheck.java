package Adapter;

import Entities.NewGamer;

public class GamerCheck {

	public static boolean userCheck(NewGamer gamer) {
		if (!gamer.getFirstName().isEmpty()) {
			return true;
		} 
		
		return false;
		
	}
}
