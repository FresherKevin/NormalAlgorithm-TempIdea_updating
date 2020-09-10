package cn.nh.kevin.DTO;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p> 名称：BigDecimalDTO </p>
 * <p> 描述： </p>
 * <p> 版本：v1.0.0 </p>
 * <p> 日期：2020-09-10 09:48 </p>
 *
 * <p> @author：xck </p>
 */
@Data
public class BigDecimalDTO {
	private String name;
	private BigDecimal value;

	public BigDecimalDTO(String name, BigDecimal value) {
		this.name = name;
		this.value = value;
	}
}
