# Autor: Danilo osorio higuita
  @stories
  Feature: Academy choucair
    As A user, I want to learn how to automate in screamplay at the choucair Academy wiht the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandom wants to learn automation at academy Choucair
    |strUser   |strPassword  |
    |1036662427|Choucair2021*|
    When he search for the course  on the choucair academy platform
    |strCourse                          |
    |Recursos Automatizacion Bancolombia|
    Then he finds the course called resourses
    |strCourse                          |
    |Recursos Automatizacion Bancolombia|