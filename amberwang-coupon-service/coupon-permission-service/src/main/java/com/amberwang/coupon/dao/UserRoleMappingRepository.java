package com.amberwang.coupon.dao;

import com.amberwang.coupon.entity.UserRoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>UserRoleMapping Dao</h1>
 */
public interface UserRoleMappingRepository
        extends JpaRepository<UserRoleMapping, Long> {

    /**
     * <h2>通过 userId 寻找数据记录</h2>
     * */
    UserRoleMapping findByUserId(Long userId);
}
