package ontarioLicenceAuthority;

public class Licenceeligibility {
	private static final 
	int age;
	String currentlevel;
	String level1 = "G1";
	String level2 = "G2";
	String level3 = "G";
	void applicant() {
		//minimum age criteria is 16
        if(age>=16) {
        currentlevel.equals("");
		System.out.println("The applicant is eligible for :"+level1);
        }
		
      if(age>=17) {
        currentlevel.equals("G1");
        	System.out.println("The applicant is eligible for :"+level2);
        }
        {
        if(currentlevel.equals("G2"))
        	System.out.println("The applicant is eligible for :"+level3);
        }
        {
       if (currentlevel.equals("G"))
		System.out.println("you have full licence");
        }
     
	}
	

}
