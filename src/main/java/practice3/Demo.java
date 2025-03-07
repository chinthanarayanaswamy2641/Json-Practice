package practice3;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.DatabindException;
import practice2.Credentials;

public class Demo {

	public static void main(String[] args) throws DatabindException, IOException {
		Data data = Read.getData();
		Map<String,String>datas=data.getHome_Page();
		for(Entry<String, String> entry:datas.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		Map<String, String> page = data.getLogin_Page();
		for(Entry<String, String> entry:page.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		Map<String, String> pages = data.getAccount_Page();
		for(Entry<String, String> entry:pages.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

