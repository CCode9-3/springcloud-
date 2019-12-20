import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.demo"})
@ComponentScan("com.demo")
public class DeptConsumer80_feign_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_feign_App.class, args);
    }
}