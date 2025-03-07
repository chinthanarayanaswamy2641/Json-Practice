package jsonexamp5;

public class Settings {

	private String theme;
	private boolean notifications_enabled;
	private Preferences preferences;
	
	public boolean getIsNotifications_enabled() {
		return notifications_enabled;
	}
	public void setNotifications_enabled(boolean notifications_enableds) {
		this.notifications_enabled = notifications_enableds;
	}
	
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public Preferences getPreferences() {
		return preferences;
	}
	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}
	
}
