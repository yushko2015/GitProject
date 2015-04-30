package com.pigovsky.myrest.repository;

import com.pigovsky.myrest.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yuriy on 30.04.15.
 */
public interface UserRepository extends CrudRepository<User, Long>  {
}
