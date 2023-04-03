
public class Operaciones {
	
	double a;
	double b;
	double resultado;
	
	public void Sumar(double a, double b) {
		double op_suma = a+b;
		resultado = op_suma;
	}
	
	public void Restar(double a, double b) {
		double op_suma = a-b;
		resultado = op_suma;
	}
	
	public void Multiplicar(double a, double b) {
		double op_suma = a*b;
		resultado = op_suma;
	}
	
	public void Dividir(double a, double b) {
		double op_suma = a/b;
		resultado = op_suma;
	}
	
	public double get_Resultado() {
		return resultado;
	}
	
}
