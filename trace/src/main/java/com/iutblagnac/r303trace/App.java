package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Main method
     * 
     * @param args phrase a eventuellement afficher
     */
    public static void main( String[] args )
    {
        System.out.println(hello());
    }
    /**
     * Methode qui retourne une phrase par defaut
     * @return
     */
    public static String hello() {
        return  "Hello My beautiful WORLD!" ;
    }

    /**
     * Methode qui retourne une phrase passée parametre
     * @param param phrase a retourner
     * @return phrase passée en parametre
     */
    public static String hello(String param) {
        return  param ;
    }
    
    
}
