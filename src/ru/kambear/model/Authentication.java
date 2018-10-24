package ru.kambear.model;

import java.util.*;

public class Authentication{

	ArrayList<String> members;

	public Authentication(){
		members = new ArrayList<String>();
		members.add(new String("Dad,Password"));
		members.add(new String("Mom,Password"));
		members.add(new String("Nadya,Password"));
		members.add(new String("Misha,Password"));
	}

	public boolean isMember(String logPass){
		for (String member: members ){
			if (member.equals(logPass)) return true;
		}
		return false;
	}
	
}