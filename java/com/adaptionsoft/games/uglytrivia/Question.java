package com.adaptionsoft.games.uglytrivia;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
    Map<String, LinkedList> questions = new HashMap<String, LinkedList>();
	

    
    public Question(String[] types) {
		for(String type : types) {
	    	LinkedList<String> lista = new LinkedList<String>();
	    	for (int i = 0; i < 50; i++) {
	    		lista.addLast(type + " Question " + i);
	    	}
			questions.put(type, lista);
    	}
    }
    
    public String get(String type) {
    	return (String) questions.get(type).removeFirst();
    }
}
