package ifAndElsePack;

public class IfAndElseClass2 {

	public static void main(String[] args) {
		/*int x=20;

		if(x==5) {
			System.out.println("toy");
		}
		else if(x==10) {
			System.out.println("animal");
		}
		else {
			System.out.println("invalid");
		}*/
		
		/*int y=15;
		if(y>=0 && y<=10) {
			System.out.println("Toy");
		}
		else if (y>=11 && y<=20){
			System.out.println("animal");	
		}
		else {
			System.out.println("invalid");
			
		}*/
		//if age is 0 to 12 print "Baby", if age 13 to 19 print "Teen" if age 20 to 120 print "Adult"
		//otherwise print "Invalid Age
		
		int age=-30;
		if(age>=0 && age<=12) {
			System.out.println("Baby");	
		}
		else if(age>=13 && age<=19){
			System.out.println("Teen");	
		}
		else if(age>=20 && age<=120){
			System.out.println("Adult");
		}
		else {
			System.out.println("Invalid age ");
		}

	}

}
