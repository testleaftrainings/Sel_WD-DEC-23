Selenium interaction:
=====================

How Communication Happens?
Selenium automations are performed using the WebDriver, which is an interface that sends commands to a browser and retrieves results.
The process is streamlined through WebDriver's ability to communicate across various browsers using the same script in a chosen programming language.

Why Selenium Communicates with Webpage Through HTML Document-DOM?
Understanding the Document Object Model (DOM), which is the logical structure of HTML documents, allows Selenium to interact with various elements on a webpage.
By communicating through the DOM, Selenium can simulate user actions like clicking and typing in a way that mirrors real user behavior.

What is DOM?
The DOM is a representation of a browser’s current web document.
It's a hierarchical tree of objects that enables scripts to dynamically access and update the content, structure, and style of documents.
Understanding the DOM is crucial for locating elements to interact with during testing.
Understanding HTML Structure and Tags

The HTML structure is composed of various tags like <html>, <a>, <button>, <div>, <iframe>, <img>, <input>, <option>, <select>, <span>, and <table>.
Each tag has a specific purpose, such as defining hyperlinks, sections in a document, or input fields. Knowing these tags helps in identifying elements for Selenium to interact with.
To Locate Element in DOM

Different locators such as id, name, className, linkText, partialLinkText, xpath are used to find elements in the DOM.
Each locator has a specific use case, for example, id is used when the element has a unique identifier, while xpath are used when elements are dynamic or duplicate name, class, or ID.

How to Use Locators?
Locators are used with the Syntax:
`driver.findElement(By.locator("value"))` 
For instance, By.id("login") would locate an element with the ID of 'login'.

When to/Not to Use Locators

Guidelines are provided on when to use specific locators.
For example, id should be used when it's available,
name if id does not exist,
linkText for links,
className when the class attribute is unique,
tagName for collections,
xpath if no other locator works.


Dropdown:
=========

What is a Dropdown?
A dropdown in web development is a user interface element that allows users to select one option from a list of options.
In HTML, this is structured with a <select> tag as the parent element and <option> elements as children.
Selenium must be able to interact with these elements to test web applications thoroughly.

How to Handle Dropdown?
Selenium provides a Select class specifically for interacting with dropdown elements.
The Select class offers methods to select options within a dropdown easily.

When to Use?
The Select class should be used when an element in the DOM is identified with a <select> tag, indicating a dropdown menu.
<select> Structure in DOM

The <select> tag in the DOM represents the dropdown element,
and the nested <option> tags represent the individual choices available to the user.

How to Use Select Class?
To use the Select class, a Selenium script must first identify the <select> element in the DOM.
Then, an instance of the Select class is created by passing the located WebElement as an argument to its constructor.
This allows the script to manipulate the dropdown as needed.
Helper Methods

The Select class provides various methods to select options from a dropdown, such as:
selectByIndex(index): Selects an option by its index in the dropdown, starting with 0.
selectByVisibleText("text"): Selects an option by the text visible to the user in the dropdown.
selectByValue("value"): Selects an option by the value of its value attribute.



How to open DOM(Document Object Model)
======================================
      f12
      Customize icon --> more tools ---> developer tools
      ctrl + shift + i
      right click on the web page ---> click on inspect.

Possible ways to locate WebElement in the DOM
=============================================
      1.right on the WebElement--> Inspect 
      2. enable the spyTool --> click on the WebElement


Locators
========
   Basic
   -----
      1. id ---> Most preffered locator
            ---> If id attribute has a number . it is not recommanded.
      2. name ---> Second preffered loctor
              ---> if there is any duplicate in the name atturibute, then it is not recommanded.
      3. className ---> Id and name is not available then we can use this.
                   ---> If class attribute value has white space and there is duplicate . it is not recommanded.
      4. linkText ---> If the tagName is <a> and there is a text. Then we can use.
      5. partialLinkText ---> tagName is <a> and there is long text we can use this.
      6. tagName ---> by using tagName to locate the elements.

   Advanced
   --------
         1. xpath
         2. cssSelector.