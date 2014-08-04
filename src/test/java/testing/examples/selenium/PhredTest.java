import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PhredTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSeleniumDrivers() throws Exception {

/*		long time0 = System.currentTimeMillis();
		WebDriver driver = new FirefoxDriver();
		long time1 = System.currentTimeMillis();
		System.out.printf("FirefoxDriver created in %d msec\n", time1 - time0);
		driver.get("http://localhost:8080/web/guest/phred1");
		long time2 = System.currentTimeMillis();
		System.out.printf("Firefox page loaded in %d msec\n", time2 - time1);
		assertEquals("", driver.getTitle());
		long time3 = System.currentTimeMillis();
		
		System.out.printf(" ************ %s | Driver creation = %d msec | Page load = %d msec | Get title = %d msec | Total = %d msec\n",
				"Firefox Driver", time1 - time0, time2 - time1, time3 - time2, time3 - time0);
*/
		long time0 = System.currentTimeMillis();
		WebDriver driver = new SafariDriver();
		long time1 = System.currentTimeMillis();
		driver.get("http://localhost:8080/web/guest/phred1");
		long time2 = System.currentTimeMillis();
		String title = driver.getTitle();
		long time3 = System.currentTimeMillis();
		driver.get("http://localhost:8080/web/guest/phred2");
		long time4 = System.currentTimeMillis();

		System.out.printf(" ************ %s | Driver creation = %d msec | Page 1 load = %d msec | Get title = %d msec | Page 2 load = %d msec | Total = %d msec\n",
				"Safari Driver", time1 - time0, time2 - time1, time3 - time2, time4 - time3, time4 - time0);

		time0 = System.currentTimeMillis();
		driver = new HtmlUnitDriver();
		time1 = System.currentTimeMillis();
		driver.get("http://localhost:8080/web/guest/phred1");
		time2 = System.currentTimeMillis();
		title = driver.getTitle();
		time3 = System.currentTimeMillis();
		driver.get("http://localhost:8080/web/guest/phred2");
		time4 = System.currentTimeMillis();

		System.out.printf(" ************ %s | Driver creation = %d msec | Page 1 load = %d msec | Get title = %d msec | Page 2 load = %d msec | Total = %d msec\n",
				"HtmlUnit Driver", time1 - time0, time2 - time1, time3 - time2, time4 - time3, time4 - time0);
	}

}
