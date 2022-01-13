package basicPractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionUsage {

    String name = "MS_Dhoni";
    boolean value = false;
    @Test
    public void checkName(){

        /*if(name.equals("MS_Dhon")){
            System.out.println("He is an Inspiration");
        }else {
            System.out.println("However he was my Captain");
        }*/
         Assert.assertEquals(name, "MS_Dhoni");
       // Assert.assertNotEquals(name,"MS_Dhon");
        //Assert.assertTrue(value,"except false");
       // Assert.assertFalse(value,"expect false");

    }

}
