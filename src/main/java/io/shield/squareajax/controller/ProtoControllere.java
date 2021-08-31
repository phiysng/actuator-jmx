package io.shield.squareajax.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.shield.squareajax.proto.SkyScreenOuterClass.SkyScreen;
import io.shield.squareajax.proto.SkyScreenOuterClass.ThunderSkyScreen;

import java.io.IOException;
import java.util.Map;
import java.util.stream.LongStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping("/proto")
public class ProtoControllere {
	@GetMapping("/decode")
	public ResponseEntity<String> handleProtoRequest() {
		SkyScreen skyScrren = SkyScreen.newBuilder().build();
		ThunderSkyScreen.Builder thunderSkyScreenBuilder = ThunderSkyScreen.newBuilder().setSkyScreen(skyScrren)
				.setId(1001);
		Map<Long, Long> map = thunderSkyScreenBuilder.getKateMapMap();

		LongStream.range(0, 10).forEach(i -> {
			// read-only map
			// map.put(i, i * 10);
			thunderSkyScreenBuilder.putKateMap(i, i * 10);
		});

		log.info("response : {}", thunderSkyScreenBuilder);
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.TEXT_PLAIN)
				.body(thunderSkyScreenBuilder.build().toString());
	}

	@GetMapping("/toString")
	public void handleProtoToString(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		try {
			log.info("id : {}", Integer.valueOf(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			log.error("error during parsing int in handleProtoToString...", e);
		}

		try {
			response.sendRedirect("https://www.baidu.com");
		} catch (IOException e) {
			log.error("error during set redirect url in handleProtoToString...", e);
		}

		log.info("handleProtoToString end... request:{} response:{}", request, response);
	}

}
