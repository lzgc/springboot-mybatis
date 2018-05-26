package com.lzgc.aduo.common;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@PropertySource(value = "classpath:druid.properties")
public class DruidConfiguration {
	
	@Bean(destroyMethod= "close", initMethod = "init")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}
	
	@Bean
	public ServletRegistrationBean druidStatViewServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
		
		
		//添加初始化参数
		//添加白名单
		servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
		//黑名单
		servletRegistrationBean.addInitParameter("deny", "192.168.0.107");
		
		//登录查看信息的账号密码
		servletRegistrationBean.addInitParameter("loginUsername", "admin");
		servletRegistrationBean.addInitParameter("loginPassword", "123456");
		//是否能够重置数据
		servletRegistrationBean.addInitParameter("restEnable", "false");
		return servletRegistrationBean;
	}
	
	public FilterRegistrationBean  druidStatFilter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
		
		//添加过滤规则
		filterRegistrationBean.addUrlPatterns("/*");
		
		//添加不需要忽略的格式信息
		filterRegistrationBean.addInitParameter("exclisons", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}
}
