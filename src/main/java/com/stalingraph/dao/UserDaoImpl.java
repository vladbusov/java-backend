package com.stalingraph.dao;

import com.stalingraph.entity.User;
import com.stalingraph.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao
{
    public void save(User user) {
        String sql = "INSERT INTO User (name, email, age) VALUES (?,?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    public User getById(int id) {
        String sql = "SELECT * FROM User WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    public void update(User user) {
        String sql = "UPDATE user SET name=?,email=?,age=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<User> findAll() {
        String sql = "SELECT * FROM User";
        return jdbcTemplate.query(sql, new UserMapper() );
    }
}
