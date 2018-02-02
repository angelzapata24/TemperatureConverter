package com.company;

public class TemperatureConverter {
    public String startUnit;// starting unit
    public String endUnit;// ending unit

    public TemperatureConverter(String start, String end) {
        this.startUnit = start;
        this.endUnit = end;
    }

    public double convert(double temperature) {
        double newTemperature;
        if (startUnit.equals("F"))
            newTemperature = convertFromF(temperature);

        else if (startUnit.equals("C"))
            newTemperature = convertFromC(temperature);

        else
            newTemperature = 0;

        return newTemperature;
    }

    private double convertFromF(double temperature) {
        if (endUnit.equals("C"))
            return (temperature - 32) * 5/9;

        else if (endUnit.equals("K"))
            return ((temperature - 32) / 1.8) + 273.15;

        else
            return -999999;
    }

    private double convertFromC(double temperature) {
        if (endUnit.equals("F"))
            return (temperature * 9/5 ) + 32;

        else if (endUnit.equals("K"))
            return temperature + 273.15;

        else
            return -999999;
    }
}
