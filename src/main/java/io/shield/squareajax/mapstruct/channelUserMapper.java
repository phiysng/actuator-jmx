package io.shield.squareajax.mapstruct;

import github.phiysng.io.shield.ChannelUserOuterClass;
import io.shield.squareajax.common.data.ChannelUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * channelUser到Protobuf对象的转换
 */
@Mapper
public interface channelUserMapper {
    @Mapping(target = "skyScreen", source = "skyScreenList")
    ChannelUserDTO channelUserToChannelUser(ChannelUserOuterClass.ChannelUser channelUser);
}
