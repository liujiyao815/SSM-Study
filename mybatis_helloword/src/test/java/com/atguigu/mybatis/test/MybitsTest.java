package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybitsTest {

    @Test
    public void testInsert() throws IOException {
        //获取核心文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取 SqlSessionFactory对象
        SqlSessionFactory SqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sql的会话对象SqlSession，是mybatis提供的操作数据库的对象
        SqlSession sqlSession = SqlSessionFactory.openSession();
        //获取UserMapper的代理实现对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用mapper接口中的方法，实现添加用户信息功能
        int result = mapper.insertUser();
        System.out.println("结果：" +result);
        sqlSession.commit();
        sqlSession.close();

        
    }
}

