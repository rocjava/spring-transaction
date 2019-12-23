package com.penn.spring.transaction.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 *  实体
 * @author Penn.Zhang
 * @since 2019-12-23
 */
@Data
@Accessors(chain = true)
public class TOrder implements Serializable {

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String orderNo;

    /**
     * 
     */
    private Integer price;

}