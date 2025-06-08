package ex_19_OOPs_Part2.superKeyword;

public class Lab180 {

}

class BaseClass{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){
            this.browser = browser;
        }
        else{
            System.out.println("Change browser Not allowed, Not a Admin");
        }

    }


    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }

    void bhk3(){}
}

class TestCase1 extends BaseClass{


    public void tc(){}

    public TestCase1(String browser){
        super(browser);
        super.openBrowser();
        super.openBrowser("chrome");
        super.closeBrowser();
        super.bhk3();

        this.tc();

    }



}
