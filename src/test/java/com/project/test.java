package com.project;

import com.project.entities.MenuItem;
import com.project.entities.Restaurant;
import com.project.mapper.MenuItemMapper;
import com.project.mapper.RestaurantMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class test {
    SqlSession sqlSession;

    @Before
    public void init() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        sqlSession= sqlSessionFactory.openSession(true);
    }

    @Test
    public void testFindMenuItemById() {
        MenuItemMapper mapper = sqlSession.getMapper(MenuItemMapper.class);
        MenuItem menuItem = mapper.findMenuItemByID(5);
        System.out.println(menuItem);
    }

    @Test
    public void testFindMenusByRestaurantId() {
        MenuItemMapper mapper = sqlSession.getMapper(MenuItemMapper.class);
        List<MenuItem> menuItems = mapper.findMenusByRestaurantId(1);
        menuItems.forEach(System.out::println);
    }

    @Test
    public void testFindRestaurantById() {
        RestaurantMapper mapper = sqlSession.getMapper(RestaurantMapper.class);
        Restaurant restaurant = mapper.findRestaurantById(1);
        System.out.println(restaurant);
    }


    @After
    public void close() {
        sqlSession.close();
    }
}
