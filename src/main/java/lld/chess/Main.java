package lld.chess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		LOG.info("Starting Chess game");
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
			
			private final Logger LOG = LoggerFactory.getLogger(Main.class);
			
			@Override
			public void run() {
				LOG.info("Ending Chess game");
			}
		});
		
		SpringApplication.run(Main.class, args);
	}
}
