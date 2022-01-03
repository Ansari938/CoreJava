package interFace;

public class Busniessman implements Richman,SocialWorker{

	@Override
	public void earnmoney() {
		System.out.println("Earnmoney");
		
	}

	@Override
	public void donation() {
      System.out.println("donation");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}

	@Override
	public void helptoOther() {
		System.out.println("helptoother");
		
	}

}
