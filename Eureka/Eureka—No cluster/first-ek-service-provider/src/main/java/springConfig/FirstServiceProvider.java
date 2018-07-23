package springConfig;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"controller"})
public class FirstServiceProvider {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FirstServiceProvider.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}
}
