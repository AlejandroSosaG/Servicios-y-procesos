package hilosDurmientes;

public class TareaC2_c extends Thread{

	public static void main(String[] args) {
		try{
			Thread hilo1 = new Thread();
			Thread hilo2 = new Thread();
			Thread hilo3 = new Thread();
			Thread hilo4 = new Thread();
			Thread hilo5 = new Thread();
			
			hilo1.setName("hilo1");
			hilo2.setName("hilo2");
			hilo3.setName("hilo3");
			hilo4.setName("hilo4");
			hilo5.setName("hilo5");
		
			for(;;) {
				System.out.println("Soy el bucle for y estoy trabajando");
				hilo1.sleep((long) (Math.random()*10000+1000));
				hilo1.sleep((long) (Math.random()*10000+1000));
				hilo1.sleep((long) (Math.random()*10000+1000));
				hilo1.sleep((long) (Math.random()*10000+1000));
				hilo1.sleep((long) (Math.random()*10000+1000));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
