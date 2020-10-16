package funcionalidades;
import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		
		
		Scanner teclado=new Scanner(System.in);
        String persona1,persona2;
        int edad1,edad2;
        System.out.print("Ingrese el apellido y el nombre:");
        persona1=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad1=teclado.nextInt();
        System.out.print("Ingrese el apellido y el nombre:");
        teclado.nextLine();
        persona2=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es:");
        if (edad1>edad2) {
            System.out.print(persona1);
        } else {
            System.out.print(persona2);
        }
    }
}