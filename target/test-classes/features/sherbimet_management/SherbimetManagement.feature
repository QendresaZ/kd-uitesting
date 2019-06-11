Feature: Service Management

  Scenario: Add a new Service
    Given the user is on the add service page
    When the user creates a new service with name "Vizite kontrolluese" and price "10.0" and description about service "Pershkrim test"
    Then They should see the list of services page

#  Scenario: Delete a service
#    Given the user is on the service list page
#    When the user deletes service with  102258796 in the table
#    Then They should see the list without patient with personal number 102258796

