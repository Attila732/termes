/*
* File: MainConsole.java
* Author: Kovács Attila
* Copyright: 2023, Kovács Attila
* Group: Szoft II/2/N
* Date: 2023-10-19
* Github: https://github.com/Attila732/
* Licenc: GNU GPL
*/
package view;

import java.util.ArrayList;

import model.Employee;

public class MainConsole {
    public void showData(ArrayList<Employee> emplist) {
        for (int i = 0; i < emplist.size(); i++) {
            String line = (emplist.get(i).getid() + ", " + emplist.get(i).getName() + ", "
                    + emplist.get(i).getDulo() + ", " + emplist.get(i).getTermes() + ", "
                    + emplist.get(i).getBetakaritas());
            System.out.println(line);
        }
    }
}
