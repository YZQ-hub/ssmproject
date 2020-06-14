package com.langren.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private Integer id;
    private String username;
    private Integer password;
    private Date birthday;
    private String email;
}
