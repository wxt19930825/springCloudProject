package config;


import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages={"controller"})
public class FirstInvoker {
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(FirstInvoker.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}

}
