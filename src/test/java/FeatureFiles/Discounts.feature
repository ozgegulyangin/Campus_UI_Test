Feature: Discounts under Setup Parameters

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | discounts  |

  @Smoke
  Scenario Outline: Adding Discounts

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | descriptionInDiscounts     | <descriptionInDiscounts>     |
      | integrationCodeInDiscounts | <integrationCodeInDiscounts> |

    And User sending the keys in Dialog Content
      | priorityInDiscounts | <priorityInDiscounts> |

    And Click on the element in Dialog
      | toggleBar |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    Examples:
      | descriptionInDiscounts | integrationCodeInDiscounts | priorityInDiscounts |
      | User user1234          | 1212                       | 3434                |

  Scenario Outline: Adding Already Exist Discounts

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | descriptionInDiscounts     | <descriptionInDiscounts>     |
      | integrationCodeInDiscounts | <integrationCodeInDiscounts> |

    And User sending the keys in Dialog Content
      | priorityInDiscounts | <priorityInDiscounts> |

    And Click on the element in Dialog
      | toggleBar |

    And Click on the element in Dialog
      | saveButton |

    Then Already Exist message should be displayed

    Examples:
      | descriptionInDiscounts | integrationCodeInDiscounts | priorityInDiscounts |
      | User user1234          | 1212                       | 3434                |

  @Smoke
  Scenario Outline:Editing Discount

    And User edit item on Dialog Content in Discounts

      | <descriptionInDiscounts> |
      | <newName>                |

    Then Success message should be displayed

    Examples:
      | descriptionInDiscounts | newName            |
      | User user1234          | Kullanici user1234 |

  @Smoke
  Scenario Outline:Deleting Discounts

    And User delete item from Dialog Content in Discounts
      | <descriptionInDiscounts> |

    Then Success message should be displayed

    Examples:
      | descriptionInDiscounts |
      | Kullanici user1234     |

  Scenario Outline: Accessing Discount

    And User sending the keys in Dialog Content
      | descriptionSearchInDiscounts | <descriptionSearchInDiscounts> |
    And Click on the element in Dialog
      | searchButton |
    Then No data message should be displayed

    Examples:
      | descriptionSearchInDiscounts |
      | Kullanici user1234           |



