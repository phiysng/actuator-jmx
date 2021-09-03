package io.shield.squareajax.action;

import io.shield.squareajax.proto.Datas.LongData;

public interface IBrowserHandler {

	/**
	 * 浏览器创建之后的回调
	 * @param handle
	 */
	public void onAfterCreated(LongData handle);
	
	/**
	 * 浏览器开始加载网页的回调
	 * @param handle
	 */
	public void onLoadStart(LongData handle);
	
	/**
	 * 浏览器结束加载时的回调
	 * @param handle
	 */
	public void onLoadEnd(LongData handle);
}
