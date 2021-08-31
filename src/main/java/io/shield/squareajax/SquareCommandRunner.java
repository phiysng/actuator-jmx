package io.shield.squareajax;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * @since version 1.0.0
 * @author wyshou a simple and dumb command runner.
 */
@Slf4j
@Configuration
public class SquareCommandRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello From Commandline Runner");
	}
}
