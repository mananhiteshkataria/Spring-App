package com.practise;

public class UserService {
	private DBOperation dbop1;

	public void setDbop1(DBOperation dbop1) {
		this.dbop1 = dbop1;
	}
	
	public void save()
	{
		System.out.println("--save() in service--");
		dbop1.store();
	}
	public void delete() {
		System.out.println("--delete() in service--");
		dbop1.delete();
	}
}
