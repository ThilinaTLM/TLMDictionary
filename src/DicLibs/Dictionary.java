package DicLibs;

public abstract class Dictionary {
	private String term;
	private Word wordsList[];
	
	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
	
	public abstract void loadOffline();
	public abstract void loadOnline();

	public Word[] getWordsList() {
		return wordsList;
	}
}
