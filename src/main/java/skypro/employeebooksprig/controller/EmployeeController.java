package skypro.employeebooksprig.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import skypro.employeebooksprig.model.Employee;
import skypro.employeebooksprig.record.EmployeeRequest;
import skypro.employeebooksprig.service.EmployeeService;

import java.util.Collection;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public Collection<Employee> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody EmployeeRequest employeeRequest) {
        return this.employeeService.addEmployee(employeeRequest);
    }

    @GetMapping("/employees/salary/sum")
    public int getSalarySum() {
        return this.employeeService.getSalarySum();
    }

    @GetMapping("/employees/salary/min")
    public Employee getSalaryMin() {
        return this.employeeService.getSalaryMin();
    }

    @GetMapping("/employees/salary/max")
    public Employee getSalaryMax() {
        return this.employeeService.getSalaryMax();
    }

    @GetMapping("employees/high-salary")
    Collection<Employee> getEmployeesHighSalary() {
        {
            return this.employeeService.getEmployeesHighSalary();
        }
    }

}
