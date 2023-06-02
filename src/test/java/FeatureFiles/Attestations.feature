Feature:  Attestations Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | humanResources |
      | setupHR        |
      | attestations   |

  @Smoke
  Scenario Outline:Adding Attestations

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

  Scenario Outline:Adding Already Exist Attestations

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

  @Smoke
  Scenario Outline:Editing Attestations

    And User edit item on Dialog Content
      | <searchInput> |
      | <name>        |

    Then Success message should be displayed

    Examples:
      | searchInput   | name         |
      | User user1234 | Kullanici user1234 |

  @Smoke
  Scenario Outline:Deletion of Attestations

    And User delete item from Dialog Content
      | <searchInput> |

    Then Success message should be displayed

    Examples:
      | searchInput  |
      | Kullanici user1234 |


  Scenario Outline:Accessing Deleted Attestations

    And User sending the keys in Dialog Content
      | searchInput | <searchInput> |

    And Click on the element in Dialog
      | searchButton |

    Then No data message should be displayed

    Examples:
      | searchInput  |
      | Kullanici user1234 |


