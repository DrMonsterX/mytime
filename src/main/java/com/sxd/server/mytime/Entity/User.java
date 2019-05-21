package com.sxd.server.mytime.Entity;

import javax.persistence.*;

@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")//test
    private String name;

    @Column(name = "icon_id")
    private Integer iconId;

    @Column(name = "user_password")
    private String password;

    @Column(name = "completeness_id")
    private Integer completenessId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCompletenessId() {
        return completenessId;
    }

    public void setCompletenessId(Integer completenessId) {
        this.completenessId = completenessId;
    }
}
