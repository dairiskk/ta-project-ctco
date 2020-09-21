@Vacancies
Feature: Vacancies

  @TA_SKILL_COUNT
  Scenario: Test Automation Engineer skill count
    Given Navigate to "https://www.ctco.lv/en"
    Then Open "Careers" menu
    Then Click "Vacancies" from the list
    And Open vacancy "Test Automation Engineer"
    Then Verify that paragraph under "Professional skills and qualification:" contains exactly "5" skills

