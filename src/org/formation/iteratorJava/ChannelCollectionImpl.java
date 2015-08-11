package org.formation.iteratorJava;

import java.util.ArrayList;
import java.util.List;

import org.formation.iterator.Channel;
import org.formation.iterator.ChannelTypeEnum;

public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channels;
	
	public ChannelCollectionImpl() {
		channels = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel c) {
		// TODO Auto-generated method stub
		channels.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		// TODO Auto-generated method stub
		channels.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return new ChannelIterator(channels, type);
	}

	@Override
	public ChannelIterator2 iterator2(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return new ChannelIterator2(channels, type);
	}
	
}
