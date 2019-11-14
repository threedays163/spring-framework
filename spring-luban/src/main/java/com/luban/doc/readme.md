## spring

spring有几种注入方式:
  两种: 构造注入和set属性注入
  但是 有4种自动装配方式: 
  
  no:     什么都不做
    
  byType: 根据类型
    
  byName: 根据名称
    
  construct: 构造方法
    
  @Resource 
  包名:javax.annotation.Resource 
    
  
  @Autowired 
  包名:org.springframework.beans.factory.annotation.Autowired
    先通过type找, 再根据name去找. 即,优先按照Type查找类, 如果存在多个类可选, 则再比较类的名字和待注入的字段属性名字, 如果存在名称相同的优先注入这个bean, 否则报错,需要Qualify注解
  
  
  byType 如果发现同一个接口有两个备选bean时, 会报错

bean Scope:
  原型: 单例时是在getBean时才初始化的
  单例: 在容器初始化时初始化
  
### Bean Lifecycle机制
  
  有三种bean生命周期控制方法:
  1. InitializingBean(初始化bean接口), DisposableBean(销毁bean接口) 接口的回调方法
  2. 用户自定义 init() 和 destory()方法
  3. @PostConstruce 和 @PreDestory 注解
  
  这三种控制方法的调用顺序是:
  
  initialization 初始化时:
    1. @PostConstruct 注解标注的方法
    2. InitializingBean接口中的afterPropertiesSet()回调方法;
    3. 用户自定义配置的init方法
    
  destory 销毁时:
    1. @PreDestory 注解标注方法
    2. DisposableBean 接口中的destory()回调方法;
    3. 用户自定义配置的destory方法
  
  注意:
  如果某个方法同时使用了两种机制,则只会执行一次; 
  比如: 某个bean在实现了InitializingBean接口中的afterPropertiesSet方法, 在这个afterPropertiesSet方法上添加@PostConstruce注解后,
  这个afterPropertiesSet方法只会执行一次
  
### 容器 Lifecycle机制
  
  Lifecycle接口提供容器启动,关闭的回调方法