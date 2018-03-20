配置spring cloud config的应用程序需要做如下改造：
1、pom.xml/build.gradle  中添加spring-cloud-starter-config包
2、添加bootstrap.yml配置文件，该配置文件中指定了spring cloud server的相关配置。
3、程序启动时，通过指定profile来决定选择哪个环境。
    例如：-Dspring.cloud.config.profile=prod
