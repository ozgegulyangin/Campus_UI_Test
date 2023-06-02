Feature: Bank Accounts Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the element in LeftNav
      | setup        |
      | parameters   |
      | bankAccounts |

  Scenario Outline: Adding Bank Account

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <name> |
      | iban      | <iban> |

    And Click on the element in Dialog
      | currency   |
      | usd        |
      | saveButton |

    Then Success message should be displayed

    Examples:
      | name          | iban             |
      | User user1234 | User121234345656 |

  Scenario Outline: Adding Already Exist Bank Account

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <name> |
      | iban      | <iban> |

    And Click on the element in Dialog
      | currency   |
      | usd        |
      | saveButton |

    Then Already Exist message should be displayed

    Examples:
      | name          | iban             |
      | User user1234 | User121234345656 |

  Scenario Outline: Editing Bank Account

    And User edit item on Dialog Content
      | <searchInput> |
      | <newName>     |

    Then Success message should be displayed

    Examples:
      | searchInput   | newName            |
      | User user1234 | Kullanici user1234 |

  Scenario Outline: Deleting Bank Account

    And User delete item from Dialog Content
      | <searchInput> |

    Then Success message should be displayed

    Examples:
      | searchInput        |
      | Kullanici user1234 |

  Scenario Outline: Accessing Bank Account Types

    And User sending the keys in Dialog Content
      | searchInput | <searchInput> |
    And Click on the element in Dialog
      | searchButton |
    Then No data message should be displayed

    Examples:
      | searchInput        |
      | Kullanici user1234 |