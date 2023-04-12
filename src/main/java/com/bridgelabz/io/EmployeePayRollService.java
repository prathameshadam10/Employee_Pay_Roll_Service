package com.bridgelabz.io;

import java.io.IOException;
import java.util.List;

public class EmployeePayRollService {
    List<EmployeePayRoll> list;

    public EmployeePayRollService(List<EmployeePayRoll> list) {
        this.list = list;
    }

    public PayRollService getPayrollService(IOService ioType) {
        PayRollService payrollService;
        if (IOService.FILE_IO.equals(ioType)) {
            payrollService = new FileIOImpl();
        } else if (IOService.DATABASE_IO.equals(ioType)) {
            payrollService = new DatabaseIOImpl();
        } else if (IOService.CONSOLE_IO.equals(ioType)) {
            payrollService = new ConsoleIOImpl();
        } else {
            payrollService = new CloudIOImpl();
        }
        return payrollService;
    }


    public void writeData(IOService ioType) {
        // Abstraction
        PayRollService payrollService = getPayrollService(ioType);
        try {
            payrollService.writeData(list);
        } catch (IOException e) {
            System.out.println("catch block");
        }
    }

    public void readData(IOService ioType) {
        PayRollService payRollService = getPayrollService(ioType);
        try {
            payRollService.readData();
        } catch (IOException e){
            System.out.println("catch block");
        }
    }

    public Long countEntries(IOService ioType) {
        PayRollService payrollService = getPayrollService(ioType);
        try {
            return payrollService.countEntries();
        } catch (IOException e) {
            System.out.println("catch block");
        }
        return null;

    }
}
