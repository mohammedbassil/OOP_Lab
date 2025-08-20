public class Basith {
	private String model;
	private String color;
	public Basith(String model,String color) {
		this.model=model;
		this.color=color;
		
	}
	public void start() {
		System.out.println(color +" " + model +" " + "car started");
}
	public void stop() {
		System.out.println(color +" " + model +" "+ "car stopped");
	
	}
	public static void main(String[] args) {
		Basith car1=new Basith("Tesla","Red");
		car1.start();
		car1.stop();
	}
}
