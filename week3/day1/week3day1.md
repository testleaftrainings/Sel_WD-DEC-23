Definition and Structure:
=========================

Absolute XPath: It starts from the root (html) and traverses down to the desired element, detailing every single element in the hierarchy. The path starts with a single forward slash /, indicating the root. For example: /html/body/div[2]/div[2]/div/form/p[1]/input. `.
Relative XPath: It starts from anywhere within the document and typically focuses on identifying elements based on attributes, indexes, or specific tags, not necessarily detailing the entire path from the root. It starts with a double forward slash //, indicating the search can begin anywhere. For example: //input[@id=‘username’].

Robustness:
Absolute XPath: It is less robust because if there are any changes in the path or structure of the web page, the XPath would break, leading to failed element location.
Relative XPath: It is more robust as it usually focuses on specific attributes or elements, making it less susceptible to changes in the overall structure of the webpage.

Length and Complexity:
Absolute XPath: These tend to be longer . They map the entire path from the root to the element, making them more complex.
Relative XPath: They are generally shorter and more concise, targeting specific elements directly without detailing the entire path, reducing complexity.

Flexibility and Use Cases:
Absolute XPath: It's less commonly used in dynamic web environments where page structures can change frequently.
Relative XPath: More commonly used in web automation and scraping because of its adaptability to web page changes and ability to precisely target elements.

Performance:
Absolute XPath: It can be slower in performance as it requires traversing the entire hierarchy of the DOM (Document Object Model) from the root.
Relative XPath: Generally offers better performance as it allows for more direct queries and doesn't necessarily traverse from the root.

Relative Xpath:

a.Basic xpath
Attribute based xPath: Syntax: //tagname[@attributename='attributeValue'] Example:  //input[@id='password'] //input[@id='twotabsearchtextbox']

Text based xPath: Syntax: //tagname[text()='textvalue'] Example:  //a[text()='Leads'] //span[text()='Hello, sign in']

Partial Attribute based xpath: Syntax: //tagname[contains(@attributename,'partialattributevalue')] Example: //input[contains(@class,'decorative')] //input[contains(@id,'twotab')]

Partial Text based xpath:
Syntax: //tagname[contains(text(),'partialtextvalue')]  Example: //a[contains(text(),'SFA')]
//span[contains(text(),'Hello')]

Index based xpath: Syntax: (//tagname[@attributename='attributeValue'])[2]
(//tagname[text()='textvalue'])[3] Example: (//a[contains(text(),'Lead')])[3] 

b.Advanced xPath(Axes based xPath)
Parent to Child: Syntax: BasicRelativeXpathforParent/childTagname Example: (//form[@id='login']/p)[2] 

Child to Parent: Syntax:  BasicRelativeXpathforChild/parent::parenttagname Example:  //label[text()='Password']/parent::p //p[@class='top']/parent::form

GrandParent to GrandChild: Syntax: BasicRelativeXpathforGrandParent//grandchildTagname Example: (//form[@id='login']//input)[3] 

GrandChild to GrandParent: Syntax:  BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname
Example: //input[@class='decorativeSubmit']/ancestor::form

ElderCousin to YoungerCousin: Syntax: BasicRelativeXpathforElderCousin/following::youngerCousintagname
Example: `//span[text()='Company Name']/following::input

YoungerCousin to ElderCousin: Syntax: BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname
Example: //input[@id='createLeadForm_firstName']/preceding::input[2] 

ElderSibling to YoungerSibling: Syntax:
BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname Example: //label[text()='Username']/following-sibling::input

YoungerSibling to ElderSibling: Syntax: BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname Example:
//input[@id='username']/preceding-sibling::label
`

Exceptions:
===========

InvalidSelectorException
========================

Definition:
This exception occurs when the format of a given selector is incorrect or unsupported.

Common Causes:
Syntax errors in the selector string.

Handling Tips:
Double-check the syntax of your selector.


NoSuchElementException
======================

Definition:
This exception is thrown when an element could not be found on the page.
It indicates that the search operation did not locate the element within the current webpage.

Common Causes:
The element does not exist on the page at the time of search.
The selector used does not correctly identify the desired element.
The element is not loaded yet due to web page's dynamic loading or delays.
 
Handling Tips:
Ensure the correctness of the selector.
Use waits ( implicit) to allow time for the element to load.


Waits in Selenium
=================

   Two types:
         1. ImplicitlyWait
         2. ExplicitlyWait

ImplicitlyWait
--------------
      - used to wait for timeout to locate the WebElement from the DOM.
      - It will only works when entire page is loaded. 
      - if partial of the WebPage got loaded, Then implicitly wait will not work.


xpath
=====

   1. Abosulte xpath
         starts from '/' --> root node
         it long path
         take more time to write a xpath.
         /html/body/div[2]/div[2]/div/form/p[1]/input

   2. Relative xpath
         starts from '//' --> current node
         
         General syntax
         --------------
               //tagName[@attributeName ='attribteValue']
               //label[@for='password']

      Basic xpath
      ===========
      1. Attribute based
         syntax:
         //tagName[@attributeName='attributeValue']
         Ex:
         //input[@placeholder='Babu Manickam']

      2. Text based 
         syntax:
         //tagName[text()='textb of the WebElement']
         Ex:
         //h5[text()='Clear the typed text.']
         //a[text()='Conditions of Use & Sale']

      3. Parital attribute based
         syntax:
         //tagName[contains(@attributeName,'partial attribute value')]
         Ex:
         //input[contains(@name,'j_idt88:j_idt97')]

      4. Parital text based
         syntax:
         //tagName[contains(text(),'partial text of the WebElement')]
         Ex: //li[contains(text(),'Amazon.com')]

      
      5. Collection based
         syntax:
         (Any xpath)[collection index]
         Ex:
         (//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[1]




      Advanced xpath
      ==============

      1. Parent to child

      Syntax:
         xpath of the parent element/ tagName of the child
      Ex:
      //p[@class='top']/input

      2. Grand Parent to Grand Child

      Syntax:
         xpath of the grand parent // tagName of the grand child
      Ex:
      (//form[@id='login']//input)[3]
      //div[@id='nav-bb-searchbar']//input[@title='Go']
      //a[@aria-label='Routers']//img

      3. Child to parent

         Syntax:
            xpath of the child /parent:: tagName of the parent
         Ex:
         //input[@value='Flip Flops']/parent::label

      4. Grand Child to Grand Parent

         Syntax:
            xpath of the grand child/ancestor::tagName of the grand parent
         Ex:
            //span[text()='Categories']/ancestor::section

      5. Elder sibling to Younger sibling

         Syntax:
            xpath of the elder sibling /following-sibling:: tagName of the younger sibling
         Ex:
         //span[text()='Recommended']/following-sibling::span

      6. Younger sibling to elder sibling

         Syntax:
            xpath of the younger sibling /preceding-sibling:: tagName of the elder sibling
         Ex:
         //div[@class='desktop-downLinkContainer']/following-sibling::div

      7. Elder cousin to younger cousin

         syntax:
            xpath of the elder cosin /following:: tagName of the younger cousin
         Ex: 
         //p[text()=' EXPERIENCE MYNTRA APP ON MOBILE ']/following::a

      8. Younger cousin to elder cousin

         Syntax:
            xpath of the younger cousin /preceding :: tagName of the elder cousin. 
         Ex: 
         //img[@class='desktop-iOSDownLink']/preceding::img[@class='desktop-androidDownLink']



