public class MyPhoneScript{
	
	public static void main(String[] args){
		MobilePhone myPhone = new SmartPhone("Sony");
		///((SmartPhone) myPhone).browseWeb("http://www.bbc.co.uk");
		// System.out.println(((SmartPhone) myPhone).findPosition());
		//myPhone.call("87810");
		//myPhone.addToHistory("87810");
		//myPhone.ringAlarm("5:00 am alarm");
	//	myPhone.playGame("Tetris");
	//	myPhone.printLastNumbers();
	//	System.out.println(myPhone.getBrand());
		MyPhoneScript ps = new MyPhoneScript();
		ps.testPhone(myPhone);
	
	}
	
	public void testPhone(Phone phone){
		SmartPhone smartPhone = (SmartPhone) phone;
		
		smartPhone.browseWeb("http://www.bbc.co.uk");
		 System.out.println(smartPhone.findPosition());
		smartPhone.call("87810");
		smartPhone.addToHistory("87810");
		smartPhone.ringAlarm("5:00 am alarm");
		smartPhone.playGame("Tetris");
		smartPhone.printLastNumbers();
		System.out.println(smartPhone.getBrand());
		
	}
}
