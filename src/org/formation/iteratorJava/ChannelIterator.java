package org.formation.iteratorJava;

import java.util.Iterator;
import java.util.List;

import org.formation.iterator.Channel;
import org.formation.iterator.ChannelTypeEnum;

public class ChannelIterator implements Iterator<Channel>{

	private List<Channel> channels;
	private int position;
	private ChannelTypeEnum type;
	
	public ChannelIterator(List<Channel> channels, ChannelTypeEnum type) {
		super();
		this.channels = channels;
		this.type = type;
	}

	@Override
	public boolean hasNext() {
		while (position < channels.size()) {
			Channel c = channels.get(position);
			if (c.getTYPE().equals(type))
				return true;
			else
				position++;
		}
		return false;
	}

	@Override
	public Channel next() {
		Channel c = channels.get(position);
		position++;
		return c;
	}
	

}
