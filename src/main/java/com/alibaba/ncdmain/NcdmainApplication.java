package com.alibaba.ncdmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

//@SpringCloudApplication
@SpringBootApplication
public class NcdmainApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcdmainApplication.class, args);
		//System.out.println(System.getProperty("user.dir"));
	}
}
