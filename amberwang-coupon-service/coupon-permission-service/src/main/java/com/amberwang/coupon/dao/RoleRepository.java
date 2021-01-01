package com.amberwang.coupon.dao;

import com.amberwang.coupon.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>Role Dao</h1>
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
