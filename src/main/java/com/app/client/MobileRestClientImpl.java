package com.app.client;

import java.util.Date;
import java.util.List;

import com.app.client.conf.Configuration;
import com.app.client.entity.Mobile;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class MobileRestClientImpl implements MobileRestClient {

	private MobileRestClient mobileRestClient;
	private String URL;// = "http://localhost:8080/v1/mobile";
	private Configuration config;

	public MobileRestClientImpl(Configuration config) {
		this.config = config;
		initBaseUrl();
		mobileRestClient = Feign.builder().encoder(new JacksonEncoder()).decoder(new JacksonDecoder()).target(MobileRestClient.class, URL);
	}

	private void initBaseUrl() {
		URL = config.getBaseUrl() + config.getVersion() + config.getComplementUrl();
	}

	public Mobile CreateMobile(Mobile mobile) {

		return mobileRestClient.CreateMobile(mobile);
	}

	public Mobile UpdateMobile(Mobile mobile) {
		return mobileRestClient.UpdateMobile(mobile);
	}

	public List<Mobile> GetAllMobile() {
		return mobileRestClient.GetAllMobile();
	}

	public void DeletMobile(Long id) {
		mobileRestClient.DeletMobile(id);
	}

	public Mobile getById(Long id) {
		return mobileRestClient.getById(id);
	}

	public List<Mobile> getByNameClient(String name) {
		return mobileRestClient.getByNameClient(name);
	}

	public List<Mobile> getByimei(String imei) {
		return mobileRestClient.getByimei(imei);
	}

	public List<Mobile> getByModel(String model) {
		return mobileRestClient.getByModel(model);
	}

	public List<Mobile> getByDate(Date date) {
		return mobileRestClient.getByDate(date);
	}

	public List<Mobile> getByPanne(String panne) {
		return mobileRestClient.getByPanne(panne);
	}

}
