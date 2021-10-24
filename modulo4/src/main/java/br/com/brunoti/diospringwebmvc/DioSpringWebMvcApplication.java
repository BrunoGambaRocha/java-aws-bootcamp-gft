package br.com.brunoti.diospringwebmvc;

import br.com.brunoti.diospringwebmvc.repository.JediRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.brunoti.diospringwebmvc.model")
@EnableJpaRepositories(basePackages = "br.com.brunoti.diospringwebmvc.repository")
public class DioSpringWebMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  configurableApplicationContext = SpringApplication.run(DioSpringWebMvcApplication.class, args);
		JediRepository jediRepository = configurableApplicationContext.getBean(JediRepository.class);
	}
}