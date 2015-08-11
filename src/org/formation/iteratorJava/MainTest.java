package org.formation.iteratorJava;

import org.formation.iterator.Channel;
import org.formation.iterator.ChannelTypeEnum;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testChannels();
	}

	private static void testChannels(){
		ChannelCollection channels = generateChanels();
		ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.KIDS);
		ChannelIterator2 baseIterator2 = channels.iterator2(ChannelTypeEnum.KIDS);
		
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}
		System.out.println("********");
		
		ChannelIterator news = channels.iterator(ChannelTypeEnum.MUSIC);
		while (news.hasNext()) {
			Channel c = news.next();
			System.out.println(c.toString());
		}
		System.out.println("********");
		
		while (baseIterator2.hasNext()) {
			Channel c = baseIterator2.next();
			System.out.println(c.toString());
		}
	}

	private static ChannelCollection generateChanels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel("offive", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("France Musique", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("Aljazera kids", ChannelTypeEnum.KIDS));
		channels.addChannel(new Channel("zevhezfv", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("Blbae", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("ezrgfzer", ChannelTypeEnum.KIDS));
		channels.addChannel(new Channel("nyyuj", ChannelTypeEnum.KIDS));
		return channels;
	}
	
}
