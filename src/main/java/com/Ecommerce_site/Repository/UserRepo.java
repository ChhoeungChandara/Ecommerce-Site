package com.Ecommerce_site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Ecommerce_site.Entity.User;

public interface UserRepo extends JpaRepository<User,Long>{

}
