package by.bsuir.management.exception;

import by.bsuir.management.models.Employees;

public class EditEmployeesParametersExistException extends RuntimeException {

    Employees employees;

    public EditEmployeesParametersExistException(String message, Employees employees) {
        super(message);
        this.employees = employees;
    }
}
