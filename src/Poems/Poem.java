package Poems;

public class Poem {

	private String title;
	private int numLines;

	public Poem(String title, int numLines) {
		this.title = title;
		this.numLines = numLines;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumLines() {
		return numLines;
	}

	public void setNumLines(int numLines) {
		this.numLines = numLines;
	}

}
