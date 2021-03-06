package com.ezhil.JAX_RS_PutAndDelete.database;

import java.util.HashMap;
import java.util.Map;

import com.ezhil.JAX_RS_PutAndDelete.model.Message;
import com.ezhil.JAX_RS_PutAndDelete.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();
	
	public static Map<Long, Message> getMessage(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}

}
