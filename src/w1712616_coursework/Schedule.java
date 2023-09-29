/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1712616_coursework;

import static java.lang.Integer.*;

/**
 *
 * @author w1712616
 */
public class Schedule {
    //Schedule

    protected String Day;
    protected String Month;
    protected String Year;

    protected String Day1;
    protected String Month1;
    protected String Year1;

    public void setDropOffDate(String day, String month, String year) {
        this.Day = day;
        this.Month = month;
        this.Year = year;
    }

    public void setPickUpDate(String day, String month, String year) {
        this.Day1 = day;
        this.Month1 = month;
        this.Year1 = year;
    }

    public void setDay(String day) {
        this.Day = day;
    }

    public void setMonth(String month) {
        this.Month = month;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getDay() {
        if (parseInt(Day) < 10) {
            return "0" + Day;
        } else {
            return "" + Day;
        }
    }

    public String getMonth() {
        if (parseInt(Month) > 0 && parseInt(Month) < 10) {
            return "0" + Month;
        } else {
            return "" + Month;
        }
    }

    public String getYear() {
        return "" + Year;
    }

    public String getDropOffDate() {
        return Day + "/" + Month + "/" + Year;
    }

    public String getPickUpDate() {
        return Day1 + "/" + Month1 + "/" + Year1;
    }
}
