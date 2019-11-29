package com.ustglobal.singleton;

public class MySingleton {
	
	private final static MySingleton instance = null;
	String s;


	private MySingleton() {

	}

	public static MySingleton getDbConnection() {

	
			return instance;
		}
	}


