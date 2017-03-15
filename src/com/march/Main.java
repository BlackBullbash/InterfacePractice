package com.march;

import com.march.randomObj.RandomObject;

public class Main {

    private IPrintable[] printables;

    private IPrintable param;

    public static void main(String[] args) {
	    Main App = new Main();
        App.runApp();
    }

    private void runApp() {
        printables = new IPrintable[4];
        printables[0] = new Car(100, "Red", "Volvo", 45, "Sedan");
        printables[1] = new Car(300, "white", "Renault", 78, "Coupe");
        printables[2] = new Notebook(500, "Black", "Acer", 17.0, "China");
        printables[3] = new RandomObject(1200, "Red", "dff", 4536645, 34);
        for (IPrintable i: printables) {
            i.printInfo();
        }
        param = new RandomObject(120, "Hey", "yyy", 456, -12);

        Car volvo = new Car(20, "red", "df", 45, "6erfw");
       // volvo.printInfo();
        //System.out.println(volvo.getColor());

        for (IPrintable i: printables) {
            System.out.println(i.getClass());
        }

      // System.out.println(param);
    }
}
