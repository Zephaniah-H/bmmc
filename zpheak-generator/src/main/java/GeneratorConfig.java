import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/**
 * @author: Zephaniah.
 * @create: 2022-05-01 22:29
 */
public class GeneratorConfig {

    public static void main(String[] args) {

        AutoGenerator autoGenerator = new AutoGenerator();

        //数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUrl("jdbc:mysql://localhost:3306/zpheak_bmmc_book?serverTimezone=UTC");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        autoGenerator.setDataSource(dsc);

        //设置全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(System.getProperty("user.dir") + "/zpheak-modules/zpheak-book/src/main/java");//设置生成的目录
        gc.setOpen(false);//设置生成完了之后不打开生成的目录
        gc.setAuthor("Zphaniah.");//设置作者
        gc.setFileOverride(true);//设置重新生成之后是否覆盖原来的，默认为不覆盖false
        gc.setMapperName("%sDao");//设置数据访问层的文件后缀
        gc.setIdType(IdType.AUTO);//设置主键的生成策略，自增
        autoGenerator.setGlobalConfig(gc);

        //设置包名相关配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.zpheak.book");//设置生成的父文件夹
        pc.setEntity("do");//设置生成的实体类包名
        pc.setMapper("dao");//设置生成数据访问层的包名
        autoGenerator.setPackageInfo(pc);

        //设置策略设置
        StrategyConfig sc = new StrategyConfig();
//        sc.setInclude("character_attr");//设置只生成指定的表的代码
//        sc.setTablePrefix("t_");//设置生成的表的前缀，模块名 = 表名 - 前缀，如数据库t_user表生成user类
        sc.setRestControllerStyle(true);//设置生成restful风格的
//        sc.setVersionFieldName("version");//设置乐观锁字段名
        sc.setLogicDeleteFieldName("is_deleted");//设置逻辑删除字段名
        sc.setEntityLombokModel(true);//设置是否启用lombok

        autoGenerator.setStrategy(sc);

        autoGenerator.execute();

    }
}
