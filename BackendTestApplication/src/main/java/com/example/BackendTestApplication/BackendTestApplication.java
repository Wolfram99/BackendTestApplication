package com.example.BackendTestApplication;

import com.example.BackendTestApplication.Bicycle.BuildCheck;
import com.example.BackendTestApplication.Bicycle.BuildCheckDs;
import com.example.BackendTestApplication.Bicycle.WriterFile;
import com.example.BackendTestApplication.Repositories.CardRepo;
import com.example.BackendTestApplication.Repositories.JdbcProductRepo;
import com.example.BackendTestApplication.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BackendTestApplication {

	public static void main(String[] args) {
		BuildCheck b = new BuildCheckDs();



		SpringApplication.run(BackendTestApplication.class, args);

		WriterFile.writeToFile(b.buildCheckFile(args));


	}

}
