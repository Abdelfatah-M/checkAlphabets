/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.function.BiPredicate;

/**
 *
 * @author Administrator
 */
public class StringOperations {
    public static void checkAlphabets(String s1,AlphaCheck<String> p){
        if (p.test(s1)) 
            System.out.println("string contains only alphabets");
        else
            System.out.println("string doesn't contain only alphabets");;
    }
}
