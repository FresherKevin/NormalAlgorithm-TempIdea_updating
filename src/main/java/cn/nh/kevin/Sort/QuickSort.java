package cn.nh.kevin.Sort;

/**
 * 标题: 快速排序
 * 描述:
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-16 09:25
 */
public class QuickSort {

	public int[] quickSortJs(int[] data){
		int start = 0;
		int end = data.length - 1;
		quickSortDeal(data,start,end);
		return data;
	}
	public void quickSortDeal(int[] data,int start,int end){
		if (start > end) return;
		int i=start,j=end;
		int value = data[i];
		int place;
		while(i != j && i < j){
			while(data[j] > value){
				j--;
			}
			if (i == j) break;
			data[i]=data[j];
			data[j]=value;
			i++;
			while(data[i] < value){
				i++;
			}
			if (i == j) break;
			data[j]=data[i];
			data[i]=value;
			j--;
		}
		place = i;
		quickSortDeal(data,start,place-1);
		quickSortDeal(data,place+1,end);
	}

}
