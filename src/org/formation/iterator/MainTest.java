package org.formation.iterator;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	private static void testChannels(){
		ChannelCollection channels = generateChanels();
		ChannelIterator baseIterator = channels
				.iterator(ChannelTypeEnum.GENERAL);
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}
		System.out.println("********");
		
		ChannelIterator news = channels
				.iterator(ChannelTypeEnum.NEWS);
		while (news.hasNext()) {
			Channel c = news.next();
			System.out.println(c.toString());
		}
	}

	private static ChannelCollection generateChanels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel("offive", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("France Musique", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("Aljazera kids", ChannelTypeEnum.KIDS));
		channels.addChannel(new Channel("offive", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("offive", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("offive", ChannelTypeEnum.MUSIC));
		channels.addChannel(new Channel("offive", ChannelTypeEnum.MUSIC));
		return channels;
	}
	
	
	
}
