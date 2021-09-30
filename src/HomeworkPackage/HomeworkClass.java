package HomeworkPackage;

public class HomeworkClass {

	public static void main(String[] args) {
		
		// #1
		int grade = 40; 
		if(grade>89) {
			System.out.println("A");
		}else if(grade>79 && grade<90) {
			System.out.println("B");
		}else if(grade>69 && grade<80) {
			System.out.println("C");
		}else if(grade>54 && grade<70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		// #2
		int day = 20;
		String dayString;
		
		switch(day) {
		case 1: dayString = "Monday";
				break;
		case 2: dayString = "Tuesday";
				break;
		case 3: dayString = "Wednesday";
				break;
		case 4: dayString = "Thursday";
				break;
		case 5: dayString = "Friday";
				break;
		case 6: dayString = "Saturday";
				break;
		case 7: dayString = "Sunday";
				break;
		default: dayString = "Invalid Day";
				break;
		}
		System.out.println(dayString);
				
	
		// #3
		int num = 21; 
		
		if(num%2 == 0) {
			
			if(num <=5 && num>=2) {
				System.out.println("even (between 5 and 2) - not cool");
			} 
			else if(num <21 && num>5) {
				System.out.println("even (between 20 and 6) - cool");
			} 
			else if(num>20) {
				System.out.println("even & greater than 20 - not cool");
			}}
		else { // num%2 !=0  or num%2 == 1
				System.out.println("Odd - cool");
		}
	}
}
