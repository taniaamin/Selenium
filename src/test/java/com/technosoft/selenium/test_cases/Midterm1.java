package com.technosoft.selenium.test_cases;

import com.technosoft.selenium.basic.BasePage;
import com.technosoft.selenium.basic.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by taniaamin on 2/3/18.
 */
public class Midterm1 extends BasePage{


// 1)reverse "hope you are doing well"-
    @Test
    public void reverseEverything1(){
            String s = "hope you are doing well";
            StringBuilder reverse = new StringBuilder();
            reverse.append(s);
            reverse = reverse.reverse();
            // print reversed String
            for (int i=0; i<reverse.length(); i++)
                System.out.print("Reverse" + reverse.charAt(i));
        }

    @Test
    public void reverseEverything2(){
        String s= "hope you are doing well";
        String reverse = new StringBuffer(s).reverse().toString();
        // print reversed String
        System.out.println("Reverse: " + reverse);
    }


    @Test
    public void reverseEverything3() {
        String s = "hope you are doing well";
        // convert String to character array by using toCharArray
        char[] a = s.toCharArray();
        // create a loop and take input backwards to print
        for (int i = a.length-1; i>=0; i--)
            System.out.print(a[i]);
    }


// 2a)Display the third and fifth item from the above list. Your output should be:
// Applesauce, unsweetened
    @Test
    public void displayFoodItem(){
       //  List<String> listOfFood = new ArrayList<>();
         List<WebElement> listOfFood = getDriver().findElements(By.className("title ng-binding"));
            for (int i = 1; i < listOfFood.size(); i++) {
                System.out.println(listOfFood.get(2) + "/n" + listOfFood.get(4));
                break;
            }
        }

// 2b)Fetch each food name and its servings and store them in a Map.
// Iterate through all the entries in the Map and print them.

    // public static void main(String[] args) {
    @Test
    public void hashMap() {
        HashMap<String, String> food = new HashMap<String, String>();

        food.put("Apple", "butter");
        food.put("Apple", "fresh");
        food.put("Applesauce", "unsweetened");
        food.put("Apple(s)", "dried");
        food.put("Juice", "Cranberry-apple drink");

        for (Map.Entry m : food.entrySet()) {
            System.out.println("item: " + m.getKey() + " Serving: " + m.getValue());
        }
    }



}




//Midterm:
//
//        Question 1:
//
//        Given a string, reverse each word in it and reverse the entire string. For example,
//        if the given string is “hope you are doing well”, then the output should be “llew gniod era uoy epoh”.
//        Assume that all characters in the string are lower case. Create a method called reverseEverything(String s)
//        where ‘s’ is the input from the user in order to solve this question.
//
//        Question 2:
//
//        Below is the source code of a sample webpage which displays a food item along with its servings.
//
//<html>
//<head>
//<body>
//<div class=”itemContent”>
//
//<span class="title ng-binding" ng-bind="food.name">Apple butter</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1 Tbsp</span>
//
//<span class="title ng-binding" ng-bind="food.name">Apple(s) fresh</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1 medium</span>
//
//<span class="title ng-binding" ng-bind="food.name">Applesauce, unsweetened </span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1/2 cup(s)</span>
//
//<span class="title ng-binding" ng-bind="food.name">Apple(s), dried</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">1/4 cup(s)</span>
//
//<span class="title ng-binding" ng-bind="food.name">Juice, Cranberry-apple drink</span>
//<span class="description ng-binding" ng-bind="food._servingDesc">8 fl oz</span>
//
//</div>
//</body>
//</head>
//</html>
//
//        Use your knowledge of WebDriver to fetch the following:
//        a)	Display the third and fifth item from the above list. Your output should be:
//        Applesauce, unsweetened
//        Juice, Cranberry-apple drink
//        b)	Fetch each food name and its servings and store them in a Map.
//        Iterate through all the entries in the Map and print them.
//




