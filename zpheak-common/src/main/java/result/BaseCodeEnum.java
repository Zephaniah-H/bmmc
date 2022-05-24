package result;

/**
 * @author: Zephaniah.
 * @create: 2022-05-02 18:26
 * 结果枚举类
 */
public enum BaseCodeEnum {
    //成功
    SUCCESS("200"),
    //出错
    ERROR("500");

    private final String code;

    BaseCodeEnum(String code) {
        this.code = code;
    }

    public String getCode(){
        return code;
    }
}
