package mipackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Test1 {

	@Test
	@DisplayName(value= "Intentamos ingresar una cantidad positiva")
	public void testIngresar() throws Exception {
		Account a=new Account(15);
		a.ingresar(10);
		int esperado=25;
		int obtenido=(int) a.getBalance();
		assertEquals(esperado, obtenido);	
	}
	
	@Test
	@DisplayName(value= "Intentamos ingresar una cantidad negativa")
	public void testIngresar2() throws Exception {
		Account a=new Account(15);
		a.ingresar(-1);
	}
	
	@Test
	@DisplayName(value= "Retiramos todo el dinero de la cuenta")
	public void testRetirar() throws Exception{
		Account a= new Account(20);
		a.retirar(20);
		int esperado=0;
		int obtenido= (int) a.getBalance();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	@DisplayName(value= "Retiramos una cantidad negativa")
	public void testRetirar2() throws Exception{
		Account a= new Account(20);
		a.retirar(-4);
	}
	
	@Test
	@DisplayName(value= "Retiramos una cantidad negativa")
	public void testRetirar3() throws Exception{
		Account a= new Account(20);
		a.retirar(30);
	}
}
