package cn.nh.kevin.Concurrent.Thread.ImplementRunable;

import cn.nh.kevin.Concurrent.Thread.ImplementRunable.BaseThread;

/**
 * 标题:
 * 描述: 工作线程
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-23 15:29
 */
public class WorkerThread extends BaseThread {

	public WorkerThread(String name, Long time) {
		super(name, time);
	}

	public void run() {
		try{
			System.out.println(tname + "begin");
			Thread.sleep(Time);
			System.out.println(tname + "end");
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}

}
