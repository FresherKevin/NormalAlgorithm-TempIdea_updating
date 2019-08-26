package cn.nh.kevin.Util;



import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 标题:
 * 描述:
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-15 14:52
 */
public class DataUtil {

	private static final Logger LOGGER = Logger.getLogger(DataUtil.class);

	/**
	 * @Description //TODO 
	 * @Author xck
	 * @Date 2019/8/15 17:43
	 * @param pathName
	 * @return void
	 **/
	public void getData(String pathName) throws FileNotFoundException, IOException {
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(pathName));
		for (int i = 0; i < 20; i++) {
			int num = (int) (Math.random() * 100 + 1);
			dataOutputStream.writeInt(num);
			//System.out.print(num+" ");
		}
		LOGGER.info("数据生成成功");
		dataOutputStream.close();
	}
	/**
	 * @Description //TODO 
	 * @Author xck
	 * @Date 2019/8/15 17:43
	 * @param pathName
	 * @return int[]
	 **/
	public int[] useData(String pathName) throws FileNotFoundException, IOException {
		DataInputStream dataInputStream = new DataInputStream(new FileInputStream(pathName));
		int temp;
		int[] result;
		List<Integer> list = new ArrayList();
		int i = 0;
		while (dataInputStream.available()>0) {
			temp = dataInputStream.readInt();
			//System.out.print(temp+" ");
			list.add(temp);
			i++;
		}
		dataInputStream.close();
		result = new int[list.size()];
		for (int i1 = 0; i1 < result.length; i1++) {
			result[i1]=list.get(i1);
			//System.out.println(result[i1]+" ");
		}
		//LOGGER.info("数据获取成功");
		return result;
	}
}
