package cn.nh.kevin;

import cn.nh.kevin.DTO.BigDecimalDTO;
import cn.nh.kevin.TestAbstractImpl.SonSample;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
	@Test
	public void myTest(){
		List<BigDecimalDTO> arrayList = new ArrayList();
		arrayList.add(new BigDecimalDTO("a", BigDecimal.valueOf(3L)));
		arrayList.add(new BigDecimalDTO("b", BigDecimal.valueOf(2L)));
		arrayList.add(new BigDecimalDTO("a", BigDecimal.valueOf(1L)));
		arrayList.add(new BigDecimalDTO("d", BigDecimal.valueOf(6L)));
		BigDecimal bqSrehj = arrayList.stream().map(BigDecimalDTO::getValue).reduce(BigDecimal.ZERO, BigDecimal::add);


		Map<String, List<BigDecimalDTO>> sbmap = arrayList.stream()
				.collect(Collectors.groupingBy(BigDecimalDTO::getName));
		System.out.println();
	}
}
