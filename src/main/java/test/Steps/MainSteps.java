package test.Steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import test.Pages.HomePage;
import test.Pages.PlaceOrderPage;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.files.DownloadActions.click;

public class MainSteps {
    public MainSteps() throws FileNotFoundException {
    }

    @When("user navigate to then {string} link")
    public void userNavigateToThenLogInLink(String link) {
        HomePage homePage = new HomePage();
        switch (link) {
            case "Log in":
                homePage.loginlink.click();
                Selenide.sleep(2000);
                break;
            case "Sign up":
                homePage.singUp.click();
                Selenide.sleep(2000);
                break;
        }

    }

    @When("user select {int} product from Main Page")
    public void userSelectProductFromMainPage(int arg0) {
        // Write code here that turns the phrase above into concrete actions

        HomePage homePage = new HomePage();
        homePage.products.get(arg0).click();
        Selenide.sleep(4000);
    }

    @When("user fills order details and completes purchase")
    public void userFillsOrderDetailsAndCompletesPurchase() {
        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
        placeOrderPage.purchaseButton.click();
        Selenide.sleep(3000);
    }

    @When("save products in the file")
    public void saveProductsInTheFile() throws IOException {
        HomePage homePage = new HomePage();
        Selenide.sleep(2000);
        FileWriter fileWriter = new FileWriter("src/main/java/test/TestData/products.txt");
        for (SelenideElement i : homePage.products) {
            String productName = i.getText();
            System.out.println(productName);
            fileWriter.write(productName);
        }
        fileWriter.close();


    }

    @And("read products from the file")
    public void readProductsFromTheFile() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        FileReader fileReader = new FileReader("src/main/java/test/TestData/products.txt");
        Selenide.sleep(2000);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) ;
        System.out.println(line);


    }

    @And("save the price products in the file")
    public void saveThePriceProductsInTheFile() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        Selenide.sleep(2000);
        FileWriter fileWriter = new FileWriter("src/main/java/test/TestData/price.txt");
        for (SelenideElement j : homePage.priceProducts) {
            String priceProducts = j.getText();
            System.out.println(priceProducts);
            fileWriter.write(priceProducts + "\n");
        }
        fileWriter.close();
    }

    @And("read price from the file")
    public void readPriceFromTheFile() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        FileReader fileReader = new FileReader("src/main/java/test/TestData/price.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    @And("find max price in the file")
    public void findMaxPriceInTheFile() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        FileReader fileReader = new FileReader("src/main/java/test/TestData/price.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int Max = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            String newPrices = line.replace("$", " ").trim();
            if (!newPrices.isEmpty()) {
                int preturi = Integer.parseInt(newPrices);
                Max = Math.max(Max, preturi);
            }
        }
        System.out.println("Maximum" + " " + Max);
        bufferedReader.close();
        fileReader = new FileReader("src/main/java/test/TestData/price.txt");
        bufferedReader = new BufferedReader(fileReader);
        List<Integer> listaPreturi = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String newPrice = line.replace("$", "").trim();
            if (!newPrice.isEmpty()) {
                listaPreturi.add(Integer.parseInt(newPrice));
            }
        }
        if (!listaPreturi.isEmpty()) {
            int max = Collections.max(listaPreturi);
            System.out.println("Maximum din lista: " + max);
        }
        bufferedReader.close();
    }

    @And("find min price in the file")
    public void findMinPriceInTheFile() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        FileReader fileReader = new FileReader("src/main/java/test/TestData/price.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int Min = Integer.MAX_VALUE;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            String newPrices = line.replace("$", "").trim();
            if (!newPrices.isEmpty()) {
                int preturi = Integer.parseInt(newPrices);
                Min = Math.min(Min, preturi);
            }
        }
        System.out.println("Pretul minim: " + Min);
        bufferedReader.close();

        fileReader = new FileReader("src/main/java/test/TestData/price.txt");
        bufferedReader = new BufferedReader(fileReader);
        List<Integer> listaPreturi = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String newPrice = line.replace("$", "").trim();
            if (!newPrice.isEmpty()) {
                listaPreturi.add(Integer.parseInt(newPrice));
            }
        }
        if (!listaPreturi.isEmpty()) {
            int min = Collections.min(listaPreturi);
            System.out.println("Pretul minim din lista: " + min);
        }
        bufferedReader.close();
    }
}