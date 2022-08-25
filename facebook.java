package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class facebook {


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\f5519101\\workspace\\za.co.fnb.gts.payment\\platform\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com");
            driver.findElement(By.id("email")).sendKeys("");
            driver.findElement(By.id("pass")).sendKeys("");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@name='login']")).click();
            Thread.sleep(7000);
            driver.findElement(By.xpath("//div[@class='s9ok87oh bf1zulr9 s9ljgwtm lxqftegz frfouenu r7bn319e bonavkto djs4p424 bdao358l alzwoclg cgu29s5g i15ihif8 sl27f92c m8h3af8h l7ghb35v kjdc1dyq kmwttqpk aeinzg81 srn514ro rl78xhln om3e55n1 g4tp4svg i85zmo3j jl2a5g8c b0eko5f3 fwlpnqze il7dmu95']//span[contains(text(),'Friends')]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o']//span[contains(text(),'friend')]")).click();
            Thread.sleep(3000);

            while (driver.findElement(By.xpath("//div[@class='i85zmo3j alzwoclg jl2a5g8c']//div[@class='qi72231t o9w3sbdw tav9wjvu flwp5yud tghlliq5 gkg15gwv bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx dnr7xe2t aeinzg81 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg o9erhkwx dzqi5evh hupbnkgi hvb2xoa8 jl2a5g8c f14ij5to l3ldwz01 icdlwmnq qgrdou9d nu7423ey s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e fxk3tzhb m8h3af8h l7ghb35v kjdc1dyq kmwttqpk srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 i8zpp7h3 bao8dtny dnmkjdou mbayin57 jp1l04w5 nrqvyqmi gem102v4 irugqya3 qj3iqdt8 ggpyybhw by1353ay tvwbo6py']")).isDisplayed()) {
                List<WebElement> friends = driver.findElements(By.xpath("//div[@class='i85zmo3j alzwoclg jl2a5g8c']//div[@class='qi72231t o9w3sbdw tav9wjvu flwp5yud tghlliq5 gkg15gwv bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx dnr7xe2t aeinzg81 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg o9erhkwx dzqi5evh hupbnkgi hvb2xoa8 jl2a5g8c f14ij5to l3ldwz01 icdlwmnq qgrdou9d nu7423ey s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e fxk3tzhb m8h3af8h l7ghb35v kjdc1dyq kmwttqpk srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 i8zpp7h3 bao8dtny dnmkjdou mbayin57 jp1l04w5 nrqvyqmi gem102v4 irugqya3 qj3iqdt8 ggpyybhw by1353ay tvwbo6py']"));
                for (WebElement a : friends) {

                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", a);
                    a.click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//div[@class='jroqu855 nthtkgg5']/span[contains(text(),'Unfriend')]")).click();
                    Thread.sleep(200);
                    driver.findElement(By.xpath("//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y qtx5e3l4']/span[contains(text(),'Confirm')]")).click();
                    Thread.sleep(300);
                    friends = driver.findElements(By.xpath("//div[@class='i85zmo3j alzwoclg jl2a5g8c']//div[@class='qi72231t o9w3sbdw tav9wjvu flwp5yud tghlliq5 gkg15gwv bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx dnr7xe2t aeinzg81 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg o9erhkwx dzqi5evh hupbnkgi hvb2xoa8 jl2a5g8c f14ij5to l3ldwz01 icdlwmnq qgrdou9d nu7423ey s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e fxk3tzhb m8h3af8h l7ghb35v kjdc1dyq kmwttqpk srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 i8zpp7h3 bao8dtny dnmkjdou mbayin57 jp1l04w5 nrqvyqmi gem102v4 irugqya3 qj3iqdt8 ggpyybhw by1353ay tvwbo6py']"));


                }
            }

        }





        }


