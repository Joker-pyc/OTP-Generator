//This is a commercial programm 
//The User must get the copy of license before using rhis programm
//Author: Santosh Maurya.

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int length = 6;
		System.out.println(Password(length));

	}
	static char[] Password(int len) 
    {

		

        System.out.print("Your OTP is : "); 

	
		String numbers = "1234567890";
        String values = numbers ;



        // Using random method 

        Random rndm_method = new Random(); 



        char[] password = new char[len]; 



        for (int i = 0; i < len; i++) 

        { 

            // Use of charAt() method : to get character value 

            // Use of nextInt() as it is scanning the value as int 

            password[i] = 

				values.charAt(rndm_method.nextInt(values.length())); 

        } 

        return password; 

	};

}
