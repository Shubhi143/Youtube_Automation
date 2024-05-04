package my_youtube_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;

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

  public void SearchAboutUs() throws InterruptedException{
    System.out.println("Start of TestCase ");
    driver.get("https://www.youtube.com");
    Thread.sleep(3000);
    // Find and click on the "About" link at the bottom of the sidebar

    WebElement mainmenu=driver.findElement(By.xpath("//*[@id='guide-icon']/yt-icon-shape/icon-shape/div"));
    mainmenu.click();
    Thread.sleep(2000);
    WebElement aboutLink = driver.findElement(By.xpath("//*[@id='guide-links-primary']/a[1]"));
    aboutLink.click();

    // Print the message on the screen
    WebElement messageElement = driver.findElement(By.xpath("//*[@id='content']/section/h1"));
    String message = messageElement.getText();
    System.out.println("Message is dsplayed: "+ message);

    System.out.println("End of  TestCase ");
  }
  public void ViewMovieSelections() throws InterruptedException{
    System.out.println("Start of TestCase ");
    driver.get("https://www.youtube.com");
    Thread.sleep(3000);

    // Find and click on the "About" link at the bottom of the sidebar
    int count=0;
    WebElement mainmenu=driver.findElement(By.xpath("//*[@id='guide-icon']/yt-icon-shape/icon-shape/div"));
    mainmenu.click();
    Thread.sleep(2000);

List<WebElement> sections=driver.findElements(By.xpath("//*[@id='endpoint']/tp-yt-paper-item/yt-formatted-string"));
for(WebElement selection: sections){
    if(selection.getText().equals("Movies")){
        selection.click();
    }
}
// WebElement viewAll=driver.findElement(By.xpath("//*[@id='top-level-buttons-computed']/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
// viewAll.click();
Thread.sleep(2000);
Boolean Status=false;
List<WebElement> movies=driver.findElements(By.xpath("//*[@id='items']/ytd-grid-movie-renderer/a"));
for(WebElement movie:movies){
    if(movie.getText().contains("A") || movie.getText().contains("Comedy")){
        Status=true;
    }
    else{
       Status=false;
    }
}
if(Status){
    System.out.println("The movie is marked as 'A' for Mature and is either 'Comedy' or 'Animation'.");
}
else{
    System.out.println("The movie does not meet the criteria.");
}

System.out.println("End of Testcase ");
    }
}



