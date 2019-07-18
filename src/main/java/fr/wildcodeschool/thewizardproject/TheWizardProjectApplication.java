package fr.wildcodeschool.thewizardproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.wildcodeschool.thewizardproject.controllers.App;

@SpringBootApplication
public class TheWizardProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWizardProjectApplication.class, args);
		App myApp = new App();
        myApp.start();
	}

}
