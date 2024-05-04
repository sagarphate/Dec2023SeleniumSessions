package XpathConcept;

public class XpathAxes {

	public static void main(String[] args) {
		
		// Xpath
		
		// parent to direct child : /
		// ---- //form/div/label
		
		// parent to direct + indirect child element: //
		//select[@id='Form_getForm_Country']//option  - 233
		//select[@id='Form_getForm_Country']/option	  - 233	
		
		//html/body/div -- direct child 2 child
		//html/body//div  -- direct + indirect 40 childs
		
		
		// indirect associate with parent
		
		//div[@id="content"]//img
		
		//html/body/div  -- 2
		//html/body//div  -- All direct + indirect child's
	
		//2. Child to parent travel
		// Back word Traveling
		
		//input[@id='input-email']/..
		
		//input[@id='input-email']/../../../../../../../../../..
		
		//child input parent is div 
		//input[@id='input-email']/parent::div
		
		//child input parent is div and div parent is form 
		//input[@id='input-email']/parent::div/parent::form
	
		// from child to grand parent
		//input[@id='input-email']/ancestor::form
		
		//a[text()='Recurring payments']/ancestor::aside
		
		//input[@id='input-email']/ancestor::form/parent::div//ancestor::body
		
		//3. same level Tag names are siblings
		// Travel from exact point to upside then its presiding sibling
		//a[text()='Recurring payments']/preceding-sibling::a   ------------ 8 -- With findElements
		//a[text()='Recurring payments']/preceding-sibling::a[text()='Downloads'] -- Gives Exact one ---- 1
		
		// Travel from exact point to down side then its following sibling
		//a[text()='Recurring payments']/following-sibling::a  ----- 4  -- access with findElements
		//a[text()='Recurring payments']/following-sibling::a[text()='Newsletter']  ---- Gives Exact one ---- 1
		
		
		//label[text()='E-Mail Address']/following-sibling::input
		//input[@id='input-password']/preceding-sibling::label
		
		
		// WebSite -----  https://selectorshub.com/xpath-practice-page/
		// Click on Joe.Root check box
		// Start with Starting Point
		// out of 3 use shortest one
		//1. ---- //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//2. ---- //a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']
		//3. ---- //a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']  
		
		
		//Odd and Even values with help of Xpath
		
		// ---- (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 1] == Odd value selected 
		// ---- (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 0] == Even value selected 
				
		
	}

}
