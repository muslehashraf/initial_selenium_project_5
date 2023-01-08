package atuomation_notes;

public class _01_07_2023_SeleniumIntroduction {
    /*
            01/07/2023 - Selenium Introduction


        IDEA: An app that TechGlobal students can practice

        REQUIREMENTS - Client
        BRS
        PO, System Architects, BA, Tester, Developer


        System Architect: Tools


        DESIGN:
        UI/UX Designers - for Frontend Development


        Seller
        Products
        Account
        Addresses
        Payment methods
        Orders
        Wish list
        Reviews


        akinkaya@gmail.com

        Account    			Orders
        Acc_id 	   			Order_id     Acc_id 	Product


        SQL - Structured Query Language
        SELECT * FROM accounts WHERE email = "akinkaya@gmail.com";

        JOINS



        Backend Development


        Frontend Development
        HTML - CSS - JS



        TESTER:
        ACTUAL == EXPECTED ? "PASS" : "FAIL-Create a bug ticket";

        Bug Life Cycle
        Creating a ticket
        Assign it to developer
        Make sure dev fixed
        If not not open again
        If so close it!



        TEST CASE - Traditional:
        1. Description: Validate Upload File page
        2. Description: Add file and validate it is uploaded
        Steps:
            Go to https://techglobal-training.netlify.app/
            Select "Frontend Testing" from the header dropdown
            Select "File Upload" card
            Click on "Choose file" button
            Select a file from your local
            Click on "UPLOAD" button
            Validate the file is uploaded

        3. Description: Add file and validate the result text is blue
        4. Description: Do not add a file and click on UPLOAD
        5. Description: Validate that user cannot add multiple files



        Cucumber - BDD  - Gherkin Language
        Scenario: Add file and validate it is uploaded
            Given user is on "https://techglobal-training.netlify.app/"
            When user select "Frontend Testing" from the header dropdown
            And user select "File Upload" card
            And user click on "Choose file" button
            And select a file from your local
            And click on "UPLOAD" button
            Then Validate the file is uploaded
            And the text color is blue



        FRONTEND
        SMOKE: 5-10 test cases -> 10 minutes
        REGRESSION: 500 test cases -> 3-4 hours

        2 weeks -> 10   15
        1 month -> 20   30
        Regression-> 200


        BACKEND:
        REGRESSION: 300 -> 15 minutes
                    180 -> 5 minutes


        Java 8, Selenium 3.14

        Selenium 2
        Selenium 3
        Selenium 4



        Browsers
        Chrome  -> chromedriver
        Firefox -> geckodriver



        WebDriver methods
        - maximize() vs fullscreen() -> covers the screen
        - get() vs navigate().to() -> directs user to the given url
        - close() vs quit() -> closes the tab or the window
        - getTitle() vs getCurrentURL() -> gets the title or URL


        NAVIGATIONS
        navigate().to(url) -> directs user to the given url
        navigate().back() -> navigates user to previous page
        navigate().forward() -> navigates user to forward
        navigate().refresh() -> refresh the page




        SELENIUM ARCHITECTURE
        Browser:
        A browser is an application program that provides a way to look at and interact with all the information on the World Wide Web. This includes Web pages, videos and images.

        Selenium: Selenium automates browser. That's it.

        IDE: Integrated-Development Environment


        Selenium IDE: Selenese




        APPLICATION
        1. Web application
        2. Mobile application (AppStore or PlayStore) - Appium
        3. Hybrid


        ALTERNATIVES TO SELENIUM
        WebDriverIO, Cypress, PlayWright
     */
}
