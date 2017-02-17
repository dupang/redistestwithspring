package com.x.redis.dao;

import com.x.redis.obj.User;

/**
 * Created by Administrator on 2017/2/17.
 */
public interface UserDAO {
    public void saveUser(final User user);
    public User getUser(final long id);
}
