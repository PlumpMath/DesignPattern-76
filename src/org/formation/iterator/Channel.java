package org.formation.iterator;

public class Channel {
	private String name;
	private ChannelTypeEnum TYPE;
	
	public Channel(String name, ChannelTypeEnum tYPE) {
		super();
		this.name = name;
		this.TYPE = tYPE;
	}
	
	public String getName() {
		return name;
	}
	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Freqency=" + this.name + ", Type=" + this.TYPE;
	}

}
