Feature: Scorecard

  @ignore
  Scenario Outline: Scorecard entry
    Given I am on the <givenHole>. hole
    And I hit the ball <givenHits> times
    When I use the Scorecard
    Then I see the Scorecard with last Entry hole: <expectedHole> and hit: <expectedHit>

    Examples:
      | givenHole | givenHits | expectedHole | expectedHit |
      | 1         | 0         | 1            | 0           |
      | 1         | 1         | 1            | 1           |
      | 2         | 0         | 2            | 0           |
