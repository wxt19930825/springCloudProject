package springConfig;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages={"controller"})
public class FirstServiceProvider {

	public static void main(String[] args) {
		SpringApplicationBuilder app = new SpringApplicationBuilder(FirstServiceProvider.class);
		app.application().setBannerMode(Mode.OFF);
		app.properties("server.port="+"8082").run(args);
	}
}
