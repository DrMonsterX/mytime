package com.sxd.server.mytime.Entity;

import javax.persistence.*;

@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String name;

    @Column(name = "icon_id")
    private int iconId;

    @Column(name = "user_password")
    private String password;

    @Column(name = "completeness_id")
    private int completenessId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCompletenessId() {
        return completenessId;
    }

    public void setCompletenessId(int completenessId) {
        this.completenessId = completenessId;
    }
}
