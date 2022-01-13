package basicPractise;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.println("It will run before test starts");
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("It will run when tests passed successfully");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("It will run when tests fail");
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("It will run when tests skipped");
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("It will run when tests passed with minimal failure");
    }
    public void onStart(ITestResult result){
        System.out.println("It will run when before even test starts");
    }
    public void onFinish(ITestResult result){
        System.out.println("It will end tests");
    }

}
