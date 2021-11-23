package br.com.brunoti.microservicesjava.productcatalog.model;

import org.elasticsearch.core.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "product")
public class Product {

	@Id
	private Long id;
	
	@Nullable
	@Field(type = FieldType.Text)
	private String name;

	@Nullable
	@Field(type = FieldType.Integer)
	private Integer amount;

	public Long getId() { return id; }

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
