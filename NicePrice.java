import java.util.Scanner;
public class NicePrice {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int age;
	double price = 0.00;
	char reply;
	boolean isKid, isSenior, hasCoupon, hasNoCoupon;
	
	System.out.print("How old are you? ");
	age = keyboard.nextInt();
	
	System.out.print("Have a coupon? (Y/N)? ");
	reply = keyboard.findWithinHorizon(".", 0).charAt(0);
	
	isKid = age < 12;
	isSenior = age >= 65;
	hasCoupon = reply == 'Y' || reply == 'y';
	hasNoCoupon = reply == 'N' || reply == 'n';
	
	if(!isKid && !isSenior){
		price = 9.25;
	}
	if(isKid || isSenior){
		price = 5.25;
	}
	if(hasCoupon){
		price = price - 2.00;
	}
	if(!(hasCoupon || hasNoCoupon)){
		System.out.println("Huh?");
	}
	//we should make this a method which gets called 
	//iff 'Y' or 'N' is entered. That would be better.
	System.out.print("Please pay $" + price + ". ");
	System.out.println("Enjoy the show!");
	
	keyboard.close();
}
}
