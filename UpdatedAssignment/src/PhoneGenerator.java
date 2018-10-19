import java.util.Scanner;

public class PhoneGenerator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		char choice=' ';
		do {
		System.out.println("Select OS:");
		System.out.println("1.Android");
		System.out.println("2.IOS");
		System.out.println("Enter your Choice:");
		int os_Choice=scanner.nextInt();
			switch(os_Choice) {
				case 1: System.out.println("Android Phone List:");
						System.out.println("1.Samsung Phone");
						System.out.println("2.MI Phone");
						System.out.println("Enter youre choice");
						int phone_choice=scanner.nextInt();
							switch(phone_choice) {
								case 1: SamsungPhones samsung=new SamsungPhones();
										do {
										System.out.println("Feature List:");
										System.out.println("1.SMS");
										System.out.println("2.MMS");
										System.out.println("3.Call");
										System.out.println("4.Camera");
										System.out.println("5.Bluetooth");
										System.out.println("6.Samsung Pay");
										System.out.println("Enter youre choice:");
										int feature_choice=scanner.nextInt();
											switch(feature_choice) {
												case 1: samsung.message("1234567890", "Hi Swapnil");
														break;
												case 2: samsung.message("9876543210","Hi Nikhil", "excel.pdf");
														break;
												case 3: samsung.Make_cal("4567893210");
														break;
												case 4: samsung.Take_photo();
														break;
												case 5: samsung.use_bluetooth();
														break;
												case 6: samsung.samsungPay();
														break;
												default: System.out.println("Wrong Choice");
														break;
											}
											System.out.println("do you want continue with Android Selection 'y' or 'n'?");
											choice=scanner.next().charAt(0);
										}while(choice!='n');
										break;
								case 2: MiPhone mi=new MiPhone();
										do {
												System.out.println("Feature List:");
												System.out.println("1.SMS");
												System.out.println("2.MMS");
												System.out.println("3.Call");
												System.out.println("4.Camera");
												System.out.println("5.Face Recognisation");
												System.out.println("6.Google Pay");
												System.out.println("Enter youre choice:");
												int feature_choice=scanner.nextInt();
													switch(feature_choice) {
														case 1: mi.message("1234567890", "Hi Swapnil");
														break;
														case 2: mi.message("9876543210","Hi Nikhil", "excel.pdf");
														break;
														case 3: mi.Make_cal("4567893210");
														break;
														case 4: mi.Take_photo();
														break;
														case 5: mi.faceRecognisation();
														break;
														case 6: mi.google_Pay();
														break;
														default: System.out.println("Wrong Choice");
														break;
													}
													System.out.println("do you want continue with Android Selection 'y' or 'n'?");
													choice=scanner.next().charAt(0);
										}while(choice!='n');
										break;
								default:System.out.println("Wrong Choivce");
										break;
							}
							break;
				case 2: System.out.println("IOS Phone List:");
						System.out.println("1.IPhone 8");
						System.out.println("2.IPhone X");
						System.out.println("Enter youre choice");
						int iosphone_choice=scanner.nextInt();
							switch(iosphone_choice) {
								case 1: IphoneVII iphnv=new IphoneVII();
								do {
									System.out.println("Feature List:");
									System.out.println("1.SMS");
									System.out.println("2.MMS");
									System.out.println("3.Call");
									System.out.println("4.Camera");
									System.out.println("5.Fingerprint Scanner");
									System.out.println("6.Apple Pay");
									System.out.println("Enter youre choice:");
									int feature_choice=scanner.nextInt();
										switch(feature_choice) {
											case 1: iphnv.message("1234567890", "Hi Swapnil");
												break;
											case 2: iphnv.message("9876543210","Hi Nikhil", "excel.pdf");
												break;
											case 3: iphnv.Make_cal("4567893210");
												break;
											case 4: iphnv.Take_photo();
												break;
											case 5: iphnv.fingerPrintScanner();
												break;
											case 6: iphnv.apple_Pay();
												break;
											default: System.out.println("Wrong Choice");
												break;
										}
										System.out.println("do you want continue with IOS Selection 'y' or 'n'?");
										choice=scanner.next().charAt(0);
									}while(choice!='n');
									break;
								case 2: IphoneX iphnx=new IphoneX();
								do {
								System.out.println("Feature List:");
								System.out.println("1.SMS");
								System.out.println("2.MMS");
								System.out.println("3.Call");
								System.out.println("4.Camera");
								System.out.println("5.Sim Selection");
								System.out.println("6.Apple Pay");
								System.out.println("Enter youre choice:");
								int feature_choice=scanner.nextInt();
									switch(feature_choice) {
										case 1: iphnx.message("1234567890", "Hi Swapnil");
												break;
										case 2: iphnx.message("9876543210","Hi Nikhil", "excel.pdf");
												break;
										case 3: iphnx.Make_cal("4567893210");
												break;
										case 4: iphnx.Take_photo();
												break;
										case 5: iphnx.sim_Option(2);
												break;
										case 6: iphnx.apple_Pay();
												break;
										default: System.out.println("Wrong Choice");
												break;
									}
									System.out.println("do you want continue with IOS Selection 'y' or 'n'?");
									choice=scanner.next().charAt(0);
								}while(choice!='n');
								break;
								default:System.out.println("Wrong Choice");
										break;
							}
							break;
				default:System.out.println("Wrong Choice");
						break;
			}
			System.out.println("do you want continue with OS Selection 'y' or 'n'?");
			choice=scanner.next().charAt(0);
		}while(choice!='n');
	}
}
