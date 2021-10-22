package com.generation.uber;

public class UberDriver {
    private String name;
    private String carModel;
    private String plate;
    private int minimu = 7;
    private double ratePerKm = 1.5;
    private int ratePerMinute = 1;
    private int currenMonthSalary;

    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,minimu);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setMinimu(int minimu) {
        this.minimu = minimu;
    }

    public void setRatePerkm(double ratePerkm) {
        this.ratePerKm = ratePerkm;
    }

    public void setRatePerMinute(int ratePerMinute) {
        this.ratePerMinute = ratePerMinute;
    }

    public void setCurrenMonthSalary(int currenMonthSalary) {
        this.currenMonthSalary = currenMonthSalary;
    }
}
