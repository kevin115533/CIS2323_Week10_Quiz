import FormLetterWriter.*;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
	String userLast, userFirst;
	FormLetterWriter user = new FormLetterWriter();
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a first name");
	userFirst = input.nextLine();
	
	System.out.println("Enter a last name");
	userLast = input.nextLine();
	
	user.displaySaluation(userLast);
	user.displaySaluation(userFirst, userLast);
	
	
}
}