package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Figures figures = new Figures();
        figures.buy(2000, 300);

        Figures figures2 = new Figures();
        figures2.buy(3.22, 4.55, 5.33);

        Figures figures3 = new Figures();
        figures3.countArea(5, 4);

        Figures figure4 = new Figures();
        figure4.countArea(3.5, 4.2, 5.5);

    }
}
