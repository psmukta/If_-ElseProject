package ifAndElsePack;

public class PracticeIfAndElse {
	
	public static void main (String[] args) {
		int x=10;
		if(x==5) {
			System.out.println("It is a cow");
			
		}
		else if(x==3){
			System.out.println("goat");
			
		}
		else {
			System.out.println("Invalid");
		}
		
		
		int favoritetemp=75;
		int currenttemp=100;
		String opinion;
		if(currenttemp==favoritetemp) {
		if (currenttemp<=favoritetemp) {
			opinion="comfotable";
		}
		else if(currenttemp>=favoritetemp) {
			opinion="uncomfotable";
		}
		else {
			opinion="unknowntemp";
		}
		
		System.out.println(opinion);
		
	}
		else {
			opinion="not equal";
		}
		System.out.println(opinion);
	
	/*String y ="";
	   if(y.equalsIgnoreCase("abc")) {
		System.out.println("null");
	}
	   else {
		System.out.println("not null");
	   }*/
		
		String ab="1";
		System.out.println(ab.isEmpty());
		System.out.println(ab);
		if(ab=="0") {
			System.out.println("null");	
		}
		else {
			System.out.println(ab);
		}
}


}
