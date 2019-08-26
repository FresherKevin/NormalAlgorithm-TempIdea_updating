package cn.nh.kevin.Sort;

/**
 * 标题:
 * 描述: 归并排序
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-26 14:07
 */
public class MergeSort {
	public int[] mergeSort(int[] data) {
		int length = data.length;
		int[] result = new int[length];
		int size = 1, i, j, place;
		int start1, start2, end1,end2;

		for (size = 1; size < length ; size = size * 2) {
			for (i = 0; i < length; i = end2) {

				start1 = i;
				start2 = start1 + size;
				end1 = start2;
				end2 = start2+size;
				place = i;
				while (start1 < end1 && start2 < length && start2 < end2) {
					//System.out.println(size);
					if (data[start1] > data[start2]) {
						result[place] = data[start2];
						place++;
						start2++;
					} else {
						result[place] = data[start1];
						place++;
						start1++;
					}
				}
				//第二个数组元素大
				if (start1 >= end1) {
					while (start2 < end2) {
						result[place++] = data[start2++];
					}
					continue;
				}
				//对多余数组的处理
				if (start2 >= length) {
					while (start1 < end1 && start1< length) {
						result[place++] = data[start1++];
					}
					continue;
				}
				//第一个数组元素大
				if (start2 >= end2) {
					while (start1 < end1) {
						result[place++] = data[start1++];
					}
					continue;
				}

			}

			//复制数组
			for (int i1 = 0; i1 < data.length; i1++) {
				data[i1]=result[i1];
				result[i1]=0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] data = { 8,2,4,1,6,5};
		new MergeSort().mergeSort(data);
		for (int datum : data) {
			System.out.print(datum+" ");
		}
	}

}
