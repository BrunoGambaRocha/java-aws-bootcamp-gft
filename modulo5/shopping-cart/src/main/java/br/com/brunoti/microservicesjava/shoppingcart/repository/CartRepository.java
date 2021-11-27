package br.com.brunoti.microservicesjava.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.brunoti.microservicesjava.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}