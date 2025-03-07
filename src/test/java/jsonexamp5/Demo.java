package jsonexamp5;

import java.io.IOException;
import java.util.List;

public class Demo {

	public static void main(String[] args) throws IOException {
		Root data = Data5.getData();
		String name = data.getApplication().getName();
		String version = data.getApplication().getVersion();
		System.out.println(name);
		System.out.println(version);
		List<User> users=data.getApplication().getUsers();
		for( User user:users) {
			String email = user.getEmail();
			String password = user.getPassword();
			List<String> roles = user.getRoles();
			System.out.println(email);
			System.out.println(password);
			System.out.println(roles);
		}
		String theme = data.getApplication().getSettings().getTheme();
		System.out.println(theme);
		

		boolean notification = data.getApplication().getSettings().getIsNotifications_enabled();
		System.out.println(notification);
		
		String language = data.getApplication().getSettings().getPreferences().getLanguage();
		String timezone = data.getApplication().getSettings().getPreferences().getTimezone();
		System.out.println(language);
		System.out.println(timezone);
	}

}
