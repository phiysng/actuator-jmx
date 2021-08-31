package io.shield.squareajax;

import java.util.List;

import io.shield.squareajax.interceptors.LogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.shield.squareajax.constant.FC;
import io.shield.squareajax.mapper.IMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Slf4j
@RestController
@SpringBootApplication
public class ActuatorApplication implements WebMvcConfigurer {

	@Autowired
	private List<IMapper> mapper;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogInterceptor());
	}

	@GetMapping("/hello/{id}")
	public String helloId(@PathVariable("id") Long id, @RequestParam(value = "name", required = false) String name) {
		log.info("当前获得的请求参数为 id:{} name:{} mapper:{}", id, name, mapper);
		log.warn("球队对应的枚举为 : {} {} {}", FC.getFC(name), FC.getFC(name).getName(), FC.getFC(name).getTrophy());

		return "hello world from : " + id;
	}

	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}

}
