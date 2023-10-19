/*
* File: MainConsole.java
* Author: Kovács Attila
* Copyright: 2023, Kovács Attila
* Group: Szoft II/2/N
* Date: 2023-10-19
* Github: https://github.com/Attila732/
* Licenc: GNU GPL
*/
package controller;

import model.Filereader;
import view.MainConsole;

public class MainController {
    public MainController() {
        new MainConsole().showData(new Filereader().loadData());

    }
}
