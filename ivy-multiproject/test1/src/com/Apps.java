package com;

import common.Com;

public class Apps {

	public void hello() throws Exception{
		System.out.println("goodby");
		Com com = new Com();
		com.exec();
	}

	public static void main(String args[]) throws Exception{
		new Apps().hello();
	}

}
