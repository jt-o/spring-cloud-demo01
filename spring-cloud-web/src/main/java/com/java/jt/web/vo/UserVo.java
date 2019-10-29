package com.java.jt.web.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by jt on 2019/10/7 11:37
 */
@Data
public class UserVo implements Serializable {

    private String userName;
    private String password;
    private String phone;
    private String userLevel;
    private int isDelete;

}
