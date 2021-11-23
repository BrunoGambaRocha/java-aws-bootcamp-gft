package br.com.brunoti.microservicesjava.productcatalog.repository;

import br.com.brunoti.microservicesjava.productcatalog.model.Product;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Long> {

    List<Product> findByName(String name);

}