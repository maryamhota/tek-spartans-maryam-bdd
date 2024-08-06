Feature: Security tests scenarios

  #Story #1
  Scenario: Validate sign in functionality with valid credential
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "sawelai@yahoo.com" and "Password@123" and click login
    #When user enter username and password and click on login
    Then user should be able to see account link

    #Story #2 applying Scenario outline here
    Scenario Outline: Validate sign in with invalid user valid password
      When user click on sign in link
      Then validate user is in sign in page
      When user enter <username> and <password> and click login
      Then user should see error "wrong username or password"
      Examples:
        |username          | password     |
        |invalid@gmail.com |Password@123  |
        |sawelai@yahoo.com |Password@123  |
        |sawelai@yahoo.com |Password@12345|


      #Story #3
  #Scenario: Validate sign in with invalid user valid password
    # When user click on sign in link
    #Then validate user is in sign in page
    # When user enter "sawelai@yahoo.com" and "Password@12345" and click login
    #Then user should see error "wrong username or password"


