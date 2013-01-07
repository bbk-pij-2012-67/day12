public class SmartPhone extends MobilePhone{
	
	public SmartPhone(String brand){
		super(brand);
	}
	
	public void browseWeb(String address){
		System.out.println("Browsing " + address);
	}
	
	public String findPosition(){
		String latDegrees = Double.toString((int)(Math.random()*180)+1);
		String latMinutes = Double.toString((int)(Math.random()*60));
		String lonDegrees = Double.toString((int)(Math.random()*180)+1);
		String lonMinutes = Double.toString((int)(Math.random()*60));
		return latDegrees + " " + latMinutes + ", " + lonDegrees + " " + lonMinutes;
	}
	
	public void call(String number){
		if(number.substring(0,2).equals("00")){
			System.out.println("Calling " + number + " through the Internet to save money");
			super.addToHistory(number);
		}else{
			super.call(number);
		}
	}
		
		
}
