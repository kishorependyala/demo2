package com.example.demo2.domain;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static final class EmployeeBuilder {
        private int id;
        private String firstName;
        private String lastName;

        EmployeeBuilder() {
        }

        public static EmployeeBuilder anEmployee() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.firstName = this.firstName;
            employee.lastName = this.lastName;
            employee.id = this.id;
            return employee;
        }
    }
}
