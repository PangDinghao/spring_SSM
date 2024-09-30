package com.example.springbootvue.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2023-11-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Pdh3113_book {

    private static final long serialVersionUID = 1L;

    @TableId
    private int id;
    private String name;
    private String type;
    private Integer price;


}
