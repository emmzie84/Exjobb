package com.example.exjobb;

public class DBAdapter {
	static final String DATABASE_NAME = "mydb";
	static final int DATABASE_VERSION = 1;

	private static final String CREATE_TABLE_DRUGS = "create table drugs (_id integer primary key autoincrement, "
			+ DrugsDBAdapter.DRUG_NAME + " TEXT,"
			+ DrugsDBAdapter.TYPE + " TEXT,"
			+ DrugsDBAdapter.POTENCY + " TEXT,"
			+ DrugsDBAdapter.SIZE + " TEXT,"
			+ DrugsDBAdapter.PREFERENTIAL_PRICE + " TEXT,"
			+ DrugsDBAdapter.PRESCRIPTION_ONLY + " TEXT" + ");";
	
	private static final String CREATE_TABLE_PHARMACIES = "create table pharmacies (_id integer primary key autoincrement, "
			+ PharmaciesDBAdapter.CHAIN_NAME + " TEXT,"
			+ PharmaciesDBAdapter.PHARMACY_NAME + " TEXT,"
			+ PharmaciesDBAdapter.ADDRESS + " TEXT,"
			+ PharmaciesDBAdapter.POSTAL_CODE + " INTEGER,"
			+ PharmaciesDBAdapter.POSTAL_AREA + " TEXT,"
			+ PharmaciesDBAdapter.LATITUDE + " TEXT,"
			+ PharmaciesDBAdapter.LONGITUDE + " TEXT,"
			+ PharmaciesDBAdapter.PHONE_NBR + " TEXT,"
			+ PharmaciesDBAdapter.OPENING_HOURS_WD + " TEXT,"
			+ PharmaciesDBAdapter.CLOSING_HOURS_WD + " TEXT,"
			+ PharmaciesDBAdapter.OPENING_HOURS_SAT + " TEXT,"
			+ PharmaciesDBAdapter.CLOSING_HOURS_SAT + " TEXT,"
			+ PharmaciesDBAdapter.OPENING_HOURS_SUN + " TEXT,"
			+ PharmaciesDBAdapter.CLOSING_HOURS_SUN + " TEXT" + ");";
	
	private static final String CREATE_TABLE_STOCK = "create table stock"
			+ StockDBAdapter.DRUG_ID + "(INTEGER,"
			+ StockDBAdapter.PHARMACY_ID + " INTEGER,"
			+ StockDBAdapter.NUMBER + " INTEGER,"
			+ StockDBAdapter.PRICE + " INTEGER" + ");";
}
