package arcmop.blog.springbootest.configuracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import arcmop.blog.springbootest.repository.SumaRepository;

@SpringBootApplication(scanBasePackages = "arcmop.blog.springbootest")
@EntityScan("arcmop.blog.springbootest.entity")
@EnableJpaRepositories("arcmop.blog.springbootest.repository")
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
