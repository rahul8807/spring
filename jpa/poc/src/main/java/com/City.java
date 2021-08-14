package com;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class City {

    /*//2nd higest average rainfall in city
    //city name as string //bang
    //rain fall in millimeter integer //800 mm
    //year of the rainfall integer // 2015



    public static void main ( String[] args ) {

        CityRainfallData mumbai2018 = new CityRainfallData ("Mumbai", 100, "2018");
        CityRainfallData mumbai2019 = new CityRainfallData ("Mumbai", 200, "2019");
        CityRainfallData mumbai2020 = new CityRainfallData ("Mumbai", 300, "2020");
        CityRainfallData mumbai2021 = new CityRainfallData ("Mumbai", 400, "2021");


        CityRainfallData pune2018 = new CityRainfallData ("Pune", 100, "2018");
        CityRainfallData pune2019 = new CityRainfallData ("Pune", 200, "2019");

        CityRainfallData banglore2018 = new CityRainfallData ("Mumbai", 300, "2018");

        Stream.of ( mumbai2018,mumbai2019,mumbai2020,mumbai2021,pune2018,pune2019,banglore2018)
                .collect ( Collectors.groupingBy ( CityRainfallData::getCityName ) )
                .entrySet ()
                .stream ().map ( e ->  {

                    int sum = e.getValue ().stream ().map ( city -> city.getMillimeter () ).reduce(0, (a, b) -> a + b);
                    double average = sum / e.getValue ().stream ().count ();

                    return new CityAverage ( e.getKey (),  average);

        } ).collect( Collectors.toList ()).sort ( avg -> avg.getAverage () ).;
               // .reduce ( Collectors.groupingBy ( CityRainfallData::getCityName ) , 100);


    }*/
}

class CityAverage{
    String cityName;
    Double average;

    public CityAverage ( String cityName, Double average ) {
        this.cityName = cityName;
        this.average = average;
    }

    public String getCityName () {
        return cityName;
    }

    public void setCityName ( String cityName ) {
        this.cityName = cityName;
    }

    public Double getAverage () {
        return average;
    }

    public void setAverage ( Double average ) {
        this.average = average;
    }
}

class CityRainfallData{
    private String cityName;
    private Integer millimeter;
    private String year;


    public CityRainfallData ( String cityName, Integer millimeter, String year ) {
        this.cityName = cityName;
        this.millimeter = millimeter;
        this.year = year;
    }

    public String getCityName () {
        return cityName;
    }

    public void setCityName ( String cityName ) {
        this.cityName = cityName;
    }

    public Integer getMillimeter () {
        return millimeter;
    }

    public void setMillimeter ( Integer millimeter ) {
        this.millimeter = millimeter;
    }

    public String getYear () {
        return year;
    }

    public void setYear ( String year ) {
        this.year = year;
    }
}
