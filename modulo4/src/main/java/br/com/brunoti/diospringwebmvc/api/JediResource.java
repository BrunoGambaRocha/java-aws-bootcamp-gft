package br.com.brunoti.diospringwebmvc.api;

import br.com.brunoti.diospringwebmvc.exception.JediNotFoundException;
import br.com.brunoti.diospringwebmvc.model.Jedi;
import br.com.brunoti.diospringwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class JediResource {

	@Autowired
	private JediRepository repository;

	@GetMapping("/api/jedi")
	public List<Jedi> getAllJedi() {
		return repository.findAll();
	}
	
	@GetMapping("/api/jedi/{id}")
	public ResponseEntity<Jedi> getJedi(@PathVariable("id") Long id) {
		final Optional<Jedi> jedi = repository.findById(id);

		if (jedi.isPresent()) {
			return ResponseEntity.ok(jedi.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/api/jedi")
	public Jedi createJedi(@Valid @RequestBody Jedi jedi) {
		return repository.save(jedi);
	}

	@PutMapping("/api/jedi/{id}")
	public ResponseEntity<Jedi> updateJedi(@PathVariable("id") Long id, @Valid @RequestBody Jedi dto) {
		final Optional<Jedi> jediEntity = repository.findById(id);
		final Jedi jedi;

		if (jediEntity.isPresent()) {
			jedi = jediEntity.get();
		} else {
			return ResponseEntity.notFound().build();
		}

		jedi.setName(dto.getName());
		jedi.setLastName(dto.getLastName());

		return ResponseEntity.ok(repository.save(jedi));
	}
}