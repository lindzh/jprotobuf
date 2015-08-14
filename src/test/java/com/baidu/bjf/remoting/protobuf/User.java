package com.baidu.bjf.remoting.protobuf;

import java.io.Serializable;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

public class User implements Serializable{

	private static final long serialVersionUID = -5510226916379032896L;
	
	@Protobuf(description = "id", order = 1, required = true, fieldType = FieldType.UINT64)
	private long id;
	@Protobuf(description = "name", order = 2, required = true, fieldType = FieldType.STRING)
	private String name;
	@Protobuf(description = "age", order = 3, required = true, fieldType = FieldType.UINT32)
	private int age;
	@Protobuf(description = "money", order = 4, required = true, fieldType = FieldType.DOUBLE)
	private double money;
	@Protobuf(description = "money", order = 5, required = true, fieldType = FieldType.FLOAT)
	private float price;
	@Protobuf(description = "sex", order = 6, required = true, fieldType = FieldType.UINT32)
	private int sex;
	@Protobuf(description = "valid", order = 7, required = true, fieldType = FieldType.BOOL)
	private boolean valid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", money=" + money + ", price=" + price + ", sex=" + sex
				+ ", valid=" + valid + "]";
	}
}
