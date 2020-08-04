package cn.nh.kevin;

import cn.nh.kevin.DTO.testDTO;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * <p> 名称：testServ </p>
 * <p> 描述：测试序列化 </p>
 * <p> 版本：v1.0.0 </p>
 * <p> 日期：2020-08-03 17:11 </p>
 *
 * <p> @author：xck </p>
 */
public class testServ {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String ,String>();
		map.put("name","kevin");
		map.put("num","1");
//		String s = JSONObject.toJSONString(map);

		testDTO testDTO1 = new testDTO();
		testDTO1.setName("kevin");
		testDTO1.setNum(new BigDecimal(1));
		testDTO1.setNum(BigDecimal.ONE);
		String s = JSONObject.toJSONString(testDTO1);
		System.out.println(s);
		testDTO testDTO = JSONObject.parseObject(s, testDTO.class);
		System.out.println(testDTO.getNum());

	}
}
