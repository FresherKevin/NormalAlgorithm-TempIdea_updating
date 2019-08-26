package cn.nh.kevin.CDLTest;

import cn.nh.kevin.Concurrent.Thread.ExtendThread.BaseExThread;
import cn.nh.kevin.Concurrent.Thread.ExtendThread.TwoPartWokerExThread;
import cn.nh.kevin.Concurrent.Thread.ExtendThread.WorkCDLThread;
import cn.nh.kevin.Concurrent.Thread.ExtendThread.WorkerExThread;
import org.apache.log4j.Logger;

import java.util.concurrent.CountDownLatch;

/**
 * 标题:CountDownLatch的应用场景和Join的对比
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-23 14:18
 */
public class CDLCompareToJoin {

	public static final Logger LOGGER = Logger.getLogger(CDLCompareToJoin.class);

	public void joinTest() throws InterruptedException{
		LOGGER.info("join");
		WorkerExThread[] baseExThreads = new WorkerExThread[3];
		for (int i = 0; i < 3; i++) {
			baseExThreads[i] = new WorkerExThread("jointhread" + i, 3000L);
		}

		baseExThreads[0].start();
		baseExThreads[1].start();

		baseExThreads[0].join();
		baseExThreads[1].join();

		System.out.println("ready!!");

		baseExThreads[2].start();
	}

	public void CDLTest() throws InterruptedException{
		LOGGER.info("CountDownLatch");
		BaseExThread[] baseExThreads = new WorkCDLThread[3];
		CountDownLatch countDownLatch = new CountDownLatch(2);
		for (int i = 0; i < 3; i++) {
			baseExThreads[i] = new WorkCDLThread("CDLthread" + i, 3000L,countDownLatch);
		}

		baseExThreads[0].start();
		baseExThreads[1].start();

		countDownLatch.await();
		System.out.println("ready!!");

		baseExThreads[2].start();


	}

	public void CDLTwoPartTest() throws InterruptedException{
		BaseExThread[] baseExThreads = new TwoPartWokerExThread[3];
		CountDownLatch countDownLatch = new CountDownLatch(2);
		for (int i = 0; i < 3; i++) {
			baseExThreads[i] = new TwoPartWokerExThread("TwoCDLthread" + i, 3000L,countDownLatch);
		}

		baseExThreads[0].start();
		baseExThreads[1].start();

		countDownLatch.await();

		System.out.println("ready!!");

		baseExThreads[2].start();
	}

	public static void main(String[] args) throws InterruptedException {

		CDLCompareToJoin cdlCompareToJoin = new CDLCompareToJoin();
		cdlCompareToJoin.joinTest();
		cdlCompareToJoin.CDLTest();
		cdlCompareToJoin.CDLTwoPartTest();

	}

}


