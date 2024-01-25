package edu.wgu.d387_sample_code;


import edu.wgu.d387_sample_code.Internationalization.MessageRetriever;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;




@SpringBootApplication
public class D387SampleCodeApplication {
	static ExecutorService messageExecutor = Executors.newFixedThreadPool(5);
	static Properties properties = new Properties();


	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);

	}

	@EventListener(ContextRefreshedEvent.class)
	public void onApplicationEvent () {
		messageExecutor.execute(() -> {
			try {
				InputStream stream = new ClassPathResource("ResourceBundle_en_US.properties").getInputStream();
				properties.load(stream);
				System.out.println(properties.getProperty("Greeting"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		messageExecutor.execute(() -> {
			try {
				InputStream stream = new ClassPathResource("ResourceBundle_fr_CA.properties").getInputStream();
				properties.load(stream);
				System.out.println(properties.getProperty("Greeting"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		MessageRetriever englishResource = new MessageRetriever("en", "US");
		MessageRetriever frenchResource = new MessageRetriever("fr", "CA");

		Thread englishThread = new Thread(() -> {
			String welcomeMessage = englishResource.getWelcomeMessage();
			System.out.println("English Welcome Message: " + welcomeMessage);
		});

		Thread frenchThread = new Thread(() -> {
			String welcomeMessage = frenchResource.getWelcomeMessage();
			System.out.println("French Welcome Message: " + welcomeMessage);
		});

		englishThread.start();
		frenchThread.start();
	}

}

