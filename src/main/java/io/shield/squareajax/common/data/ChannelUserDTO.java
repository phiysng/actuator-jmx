package io.shield.squareajax.common.data;

import lombok.Data;

import java.util.List;

import io.shield.squareajax.proto.SkyScreenOuterClass.SkyScreen;

@Data
public class ChannelUserDTO {
	private long roleId;
	private String wdId;
	private long channel;
	private long subChannel;
	private List<SkyScreen> skyScreen;
}
