package com.im.framework.rapidgen;

import cn.org.rapid_framework.generator.GeneratorProperties;

import java.util.*;

/**
 * @Description
 * @Author Administrator
 * @Date 2017/6/8
 */
public class GenMain {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //利用hasNextXXX()判断是否还有下一输入项
        System.out.println("> 欢迎使用rapid-gen代码生成器~");
        System.out.println("> 请输入作者：");
        String author = sc.nextLine();

        System.out.println("> 请输入项目根目录：（e.g: com.nezha.pps.transaction.biz）");
        String basepackage = sc.nextLine();

        System.out.println("> 请输入模块名：（e.g: order）");
        String moduleName = sc.nextLine();

        System.out.println("> 请输入表名：（多个可逗号分隔）");
        String tableNames = sc.nextLine();
        //#作者
        System.getProperties().put("author", author);
        //#项目根目录
        System.getProperties().put("basepackage", basepackage);


        System.out.println("> 请核对数据：");
        System.out.println("> 项目根目录:" + basepackage);
        System.out.println("> 作者：" + author);
        System.out.println("> 模块名：" + moduleName);
        System.out.println("> 带生成表名：" + tableNames);
        System.out.println("> 确认生成对象？[y/n]：");
        String yesNo = sc.nextLine();

        if ("y".equals(yesNo.toLowerCase())) {
            System.out.println("> 用户接受");

            CodeGenerator generator = new CodeGenerator();

            generator.genTable(moduleName
                    , tableNames.split(",")
            );
        } else {
            System.out.println("> 用户拒绝");

        }

        System.out.println("> Bye~");


    }

}