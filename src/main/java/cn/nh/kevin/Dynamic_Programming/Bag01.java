package cn.nh.kevin.Dynamic_Programming;

import cn.nh.kevin.Util.StringUtil;

import java.io.*;

/**
 * 标题:
 * 描述:
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-20 15:06
 */
public class Bag01 {

	private int[] weight;
	private int[] value;
	int MaxLimit;
	private int[][] maxvalue = new int[10][10];

	public int[] getWeight() {
		return weight;
	}

	public void setWeight(int[] weight) {
		this.weight = weight;
	}

	public int[] getValue() {
		return value;
	}

	public void setValue(int[] value) {
		this.value = value;
	}

	public int[][] getMaxvalue() {
		return maxvalue;
	}

	public void setMaxvalue(int[][] maxvalue) {
		this.maxvalue = maxvalue;
	}

	public Bag01(String filePath) {
		InputStreamReader isr= null;
		try {
			FileInputStream fis=new FileInputStream(filePath);
			isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			this.weight = StringUtil.getInstance().StringToInt(br.readLine().split("\\s+"));
			this.value = StringUtil.getInstance().StringToInt(br.readLine().split("\\s+"));
			this.MaxLimit = Integer.parseInt(br.readLine());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int getMax(int a,int b){
		return a > b? a:b;
	}

	public int getResult(){
		int num = this.weight.length;
		/**
		 * 初始化maxValue
		 */
		for (int i = 0; i < MaxLimit; i++) {
			maxvalue[0][i] = 0;
		}
		for (int i = 0; i < num; i++) {
			maxvalue[i][0] = 0;
		}

		for (int i = 1; i < num+1; i++) {
			for (int j = 0; j < MaxLimit; j++) {
				if (j < weight[i - 1]){
					maxvalue[i][j] = maxvalue[i - 1][j];
				}
				else maxvalue[i][j] = getMax(maxvalue[i-1][j],maxvalue[i-1][j-weight[i-1]]+value[i-1]);
			}
		}

		return maxvalue[num][MaxLimit-1];
	}
}
