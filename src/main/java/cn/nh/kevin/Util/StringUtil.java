package cn.nh.kevin.Util;

/**
 * 标题:
 * 描述:
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-20 15:31
 */
public class StringUtil {

	private static volatile StringUtil instance = null;

	private StringUtil(){

	}

	public static StringUtil getInstance(){
		if (instance == null)
			synchronized (StringUtil.class){
				if (instance == null){
					instance = new StringUtil();
				}
		}
		return instance;
	}

	/**
	 * @Description //TODO
	 * @Author xck
	 * @Date 2019/8/20 15:34
	 * @param data
	 * @return int[]
	 **/
	public int[] StringToInt(String[] data){
		int[] result = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			result[i] = Integer.parseInt(data[i]);
		}
		return result;
	}
}
