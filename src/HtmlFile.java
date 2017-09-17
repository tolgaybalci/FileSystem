import java.util.List;

public class HtmlFile extends TextFile {

	private ExecutableFile browser;
	private List<HtmlFile> linksTo;

	public ExecutableFile getBrowser() {
		return browser;
	}

	public void setBrowser(ExecutableFile browser) {
		this.browser = browser;
	}

	public List<HtmlFile> getLinksTo() {
		return linksTo;
	}

	public void setLinksTo(List<HtmlFile> linksTo) {
		this.linksTo = linksTo;
	}

}