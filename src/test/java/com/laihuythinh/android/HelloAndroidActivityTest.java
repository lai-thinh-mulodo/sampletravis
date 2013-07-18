package test.java.com.laihuythinh.android;

import main.java.com.laihuythinh.android.HelloAndroidActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {
	
	private HelloAndroidActivity activity;
	
	@Before
    public void setUp() {
        activity = new HelloAndroidActivity();
        activity.onCreate(null);
    }

	@Test
    public void itProperlyGreetsYou() {
		String hello = "Hello World, MyActivity!";
        assertThat(hello, equalTo("Hello World, MyActivity!"));
    }
}
