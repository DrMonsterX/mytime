package com.sxd.server.mytime.Entity;

import javax.persistence.*;

@Table(name = "completeness")
public class Completeness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "completeness_id")
    private Integer completenessId;

    @Column(name = "week_completeness")
    private Integer weekCompleteness=0;

    @Column(name = "history_one")
    private Integer historyOne=0;

    @Column(name = "history_two")
    private Integer historyTwo=0;

    @Column(name = "history_three")
    private Integer historyThree=0;

    @Column(name = "history_four")
    private Integer historyFour=0;

    @Column(name = "history_five")
    private Integer historyFive=0;

    public Integer getCompletenessId() {
        return completenessId;
    }

    public void setCompletenessId(Integer completenessId) {
        this.completenessId = completenessId;
    }

    public Integer getWeekCompleteness() {
        return weekCompleteness;
    }

    public void setWeekCompleteness(Integer weekCompleteness) {
        this.weekCompleteness = weekCompleteness;
    }

    public Integer getHistoryOne() {
        return historyOne;
    }

    public void setHistoryOne(Integer historyOne) {
        this.historyOne = historyOne;
    }

    public Integer getHistoryTwo() {
        return historyTwo;
    }

    public void setHistoryTwo(Integer historyTwo) {
        this.historyTwo = historyTwo;
    }

    public Integer getHistoryThree() {
        return historyThree;
    }

    public void setHistoryThree(Integer historyThree) {
        this.historyThree = historyThree;
    }

    public Integer getHistoryFour() {
        return historyFour;
    }

    public void setHistoryFour(Integer historyFour) {
        this.historyFour = historyFour;
    }

    public Integer getHistoryFive() {
        return historyFive;
    }

    public void setHistoryFive(Integer historyFive) {
        this.historyFive = historyFive;
    }
}
