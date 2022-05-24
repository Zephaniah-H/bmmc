package result;

import java.io.Serializable;

/**
 * @author: Zephaniah.
 * @create: 2022-05-02 18:26
 */
public class CommonResult<T> extends BaseResult<T> implements Serializable {

    private static final long serivalVersionUID = -7268040542410707954L;

    public CommonResult(){}

    private CommonResult(String code, String msg){
        this.setCode(code);
        this.setMsg(msg);
    }

    private CommonResult(String code, String msg, T data){
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public static CommonResult ok(){
        return new CommonResult(BaseCodeEnum.SUCCESS.getCode(), "成功！");
    }

    public static <T> CommonResult<T> okData(T data){
        return new CommonResult<T>(BaseCodeEnum.SUCCESS.getCode(), "成功！", data);
    }

    public static CommonResult fail(){
        return new CommonResult(BaseCodeEnum.ERROR.getCode(), "失败！");
    }

    public static CommonResult failReason(String msg){
        return new CommonResult(BaseCodeEnum.ERROR.getCode(), msg);
    }
}
