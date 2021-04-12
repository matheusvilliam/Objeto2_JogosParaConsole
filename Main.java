
public class Main {
	
	static int qtdGrilos = 5;
	
	public static void main(String[] args) {
		
		for (int i=0; i<qtdGrilos; i++) {
			
		Grilo_Thread thread = new Grilo_Thread("Grilo_"+ i);
		}
	}

}
