package io.shield.squareajax.mapstruct;

import io.shield.squareajax.common.data.ChannelUserDTO;
import io.shield.squareajax.proto.ChannelUserOuterClass.ChannelUser;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * channelUser到Protobuf对象的转换
 */
@Mapper
public interface channelUserMapper {
	@Mapping(target = "skyScreen", source = "skyScreenList")
	ChannelUserDTO channelUserToChannelUser(ChannelUser channelUser);
}
