package com.danny.springdata.dao;

import com.danny.springdata.entities.UserDO;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author huyuyang@lxfintech.com
 * @Title: UserDAO
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-19 22:26:29
 */
public interface UserDAO extends PagingAndSortingRepository<UserDO,Long> {
    public UserDO findById(Long id);
    public UserDO findByIdAndName(Long id,String name);
}
