package cn.nh.kevin.Concurrent.Main;

import cn.nh.kevin.Concurrent.Thread.ExtendThread.WorkerExThread;


/**
 * 标题:CountDownLatch的应用场景和Join的对比
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-23 14:18
 */
public class CDLCompareToJoin {

	public void joinTest() throws InterruptedException{

		WorkerExThread[] workerThreads = new WorkerExThread[3];
		for (int i = 0; i < 3; i++) {
			workerThreads[i] = new WorkerExThread("thread" + i, 3000L);
		}

		workerThreads[0].start();
		workerThreads[1].start();

		workerThreads[0].join();
		workerThreads[1].join();

		System.out.println("ready!!");

		workerThreads[2].start();
	}




	public static void main(String[] args) throws InterruptedException {





	}

}


