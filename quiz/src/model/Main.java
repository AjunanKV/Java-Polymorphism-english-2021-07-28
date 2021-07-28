package model;

class printer {
    public void printing()
    {
        System.out.println("Printing");
    }

    public void printing(String InkColor)
    {
        if(InkColor=="BLACK || Black || black ")
        {
            System.out.println("Printed black using black and white printer");
        }
        else
        {
            System.out.println("Printed with "+ InkColor+" color using colored printer.");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        printer obj = new printer();
        obj.printing();
        obj.printing("BLACK");
        obj.printing("Colored"); //ink-black
    }
}
