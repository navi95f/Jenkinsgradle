import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tester {
	
	public Tester(){
		
	}
	
	GetPrima gp = new GetPrima();

	@Test
	public void test1() {
		assertEquals(200, gp.getPrima(50, "casado", "m"));
	}
	
	@Test
	public void test2() {
		assertEquals(600, gp.getPrima(20, "soltero", "h"));
	}
	
	@Test
	public void test3() {
		assertEquals(300, gp.getPrima(70, "viudo", "m"));
	}
	
	@Test
	public void test4() {
		assertEquals(-1, gp.getPrima(100, "", ""));
	}
	
	@Test
	public void test5() {
		assertEquals(-1, gp.getPrima(20, "", "t"));
	}
	
	@Test
	public void test6() {
		assertEquals(-1, gp.getPrima(20, "no", "h"));
	}
	
	@Test
	public void test7() {
		assertEquals(-1, gp.getPrima(20, "muerto", ""));
	}
	
	@Test
	public void test8() {
		assertEquals(-1, gp.getPrima(17, "soltero", "h"));
	}
	
	@Test
	public void test9() {
		assertEquals(400, gp.getPrima(25, "divorciado", "m"));
	}



}
