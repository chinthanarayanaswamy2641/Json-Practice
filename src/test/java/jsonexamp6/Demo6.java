package jsonexamp6;

import java.io.IOException;
import java.util.List;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;

public class Demo6 {

	public static void main(String[] args) throws DatabindException, IOException {
		Examp6 data = Data6.getData();
		String appname = data.getApp_metadata().getApp_name();
		System.out.println(appname);
		String version = data.getApp_metadata().getVersion();
		System.out.println(version);
		String releaseData = data.getApp_metadata().getRelease_date();
		System.out.println(releaseData);
		List<String> platforms = data.getApp_metadata().getSupported_platforms();
		System.out.println(platforms);
		System.out.println("---------------");
		List<Users> users = data.getUsers();
		for(Users user:users) {
			String id = user.getUser_id();
			System.out.println(id);
			String firstName=user.getProfile().getFirst_name();
			System.out.println(firstName);
			String lastName=user.getProfile().getLast_name();
			System.out.println(lastName);
			String email=user.getProfile().getContact().getEmail();
			System.out.println(email);
			String phone = user.getProfile().getContact().getPhone();
			System.out.println(phone);
			List<String> roles = user.getRoles();
			System.out.println(roles);
			String login = user.getLast_login();
			System.out.println(login);
			List<Subscriptions> subscribe = user.getSubscriptions();
			for(Subscriptions subscribes:subscribe) {
				String type = subscribes.getType();
				System.out.println(type);
				String untill = subscribes.getValid_until();
				System.out.println(untill);
			}
			
		}
		int maxUsers=data.getSettings().getMax_users();
		System.out.println(maxUsers);
		boolean support=data.getSettings().getFeatures().getIsMulti_language_support();
		System.out.println(support);
		List<String> featuress = data.getSettings().getFeatures().getBeta_features();
		System.out.println(featuress);
	}
}
