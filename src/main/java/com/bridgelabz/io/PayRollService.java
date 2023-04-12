package com.bridgelabz.io;

import java.io.IOException;
import java.util.List;

public interface PayRollService {
    void writeData(List<EmployeePayRoll> list) throws IOException;

    void readData() throws IOException;

    long countEntries() throws IOException;

}
