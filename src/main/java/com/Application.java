package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

//@Configuration				//指出该类是 Bean 配置的信息源，相当于XML中的<beans></beans>，一般加在主类上。
//@EnableAutoConfiguration	//让 SpringBoot 根据应用所声明的依赖来对 Spring 框架进行自动配置
//@ComponentScan				//表示将该类自动发现（扫描）并注册为Bean，可以自动收集所有的Spring组件
@SpringBootApplication		//上面三个注解的合集
@PropertySource({"classpath:/config/application.properties","classpath:/config/jdbc.properties"})
@MapperScan("com.mapper")
public class Application {  
 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
