package com.adaptionsoft.games.uglytrivia;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
    Map<String, LinkedList> questions = new HashMap<String, LinkedList>();
    Map<Integer, String> numbers = new HashMap<Integer, String>();
    String defaultCategory;
    
    public void createQuestions(String category, int[] num) {
    	LinkedList<String> lista = new LinkedList<String>();
    	for (int i = 0; i < 50; i++) {
    		lista.addLast(category + " Question " + i);
    	}
		questions.put(category, lista);
		
		if(num.length > 0 ) {
			for(int n : num){
				numbers.put(n, category);
			}
		}
		else {
			defaultCategory = category;
		}
    }
    
    public String getQuestion(String type) {
    	return (String) questions.get(type).removeFirst();
    }
    
    public String getCategoryByNumber(int num) {
    	if(numbers.containsKey(num)) {
    		return numbers.get(num);
    	}
    	return defaultCategory;
    }
}
