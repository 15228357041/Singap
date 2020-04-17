   
/**
 * 
 * @author wf.shu
 * @since 2017�?12�?1�? 上午8:57:06
*/

package com.mingcloud.proxy.util;

  
/**
 * 公私钥对
 * @author wf.shu
 * @since 2017�?12�?1�? 上午8:57:06
*/

public class RSAKeyPair {
	/**
	 * Key：公�?
	 */
	private String publicKey;
	/**
	 * Key: 私钥 
	 */
	private String privateKey;
	
	/**
	 * 获取公钥
	 * 
	 * @author wf.shu
	 * @since 2017�?12�?1�? 上午8:58:05
	 * @return 公钥�?
	 */
	public String getPublicKey() {
		return publicKey;
	}
	/**
	 * set 公钥
	 * 
	 * @author wf.shu
	 * @since 2017�?12�?1�? 上午8:59:26
	 * @param publicKey
	 */
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	/**
	 * 获取私钥
	 * 
	 * @author wf.shu
	 * @since 2017�?12�?1�? 上午8:58:29
	 * @return 私钥�?
	 */
	public String getPrivateKey() {
		return privateKey;
	}
	/**
	 * set 私钥
	 * 
	 * @author wf.shu
	 * @since 2017�?12�?1�? 上午8:59:41
	 * @param privateKey 私钥
	 */
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

}
