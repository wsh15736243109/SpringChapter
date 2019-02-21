package com.wsh.springchapter01.bean;

/**
 * @Author:Create by Mr.w
 * @Date:2019/2/21 20:38
 * @Description:
 */
public class DeviceInfo {
    private String deviceId;
    private String deviceName;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                '}';
    }
}
