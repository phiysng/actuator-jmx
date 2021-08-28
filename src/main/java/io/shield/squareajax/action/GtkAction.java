/**
 * 
 */
package io.shield.squareajax.action;

import io.shield.squareajax.annotation.ZPath;
import io.shield.squareajax.constant.MessageProtocal;
import lombok.extern.slf4j.Slf4j;
import github.phiysng.io.shield.Datas.IntData;
import github.phiysng.io.shield.Datas.LongData;
import github.phiysng.io.shield.SkyScreenOuterClass.SkyScreen;
import github.phiysng.io.shield.SkyScreenOuterClass.ThunderSkyScreen;

@Slf4j
public class GtkAction {

	@ZPath(protocal = MessageProtocal.LOGIN , sync = true)
	public void login(LongData longData) {
		log.info("login operation end...");
	}

	@ZPath(protocal = MessageProtocal.LOGOUT)
	public void logout(LongData longData) {
		log.error("logout operation end.. roleId = {}" , longData.getLong());
	}

	@ZPath(protocal = MessageProtocal.BUY)
	public void buy(LongData longData, IntData number) {
		SkyScreen skyScrren = SkyScreen.newBuilder().setPriority(5).setMsg("Hello Broadcast Message").build();
		ThunderSkyScreen thunderSkyScreen = ThunderSkyScreen.newBuilder().setSkyScreen(skyScrren).build();
		log.error("{}", skyScrren);

		log.debug("roleId : {} number : {}", longData.getLong(), number.getInt());
	}
}
