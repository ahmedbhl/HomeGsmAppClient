package com.app.client.conf;

public class ConfigurationImpl implements Configuration {

	private String BaseUrl;
	private String Version;
	private String ComplementUrl;

	public String getBaseUrl() {
		return BaseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.BaseUrl = baseUrl;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		this.Version = version;
	}

	public String getComplementUrl() {
		return ComplementUrl;
	}

	public void setComplementUrl(String complementUrl) {
		this.ComplementUrl = complementUrl;
	}

}
