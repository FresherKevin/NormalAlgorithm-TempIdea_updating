package cn.nh.kevin.DTO;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Constructor;

/**
 * 标题:
 * 描述:
 * 版权: KEVIN
 * 作者: xck
 * 时间: 2019-08-21 16:47
 */
@Setter
@Getter
public class SimpleDTO {

	private String A;

	private String B;

	public SimpleDTO(){

	}

	public SimpleDTO(String a,String b){
		A=a;
		B=b;
	}
	public boolean equals(SimpleDTO obj) {
		boolean mark = (obj.getA().equals(this.getA()) && obj.getB().equals(this.getB()))? true:false;
		return mark;
	}
}
