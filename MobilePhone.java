public class MobilePhone extends OldPhone{
	
	private String[] history = new String[10];
	
	public MobilePhone(String brand){
		super(brand);
	}
	
	public void ringAlarm(String alarm){
		System.out.println("Alarm: " + alarm);
	}
	
	public void playGame(String game){
		System.out.println("Game: " + game);
	}
	
	public void printLastNumbers(){
		for(int c=0;c < 10;c++){
			if(history[c] != null){
			System.out.println(history[c]);
			}
		}
	}
			
	public void addToHistory(String newNumber){
		for(int c=8;c >= 0;c--){
			history[c+1] = history[c];
		}
		history[0] = newNumber;
	}
	
	public void call(String number){
		super.call(number);
		addToHistory(number);
	}
}
