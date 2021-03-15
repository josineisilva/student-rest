package br.unitau.inf.student.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import br.unitau.inf.student.model.Student;

public class StudentPostDTO {
	@NotBlank
	private String name;
	private Integer age;
	@Email
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void update(Student obj) {
		obj.setName(name);
		obj.setAge(age);
		obj.setEmail(email);
	}
}