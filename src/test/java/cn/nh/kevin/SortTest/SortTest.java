package cn.nh.kevin.SortTest;

import cn.nh.kevin.Sort.BubbleSort;
import cn.nh.kevin.Sort.HeapSort;
import cn.nh.kevin.Sort.MergeSort;
import cn.nh.kevin.Sort.QuickSort;
import cn.nh.kevin.Util.DataUtil;
import org.apache.log4j.Logger;

/**
 * 标题:测试多种排序结果
 * 描述:
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-15 18:00
 */
public class SortTest {

	public static final Logger LOGGER = Logger.getLogger(SortTest.class);

	public static void main(String[] args) throws Exception {
		String pathName = "src/test/resource/File/data.txt";
		DataUtil dataUtil = new DataUtil();
		//dataUtil.getData(pathName);

		int[] dataBubble = dataUtil.useData(pathName);
		new BubbleSort().bubbleSort(dataBubble);
		LOGGER.info("Bubble");
		for (int datum : dataBubble) {
			System.out.print(datum + " ");
		}
		System.out.println();

		int[] dataQuick = dataUtil.useData(pathName);
		new QuickSort().quickSortJs(dataQuick);
		LOGGER.info("Quick");
		for (int i : dataQuick) {
			System.out.print(i + " ");
		}
		System.out.println();

		LOGGER.info("Heap");
		int[] dataHeap = dataUtil.useData(pathName);
		new HeapSort().heapSort(dataHeap);
		for (int i : dataHeap) {
			System.out.print(i + " ");
		}
		System.out.println();

		LOGGER.info("Merge");
		int[] dataMerge = dataUtil.useData(pathName);
		new MergeSort().mergeSort(dataMerge);
		for (int i : dataMerge) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
