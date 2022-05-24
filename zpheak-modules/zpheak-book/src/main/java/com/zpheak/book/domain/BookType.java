package com.zpheak.book.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;



/**
 * <p>
 * 
 * </p>
 *
 * @author Zphaniah.
 * @since 2022-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BookType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer book_type_id;

    private String book_type;


}
