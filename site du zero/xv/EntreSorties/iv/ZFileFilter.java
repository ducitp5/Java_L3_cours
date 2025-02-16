package xv.EntreSorties.iv;

import javax.swing.filechooser.FileFilter;
import java.io.File;

class ZFileFilter extends FileFilter {
	
	String 	extension 	= ".sdz", 
			description = "Fichier Ardoise Mazique";

	public ZFileFilter(String ext, String descrip) {
		this.extension = ext;
		this.description = descrip;
	}

	public ZFileFilter() {
	}

	@Override
	public boolean accept(File file) {
		return (file.isDirectory() || file.getName().endsWith(this.extension));
	}

	@Override
	public String getDescription() {
		return this.extension + " - " + this.description;
	}
}


