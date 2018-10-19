
public class IosOSPhone implements common_feature{

	@Override
	public void message(String mobile_number, String message) {
		System.out.println("Message:"+message+","+"Sending to:"+mobile_number);
	}

	@Override
	public void message(String mobile_number, String message, String attachment) {
		System.out.println("Message:"+message+","+"Sending to:"+mobile_number+","+"Attachment:"+attachment);	
	}

	@Override
	public void Make_cal(String mobile_number) {
		System.out.println("Making call with"+mobile_number);
	}

	@Override
	public void Take_photo() {
		System.out.println("Taking Photos,Please Smile");
	}
}
