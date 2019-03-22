package com.im.framework.rapidgen;

import cn.org.rapid_framework.generator.Generator;
import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.GeneratorProperties;
import cn.org.rapid_framework.generator.util.StringHelper;

import java.io.IOException;

public class CodeGenerator extends Generator {

    private static GeneratorFacade g;

    CodeGenerator() {

//        setTemplateRootDir(GeneratorProperties.getProperty("templateRootDir", System.getProperty("user.dir") + "/template"));
        setTemplateRootDir(CodeGenerator.class.getResource("/template").getPath());

        if (StringHelper.isNotBlank(GeneratorProperties.getProperty("outRoot"))) {
            setOutRootDir(GeneratorProperties.getProperty("outRoot"));
        }

        g = new GeneratorFacade();

        g.setGenerator(this);


        try {
            g.deleteOutRootDir(); // 删除生成器的输出目录
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void genTable(String module, String...tableNames) throws Exception {

        if(module != null) {
            System.getProperties().put("module", module);
        }

        g.generateByTable(tableNames);
    }

    public void genTable(String tableNames) throws Exception {
        genTable(null,tableNames);
    }

}
