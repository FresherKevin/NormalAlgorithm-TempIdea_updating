package cn.nh.kevin.LittleConfuse;

import cn.nh.kevin.DTO.SimpleDTO;
import org.apache.log4j.Logger;

/**
 * 标题:
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-21 16:32
 */
public class StringReference {

	private static final Logger LOGGER = Logger.getLogger(StringReference.class);

	public static void ChangeString(String A){
		A = A + "xck";
	}
	public static void ClearArray(int[] A){
		for (int i = 0; i < A.length; i++) {
			A[i] = 0;
		}
	}
	public static void main(String[] args) {

		int[] array = new int[]{1,2,3,4,5,6};
		String A = "abcdefg";
		StringReference.ChangeString(A);
		System.out.println(A);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		StringReference.ClearArray(array);

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

		Integer temp = 10;
		Integer result = temp;
		temp = 20;
		System.out.println("result:"+result);

		SimpleDTO simpleDTO = new SimpleDTO();
		simpleDTO.setA("aaaa");
		simpleDTO.setB("bbbb");
		SimpleDTO simpleDTO2 = new SimpleDTO();
		simpleDTO2 = simpleDTO;
		System.out.println();
		System.out.println("simpleDto2:"+simpleDTO2.getA()+simpleDTO2.getB());

		System.out.println(simpleDTO==simpleDTO2);
		System.out.println(simpleDTO.equals(simpleDTO2));

		SimpleDTO simpleDTOA = new SimpleDTO("aaaaa","bbbbbb");
		SimpleDTO simpleDTOB = new SimpleDTO("aaaaa", "bbbbbb");
		boolean mark1 = simpleDTOA == simpleDTOB;
		System.out.println(mark1);

		boolean mark2 = simpleDTOA.equals(simpleDTOB);
		System.out.println(mark2);

	}
}
/**
 *
 */
