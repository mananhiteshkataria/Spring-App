package com.practise;

public class OracleDbImpl implements DBOperation {

	@Override
	public void delete() {
		
		System.out.println("--delete() in oracle---");
	}

	@Override
	public void store() {
		
		System.out.println("--store() in oracle---");
		
	}

}
