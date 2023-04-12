package com.bridgelabz.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileIOImpl implements PayRollService {
    static String filePath = "D:\\Prathamesh Java\\Day27_Employee_Pay_Roll_Service_IO\\src\\main\\java\\com\\bridgelabz\\io\\PayRoll.txt";
   @Override
    public void writeData(List<EmployeePayRoll> list) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        list.stream().forEach(employee -> {
            String empString = employee.toString().concat("\n");
            stringBuffer.append(empString);
        });
        // var-args -> variable arguments
        Files.write(Path.of(filePath),stringBuffer.toString().getBytes());
    }
    @Override
    public void readData() throws IOException {
        Files.lines(Path.of(filePath)).forEach(empData -> {
            System.out.println(empData);
        });
    }

    @Override
    public long countEntries() throws IOException {
        return Files.lines(Path.of(filePath)).count();
    }
}
