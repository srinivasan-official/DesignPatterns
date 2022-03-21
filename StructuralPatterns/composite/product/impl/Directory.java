package composite.product.impl;

import java.util.ArrayList;
import java.util.List;

import composite.product.Component;

public class Directory implements Component {
	
	private String directoryName;
	private List<Component> includedComponent; 
	
	public Directory(String directoryName) {
		this.directoryName = directoryName;
		this.includedComponent = new ArrayList<>();
	}

	public void addChild(Component component) {
		includedComponent.add(component);
	}
	
	public void removeChild(Component component) {
		includedComponent.remove(component);
	}
	
	@Override
	public void ls(StringBuffer sbf) {
		sbf.append(directoryName);
		sbf.append("\n");
		sbf.append("   ");
		includedComponent.forEach(component -> {
			component.ls(sbf);
		});
		sbf.setLength(sbf.length() - 3);
	}
	
	@Override
	public boolean equals(Object object) {
		if(object==null || !(object instanceof Directory))
			return false;
		Directory other = (Directory) object;
		return this.directoryName.equals(other.directoryName);
	}

}
