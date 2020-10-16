package funcionalidades;

//Importamos la entrada de teclado del usuario
import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		//Declaro variables
		int num1, num2;
		//Pido valores
		System.out.print("Ingrese primer valor:");
		//Se alojan dentro de la variable NUM1
		num1 = teclado.nextInt();
		System.out.print("Ingrese segundo valor:");
		num2 = teclado.nextInt();
		//Condicionales
		if (num1 > num2) {
			System.out.print(num1);
		} else {
			System.out.print(num2);
		}
		System.out.println();
		System.out.print("La condicional funciono perfectamente con los numeros: " + num1 + " Y " + num2);
	}
}
