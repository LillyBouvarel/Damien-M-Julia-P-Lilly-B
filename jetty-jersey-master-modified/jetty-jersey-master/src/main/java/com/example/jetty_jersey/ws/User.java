package com.example.jetty_jersey.ws;

import java.util.List;

public class User {
	public String name;
	public Map mapPerso;
	public List<Map> mapOthers; //list of users the user (this) is following
	public List<User> followers; //list of users who are following this

}
