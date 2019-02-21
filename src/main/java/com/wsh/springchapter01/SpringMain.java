package com.wsh.springchapter01;

import com.wsh.springchapter01.bean.DeviceInfo;
import com.wsh.springchapter01.helper.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:Create by Mr.w
 * @Date:2019/2/21 20:37
 * @Description:
 */
public class SpringMain {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-context.xml");
//        DeviceInfo deviceInfo= (DeviceInfo) applicationContext.getBean("deviceBean");
//        System.out.println(deviceInfo.toString());

        OutputHelper outputHelper= (OutputHelper) applicationContext.getBean("outputHelper");
        outputHelper.generateOutput("hahahah");
    }
}
