import java.util.Scanner;

public class Mobile extends Sim{
	private int Ram;
	private String color;
	private int memory;
	private String display;
	public static Scanner getInput() {
		return input;
	}
	public static void setInput(Scanner input) {
		Mobile.input = input;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	static Scanner input=new Scanner(System.in);
	
	void Select_Os()
	{
		Mobile mb=new Mobile();
		System.out.println("Enter Ram (GB):");
		int r=sc.nextInt();
		mb.setRam(r);
		System.out.println("Enter color:");
		String c=sc.next();
		mb.setColor(c);
		System.out.println("Enter memory (GB):");
		int m=sc.nextInt();
		mb.setMemory(m);
		System.out.println("Enter display (LCD,Amoled,Super Amoled):");
		String d=sc.next();
		mb.setDisplay(d);
		System.out.println("Discription:");
		System.out.println("RAM:"+mb.getRam());
		System.out.println("DISPLAY:"+mb.getDisplay());
		System.out.println("COLOR:"+mb.getColor());
		System.out.println("MEMORY:"+mb.getMemory());
		System.out.println("==============NEXT=============");
		System.out.println("1)Android");
		System.out.println("2)IOS");
		System.out.println("Enter your Choice:");
		int choice=input.nextInt();
		switch(choice)
		{
			case 1:	mb.dual_sim(choice);
					break;
			case 2: mb.single_sim();
					break;
			default: System.out.println("You've choosen incorrect choice");
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter Your Name:");
		String user_name=input.next();
		System.out.println("Welcome,"+user_name);
		Mobile m=new Mobile();
		m.Select_Os();
	}
}
