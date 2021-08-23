package io.shield.squareajax.controller;

import github.phiysng.io.shield.SkyScreenOuterClass.SkyScreen;
import github.phiysng.io.shield.SkyScreenOuterClass.ThunderSkyScreen;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.LongStream;

@RestController
public class ProtoControllere {
    @GetMapping("/proto/")
    public ResponseEntity<byte[]> handleProtoRequest() {
        SkyScreen skyScrren = SkyScreen.newBuilder().build();
        ThunderSkyScreen.Builder thunderSkyScreenBuilder = ThunderSkyScreen.newBuilder()
                .setSkyScreen(skyScrren).setId(1001);
        Map<Long, Long> map = thunderSkyScreenBuilder.getKateMapMap();

        LongStream.range(0, 10).forEach(i -> {
            //  read-only map
            //   map.put(i, i * 10);
            thunderSkyScreenBuilder.putKateMap(i, i * 10);
        });

        return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(thunderSkyScreenBuilder.build().toByteArray());
    }
}
