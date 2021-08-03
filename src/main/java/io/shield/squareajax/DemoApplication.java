package io.shield.squareajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@SpringBootApplication
public class DemoApplication {

	@Autowired
	private List<IMapper> mapper;
	
	@GetMapping("/hello/{id}")
	public String helloId(@PathVariable("id") Long id ,
			@RequestParam(value = "name" ,required=false) String name) {
		log.info("当前获得的请求参数为 id:{}",id);
		log.info("当前获得的请求参数为 name:{}",name);
		log.info("当前获得的请求参数为 mapper:{}",mapper);
		return "hello world from : " + id;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
