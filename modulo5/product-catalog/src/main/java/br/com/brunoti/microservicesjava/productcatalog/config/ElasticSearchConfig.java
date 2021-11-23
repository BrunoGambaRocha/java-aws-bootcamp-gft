package br.com.brunoti.microservicesjava.productcatalog.config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.http.HttpHeaders;

@Configuration
@EnableElasticsearchRepositories(basePackages = "br.com.brunoti.microservicesjava.productcatalog.repository")
@ComponentScan(basePackages = { "br.com.brunoti.microservicesjava.productcatalog" })
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

	@Override
	@Bean
	public RestHighLevelClient elasticsearchClient() {

		final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
				.connectedTo("192.168.99.100:9200", "192.168.99.100:9300")
				.withHeaders(() -> {                                                  
					HttpHeaders headers = new HttpHeaders();
					headers.add("currentTime", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
					return headers;
				  })
				.build();

		return RestClients.create(clientConfiguration).rest();
	}

}