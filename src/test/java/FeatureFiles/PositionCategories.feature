Feature: Position Categories under Human Resources

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | humanResources |
      | setupHR        |
      | positionCat    |

  Scenario Outline: Adding Position Categories

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <name> |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed
    Examples:
      | name          |
      | User user1234 |

  Scenario Outline: Adding Already Exist Position Categories

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <name> |

    And Click on the element in Dialog
      | saveButton |
    Then Already Exist message should be displayed

    Examples:
      | name          |
      | User user1234 |

  Scenario Outline: Editing Position Categories

    And User edit item on Dialog Content
      | <name>     |
      | <editName> |

    Then Success message should be displayed
    Examples:
      | name          | editName           |
      | User user1234 | Kullanici user1234 |


  Scenario Outline: Deleting Position Categories

    And User delete item from Dialog Content
      | <name> |
    Then Success message should be displayed
    Examples:
      | name               |
      | Kullanici user1234 |

  Scenario Outline: Accessing Deleted Position Categories
    And User sending the keys in Dialog Content
      | searchInput | <name> |

    And Click on the element in Dialog
      | searchButton |

    Then No data message should be displayed
    Examples:
      | name               |
      | Kullanici user1234 |