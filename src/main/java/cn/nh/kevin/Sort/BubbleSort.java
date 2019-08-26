package cn.nh.kevin.Sort;

/**
 * 标题:冒泡排序
 * 描述:
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-15 17:55
 */
public class BubbleSort {
	public int[] bubbleSort(int[] data){
		int []result = data;
		int exchange=0;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j<result.length-i-1; j++){
				if(result[j]>result[j+1]){
					exchange = result[j];
					result[j] = result[j+1];
					result[j+1] = exchange;
				}
			}
		}
		return result;
	}
}
