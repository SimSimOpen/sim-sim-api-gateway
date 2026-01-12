package info.jemsit.SimSimGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimSimGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimSimGatewayApplication.class, args);
	}

}
