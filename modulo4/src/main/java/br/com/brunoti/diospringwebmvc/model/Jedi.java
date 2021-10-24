package br.com.brunoti.diospringwebmvc.model;

import javax.validation.constraints.NotBlank;

public class Jedi {

	@NotBlank
	private String lastName;

	@NotBlank
	private String name;

	public Jedi(final String name, final String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public Jedi() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}