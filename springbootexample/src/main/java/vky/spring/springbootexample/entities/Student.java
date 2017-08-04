package vky.spring.springbootexample.entities;


public class Student {
	private int id;
	private String name;
	private String address;
	private String topic;
	private String course;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String address, String topic, String course) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.topic = topic;
		this.course = course;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}	
}
