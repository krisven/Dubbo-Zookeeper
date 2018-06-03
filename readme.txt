Dubbo+Zookeeper+SpringBoot 小例子

1、下载Zookeeper，修改conf下配置文件名字为zoo.cfg

2、启动Zookeeper

3、配置Tomcat的server.xml的端口为8088

4、下载Dubbo-admin，并打包成war包放到tomcat的webapps目录下，启动tomcat会自动解压war包

5、然后url输入：localhost:8088/dubbo-admin，即可看到dubbo服务管理端

6、写provider和consumer代码，配置好xml文件

