package com.practise;

public class MySqlDbImpl implements DBOperation{

	@Override
	public void delete() {
		System.out.println("--Deleting in mysql");
		
	}

	@Override
	public void store() {
		System.out.println("--Storing in mysql");
		
	}

}
