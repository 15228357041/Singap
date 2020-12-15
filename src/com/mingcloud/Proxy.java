package com.mingcloud;


import com.mingcloud.proxy.logiclayer.singaporedata.*;
import com.mingcloud.proxy.util.DateHelper;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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


//		SingaporeDataThread dimissionThread = new SingaporeDataThread();
//		Thread userDimissionThread = new Thread(dimissionThread);
//		userDimissionThread.setName("UserDimissionThread");
//		userDimissionThread.start();

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		long oneDay = 24 * 60 * 60 * 1000;
		long initDelay  = DateHelper.getTimeMillis("02:00:00") - System.currentTimeMillis();
		initDelay = initDelay > 0 ? initDelay : oneDay + initDelay;
		executor.scheduleAtFixedRate(
				new SingaporeDataThread(),
				initDelay,
				oneDay,
				TimeUnit.MILLISECONDS);


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

//		SingaporeDataThread singaporeDataTranThread = new SingaporeDataThread();
//		Thread singaporeDataThread = new Thread(singaporeDataTranThread);
//		singaporeDataThread.setName("UserDimissionThread");
//		singaporeDataThread.start();
	}
}
