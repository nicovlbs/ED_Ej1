import java.util.Scanner;

public class Examen1T {
	
	public static void main(String[] args) {
	
		String mensaje = "10 de Noviembre de 2023";		
		int num1, num2, num3;
		
		Scanner lectura = new Scanner (System.in);
		System.out.println("Introduce un numero entero:");
		num1 = lectura.nextInt();
		System.out.println("Introduce un segundo número entero:");
		num2 = lectura.nextInt();
		
		
		System.out.println("Primer numero introducido: " + num1);
		System.out.println("Segundo numero introducido: " + num2);
		if (num1 <= num2) {
			num3=num1/num2;
			System.out.println("El cociente de la división del mayor entre el menor es " + num3);
		}else {
			num3=num1/num2;
			System.out.println("El cociente de la división del mayor entre el menor es " + num3);
		}
		
		int i=0;		
		
		{
			String derecho= mensaje.substring(i,i++);
			System.out.print(derecho);
			i++;
		}
		System.out.println();
		
		i = mensaje.length()-1;
		String reves=""; 
		while (i>=0)
		{	
			 reves= mensaje.substring(i);	
			 i--;
		}
		System.out.print(mensaje);
		
		lectura.close();
	}
}