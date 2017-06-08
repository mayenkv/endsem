import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test() {
		Light on = new Light();
		on.setOn(true);
		assertEquals(false,on.isOn());
	}
		

}
