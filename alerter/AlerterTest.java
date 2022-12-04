import org.junit.Test;

public class AlerterTest {

	@Test
	public void testSuccessAlertInCelcius() {
		Alerter.alertInCelcius(150.4f);
		Alerter.alertInCelcius(33.6f);
		assert Alerter.alertFailureCount == 0;
	}
	
	@Test
	public void testFailureAlertInCelcius() {
		Alerter.alertInCelcius(400.5f);
		Alerter.alertInCelcius(303.6f);
		assert Alerter.alertFailureCount == 2;
	}

}
