package cn.nh.kevin.Concurrent.Thread.ExtendThread;

/**
 * 标题:
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-23 15:49
 */
public class WorkerExThread extends BaseExThread {
	public WorkerExThread(String name, Long time) {
		super(name, time);
	}

	@Override
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
