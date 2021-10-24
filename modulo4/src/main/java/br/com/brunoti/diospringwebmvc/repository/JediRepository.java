package br.com.brunoti.diospringwebmvc.repository;

import br.com.brunoti.diospringwebmvc.model.Jedi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JediRepository extends CrudRepository<Jedi, Long> {

	List<Jedi> findAll();

	Jedi findByName(String name);

	Jedi save(Jedi jedi);
}