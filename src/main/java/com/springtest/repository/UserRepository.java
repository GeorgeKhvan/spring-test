package com.springtest.repository;

import com.springtest.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by gekh on 8/23/2016.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findById(Integer id);

}
