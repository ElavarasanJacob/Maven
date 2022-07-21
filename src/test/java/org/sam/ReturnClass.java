package org.sam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReturnClass {
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 2; i <6; i++) {
			for (int j =i  ; j <128 ; j++) {
				System.out.println(j);
				
			}
			System.out.println(i);

		}
		
	}

}
