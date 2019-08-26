package cn.nh.kevin.Concurrent.Thread.ExtendThread;

import java.util.concurrent.CountDownLatch;

/**
 * 标题:
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-26 10:30
 */
public class WorkCDLThread extends BaseExThread{

	private CountDownLatch countDownLatch;

	public WorkCDLThread(String name, Long time,CountDownLatch countDownLatch) {
		super(name, time);
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try{
			System.out.println(tname + "begin");
			Thread.sleep(Time);
			System.out.println(tname + "end");

			countDownLatch.countDown();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
