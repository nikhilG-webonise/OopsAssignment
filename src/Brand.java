import java.util.Scanner;

public class Brand{
	Scanner sc=new Scanner(System.in);
	void Android_brand()
	{
		System.out.println("1)Samsung");
		System.out.println("2)MI");
		System.out.println("enter Your Brand choice number:");
		int Brand_choice=sc.nextInt();
		switch (Brand_choice) {
		case 1:	Samsung s=new Samsung();
				s.features();
				break;
		case 2: MI m=new MI();
				m.features();
				break;
		default:System.out.println("You've entered wrong choise!!");
			break;
		}
	}
}	
