package CSSSelectorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new  ChromeDriver();
		driver.get("");
		
		driver.findElement(By.cssSelector(""));
		
		// CSS for id attribute
		// ------ #id  ---------- #username
		// ------ tagname#id ---- input#username
		// ------ #password
		// ------ input#password
		
		
		// CSS for Class attribute
		// ------  .class  
		// ------  tagname.class
		// ------  input.btn.btn-primary
		// ------  
		
		
		// classes + id  
		// ------ attribute.class#id
		// ------ input.form-control#input-email
		
		// ------ attribute#id.class
		// ------ input#input-email.form-control
		
		// ------ .c1.c2.c3.c4..... cn ( CSS for class is start with . and if class value have space then with . can connect 
		// ------ form-control.private-form__control.login-email
		
		// ------ tagname.c1.c2.c3.c4....cn
		// ------ input.form-control.private-form__control.login-email
		
		// for other attribute css selector 
		// ------ tagname[attribute='value']  --- CSS
		// ------ //tagname[@attribute='value'] --- XPATH
		
		// ------ input[name='email']
		// ------ input[id='input-email']
		// ------ input[id='input-email'][type='text'][name='email'] --- multiple attribute used
		// ------ input#input-email[type='text'][name='email']
		
		
		//  contains represent in CSS as * 
		// ------ input[placeholder*='E-Mail']
		// ------ input[placeholder*='Address']
		
		// starts with represent in CSS as ^	
		// ------  input[placeholder^='E-Mail']
		
		// ends with not in XPATH but in CSS represent as $
		// ------  input[placeholder$='Address']		
		// ------  input[placeholder$='dress']
		
		// text in CSS : Not available - supported
		
		// Parent to Child Concept in CSS
		// ------ direct associate element / child's CSS will be - form#hs-login > div -- 8 
		// ------ direct + indirect element / child's CSS will be - form#hs-login div -- 22
		
		// ------ select#Form_getForm_Country > option OR   	
		// ------ select#Form_getForm_Country option -- also used because no any option
		
		// Child to Parent : : not allowed - backward traversing not allowed
		// Child to ancestor : : not allowed - backward traversing not allowed
		// preceding sibling : : not allowed - backward traversing not allowed
		
		// following-sibling -- Represent in CSS as '+' give immediate following one
		// ------ label[for='input-email']+input#input-email 
		
		// following-sibling -- Represent in CSS as '~' give all following
		// ------ option[value='Algeria']~option
		
		
		// comma in CSS
		// ------ input#username,input#password,button#loginBtn,input#remember -- All 4 element in one CSS
		// ------ Use case for these as Count the mandatory fields on page (Sanity Test Case)
		
		int manFields = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,input#remember")).size();
		if(manFields == 4) {
			System.out.println("All important fields are presnt on page");
		}
		
		// in 10 element want to exclude any one of the element 
		// with help of -- not
		// ------ div.form-group > input.form-control:not(#input-password)
		// ------ div.form-group > input.form-control:not(#input-password)
		
		// Index in CSS
		// ------ select#Form_getForm_Country > option:nth-of-type(5) -- select specific index value
		// ------ select#Form_getForm_Country > option:nth-of-type(n)  -- All values
		// ------ select#Form_getForm_Country > option:first-child  ----- Select First one
		// ------ select#Form_getForm_Country > option:last-child  ------ Select Last one
		// ------ select#Form_getForm_Country > option:nth-child(10)  ----- 
		// ------ select#Form_getForm_Country > option:nth-last-child(2)  ---- select child from last option
		// ------ select#Form_getForm_Country > option:nth-child(odd)  --- select only Odd ones
 		// ------ select#Form_getForm_Country > option:nth-child(even) --- select only Even ones
		// ------ select#Form_getForm_Country > option:nth-of-type(n+4) -- Start from 4 position
		// ------ select#Form_getForm_Country > option:nth-of-type(4n) --- Start from 4 position and select multiple of 4
		
		// Each Browser has Xpath Enggine - chrome has V8
		// now a days these is very fast
		
		// Xpath is not converted to CSS
		// Id , name other locators converted to CSS at the time of Execution
		
		
		//							Xpath            vs              CSS
		//1.performance				Good							Good     												
		//2.Syntax					complex							simple 
		//3.
		
		
	}

}
