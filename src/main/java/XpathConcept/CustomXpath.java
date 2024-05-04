package XpathConcept;

public class CustomXpath {

	public static void main(String[] args) {
		
		// Xpath: address of the web element
		// XML path 
		//1. absolute xpath - Travel from base tag to current tag - 
		// Use of Its a risk as in future any new element added in between then it not work
		// 
		//2. relative xpath - Travel from current element tagname 
		// syntax :   //tagname[@attribute='']
		
		// 1. Using Single Attribute
		
		//input[@id='input-email']	
		//how many input fields available 
		//input[@name]  ----5 Use with find elements
		//input[@value='Login'] -- 1 use with find element
	
		//2. Using Multiple attributes - n number of attribute we can use
	
		//Syntax : //tagname[@attribute1 ='value' and @attribute2='value' and @attribute3='value']
		//input[@type='submit' and @value='Login'] - it give unique one
		//input[@type='text' or @type='email'] -- it give multiple options
		//input[@type and @value]
		// on page how many links having some URL property
		//a[@href]-- 81
		
		//3. Using text()
		//Don't have any attribute //h2
		// syntax -- //tagname[text()='value']
		// on which tag have text where we can use it
		
		//h2[text()='New Customer']
		//a[text()='Register'] -- 2
		//a[text()='Desktops'] -- 1
	
		
		//4.text() and attributes:  (and or can use)
		//tagname[@attribute='value' and text()='value']

		//a[@class='dropdown-toggle' and text()='Desktops']
		//a[@class='dropdown-toggle' and text()='Desktops' and @data-toggle='dropdown']
		
		//5. contains():
		// syntax : //tagname[contains(@attribute,'value')]
		
		//input[contains(@placeholder, 'E-Mail')]
		//input[contains(@placeholder, 'Address')]
		
		
		//6. contains() and attribute 
		
		//taganme[contains(@attribute1, 'value') and @attribute2 = 'value']
		//input[contains(@placeholder, 'Address') and @name='email']
		//input[contains(@placeholder, 'Address') and @name='email' and contains(@id, 'input-email')]
		
		//a[contains(@href,'wishlist')]
		
		// for dynamic ID - some common thing and some part is changed when do refresh
		// in this case we use the contains()
		//< input id = "firstname_123"/>
		//< input id = "firstname_456"/>
		//< input id = "firstname_412"/>
		//< input id = "firstname_785"/>
		//< input id = "firstname_236"/>
		
		//input[contains(@id, 'firstname_')]
		
		//7. contains() with text() = If long text then we can use
		// syntax = //tagname[contains(text(),'textvalue']
		
		//p[contains(text(),'generative AI.')]
		//h1[contains(text(),'software.')]
		
		//8. contains() with text() and attribute
		// syntaxt -- //tagname[contains(text(),'textvalue') and @attribute='value']
		
		//a[contains(text(),'Customer') and @tabindex='0']
		
		//tagname[contains(text(),'textvalue') and contains(@attribute,'value')]
		
		//a[contains(text(),'Notebooks') and contains(@href,'category&path=18')]
		
		//a[contains(text(),'Notebooks') and contains(@href,'category&path=18') and @data-toggle='dropdown']
		
		//8. starts_with  = Only used with start value of attribute
		// syntax --- //tagname[starts-with(@attribute,'value')]
		
		//input[starts-with(@placeholder,'E-Mail')]
		
		//9. starts-with() with text()
		//tagname(starts-with(text(),'textstartvalue')]
		//a[starts-with(text(),'Forgotten')]
		
		//10. don't have any function as ends-with - Not supported in Xpath
		
		//11. Index based Xpath  -- IMP -- is the Last option
		
		// ---  (//a[starts-with(text(),'Forgotten')])[1]
		// ---- () Hole multiple return Xpath is captured in () brackets called as capture group and then provide the index
	
		//a[@class='list-group-item']  -- this Xpath return 13 elements
		// for specific 5 number xpath
		
		 // -------(//a[@class='list-group-item'])[5]
		 // OR ----(//a[@class='list-group-item'])[position()=1]
		
		// --------- (//a[@class='list-group-item'])[last()]  -- it used for last element in all common
		//---------- (//a[@class='list-group-item'])[last()-1] -- it is for second last same -3 - 4
		
		// QUE - how to get last element 
		
		// Amazon web site example
		// get last from last column
		// ---  ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		//get second last from last column
		// ---  ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-1]	
	
		// get last from 3rd column
		// ---   ((//div[@class='navFooterLinkCol navAccessibility'])[last()-1]//a)[last()]
				
		// get last from 2nd column
		// ---   ((//div[@class='navFooterLinkCol navAccessibility'])[last()-2]//a)[last()]
		
		// get first from first column
		// ---  ((//div[@class='navFooterLinkCol navAccessibility'])[last()-3]//a[text()='About Us'])
				
		//*  Gives all elements 
		//*[@id] Give all element have attribute as id
		//*[@class='form-control'] --- 
		//input[@class='form-control'] --- best to use these
		
		// don't use * use specific tag name
	
	
	
	
	
	
	}

}
