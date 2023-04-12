package com.bridgelabz.io;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayRollTest {
    @Test
    public void givenThreeEmployeesWhenWrittenToFileAndReadShouldReturnCount(){
        EmployeePayRoll emp1 = new EmployeePayRoll(1,"Amit", 250000);
        EmployeePayRoll emp2 = new EmployeePayRoll(2,"Neha", 260000);
        EmployeePayRoll emp3 = new EmployeePayRoll(3,"Ankita", 270000);

        List<EmployeePayRoll> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        EmployeePayRollService employeePayRollService = new EmployeePayRollService(list);
        employeePayRollService.writeData(IOService.FILE_IO);
        employeePayRollService.readData(IOService.FILE_IO);
        long count = employeePayRollService.countEntries(IOService.FILE_IO);
        Assertions.assertEquals(3,count);

    }
    @Test
    public void givenThreeEmployeesWhenWrittenToDatabaseAndReadShouldReturnCount(){
        EmployeePayRoll emp1 = new EmployeePayRoll(1,"Amit", 250000);
        EmployeePayRoll emp2 = new EmployeePayRoll(2,"Neha", 260000);
        EmployeePayRoll emp3 = new EmployeePayRoll(3,"Ankita", 270000);

        List<EmployeePayRoll> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        EmployeePayRollService employeePayrollService = new EmployeePayRollService(list);
        employeePayrollService.writeData(IOService.DATABASE_IO);

    }
    @Test
    public void givenThreeEmployeesWhenWrittenToConsoleAndReadShouldReturnCount(){
        EmployeePayRoll emp1 = new EmployeePayRoll(1,"Amit", 250000);
        EmployeePayRoll emp2 = new EmployeePayRoll(2,"Neha", 260000);
        EmployeePayRoll emp3 = new EmployeePayRoll(3,"Ankita", 270000);

        List<EmployeePayRoll> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        EmployeePayRollService employeePayrollService = new EmployeePayRollService(list);
        employeePayrollService.writeData(IOService.CONSOLE_IO);

    }
    @Test
    public void givenThreeEmployeesWhenWrittenToCloudAndReadShouldReturnCount(){
        EmployeePayRoll emp1 = new EmployeePayRoll(1,"Amit", 250000);
        EmployeePayRoll emp2 = new EmployeePayRoll(2,"Neha", 260000);
        EmployeePayRoll emp3 = new EmployeePayRoll(3,"Ankita", 270000);

        List<EmployeePayRoll> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        EmployeePayRollService employeePayrollService = new EmployeePayRollService(list);
        employeePayrollService.writeData(IOService.CLOUD_IO);

    }

}
