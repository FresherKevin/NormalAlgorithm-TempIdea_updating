package cn.nh.kevin.Concurrent.Thread.ExtendThread;

import lombok.Getter;
import lombok.Setter;

/**
 * 标题:
 * 描述: 基础线程类
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-23 15:47
 */
@Getter
@Setter
public class BaseExThread extends Thread{
	protected String tname;
	protected Long Time;

	public BaseExThread(String name, Long time) {
		tname = name;
		Time = time;
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
