package basicPractise;

import org.testng.annotations.Test;

public class Grouping {

    @Test(groups = {"Bikes"})
    public void royalEnfield(){
        System.out.println("I'm a Bike");
    }
    @Test(groups = {"Cars"})
    public void volksWagen(){
        System.out.println("I'm a Car");
    }
    @Test(groups = {"Cars"})
    public void miniCooper(){
        System.out.println("I'm a Car");
    }
    @Test(groups = {"Bikes"})
    public void yamahaR15(){
        System.out.println("I'm a Bike");
    }
    @Test(groups = {"Cars"})
    public void rangeRover(){
        System.out.println("I'm a Car");
    }
    @Test(groups = {"Bikes"})
    public void bajajPulsar(){
        System.out.println("I'm a Bike");
    }
    @Test(groups = {"Cars"})
    public void mercedesBenz(){
        System.out.println("I'm a Car");
    }
}
