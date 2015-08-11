package org.formation.iterator;

import java.util.ArrayList;
import java.util.List;

import org.formation.iteratorJava.ChannelIterator;

public class ChannelIteratorImpl implements ChannelCollection {

	private List<Channel> channels;
	
	public ChannelIteratorImpl() {
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
	public org.formation.iterator.ChannelIterator iterator(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
			this.type = type;
			this.channels = channels;
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



}
