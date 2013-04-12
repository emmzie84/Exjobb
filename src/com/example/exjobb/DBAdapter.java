package com.example.exjobb;

public class DBAdapter {
	public static final String DATABASE_NAME = "mydb";
	public static final int DATABASE_VERSION = 1;
	
	private static final String CREATE_TABLE_DRUGS = "create table drugs (_id integer primary key autoincrement, "
			+ DrugsDBAdapter.DRUG_NAME + " TEXT,"
			+ DrugsDBAdapter.TYPE + " TEXT,"
			+ DrugsDBAdapter.POTENCY + " TEXT,"
			+ DrugsDBAdapter.SIZE + " TEXT,"
			+ DrugsDBAdapter.PREFERENTIAL_PRICE + " TEXT,"
			+ DrugsDBAdapter.PRESCRIPTION_ONLY + " TEXT" + ");";
	
	
}
