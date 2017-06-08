import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test() {
		Light on = new Light();
		on.setOn(true);
		assertEquals(true,on.isOn());
	}

}
