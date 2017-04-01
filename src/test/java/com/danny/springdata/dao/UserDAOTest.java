package com.danny.springdata.dao;

import com.danny.springdata.entities.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: UserDAOTest
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-19 22:35:57
 */
public class UserDAOTest extends  AbstractDAOTest{

    @Autowired
    private UserDAO userDAO;

    @Test
    public void findByIdTest() {
        UserDO userDO=userDAO.findById(1L);
        Assert.assertNotNull(userDO);
    }
    @Test
    public void findByIdAndNameTest() {
        UserDO userDO=userDAO.findByIdAndName(1L,"danny");
        Assert.assertNotNull(userDO);
    }

}
