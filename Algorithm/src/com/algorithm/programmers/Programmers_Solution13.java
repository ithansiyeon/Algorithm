package com.algorithm.programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Programmers_Solution13 {
	public static int idx = 1;
	public static int[] answer = {};
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public int[] solution(String msg) {
		while(idx<=26) {
			map.put(String.valueOf((char)('A'+idx-1)),idx++);
		}
		solve(msg);
		answer = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
		return answer;
	}
	public void solve(String msg) {
		if(msg.isEmpty())
			return;
		String w = "";
		String c = "";
		int max = Integer.MIN_VALUE;
		for(String key:map.keySet()) {
			if(msg.startsWith(key)) {
				max = Math.max(max, key.length());
				w = (max == key.length()?key:w);
			}
		}
		list.add(map.get(w));
		msg = msg.replaceFirst(w,"");
		if(msg.length()>0) {
			c = msg.substring(0,1);
			map.put(w+c, idx++);
		}
		solve(msg);
	}
}
