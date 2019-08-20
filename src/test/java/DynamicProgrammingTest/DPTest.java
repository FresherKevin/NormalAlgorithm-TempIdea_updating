package DynamicProgrammingTest;

import cn.nh.kevin.Dynamic_Programming.Bag01;
import org.apache.log4j.Logger;
/**
 * 标题:
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-20 16:01
 */
public class DPTest {
	public static Logger LOGGER = Logger.getLogger(DPTest.class);

	public static void main(String[] args) {
		String filePath = "src/test/resource/File/bagData.txt";
		Bag01 bag = new Bag01(filePath);
		System.out.println("the max value is : " + bag.getResult());
	}
}
