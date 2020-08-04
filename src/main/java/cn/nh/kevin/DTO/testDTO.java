package cn.nh.kevin.DTO;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p> 名称：testDTO </p>
 * <p> 描述： </p>
 * <p> 版本：v1.0.0 </p>
 * <p> 日期：2020-08-03 17:12 </p>
 *
 * <p> @author：xck </p>
 */
@Data
@ToString
public class testDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private BigDecimal num;
}
