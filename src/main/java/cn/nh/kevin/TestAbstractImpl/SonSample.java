package cn.nh.kevin.TestAbstractImpl;

/**
 * <p> 名称：SonSample </p>
 * <p> 描述：子类 </p>
 * <p> 版本：v1.0.0 </p>
 * <p> 日期：2020-08-04 09:13 </p>
 *
 * <p> @author：xck </p>
 */
public class SonSample extends AbstractSample implements ImplementSample {

	@Override
	public void saySomething(){
		System.out.println("hello");
	}
}
