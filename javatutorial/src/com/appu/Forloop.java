package com.appu;

import java.util.ArrayList;
import java.util.List;

public class Forloop {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
			
		}
		for(int i:l){
			if(i==2) continue;
			System.out.println("foreach "+i);
		}
		
		List<Integer> j=new ArrayList();
		j.add(1);
		j.add(2);
		j.add(3);
		j.add(4);
		j.add(5);
		j.add(6);
		
		aa:
			for(int i:l){
				
				bb:
					for(int k:j){
						if(i==k){
							System.out.println("loop done");
							break aa;
						}
					}
			}
		
		
		
		
		
	}

}
