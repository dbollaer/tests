package demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.noop.NoopDiscoveryClient;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StandaloneClientApplication.class)
@IntegrationTest({"eureka.client.enabled=false"})
@DirtiesContext
public class NoopStandaloneClientApplicationTests {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Test
	public void testDiscoveryClientIsNoop() {
		assertTrue("discoveryClient is wrong instance type", discoveryClient instanceof NoopDiscoveryClient);
	}

}
