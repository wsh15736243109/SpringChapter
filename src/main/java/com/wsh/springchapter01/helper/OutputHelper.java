package com.wsh.springchapter01.helper;

import com.wsh.springchapter01.interfaces.IOutputGenerator;

/**
 * @Author:Create by Mr.w
 * @Date:2019/2/21 20:38
 * @Description:
 */
public class OutputHelper {
    public IOutputGenerator getiOutputGenerator() {
        return iOutputGenerator;
    }

    public void setiOutputGenerator(IOutputGenerator iOutputGenerator) {
        this.iOutputGenerator = iOutputGenerator;
    }

    IOutputGenerator iOutputGenerator;

//    public void setiOutputGenerator(IOutputGenerator iOutputGenerator) {
//        this.iOutputGenerator = iOutputGenerator;
//    }
//
    public void generateOutput(String content){
        iOutputGenerator.generatorOutput(content);
    }

}
