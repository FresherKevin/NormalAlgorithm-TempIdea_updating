package cn.nh.kevin.Concurrent.Thread.ExtendThread;

import lombok.Getter;
import lombok.Setter;

/**
 * 标题:
 * 描述: 基础线程类
 * 版权: 税友软件集团股份有限公司
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

}
