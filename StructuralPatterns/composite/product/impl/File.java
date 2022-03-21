package composite.product.impl;

import composite.product.Component;

public class File implements Component {
	
	private String fileName;
	
	public File(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void ls(StringBuffer sbf) {
		sbf.append(fileName).append("\n");
	}

}
