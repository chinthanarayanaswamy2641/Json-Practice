package jsonexamp6;

import java.util.List;

public class Examp6 {

	private AppMetadata app_metadata;
	private List<Users> users;
	private Settings settings;
	
	public AppMetadata getApp_metadata() {
		return app_metadata;
	}
	public void setApp_metadata(AppMetadata app_metadata) {
		this.app_metadata = app_metadata;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public Settings getSettings() {
		return settings;
	}
	public void setSettings(Settings settings) {
		this.settings = settings;
	}
	
}
