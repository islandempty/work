package com.swpu.phone_store.entity;

import java.math.BigDecimal;

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
 * 商品表
 * </p>
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class PhoneInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "phone_id", type = IdType.AUTO)
      private Integer phoneId;

      /**
     * 商品名称
     */
      private String phoneName;

      /**
     * 商品单价
     */
      private BigDecimal phonePrice;

      /**
     * 描述
     */
      private String phoneDescription;

      /**
     * 库存
     */
      private Integer phoneStock;

      /**
     * 小图
     */
      private String phoneIcon;

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

      /**
     * 标签
     */
      private String phoneTag;


}
