package basicPractise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrisation {

    @Test
    @Parameters("Name")
    public void getSomeThing(String name){

        System.out.println("My Inspiration is:"+ name );
    }
}
