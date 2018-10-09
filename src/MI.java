import java.util.Scanner;

public class MI extends Common_features{
	Scanner sc=new Scanner(System.in);
	void Extra_Feature()
	{
		System.out.println("Colors: Red, Matte Black, Rose Gold");
		System.out.println("Display: LCD, LED, Super Amoled");
		System.out.println("Connectivity Support: 3G,4G,5G");
	}
	void features()
	{
		MI m=new MI();
		char ch=' ';
		do
		{
			System.out.println("Feature List:");
			System.out.println("1)SMS");
			System.out.println("2)MMS");
			System.out.println("3)Make Call");
			System.out.println("4)Take Photo");
			System.out.println("5)Other Features");
			System.out.println("Enter Your Choice:");
			int feature_choice=sc.nextInt();
			switch(feature_choice)
			{
				case 1:System.out.println("Enter sender mobile number:");
						String number=sc.next();
						System.out.println("Enter message you want send:");
						String message=sc.next();
						m.Sms(number, message);
						break;
				case 2:	System.out.println("Enter sender mobile number:");
						String number1=sc.next();
						System.out.println("Enter mms you want send:");
						String message1=sc.next();
						m.Mms(number1, message1);
						break;
				case 3:	System.out.println("Enter caller mobile number:");
						String number3=sc.next();
						m.Make_cal(number3);
						break;
				case 4: m.Take_photo();
						break;
				case 5: m.Extra_Feature();
						break;
				default:System.out.println("You've Enter incorrect choice");
						break;
			}
			System.out.println("Do you want to continue 'y' or do you want to Select another OS 'n'?");
			ch=sc.next().charAt(0);
		}while(ch!='n');
		Mobile mb=new Mobile();
		mb.Select_Os();
	}
}
