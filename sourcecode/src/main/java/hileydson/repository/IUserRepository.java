package hileydson.repository;

import hileydson.model.User;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User, String>  {
    List<User> findByNameContaining(String name);
    List<User> findByAddressContaining(String address);
    List<User> findByActive(boolean published);
}
