package dayThreeHomeWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(121,"Meryem","Tankut","java");
		
		UserManager userManager=new UserManager();
		userManager.add(user1);
		userManager.login(user1);
		
		Instructor egitmen1= new Instructor(101,"Engin","Demirog","A��rl�kl� olarak Savunma Sanayisi, Bankac�l�k sekt�rlerine kurumsal yaz�l�m geli�tirme s�re�leri konusunda dan��manl�k veriyorum.",
				"Java + React");
		//egitmen1.setName("Engin");
		InstructorManager instManager= new	InstructorManager();
		instManager.aboutInstructor(egitmen1);
		
		Student student1= new Student(94,"Handan","M�ge","Mezun", 85);
		//student1.setName("Handan");
		StudentManager studentManager= new StudentManager();
		studentManager.notAdd(student1);
	}

}
