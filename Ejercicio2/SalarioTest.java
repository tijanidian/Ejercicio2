import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalarioTest {
	Salario c;
	@Before
	public void setUp() throws Exception {
		c = new Salario();
	}

	@Test
	public void testCalcularSalarioBruto() {
		
		
	}

	@Test
	public void testCalcularSalarioNeto() {
		assertEquals(1640, 2000);
		assertEquals(1230, 1500);
		assertEquals(1256.9916, 1499.99,0.2);
		assertEquals(1050, 1250);
		assertEquals(840, 1000);
		assertEquals(999.99, 999.99, 0.2);
		assertEquals(500, 500);
		assertEquals(0, 0);
		
	}

}
