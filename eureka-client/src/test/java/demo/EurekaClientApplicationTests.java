package demo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EurekaClientApplication.class)
@IntegrationTest
@DirtiesContext
public class EurekaClientApplicationTests {

	@Autowired
	private EurekaDiscoveryClient client;

	@Test
	public void contextLoads() throws Exception {
		assertNotNull(this.client);
	}

}
