@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook linkGiven user in the homePage
    Given  user in the homePage
    When  user click on facebook link
    Then  Facebook link is opened in new tab "https://www.facebook.com/nopCommerce"

  Scenario: user opens twitter link
    Given  user in the homePage
    When user opens twitter link
    Then Twitter link is opened in new tab "https://twitter.com/nopCommerce"

  Scenario: user opens rss link
    Given  user in the homePage
    When user opens rss link
    Then RSS link is opened in new tab"https://demo.nopcommerce.com/new-online-store-is-open"

  Scenario: user opens youtube link
    Given  user in the homePage
    When user opens youtube link
    Then Youtube link is opened in new tab "https://www.youtube.com/user/nopCommerce"



  Scenario: user opens facebook linkGiven user in the homePage and twitter
    Given  user in the homePage
    Then Facebook link is opened in new tab "https://www.facebook.com/nopCommerce" user back to home page and open twitter "https://twitter.com/nopCommerce"