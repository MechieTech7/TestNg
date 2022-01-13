package basicPractise;

import org.testng.annotations.Test;

public class DependenciesManagement {

    @Test(enabled = true)
    public void joinAtmecs(){
        System.out.println("Join in ATMECS");
    }

    @Test(dependsOnMethods = "joinAtmecs")
    public void undergoTraining(){
        System.out.println("Complete Training Period");
    }

    @Test(dependsOnMethods = "undergoTraining")
    public void learnSkills(){
        System.out.println("Develop your Testing knowledge");
    }

    @Test(dependsOnMethods = "learnSkills")
    public void getProject(){
        System.out.println("Get Placed in a Project");
    }
}
