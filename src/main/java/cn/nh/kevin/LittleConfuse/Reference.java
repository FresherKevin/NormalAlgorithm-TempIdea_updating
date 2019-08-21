package cn.nh.kevin.LittleConfuse;

/**
 * 标题:测试数组的引用对象
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-19 09:07
 */
public class Reference {
	public static void main(String[] args) {
		int []data = {1,2,3,4};
		int []test = data;
		for (int i = 0; i < test.length; i++) {
			test[i] = 6;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
