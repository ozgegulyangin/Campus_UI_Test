Feature: Positions under Human Resources


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | humanResources |
      | setupHR        |
      | positions      |

  Scenario Outline: Add Position

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <name>      |
      | shortName | <shortName> |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed
    Examples:
      | name          | shortName |
      | User user1234 | Uu1       |

  Scenario Outline: Add Already exist Position

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <name>      |
      | shortName | <shortName> |

    And Click on the element in Dialog
      | saveButton |
    Then Already Exist message should be displayed

    Examples:
      | name          | shortName |
      | User user1234 | Uu1       |

  Scenario Outline: Position Edit

    And User edit item on Dialog Content
      | <name>     |
      | <editName> |


    Then Success message should be displayed
    Examples:
      | name          | editName           |
      | User user1234 | Kullanici user1234 |

  Scenario Outline:  Delete position

    And User delete item from Dialog Content
      | <name> |
    Then Success message should be displayed

    Examples:
      | name               |
      | Kullanici user1234 |

  Scenario Outline: Accessing Deleted position

    And User sending the keys in Dialog Content
      | searchInput | <name> |
    And Click on the element in Dialog
      | searchButton |
    Then No data message should be displayed

    Examples:
      | name               |
      | Kullanici user1234 |


