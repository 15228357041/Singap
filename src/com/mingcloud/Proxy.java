package com.mingcloud;


import com.mingcloud.proxy.logiclayer.singaporedata.*;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author zxf
 */
public class Proxy {
	private static Logger logger = Logger.getLogger(Proxy.class);
	public static Boolean flag = true;

	@SuppressWarnings("unused")
	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) throws InterruptedException,IOException {
		logger.info("Proxy proceeding...");
		//加载spring上下文
		classPathXmlApplicationContext = new
				ClassPathXmlApplicationContext("classpath:applicationContext.xml");


		SingaporeDataThread dimissionThread = new SingaporeDataThread();
		Thread userDimissionThread = new Thread(dimissionThread);
		userDimissionThread.setName("UserDimissionThread");
		userDimissionThread.start();

		/*if (flag) {
			SingaporePlanEnergyThread singaporePlanEnergyThread = new SingaporePlanEnergyThread();
			Thread singaporeEnergyThread = new Thread(singaporePlanEnergyThread);
			singaporeEnergyThread.setName("SingaporeEnergyThread");
			singaporeEnergyThread.start();
		}*/

        /*if (flag){
            ComIntoLineThread singaporeDataTranThread = new ComIntoLineThread();
            Thread singaporeDataThread = new Thread(singaporeDataTranThread);
            singaporeDataThread.setName("UserDimissionThread");
            singaporeDataThread.start();
        }*/

		/*if (flag){
			SingaporePlanEnergyThread singaporeDataTranThread = new SingaporePlanEnergyThread();
			Thread singaporeDataThread = new Thread(singaporeDataTranThread);
			singaporeDataThread.setName("UserDimissionThread");
			singaporeDataThread.start();
		}*/

		/*if (flag){
			Test singaporeDataTranThread = new Test();
			Thread singaporeDataThread = new Thread(singaporeDataTranThread);
			singaporeDataThread.setName("UserDimissionThread");
			singaporeDataThread.start();
		}*/
	}
}

