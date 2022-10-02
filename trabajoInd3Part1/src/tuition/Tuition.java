/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuition;

/**
 *
 * @author cedbo
 */
public class Tuition {

    private String regNumber;
    private String name;
    private double heritage;
    private int socialStrata;

    public Tuition(String regNumber, String name, double heritage, int socialStrata) {
        this.regNumber = regNumber;
        this.name = name;
        this.heritage = heritage;
        this.socialStrata = socialStrata;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getName() {
        return name;
    }

    public double getHeritage() {
        return heritage;
    }

    public int getSocialStrata() {
        return socialStrata;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeritage(double heritage) {
        this.heritage = heritage;
    }

    public void setSocialStrata(int socialStrata) {
        this.socialStrata = socialStrata;
    }

    public double getPayment() {
        return socialStrata > 3 && heritage > 2000000 ? 50000 + heritage * 0.03 : 50000;
    }

}
