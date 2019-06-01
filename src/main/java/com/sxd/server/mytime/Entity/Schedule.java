package com.sxd.server.mytime.Entity;

import javax.persistence.*;

@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "schedule_id")
    private int scheduleId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "position")
    private int position;

    @Column(name = "schedule_name")
    private String scheduleName;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "finish_time")
    private String finishTime;

    @Column(name = "remark")
    private String remark;

    @Column(name = "is_remind")
    private int isRemind;
}
