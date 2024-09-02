public class Application {

	public static void main(String[] args){
		
		System.out.println("Hello World!");

		for(String s:args) {
			if(s.equals("start")) {
				System.out.println("Start the Machine");
			}
			if(s.equals("stop")) {
				System.out.println("Stop the Machine");
			}
				
		}
	
	}

}