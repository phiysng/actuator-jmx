/**
 * 
 */
package io.shield.squareajax.action;

import io.shield.squareajax.annotation.ZPath;
import io.shield.squareajax.constant.MessageProtocal;
import lombok.extern.slf4j.Slf4j;
import github.phiysng.io.shield.SkyScreen;

@Slf4j
public class GtkAction {
	
	@ZPath(protocal = MessageProtocal.LOGIN)
	public void login(long roleId) {
		log.info("login operation end...");
	}
	
	@ZPath(protocal = MessageProtocal.LOGOUT)
	public void logout(long roleId) {
		log.error("logout operation end..");
	}

	@ZPath(protocal = MessageProtocal.BUY)
	public void buy(Long roleId){
		SkyScreen.SkyScrren skyScrren = SkyScreen.SkyScrren.newBuilder().setPriority(5).setMsg("Hello Broadcast Message").build();
		log.error("{}", skyScrren);
	}
}
