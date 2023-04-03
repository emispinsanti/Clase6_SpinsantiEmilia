import java.util.Scanner;

public class Iniciar {

	public static void main(String[] args) {

		Scanner ingresa_a = new Scanner(System.in);
		Scanner ingresa_b = new Scanner(System.in);
		Scanner ingresa_op = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero");
		double a = 0;
		a = Double.parseDouble(ingresa_a.nextLine());
		
		System.out.println("Introduzca el segundo numero");
		double b = 0;
		b = Double.parseDouble(ingresa_a.nextLine());
		
		System.out.println("Que operacion desea realizar: \n1- Suma \n2- Resta \n3-Multiplicacion \n4- Division");
		int operacion = 0;
		operacion = Integer.parseInt(ingresa_a.nextLine());
		
		Operaciones calcular = new Operaciones();
		double resultado = 0; 
		
		switch (operacion) {
		case 1:
			calcular.Sumar(a, b);
			resultado = calcular.get_Resultado();
			System.out.println("El resultado de la suma de " + a + " y " + b + " es: " + resultado);
		break;
		
		case 2:
			calcular.Restar(a, b);
			resultado = calcular.get_Resultado();
			System.out.println("El resultado de la resta de " + a + " y " + b + " es: " + resultado);
		break;
		
		case 3:
			calcular.Multiplicar(a, b);
			resultado = calcular.get_Resultado();
			System.out.println("El resultado de la multiplicacion de " + a + " y " + b + " es: " + resultado);
		break;
		
		case 4:
			calcular.Dividir(a, b);
			resultado = calcular.get_Resultado();
			System.out.println("El resultado de la division de " + a + " y " + b + " es: " + resultado);
		break;
		
		default:
			System.out.println("La opcion elegida es incorrecta!");
		break;
			
		}
		
	}

}
