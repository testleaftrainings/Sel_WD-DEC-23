Todays Agenda!!
================
   09:30 - 10:20 - Window Handling
   10:20 - 10:35 - Classroom
   10:35 - 10:45 - Break
   10:45 - 11:30 - Frame
   11:30 - 11:45 - Classroom
   11:45 - 12:30 - this keyword, Constructor(Optional)
   After 12:30   - Quiz,Recap

















Window Handling:
================

What is a Window Handle?
A Window Handle is a unique identifier, a string, that Selenium WebDriver assigns to each open window or tab. It acts much like a unique address for a house, allowing WebDriver to navigate to and control a specific window.

Why Window Handles are Important
Web applications can open multiple windows or tabs.
To perform actions on elements within these windows, Selenium needs to know which window to interact with. - - Window handles enable this by providing a unique ID for each window.

How to Handle Windows
To handle windows, WebDriver provides two methods:
getWindowHandle(): Retrieves the ID of the current window.
getWindowHandles(): Retrieves a set of all open windows' IDs.
To switch to a different window, the syntax is driver.switchTo().window(windowHandle); where windowHandle is the unique identifier of the target window.

Handling Multiple Windows
Retrieve the set of window handles using driver.getWindowHandles().
Convert the set to a list to handle windows in a sequential manner.
Use the driver.switchTo().window(windowHandle) to switch control to the desired window.
After operations are completed, windows can be closed using driver.close(), and control can be switched back to the main window.

NoSuchWindowException:
======================
NoSuchWindowException is an exception which signifies that the action you are trying to perform cannot be completed because the window or tab you are referencing no longer exists or is inaccessible. This can happen for various reasons:
Window or Tab Closed: If the script attempts to interact with a window or tab that has been closed.
Switched Context: If the script has switched to a different window or frame, and attempts to interact with the original window without switching back. To handle this exception, you can:
Verify that the window or tab you are trying to interact with is open and accessible.
Ensure that your script correctly switches to the window or tab before interacting with it.


Frame
=====

What is a Frame?
A frame is a part of a web page or browser window which displays content independent of its container, with its own scroll and navigation.
It's essentially a document within a document, commonly used to embed a separate document within a web page.

Why Handle Frames?
Frames must be handled because Selenium WebDriver operates on a single document context.
If a web page contains frames, WebDriver cannot automatically access the content of these frames.
To interact with elements within a frame, WebDriver must switch to it explicitly.

How to Identify a Frame?
Frames can be identified by right-clicking on the element and selecting "View Frame Source" for direct URLs or by searching for the frame or iframe tags within the HTML DOM.
Structure of Frame
When you inspect a web page, you'll notice that the frame or iframe tags define the frame structure. Each frame will have its own HTML document, which can be navigated and manipulated independently of the main page.

How to Handle Frames?
To handle frames, use the switchTo() method provided by WebDriver.

By index: driver.switchTo().frame(int index)
By Name or ID: driver.switchTo().frame(String nameOrId)
By Reference: driver.switchTo().frame(WebElement frameElement)

Once you're done with the frame and need to switch back to the main content, use:
driver.switchTo().defaultContent()

And to switch to the immediate parent frame, use:
driver.switchTo().parentFrame()

How to Handle Nested Frames
Nested frames are handled by switching into each frame sequentially. After interacting with the deepest frame, you need to switch back to the parent frame or main document to continue the automation tasks.
For handling nested frames, you would use a sequence of switchTo().frame() calls to drill down into the nested structure, and use switchTo().parentFrame() or switchTo().defaultContent() to navigate back up.

Exception:
==========

NoSuchFrameException in Selenium is thrown when the WebDriver attempts to switch to a non-existent frame. - This can happen if the frame has been removed or if it never existed in the DOM at the point of the attempt. - It indicates that the specified frame is not present in the current page context, and the automation script needs to ensure that the frame name, ID, or reference being used to switch to is correct and available.
This exception is a signal to check the frame's existence, its correct identification, or if the page has fully loaded before attempting to switch frames.





Window Address:
===============

F315147B32BB0B9393037E9A40F5D202
56C226C3DEFF1CAA04FBD4B3A114E9C2
54D15A37B009DD95582721FB2495BE71