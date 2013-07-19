package test.java.com.laihuythinh.android;

import main.java.com.laihuythinh.android.HelloAndroidActivity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

	@Test
	public void testHelloAndroidScreen() {
		Assert.assertEquals(36, 36);
	}

	@Test
	public void testOK() throws Exception {
		String hello = new HelloAndroidActivity().getPackageName();
		assertThat(hello, equalTo("com.laihuythinh.android"));
	}
	
	@Test
	public void testNG() throws Exception {
		String hello = new HelloAndroidActivity().getPackageName();
		assertThat(hello, equalTo("com.abc.android"));
	}
}
