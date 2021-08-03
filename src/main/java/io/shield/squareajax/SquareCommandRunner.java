package io.shield.squareajax;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class SquareCommandRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.error("Hello From Commandline Runner");
	}

}
