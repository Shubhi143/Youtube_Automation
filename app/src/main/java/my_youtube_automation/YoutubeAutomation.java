package my_youtube_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class YoutubeAutomation {
    static ChromeDriver driver;
  public static ChromeDriver createDriver() {
      
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
   

    public void start()  throws InterruptedException{
        //ChromeDriver driver = createDriver();
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        // TODO Auto-generated method stub
        
    }

    public void endTest() {
       // ChromeDriver driver = createDriver();
        System.out.println("End Test: TestCases");
      
        driver.quit();
    }
    public void search(String searchText) throws InterruptedException {
        System.out.println("Start TestCase: ruuning the driver");
       
        //ChromeDriver driver = createDriver();

        System.out.println("Navigating to the url");
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);

        System.out.println("Locating the search box");
  
        WebElement searchInput = driver.findElement(By.xpath("//*[@autocomplete='off']"));

        System.out.println("Searching for input");
        Thread.sleep(2000);
        searchInput.sendKeys(searchText);
    searchInput.submit();
        Thread.sleep(3000);
        System.out.println(searchText);
    
        System.out.println("End TestCase: TestCase completed");
   
     
    }

    public void playVideo(String videoName) throws InterruptedException {
        ChromeDriver driver = createDriver();
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);

}




   
}

