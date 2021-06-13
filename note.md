#bean自动装配的三种方式
- byType按属性类型自动装配
<bean id="cat" class="com.holun.beans.Cat" />
<bean id="dog" class="com.holun.beans.Dog" />
<bean id="master_1" class="com.holun.beans.Master" autowire="byType"/>

- byName按属性名字自动装配
<bean id="cat" class="com.holun.beans.Cat" />
<bean id="dog" class="com.holun.beans.Dog" />
<bean id="master_1" class="com.holun.beans.Master" autowire="byName"/>

- 实现注解实现自动装配
使用注解前需要先导入context约束和配置注解支持
context约束:
xmlns:context="http://www.springframework.org/schema/context"
http://www.springframework.org/schema/context
https://www.springframework.org/schema/context/spring-context.xsd
配置注解支持:
<context:annotation-config/>

#常用的注解
@Autowired

@Qualifier

@Resource

@Component 该注解放在类上,说明这个类被spring管理了，spring容器会将这个类部署成bean

@Component的衍生注解
 - @Repository
 - @Service
 - @Controller

  注:@Component和它的三个衍生注解，功能都是相同的。

