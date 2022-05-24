package com.zpheak.book.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

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
public class BookComment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer book_comment_id;

    private Integer book_id;

    private Integer user_id;

    private String comment;

    private String great;

    private String step;

    private BigDecimal bookpoint;

    private String comment_title;

    private String comment_time;

    private String fold;

    private String user;


}
