import java.util.Scanner;

public class Samsung extends Common_features{
	Scanner sc=new Scanner(System.in);
	void Samsung_pay()
	{
		System.out.println("Welcome to Samsung Pay");
		System.out.println("Enter your 16 digit card number:");
		String card=sc.next();
		System.out.println("Enter your expiry month:");
		String emonth=sc.next();
		System.out.println("Enter your cvv:");
		String cvv=sc.next();
		System.out.println("Thank you for using Samsung Pay!");
	}
	void features()
	{
		Samsung s=new Samsung();
		char ch=' ';
		do
		{
			System.out.println("Feature List:");
			System.out.println("1)SMS");
			System.out.println("2)MMS");
			System.out.println("3)Make Call");
			System.out.println("4)Take Photo");
			System.out.println("5)Samsung Pay");
			System.out.println("Enter Your Choice:");
			int feature_choice=sc.nextInt();
			switch(feature_choice)
			{
				case 1:System.out.println("Enter sender mobile number:");
						String number=sc.next();
						System.out.println("Enter message you want send:");
						String message=sc.next();
						s.Sms(number, message);
						break;
				case 2:	System.out.println("Enter sender mobile number:");
						String number1=sc.next();
						System.out.println("Enter mms you want send:");
						String message1=sc.next();
						s.Mms(number1, message1);
						break;
				case 3:	System.out.println("Enter caller mobile number:");
						String number3=sc.next();
						s.Make_cal(number3);
						break;
				case 4: s.Take_photo();
						break;
				case 5: s.Samsung_pay();
						break;
				default:System.out.println("You've Enter incorrect choice");
						break;
			}
			System.out.println("Do you want to continue 'y' or do you want to Select another OS 'n'?");
			ch=sc.next().charAt(0);
		}while(ch!='n');
		Mobile m=new Mobile();
		m.Select_Os();
	}
}
