package com.example.client;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import com.example.client.Employee;

public class Client extends JFrame
{
    public Client()
    {
        Employee row1 = new Employee(1, "John", 40.0, false);
        Employee row2 = new Employee(2, "Rambo", 70.0, false);
        Employee row3 = new Employee(3, "Zorro", 60.0, true);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(row1);
        employeeList.add(row2);
        employeeList.add(row3);

        EmployeeTableModel model = new EmployeeTableModel(employeeList);
        JTable table = new JTable(model);

        this.add(new JScrollPane(table));

        this.setTitle("Editable Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Client();
            }
        });
    }
}