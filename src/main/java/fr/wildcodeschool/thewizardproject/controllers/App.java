package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface mywizard = context.getBean("dumbledoreId", WizardInterface.class);
        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(mywizard.giveAdvice());
        System.out.println("******************");
        System.out.println(mywizard.changeDress());
    }
}
