package test.java.com.laihuythinh.android;

import org.junit.Assert;
import org.junit.Test;

public class HelloAndroidActivityTest {

	@Test
	public void testHelloAndroidScreenOK() {
		Assert.assertEquals(36, 36);
	}
	
//	@Test
//	public void testHelloAndroidScreenNG() {
//		Assert.assertEquals(36, 50);
//	}
	
	@Test
	public void testStringOK() {
		String myapp = "com.laihuythinh.android";
		Assert.assertEquals(myapp, "com.laihuythinh.android");
	}
	
//	@Test
//	public void testStringNG() {
//		String myapp = "com.laihuythinh.android";
//		Assert.assertEquals(myapp, "com.abc.android");
//	}
}
