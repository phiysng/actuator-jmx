package io.shield.squareajax.action;

import io.shield.squareajax.annotation.ZPath;
import io.shield.squareajax.constant.MessageProtocal;
import io.shield.squareajax.proto.Datas.LongData;

public class CefOSRBrowserHandler implements IBrowserHandler {

	@ZPath(protocal = MessageProtocal.ON_AFTER_CREATED , sync = true)
	@Override
	public void onAfterCreated(LongData handle) {
		// TODO Auto-generated method stub

	}

	@ZPath(protocal = MessageProtocal.ON_LOAD_START , sync = true)
	@Override
	public void onLoadStart(LongData handle) {
		// TODO Auto-generated method stub

	}

	@ZPath(protocal = MessageProtocal.ON_LOAD_END , sync = false)
	@Override
	public void onLoadEnd(LongData handle) {
		// TODO Auto-generated method stub

	}

}
