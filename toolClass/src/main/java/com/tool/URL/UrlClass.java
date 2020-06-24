package com.tool.URL;

public class UrlClass {

    public static void main(String[] args) {

        System.out.println("java.home："+System.getProperty("java.home"));//java.home：D:\work\jdk_8\jre

        System.out.println("java.class.version："+System.getProperty("java.class.version"));//java.class.version：52.0

        System.out.println("java.class.path:"+System.getProperty("java.class.path"));

        System.out.println("java.library.path:"+System.getProperty("java.library.path"));

        System.out.println("java.io.tmpdir:"+System.getProperty("java.io.tmpdir")); //java.io.tmpdir:C:\Users\ly\AppData\Local\Temp\

        System.out.println("java.compiler:"+System.getProperty("java.compiler"));//java.compiler:null

        System.out.println("java.ext.dirs:"+System.getProperty("java.ext.dirs"));//java.ext.dirs:D:\work\jdk_8\jre\lib\ext;C:\Windows\Sun\Java\lib\ext

        System.out.println("user.name:"+System.getProperty("user.name"));//user.name:ly

        System.out.println("user.home:"+System.getProperty("user.home"));//user.home:C:\Users\ly
        //当前工程路径
        System.out.println("user.dir:"+System.getProperty("user.dir"));
        //获取包名
        System.out.println("package:"+UrlClass.class.getPackage().getName());

        System.out.println("package:"+UrlClass.class.getPackage().toString());
    }
}
