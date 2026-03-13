package calculadora;
import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;
		double a, b;

		System.out.println("1-Somar");
		System.out.println("2-Subtrair");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("5-Raiz quadrada");
		System.out.print("Escolha uma opcao: ");

		opcao = sc.nextInt();

		switch(opcao){

		case 1:
		    a = sc.nextDouble();
		    b = sc.nextDouble();
		    System.out.println("Resultado: " + (a+b));
		    break;

		case 2:
		    a = sc.nextDouble();
		    b = sc.nextDouble();
		    System.out.println("Resultado: " + (a-b));
		    break;

		case 3:
		    a = sc.nextDouble();
		    b = sc.nextDouble();
		    System.out.println("Resultado: " + (a*b));
		    break;

		case 4:
		    a = sc.nextDouble();
		    b = sc.nextDouble();
		    System.out.println("Resultado: " + (a/b));
		    break;

		case 5:
		    a = sc.nextDouble();
		    System.out.println("Resultado: " + Math.sqrt(a));
		    break;

		default:
		    System.out.println("Opcao invalida");
		}

		sc.close();

	}

}
