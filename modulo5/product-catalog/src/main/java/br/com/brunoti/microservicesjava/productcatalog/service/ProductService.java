package br.com.brunoti.microservicesjava.productcatalog.service;

import org.springframework.stereotype.Service;

import br.com.brunoti.microservicesjava.productcatalog.model.Product;
import br.com.brunoti.microservicesjava.productcatalog.repository.ProductRepository;

@Service
public class ProductService {

  private ProductRepository productRepository;

  public void createProductIndex(final Product product) {
    productRepository.save(product);
  }

}