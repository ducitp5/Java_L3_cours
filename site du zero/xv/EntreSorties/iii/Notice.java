package xv.EntreSorties.iii;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Notice implements Serializable{
	private String langue;

	public Notice() {
		this.langue = "Français";
	}

	public Notice(String lang) {
		this.langue = lang;
	}

	@Override
	public String toString() {
		return "\t Langue de la notice : " + this.langue + "\n";
	}
}
