package by.bsuir.management.exception;

import by.bsuir.management.models.Employee;

public class EditEmployeesParametersExistException extends RuntimeException {

    Employee employee;

    public EditEmployeesParametersExistException(String message, Employee employee) {
        super(message);
        this.employee = employee;
    }
}
