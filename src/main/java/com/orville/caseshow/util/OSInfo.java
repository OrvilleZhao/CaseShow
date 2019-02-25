package com.orville.caseshow.util;

/**
 * @program:CaseShow
 * @description:获取组件路径
 * @author:orville
 * @create:2019-02-25 09:34
 */
public class OSInfo {
    private static String OS_NAME = System.getProperty("os.name").toLowerCase();
    private static String OS_ARCH = System.getProperty("os.arch").toLowerCase();

    public static String getModulePath(String module){
        String folder = "";
        String extension = "";

        if(OS_NAME.contains("win")){
            extension = ".dll";
            if(OS_ARCH.contains("86")){
                folder = "win32/";
            }else{
                folder = "win64/";
            }
        }else{
            extension = ".so";
            if(OS_ARCH.contains("86")){
                folder = "linux32/";
            }else{
                folder = "linux64/";
            }
        }
        return folder + module+extension;
    }
}
