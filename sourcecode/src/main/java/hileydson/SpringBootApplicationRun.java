package hileydson;
import hileydson.repository.IUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = IUserRepository.class)
public class SpringBootApplicationRun
{
    public static void main(String[] args){
        SpringApplication.run(SpringBootApplicationRun.class, args);
    }


}