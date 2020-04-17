package mipackage;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Tests {

	@Test
	@DisplayName(value= "Intentamos ingresar una cantidad positiva")
	void testIngresar() throws Exception {
		Account a=new Account(15);
		a.ingresar(10);
		double esperado=25;
		double obtenido=a.getBalance();
		assertEquals(esperado,obtenido);
	}

}
