package TasksOOP.FirstTask;

public class Phone {
	
	public String number, model, weight;
	
	public String getNumber() {
		return number;
	}
	
	public Phone() {
		
	}
	public Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}
	public Phone(String number, String model, String weight) {
		this(number,model);
		this.weight = weight;
	}
	
	public void receiveCall(String nameOfCaller) {
		System.out.print("Calling:" + nameOfCaller);
	}
	public void receiveCall(String numberOfCaller, String nameOfCaller) {
		System.out.print("Calling:" + nameOfCaller + " Phone number" + numberOfCaller);
	}
	
	public void sendMessage(String...args) {
		for(String number : args) {
			System.out.println(number);
		}
	}
}
