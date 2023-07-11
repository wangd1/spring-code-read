package com.wang.mybatis.spring;

import com.wang.mapper.OrderMapper;
import com.wang.mapper.UserMapper;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @author wangd1
 */
public class WangImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {


		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(WangMapperScan.class.getName());
		String path = (String) annotationAttributes.get("value");

		WangMybatisScanner scanner = new WangMybatisScanner(registry);
		scanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> true);
		scanner.doScan(path);





//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(WangMybatisFactoryBean.class);
//		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);
//		registry.registerBeanDefinition("userMapper", beanDefinition);
//
//		AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition1.setBeanClass(WangMybatisFactoryBean.class);
//		beanDefinition1.getConstructorArgumentValues().addGenericArgumentValue(OrderMapper.class);
//		registry.registerBeanDefinition("orderMapper", beanDefinition1);
	}
}
