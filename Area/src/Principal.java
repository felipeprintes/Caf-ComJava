import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Triangulo t1 = new Triangulo();
		//t1.setBase(1.0);
		//t1.setAltura(1.0);
		
		
		
		
		
		
		System.out.println("entre com a base: ");
		t1.setBase(in.nextInt());
		t1.almentaBase(4);
		
		System.out.println("Entre com a altura: ");
		t1.setAltura(in.nextInt());
		t1.almentaAltura(4);
		
		System.out.println("A base e igual: " + t1.getBase());
		System.out.println("A altura e igual: " + t1.getAltura());
		System.out.println("A area e igual a: " + t1.getArea());
		
		/*System.out.println("O valor da Area e: " + t1.getArea());
		System.out.println("O valor da sua Altura e: " + t1.getAltura());
		System.out.println("O valor da sua base e: " + t1.getBase());*/
		
	}

}
