package com.fundamentosspringboottest2.fundamentostest2;

import com.fundamentosspringboottest2.fundamentostest2.component.ComponentDependency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Fundamentostest2Application implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public Fundamentostest2Application(ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}


	public static void main(String[] args) {
		SpringApplication.run(Fundamentostest2Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
	}
}
