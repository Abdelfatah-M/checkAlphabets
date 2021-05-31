/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author Administrator
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1 = "Hello2"; 
        
        //StringUtils stringUtils;
        StringOperations.checkAlphabets(string1, 
                                        (s1)-> {
                                                for (int i=0;i<s1.length();i++)
                                                    if (!Character.isLetter(s1.charAt(i)))
                                                        return false;

                                                return true;
                                                });
    }
    
}
