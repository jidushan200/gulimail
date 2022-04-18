package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 *
 * @author zhj
 * @email 1446579723@qq.com
 * @date 2022-04-15 16:43:43
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Long id;
	/**
	 *
	 */
	private Long branchId;
	/**
	 *
	 */
	private String xid;
	/**
	 *
	 */
	private String context;
	/**
	 *
	 */
	private Longblob rollbackInfo;
	/**
	 *
	 */
	private Integer logStatus;
	/**
	 *
	 */
	private Date logCreated;
	/**
	 *
	 */
	private Date logModified;
	/**
	 *
	 */
	private String ext;

}
