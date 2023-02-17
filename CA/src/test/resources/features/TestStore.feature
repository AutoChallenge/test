Feature: Store Home Page
  #(admin|user)
  Scenario: Logo Presence on Store Home Page
    Given I launch Chrome Browser
    When I navigate Cart Home Page
    Then I verify that the logo present on Page
    And Close browser

#  Scenario: Login home page with user Details
#    Given User navigates to landing page
#    When User login into application with "Jhon" and password "12"
#    Then Home Page is Loaded with user id 45644
#    And Login User display is "true"

#  Scenario: SingUp the application with DataTable
#    Given User navigates to landing page
#    When User login into application with "Jhon" and password "12"
#    And User Register with following details
#      | Robert | William | Rober.william@gmail.com | 8989898889 |
#    Then Home Page is Loaded with user id 45644
#    And Login User display is "true"

#  Scenario Outline: SignUp the application with data Parameterization
#    Given User navigates to landing page
#    When User Signup into application with "<UserName>" and password "<Password>"
#    And Login User display is "true"
#
#    Examples:
#      | UserName | Password |
#      | Abraham  | rewrwe   |
#      | Jon      | Kenlly   |

