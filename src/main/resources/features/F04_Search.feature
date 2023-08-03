Feature:
  Scenario Outline:  user could search using product name
    When user Enter "<product name>" on search field
    And user click on search button
    Then user should see search result "<product name>"
    Examples:
      |product name|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search for product using sku
    When user search with using  "<serial number>" on search field
    And user click on search button
    Then user should see search result of SKU "<serial number>"
    Examples:
      |serial number|
      |SCI_FAITH|
     # |APPLE_CAM|
      |SF_PRO_11|