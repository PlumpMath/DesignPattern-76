package org.formation.iteratorJava;

import org.formation.iterator.Channel;
import org.formation.iterator.ChannelTypeEnum;

public interface ChannelCollection {

	public void addChannel (Channel c);
	public void removeChannel (Channel c);
	
	public ChannelIterator iterator(ChannelTypeEnum type);
	public ChannelIterator2 iterator2(ChannelTypeEnum type);
}
