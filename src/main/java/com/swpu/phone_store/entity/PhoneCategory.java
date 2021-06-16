package com.swpu.phone_store.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 类目表
 * </p>
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class PhoneCategory implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "category_id", type = IdType.AUTO)
      private Integer categoryId;

      /**
     * 类目名称
     */
      private String categoryName;

      /**
     * 类目编号
     */
      private Integer categoryType;

      /**
     * 创建时间
     */
      @TableField(fill = FieldFill.INSERT)
      private Date createTime;

      /**
     * 修改时间
     */
      @TableField(fill = FieldFill.INSERT_UPDATE)
      private Date updateTime;


}
