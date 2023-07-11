package com.wang;


import com.wang.mybatis.spring.WangImportBeanDefinitionRegistrar;
import com.wang.mybatis.spring.WangMapperScan;
import com.wang.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

@ComponentScan(value = "com.wang")
//@WangMapperScan(("com.wang.mapper"))
@MapperScan("com.wang.mapper")
//@Import(DefaultAdvisorAutoProxyCreator.class)
@EnableAspectJAutoProxy
public final class AppConfig {


//	@Bean
//	public DefaultPointcutAdvisor defaultPointcutAdvisor(){
//
//		NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
//		nameMatchMethodPointcut.addMethodName("test");
//
//		DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
//		defaultPointcutAdvisor.setPointcut(nameMatchMethodPointcut);
//		defaultPointcutAdvisor.setAdvice((MethodBeforeAdvice) (method, args, target) -> System.out.println("proxy before"));
//		return defaultPointcutAdvisor;
//	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws IOException {
		InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
		return new SqlSessionFactoryBuilder().build(resourceAsStream);
	}

//	@Bean(autowire = Autowire.BY_NAME)

//	@Bean
//	public UserService userService(){
//		return new UserService();
//	}

//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		return new JdbcTemplate(dataSource());
//	}
//
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//		transactionManager.setDataSource(dataSource());
//		return transactionManager;
//	}
//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/tuling?characterEncoding=utf-8&amp;useSSL=false");
//		dataSource.setUsername("root");
//		dataSource.setPassword("Zhouyu123456***");
//		return dataSource;
//	}


//	@Bean
//	public MapperScannerConfigurer configurer(){
//		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
//		configurer.setBasePackage("com.luban.dao");
//
//		return configurer;
//	}
//


//	@Bean
//	public SqlSessionFactory sqlSessionFactory() {
//		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource());
//		try {
//			return sessionFactoryBean.getObject();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}


}
