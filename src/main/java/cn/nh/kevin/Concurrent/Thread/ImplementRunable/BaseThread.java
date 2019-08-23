package cn.nh.kevin.Concurrent.Thread.ImplementRunable;

import lombok.Getter;
import lombok.Setter;

/**
 * 标题:
 * 描述: 基础线程类实现Runable接口
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-23 14:36
 */
@Getter
@Setter
public abstract class BaseThread implements Runnable{
	protected String tname;
	protected Long Time;

	public BaseThread(String name, Long time) {
		tname = name;
		Time = time;
	}
}
