package com.offcn.pojo;

public class Student {

	private Person person ; 

	public void setPerson(Person person) {
		this.person = person;
	}

	public void say(){
		person.say();
	}
	
	
}
