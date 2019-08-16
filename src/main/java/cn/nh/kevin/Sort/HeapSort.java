package cn.nh.kevin.Sort;

/**
 * 标题:
 * 描述:
 * 版权: 税友软件集团股份有限公司
 * 作者: xck
 * 时间: 2019-08-16 15:06
 */
public class HeapSort {
	public int[] heapSort(int[] data){
		int[] result = data;
		int mark = result.length-1;
		while (mark != 0) {
			buildHeap(result,mark+1);
			int temp = result[0];
			result[0] = result[mark];
			result[mark] = temp;
			mark--;
		}
		return result;
	}
	/*
	7  mark=7
	 */
	public void buildHeap(int[] data,int mark){
		int[] heapData = data;
		int mid = mark / 2;  //3
		int left = 0;
		int temp;
		int right = 0;
		/**
		 * 开始建堆
		 */
		for (int i = mid; i>=1; i--) {
			left = i * 2 ; //6
			right = left + 1;  //7
			/**
			 * 左子树大于根
			 */
			if ( left <= mark && heapData[left-1] > heapData[i-1]){
				temp = heapData[left-1];
				heapData[left-1] = heapData[i-1];
				heapData[i-1] = temp;
			}
			/**
			 * 右子树大于根
			 */
			if ( right <= mark && heapData[right-1] > heapData[i-1]){
				temp = heapData[right-1];
				heapData[right-1] = heapData[i-1];
				heapData[i-1] = temp;
			}
		}
	}
}
