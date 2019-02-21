package com.wsh.springchapter01.interfaces;

/**
 * @Author:Create by Mr.w
 * @Date:2019/2/21 20:44
 * @Description:
 */
public class JsonOutputGenerator implements IOutputGenerator {
    @Override
    public void generatorOutput(String content) {
        System.out.println("JsonOutputGenerator=" + content);
    }
}
