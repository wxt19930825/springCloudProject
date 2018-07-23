package springConfig;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirstServer {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FirstServer.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}
}
