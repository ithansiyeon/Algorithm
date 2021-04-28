package com.algorithm.programmers;

import java.util.Arrays;

public class Programmers_Solution16 {
	
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0}; 
        int cnt = 0;
        int cnt1 = 0;
        
        for(int i=0;i<lottos.length;i++) {
        	for(int j=0;j<win_nums.length;j++) {
        		if(lottos[i]==win_nums[j]) {
        			cnt++;
        		}
        	}
        	if(lottos[i]==0) {
        		cnt1++;
        	}
        }
        
        answer[0] = grade(cnt+cnt1);
        answer[1] = grade(cnt);
        return answer;
    }
    public int grade(int cnt){
        switch(cnt){
                case 6: return 1;
                case 5: return 2;
                case 4: return 3;
                case 3: return 4;
                case 2: return 5;
                default: return 6;
        }
    }
}
