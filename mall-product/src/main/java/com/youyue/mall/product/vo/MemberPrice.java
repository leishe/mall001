/**
  * Copyright 2019 bejson.com 
  */
package com.youyue.mall.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}