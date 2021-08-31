package io.shield.squareajax.common.data;

import github.phiysng.io.shield.SkyScreenOuterClass;
import lombok.Data;

import java.util.List;

@Data
public class ChannelUserDTO {
    private long roleId;
    private String wdId;
    private long channel;
    private long subChannel;
    private List<SkyScreenOuterClass.SkyScreen> skyScreen;
}
