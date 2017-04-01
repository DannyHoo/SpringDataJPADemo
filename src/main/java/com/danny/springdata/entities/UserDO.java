package com.danny.springdata.entities;

import javax.persistence.*;

/**
 * @author huyuyang@lxfintech.com
 * @Title: UserDO
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-19 22:21:49
 */
@Entity
@Table(name="t_user")
public class UserDO extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public UserDO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserDO setName(String name) {
        this.name = name;
        return this;
    }
}
