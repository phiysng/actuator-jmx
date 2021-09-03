package io.shield.squareajax.action;

import io.shield.squareajax.annotation.ZPath;
import io.shield.squareajax.constant.MessageProtocal;
import io.shield.squareajax.proto.Datas.LongData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
public class CefOSRBrowserHandler implements IBrowserHandler {

    @ZPath(protocol = MessageProtocal.ON_AFTER_CREATED, sync = true)
    @Override
    public void onAfterCreated(LongData handle) {
        log.info("{}", Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    @ZPath(protocol = MessageProtocal.ON_LOAD_START, sync = true)
    @Override
    public void onLoadStart(LongData handle) {
        log.info("{}", Arrays.toString(Thread.currentThread().getStackTrace()));
    }

    @ZPath(protocol = MessageProtocal.ON_LOAD_END, sync = false)
    @Override
    public void onLoadEnd(LongData handle) {
        log.info("{}", Arrays.toString(Thread.currentThread().getStackTrace()));
    }

}
