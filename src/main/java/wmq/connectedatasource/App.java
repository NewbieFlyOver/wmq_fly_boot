package wmq.connectedatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration  // 启用Spring应用程序上下文的自动配置，尝试猜测和配置您可能需要的bean。只扫当前类中的服务
@ComponentScan(basePackages={"wmq.connectedatasource"})//控制器扫包范围,并将其注入bean容器里,包括controller、service层

@EnableJpaRepositories(basePackages = "wmq.connectedatasource.jpa.IndexController") //jpa的扫包范围,包括controller、service层
@EntityScan(basePackages = "wmq.connectedatasource.jpa.UserDao")  //使用jpa时需要扫描实体类

@MapperScan(basePackages = "wmq.connectedatasource") //mybatis中扫描*mapper.java文件
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	

}
