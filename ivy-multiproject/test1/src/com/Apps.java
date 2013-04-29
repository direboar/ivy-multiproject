package com;

import common.Com;

public class Apps {

	public void hello(){
		System.out.println("goodby");
		Com com = new Com();
		com.exec();
	}

	public static void main(String args[]){
		new Apps().hello();
	}

}
