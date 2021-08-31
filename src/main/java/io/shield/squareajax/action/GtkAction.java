/**
 * 
 */
package io.shield.squareajax.action;

import io.shield.squareajax.annotation.ZPath;
import io.shield.squareajax.constant.MessageProtocal;
import io.shield.squareajax.proto.Datas.IntData;
import io.shield.squareajax.proto.Datas.LongData;
import io.shield.squareajax.proto.SkyScreenOuterClass.SkyScreen;
import io.shield.squareajax.proto.SkyScreenOuterClass.ThunderSkyScreen;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GtkAction {

	@ZPath(protocal = MessageProtocal.LOGIN, sync = true)
	public void login(LongData longData) {
		log.info("login operation end...");
	}

	@ZPath(protocal = MessageProtocal.LOGOUT)
	public void logout(LongData longData) {
		log.error("logout operation end.. roleId = {}", longData.getLong());
	}

	@ZPath(protocal = MessageProtocal.BUY)
	public void buy(LongData longData, IntData number) {
		SkyScreen skyScrren = SkyScreen.newBuilder().setPriority(5).setMsg("Hello Broadcast Message").build();
		ThunderSkyScreen thunderSkyScreen = ThunderSkyScreen.newBuilder().setSkyScreen(skyScrren).build();
		log.error("{}", skyScrren);

		log.debug("roleId : {} number : {}", longData.getLong(), number.getInt());
	}
}
