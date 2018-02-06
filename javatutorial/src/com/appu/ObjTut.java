package com.appu;

public class ObjTut {

	public ObjTut(int i,int j){
		this.i=i;
		System.out.println("i == "+i);
	}
	int i;int j;int k;
	public void dos(int g){
		this.i=g;
		gg();
	}
	public static void gg(){
		System.out.println("dfds");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ObjTut o1=new ObjTut(1,2);
		System.out.println(o1.i);
		//o1.i=2;
		System.out.println(o1.i);
		ObjTut o2=new ObjTut(3,4);
		//o2.dos(3);
		gg();
		System.out.println(o2.i);
		System.out.println("first == "+o1.i);
	}

}
