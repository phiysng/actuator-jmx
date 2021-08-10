/**
 * 
 */
package io.shield.squareajax.action;

import io.shield.squareajax.annotation.ZPath;
import io.shield.squareajax.constant.MessageProtocal;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class GtkAction {
	
	@ZPath(protocal = MessageProtocal.LOGIN)
	public void login(long roleId) {
		log.info("login operation end...");
	}
	
	@ZPath(protocal = MessageProtocal.LOGOUT)
	public void logout(long roleId) {
		log.error("登出操作");
	}
}
