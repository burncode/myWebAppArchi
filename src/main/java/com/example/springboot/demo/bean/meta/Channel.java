package com.example.springboot.demo.bean.meta;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String channelName;
	private List<String> subMenu = new ArrayList<String>();
	
	public Channel(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public List<String> getSubMenu() {
		return subMenu;
	}
	public void setSubMenu(List<String> subMenu) {
		this.subMenu = subMenu;
	}

}
