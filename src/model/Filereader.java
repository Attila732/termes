/*
* File: MainConsole.java
* Author: Kovács Attila
* Copyright: 2023, Kovács Attila
* Group: Szoft II/2/N
* Date: 2023-10-19
* Github: https://github.com/Attila732/
* Licenc: GNU GPL
*/
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {

    final private String FILENAME = "termes.txt";
    ArrayList<Employee> emplist = new ArrayList<>();

    public ArrayList<Employee> loadData() {
        try {
            tryLoadData();
        } catch (FileNotFoundException e) {
            System.err.println("A file nem található!");
            System.err.println(e.getMessage());
        }
        return emplist;
    }

    public ArrayList<Employee> tryLoadData() throws FileNotFoundException {

        File file = new File(FILENAME);
        Scanner sc = new Scanner(file, "utf-8");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] list = line.split(":");
            Employee emp = new Employee();
            emp.setId(list[0]);
            emp.setName(list[1]);
            emp.setDulo(list[2]);
            emp.setTermes(list[3]);
            emp.setBetakaritas(Integer.parseInt(list[4]));
            this.emplist.add(emp);
        }
        sc.close();
        return emplist;
    }
}
