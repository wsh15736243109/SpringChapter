package com.wsh.springchapter01.interfaces;

/**
 * @Author:Create by Mr.w
 * @Date:2019/2/21 20:43
 * @Description:
 */
public class CsvOutputGenerator implements IOutputGenerator {
    @Override
    public void generatorOutput(String content) {
        System.out.println("CsvOutputGenerator=" + content);
    }
}
