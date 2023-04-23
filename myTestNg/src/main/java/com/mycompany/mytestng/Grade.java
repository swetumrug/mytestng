/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytestng;

/**
 *
 * @author swetu
 */
public class Grade {

    private int math;
    private int sci;
    private int eng;

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public Grade(int math, int sci, int eng) {
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Grade{" + "math=" + math + ", sci=" + sci + ", eng=" + eng + '}';
    }

    public int getTotal() {
        return this.math + this.eng + this.sci;
    }

    public int getAverage() {
        return getTotal() / 3;
    }

    public String getGrade() {
        if (getAverage() < 60) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
}
