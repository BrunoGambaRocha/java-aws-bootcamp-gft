package br.com.brunoti.diospringwebmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "jedi")
public class Jedi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(name = "name")
	@Size(min = 3, max = 20, message = "Name must have between 3 and 20 letters")
	private String name;

	@NotBlank
	@Column(name = "last_name")
	@Size(max = 20, message = "Last Name must not have more than 20 letters")
	private String lastName;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Jedi(final String name, final String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public Jedi() {
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
}