package com.app.client.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.app.client.MobileRestClient;
import com.app.client.MobileRestClientImpl;
import com.app.client.conf.Configuration;
import com.app.client.conf.ConfigurationImpl;
import com.app.client.entity.Mobile;

public class MobileRestClieyImplTest {

	private MobileRestClient restClient;
	private Configuration config;

	@Before
	public void setUp() {
		
		config = new ConfigurationImpl();
		config.setBaseUrl("http://localhost:8080");
		config.setVersion("/v1");
		config.setComplementUrl("/mobile");
		restClient = new MobileRestClientImpl(config);
	}

	@Test
	public void testGetAllMobile() {

		List<Mobile> mobiles = restClient.getByNameClient("ahmed");
		assertTrue(mobiles.size() == 3);
	}

}
