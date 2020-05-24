### Eureka Server

#### 1.1 Import Eureka Server Library

```xml
<dependency>
  	<groupId>org.springframework.cloud</groupId>
  	<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
 </dependency>
```

#### 1.2 YAML

```yaml
server:
  port: 9000

eureka:
  instance:
    hostname: localhost
  client:
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
```

#### 1.3 Enable Eureka Server

```java
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
```

####1.4 Eureka Server HA
 1、准备2个EurekaServer，需要相互注册