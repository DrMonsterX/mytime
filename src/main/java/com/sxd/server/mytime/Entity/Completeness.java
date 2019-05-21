package com.sxd.server.mytime.Entity;

import javax.persistence.*;

@Table(name = "completeness")
public class Completeness {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    @Column(name = "completeness_id")
    private int completenessId;

    @Column(name = "week_completeness")
    private int weekCompleteness;

    @Column(name = "history_one")
    private int historyOne;

    @Column(name = "history_two")
    private int historyTwo;

    @Column(name = "history_three")
    private int historyThree;

    @Column(name = "history_four")
    private int historyFour;

    @Column(name = "history_five")
    private int historyFive;

    public int getCompletenessId() {
        return completenessId;
    }

    public void setCompletenessId(int completenessId) {
        this.completenessId = completenessId;
    }

    public int getWeekCompleteness() {
        return weekCompleteness;
    }

    public void setWeekCompleteness(int weekCompleteness) {
        this.weekCompleteness = weekCompleteness;
    }

    public int getHistoryOne() {
        return historyOne;
    }

    public void setHistoryOne(int historyOne) {
        this.historyOne = historyOne;
    }

    public int getHistoryTwo() {
        return historyTwo;
    }

    public void setHistoryTwo(int historyTwo) {
        this.historyTwo = historyTwo;
    }

    public int getHistoryThree() {
        return historyThree;
    }

    public void setHistoryThree(int historyThree) {
        this.historyThree = historyThree;
    }

    public int getHistoryFour() {
        return historyFour;
    }

    public void setHistoryFour(int historyFour) {
        this.historyFour = historyFour;
    }

    public int getHistoryFive() {
        return historyFive;
    }

    public void setHistoryFive(int historyFive) {
        this.historyFive = historyFive;
    }
}
