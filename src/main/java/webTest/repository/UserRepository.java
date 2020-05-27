package webTest.repository;

import org.springframework.data.repository.CrudRepository;

import webTest.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{
}
