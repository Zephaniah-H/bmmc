package result;

import lombok.Data;
import utils.DateUtils;

import java.io.Serializable;

/**
 * @author: Zephaniah.
 * @create: 2022-05-02 18:24
 */
@Data
abstract class BaseResult<T> implements Serializable {

    private String code;

    private String msg;

    private T data;

    private String timestamp = DateUtils.getTime();

}
