package wmq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//启动项目，整合常用注解（@EnableAutoConfiguration+@ComponentScan+@Configuration）；扫包作用，只能在当前同级包下
@SpringBootApplication

//@EnableAutoConfiguration  // 启用Spring应用程序上下文的自动配置，尝试猜测和配置您可能需要的bean。只扫当前类中的服务
//@ComponentScan(basePackages={"wmq.freemarke"})//控制器扫包范围,并将其注入bean容器里

@EnableJpaRepositories(basePackages = "wmq.connectedatasource.jpa.IndexController") //jpa的扫包范围
@EntityScan(basePackages = "wmq.connectedatasource.jpa.UserDao")  //使用jpa时需要扫描实体类

@MapperScan(basePackages = "wmq.connectedatasource") //mybatis中扫描*mapper.java文件
  
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
