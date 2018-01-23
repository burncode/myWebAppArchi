package com.example.springboot.demo.bean.meta;

import static org.junit.Assert.*;

import org.junit.Test;

public class WebsiteMapTest {

	@Test
	public void test() {
		WebsiteMap sitemap = new WebsiteMap();
		for(Channel channel : sitemap.getChannels()){
			System.out.println(channel.getChannelName());
		}
	}

}
