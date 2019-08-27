package HTMLLib;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HTMLFile {
	private String url;
	private String HTMLContent;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void fetchData() {
		try {
			URLConnection conn = new URL(url).openConnection();
			Scanner sc = new Scanner(conn.getInputStream());
			sc.useDelimiter("\\Z");
			HTMLContent = sc.next();
			sc.close();
		} catch (MalformedURLException e) {
			System.out.println("Connection Error");
		} catch (IOException e) {
			System.out.println("String converion error");
		}
		
	}
	public String getHTMLContent() {
		return HTMLContent;
	}
	
}
