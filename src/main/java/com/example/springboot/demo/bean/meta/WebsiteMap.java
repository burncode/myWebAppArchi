package com.example.springboot.demo.bean.meta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class WebsiteMap {

	private List<Channel> channels = new ArrayList<Channel>();

	@SuppressWarnings("unchecked")
	public WebsiteMap() {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(new ClassPathResource("sitemap.xml").getFile());
			
			List<Element> channels = document.selectNodes("/sitemap/channel");
			for(Element channelElement : channels){
				Channel channel = new Channel(channelElement.attributeValue("name"));
				List<Element> submenus = channelElement.elements("subMenu");
				for(Element subMenu : submenus){
					channel.getSubMenu().add(subMenu.attributeValue("name"));
				}
				this.channels.add(channel);
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

}
