# spring cloud config 配置中心
项目基于spring boot，另外需要特别添加jar包：  
	1). compile group: 'org.springframework.cloud', name: 'spring-cloud-config-server', version: '1.3.0.RELEASE'

application.yml文件中配置了github相关属性，包括uri，username，password。  
程序启动后，可以通过根目录+配置文件名来访问github中的配置文件内容。例如：  
http://localhost:8888/springcloudconfigclient-dev.yml  