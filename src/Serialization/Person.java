package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; // default serial version ID
    private String name;
    private int age;
    
	public Person(String name, int age , String var) {
		super();
		this.name = name;
		this.age = age;
		this.var=var;
	}
	// transient keyword used with some attribute that we don't it to be serialized 
	transient String var;

	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	
    
}
