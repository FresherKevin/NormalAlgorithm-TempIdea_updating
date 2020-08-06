package cn.nh.kevin;

import cn.nh.kevin.TestAbstractImpl.SonSample;
import lombok.extern.slf4j.Slf4j;

/**
 * <p> 名称：TestAbstractImpl </p>
 * <p> 描述：测试 </p>
 * <p> 版本：v1.0.0 </p>
 * <p> 日期：2020-08-04 09:29 </p>
 *
 * <p> @author：xck </p>
 */
@Slf4j
public class TestAbs {
	public static void main(String[] args) {
		SonSample sonSample = new SonSample();
		sonSample.saySomething();

		try {
			double num = 5/0;
		} catch (Exception e) {
			log.error("异常:{}",e);
		}
	}
}
