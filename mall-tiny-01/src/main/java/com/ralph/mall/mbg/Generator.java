package com.ralph.mall.mbg;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author Ralph.Chen
 * @date 2020/11/26
 * @description 生成mbg代码
 */
public class Generator {

    public static void main(String[] args) throws Exception {
        // mbg执行过程中警告信息
        List<String> warning = new ArrayList<String>();
        // 当生成的代码重复时，覆盖原代码
        boolean overwrite = true;
        // 读取我们的 MBG 配置文件
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warning);
        Configuration config = cp.parseConfiguration(is);
        is.close();
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        // 创建mbg
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warning);
        // 执行生成代码
        myBatisGenerator.generate(null);
        // 输出警告信息
        for (String war : warning) {
            System.out.println(warning);
        }
    }
}
