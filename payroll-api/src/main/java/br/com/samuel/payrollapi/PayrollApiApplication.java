package br.com.samuel.payrollapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PayrollApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollApiApplication.class, args);
    }

}
