package andreasgroup.medicineproductioneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MedicineProductionEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicineProductionEurekaApplication.class, args);
	}

}
