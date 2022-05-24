package com.zpheak.book.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer book_type_id;

    private String book_name;

    private String book_info;

    private String author;

    private String point;

    private String press;

    private String publication_year;

    private String cover;

    private Integer book_comment_id;

    private Integer is_orginal;

    private Integer is_delete;


}
