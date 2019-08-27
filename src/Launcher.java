import HTMLLib.HTMLFile;

public class Launcher {

	public static void main(String[] args) {
		HTMLFile html = new HTMLFile();
		html.setUrl("https://maduraonline.com/?find=hello");
		html.fetchData();
		System.out.println(html.getHTMLContent());
		
	}

}
