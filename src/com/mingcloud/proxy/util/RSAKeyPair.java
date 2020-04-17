   
/**
 * 
 * @author wf.shu
 * @since 2017å¹?12æœ?1æ—? ä¸Šåˆ8:57:06
*/

package com.mingcloud.proxy.util;

  
/**
 * å…¬ç§é’¥å¯¹
 * @author wf.shu
 * @since 2017å¹?12æœ?1æ—? ä¸Šåˆ8:57:06
*/

public class RSAKeyPair {
	/**
	 * Keyï¼šå…¬é’?
	 */
	private String publicKey;
	/**
	 * Key: ç§é’¥ 
	 */
	private String privateKey;
	
	/**
	 * è·å–å…¬é’¥
	 * 
	 * @author wf.shu
	 * @since 2017å¹?12æœ?1æ—? ä¸Šåˆ8:58:05
	 * @return å…¬é’¥å€?
	 */
	public String getPublicKey() {
		return publicKey;
	}
	/**
	 * set å…¬é’¥
	 * 
	 * @author wf.shu
	 * @since 2017å¹?12æœ?1æ—? ä¸Šåˆ8:59:26
	 * @param publicKey
	 */
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	/**
	 * è·å–ç§é’¥
	 * 
	 * @author wf.shu
	 * @since 2017å¹?12æœ?1æ—? ä¸Šåˆ8:58:29
	 * @return ç§é’¥å€?
	 */
	public String getPrivateKey() {
		return privateKey;
	}
	/**
	 * set ç§é’¥
	 * 
	 * @author wf.shu
	 * @since 2017å¹?12æœ?1æ—? ä¸Šåˆ8:59:41
	 * @param privateKey ç§é’¥
	 */
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

}
