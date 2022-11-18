package com.atguigu.mybatis.mapper;

public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 删除用户信息
     * @return
     */
    void deleteUser();
    /**
     * 修改用户信息
     */
    void updateUser();
}
