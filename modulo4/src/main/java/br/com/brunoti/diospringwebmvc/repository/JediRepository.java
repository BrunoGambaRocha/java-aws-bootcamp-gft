package br.com.brunoti.diospringwebmvc.repository;

import br.com.brunoti.diospringwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
	private List<Jedi> jedi;

	public JediRepository() {
		jedi = new ArrayList<>();
		jedi.add(new Jedi("Luke", "Skywalker"));
	}

	public List<Jedi> getAllJedi() {
		return this.jedi;
	}

	public void createJedi(final Jedi jedi) {
		this.jedi.add(jedi);
	}
}