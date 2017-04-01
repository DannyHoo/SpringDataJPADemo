package com.danny.springdata.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author huyuyang@lxfintech.com
 * @Title: BaseEntity
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-19 22:31:24
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable{

    /** 主键 **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
