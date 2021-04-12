
public class Grilo_Thread  extends Thread{

	private String nome;
	private float pulo, distanciaPercorrida;
	private int qtdPulos, distanciaTotal = 300;
	
	public Grilo_Thread (String nome) {
		this.nome=nome;
		start();
	}
	
	public void run() {
		
		while (distanciaPercorrida < distanciaTotal) {
			
			try {
				
					pulo = Math.round(Math.random() * 50);
					distanciaPercorrida += pulo;
					qtdPulos++;
					System.out.println(nome + " pulou " + pulo + "cm e j� percorreu " + distanciaPercorrida + "cm");	
					Thread.sleep(1000);
					
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
		
		System.out.println(nome + " alcan�ou a linha de chegada com " + qtdPulos + " pulos");
	}
	
}
