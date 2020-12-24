package com.microservice.app.users.repositories;

import com.common.lib.users.models.User;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


/**
 * public interface IUserRepository extends CrudRepository<User, Long>{}
 */

@RepositoryRestResource(path= "users")
public interface IUserRepository extends  PagingAndSortingRepository<User, Long>  {
  public User findByUsernameAndEmail(String username, String email);

  @RestResource(path = "find-username")
  public User findByUsername(String username);

  @RestResource(path = "find-lastname")
  @Query("SELECT u FROM User u where u.lastname = ?1")
  public User findByLastnameUser(String lastname); 
}
