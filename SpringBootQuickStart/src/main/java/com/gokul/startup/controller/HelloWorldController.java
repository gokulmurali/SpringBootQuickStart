package com.gokul.startup.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {

		return "Hello World!!";
	}

	@RequestMapping("/jsonObjects")
	public List<JsonObject> objects() {

		return Arrays.asList(
				new JsonObject("one", "tom", "Its toms Object!"),
				new JsonObject("two", "jack", "Its jacks Object!"),
				new JsonObject("three", "tom", "Its harry Object!"));
	}
}

class JsonObject {

	String id;
	String name;
	String description;

	public JsonObject(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
