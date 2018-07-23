package springConfig;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirstServer {
	public static void main(String[] args) {
		
		SpringApplicationBuilder app = new SpringApplicationBuilder(FirstServer.class);
		app.application().setBannerMode(Mode.OFF);
		app.profiles("slave2").run(args);
	}
}
