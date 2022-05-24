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
public class WannaRead implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer book_id;

    private Integer user_id;

    private String user;

    private String book;


}
