package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//for döngüsü
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("Döngü Bitti");

		//while
		
		int i = 2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While döngüsü bitti");
		
		//Do-While
		
		int k = 100;
		do {
			System.out.println(k);
			k+=2;			
		}while(k<10);
		System.out.println("Do-While döngüsü bitti");
	}

}
