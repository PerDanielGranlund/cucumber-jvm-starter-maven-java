Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario: burn energy
    Given I have 1000 energy
    When I run 1 mile
    Then I should need to eat
