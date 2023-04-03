import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class demoTest {

	@Test
	public void Test_1() {
		Operaciones prueba = new Operaciones();
		double a = 80;
		double b = 3;
		prueba.Multiplicar(a,b);
		assertEquals(240.0, prueba.get_Resultado(),0);
	}
	
	@Test
	public void Test_2() {
		Operaciones prueba = new Operaciones();
		double a = 150;
		double b = 180;
		prueba.Sumar(a,b);
		a = prueba.get_Resultado();
		b = 3;
		prueba.Dividir(a, b);
		assertEquals(110.0, prueba.get_Resultado(),0);
	}
	
	@Test
	public void Test_3() {
		Operaciones prueba = new Operaciones();
		double a = 90;
		double b = 50;
		prueba.Restar(a,b);
		a = prueba.get_Resultado();
		b = 15;
		prueba.Multiplicar(a, b);
		assertEquals(605.0, prueba.get_Resultado(),0);
	}
	
	@Test
	public void Test_4() {
		Operaciones prueba = new Operaciones();
		double a = 70;
		double b = 40;
		prueba.Sumar(a,b);
		a = prueba.get_Resultado();
		b = 25;
		prueba.Multiplicar(a, b);
		assertEquals(2700.0, prueba.get_Resultado(),0);
	}
	
	
}
