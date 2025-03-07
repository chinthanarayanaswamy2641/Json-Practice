package jsonexamp6;

import java.util.List;

public class AppMetadata {

	private String app_name;
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public List<String> getSupported_platforms() {
		return supported_platforms;
	}
	public void setSupported_platforms(List<String> supported_platforms) {
		this.supported_platforms = supported_platforms;
	}
	private String version;
	private String release_date;
	private List<String> supported_platforms;
}
