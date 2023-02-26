    package co.com.test;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

    public class formulario {

        public static void main(String[] args) throws IOException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\RentAdvisor\\Desktop\\prueba2\\prueba2\\src\\test\\resources\\driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://docs.google.com/forms/d/e/1FAIpQLSd8pYrym78Am_OtC7TeJ7igtixsW7eZPbRCAM6vbii3nS-0cA/viewform");
            driver.manage().window().maximize();


            // Abre el archivo CSV y crea un objeto BufferedReader para leer los datos del archivo
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\RentAdvisor\\Desktop\\prueba2\\prueba2\\src\\main\\java\\data\\DataExcel2.csv"));
            String linea;
            br.readLine();
            while ( (linea = br.readLine()) != null && !linea.isEmpty() ) {
                // Divide la fila del archivo en campos separados por comas
                //
                String[] campos = linea.split(";");

                String campo1 = campos[0] != null && !campos[0].isEmpty() ? campos[0] : " ";
                String campo2 = campos.length > 1 && campos[1] != null && !campos[1].isEmpty() ? campos[1] : " ";
                String campo3 = campos.length > 2 && campos[2] != null && !campos[2].isEmpty() ? campos[2] : " ";
                String campo4 = campos.length > 3 && campos[3] != null && !campos[3].isEmpty() ? campos[3] : " ";
                String campo5 = campos.length > 4 && campos[4] != null && !campos[4].isEmpty() ? campos[4] : " ";
                String campo6 = campos.length > 5 && campos[5] != null && !campos[5].isEmpty() ? campos[5] : " ";
                String campo7 = campos.length > 6 && campos[6] != null && !campos[6].isEmpty() ? campos[6] : " ";

                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]//input")).sendKeys("Juan David Guzman Lopez");
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]//input")).sendKeys(campo1);
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]//input")).sendKeys(campo2);
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]//input")).sendKeys(campo3);
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[5]//input")).sendKeys(campo4);
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[6]//input")).sendKeys(campo5);
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[7]//input")).sendKeys(campo6);
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[8]//input")).sendKeys(campo7);
                driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span")).click();
                driver.switchTo().window(driver.getWindowHandle());
                driver.get("https://docs.google.com/forms/d/e/1FAIpQLSd8pYrym78Am_OtC7TeJ7igtixsW7eZPbRCAM6vbii3nS-0cA/viewform");
            }
            br.close();

        }
    }
