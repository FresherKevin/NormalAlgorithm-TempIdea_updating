package cn.nh.kevin.Concurrent.Thread.ExtendThread;

import java.util.concurrent.CountDownLatch;

/**
 * 标题:
 * 描述:两阶段工作线程
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-23 15:50
 */
public class TwoPartWokerExThread extends BaseExThread {

	private CountDownLatch countDownLatch;
	public TwoPartWokerExThread(String name, Long time, CountDownLatch countDownLatch) {
		super(name, time);
		this.countDownLatch = countDownLatch;
	}
	@Override
	public void run(){
		try{
			System.out.println(tname+"第一阶段开始");
			Thread.sleep(Time);
			System.out.println(tname+"第一阶段结束"+","+tname+"第二阶段开始");
			countDownLatch.countDown();

			Thread.sleep(Time);

			System.out.println(tname+"第二阶段结束");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
