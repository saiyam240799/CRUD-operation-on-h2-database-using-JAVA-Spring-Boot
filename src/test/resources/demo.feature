Feature: Testing a REST API
Users should be able to submit GET and POST requests to a web service, represented by WireMock
    
  Scenario: client makes call to GET /details
    When the client calls /details
    Then the client receives status code of 200
    And the client receives server version 1.0