package com.asset.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asset.management.entity.Users;

public interface UsersDao extends JpaRepository<Users,Long>{

}
