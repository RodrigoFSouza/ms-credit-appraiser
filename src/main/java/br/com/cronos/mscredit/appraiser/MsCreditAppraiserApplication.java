package br.com.cronos.mscredit.appraiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsCreditAppraiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCreditAppraiserApplication.class, args);
	}

}
