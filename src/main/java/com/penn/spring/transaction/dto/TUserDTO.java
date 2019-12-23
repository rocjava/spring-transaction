package com.penn.spring.transaction.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 
 * @author Penn.Zhang
 * @since 2019-12-23
 */
@Data
@Accessors(chain = true)
public class TUserDTO implements Serializable {

    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private Integer age;
}