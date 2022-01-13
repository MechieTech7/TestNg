package basicPractise;

import org.testng.annotations.Test;

public class Skip {

    @Test(priority= 0)
    public void turnONComputer(){

        System.out.println("Turn on Your Computer");

    }

    @Test(priority = 1,enabled = false)
    public void refreshFirst(){

        System.out.println("Refresh your System");

    }

    @Test(priority = 2)
    public void openBrowser(){

        System.out.println("Open Chrome Browser");

    }

    @Test(priority = 3)
    public void joinMeet(){

        System.out.println("Join Meeting Using Link");

    }

    @Test(priority = 4)
    public void trollKowsik(){

        System.out.println("Troll Koushik");

    }
}
