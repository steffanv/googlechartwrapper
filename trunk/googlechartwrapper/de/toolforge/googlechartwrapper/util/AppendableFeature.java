package de.toolforge.googlechartwrapper.util;

import de.toolforge.googlechartwrapper.ChartTypeFeature;

public class AppendableFeature /*implements Comparable<AppendableFeature>*/ {
	
	private String data;
	private int order=  -1;
	private String prefix;
	
	public AppendableFeature(String data, ChartTypeFeature feature) {
		super();
		this.data = data;
		this.prefix = feature.getPrefix();
	}
	
	public AppendableFeature(String data, String prefix) {
		super();
		this.data = data;
		this.prefix = prefix;
	}
	
	public AppendableFeature(String data, ChartTypeFeature feature, int order) {
		super();
		this.data = data;
		this.prefix = feature.getPrefix();
		this.order = order;
	}
	
	public AppendableFeature(String data, String prefix, int order) {
		super();
		this.data = data;
		this.prefix = prefix;
		this.order = order;
	}

	public String getData() {
		return data;
	}

	public int getOrder() {
		return order;
	}

	public String getPrefix() {
		return prefix;
	}

	/*public int compareTo(AppendableFeature arg0) {
		return order-arg0.getOrder();
	}*/
	

}
