package com.ua.epam.lab14.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;


    @Given("open https:\\/\\/www.google.com\\/intl\\/ru\\/gmail\\/about\\/")
    public void open_https_www_google_com_intl_ru_gmail_about() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/intl/ru/gmail/about/");
    }

    @When("press \"Sign in\" button")
    public void press_sign_in_button() {
        WebElement buttonSingIn = driver.findElement(By.cssSelector("body > div.hercules-header.h-c-header.h-c-header--product-marketing-one-tier.header--desktop > div.h-c-header__bar > div.h-c-header__cta > ul.h-c-header__cta-list.header__nav--ltr > li:nth-child(2) > a"));
        buttonSingIn.click();
    }
    @When("type to input with type {string} text: {string}")
    public void type_to_input_with_type_text(String string, String string2) {
        System.out.println(string + string2);
        }
    @When("press element with value {string}")
    public void press_element_with_value(String string) {
        System.out.println(string);
    }

    @When("type to input with name {string} text: {string}")
    public void type_to_input_with_name_text(String string, String string2) {
        System.out.println(string + string2);
    }
    @Then("should be opened https:\\/\\/mail.google.com\\/mail\\/u\\/0\\/#inbox")
    public void should_be_opened_https_mail_google_com_mail_u_inbox() {
        System.out.println("ok");
    }
}
