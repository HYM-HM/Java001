//*******这是小明修改内容*********
package com.offcn.pojo;

public class Student {

	private Person person ; 

	public void setPerson(Person person) {
		this.person = person;
	}

	public void say(){
		person.say();
	}
//添加新的方法
                public void add(){
		person.add();
	}
	
// 编辑测试（新增方法）
	public String str(){
		return "str";
	}
	
	
}
