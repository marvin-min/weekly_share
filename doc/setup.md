#### 配置环境
##### 1.加入如下依赖
```
<dependency>
	<groupId>org.mybatis.spring.boot</groupId>
	<artifactId>mybatis-spring-boot-starter</artifactId>
	<version>1.3.2</version>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency>
```

##### 2.配置数据库连接（在application.yml 或者application.properties里面配置)
application.yml

```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/springboot?useUnicode=true&characterEncoding=utf-8
    username: root
    password: password
    driver-class-name: com.mysql.jdbc.Driver
```

##### 3.加入mybatis的配置文件到application.yml
```
mybatis:
  mapper-locations: classpath:mybatis/mapper/*.xml
  configuration:
    map-underscore-to-camel-case: true
    default-fetch-size: 100
    default-statement-timeout: 30
    
```

##### 4.编写普通的java类
		* 考虑如下问题：
			要不要生成getter,setter方法
##### 5.编写mapper接口 和 mapper.xml映射文件
		* mapper.xml文件位置: resources/mybatis/mapper目录下(文件必须以ModelMapper.xml的命名格式)
		* 编写Sql
		Mapper接口开发需要遵循以下规范：
		1、	Mapper.xml文件中的namespace与mapper接口的类路径相同。
		2、	Mapper接口方法名和Mapper.xml中定义的每个statement的id相同 
		3、	Mapper接口方法的输入参数类型和mapper.xml中定义的每个sql 的parameterType的类型相同
		4、	Mapper接口方法的输出参数类型和mapper.xml中定义的每个sql的resultType的类型相同
		
##### 6.动态sql
	 choose/when/if
##### 7.主键生成:
	<selectKey resultType="java.lang.String" order="BEFORE"  keyProperty="id">
		select uuid()
	</selectKey>
##### 8.Sql注入:
	%'" or 2498=2498 or "'%'=
 	concat(‘%’,#{title}, ‘%’)，
	