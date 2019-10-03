/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */



import java.util.Scanner;
/*******************************************************************************
 * Třída {@code TestovacíTřída} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class TestovacíTřída
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Slovo sl1 = new Slovo("kiss");
        System.out.println(sl1.dejPlur("kiss"));
        System.out.println("Expected: kisses");
        System.out.println(sl1.dejPlur("phase"));
        System.out.println("Expected: phases");
        System.out.println(sl1.dejPlur("dish"));
        System.out.println("Expected: dishes");
        System.out.println(sl1.dejPlur("massage"));
        System.out.println("Expected: massages");
        System.out.println(sl1.dejPlur("witch"));
        System.out.println("Expected: witches");
        System.out.println(sl1.dejPlur("judge"));
        System.out.println("Expected: judges");
        System.out.println(sl1.dejPlur("lap"));
        System.out.println("Expected: laps");
        System.out.println(sl1.dejPlur("cat"));
        System.out.println("Expected: cats");
        System.out.println(sl1.dejPlur("clock"));
        System.out.println("Expected: clocks");
        System.out.println(sl1.dejPlur("cuff"));
        System.out.println("Expected: cuffs");
        System.out.println(sl1.dejPlur("death"));
        System.out.println("Expected: deaths");
        System.out.println(sl1.dejPlur("boy"));
        System.out.println("Expected: boys");
        System.out.println(sl1.dejPlur("girl"));
        System.out.println("Expected: girls");
        System.out.println(sl1.dejPlur("chair"));
        System.out.println("Expected: chairs");
        System.out.println(sl1.dejPlur("day"));
        System.out.println("Expected: days");
        System.out.println(sl1.dejPlur("monkey"));
        System.out.println("Expected: monkeys");
        System.out.println(sl1.dejPlur("bath"));
        System.out.println("Expected: baths");
        System.out.println(sl1.dejPlur("cherry"));
        System.out.println("Expected: cherries");
        System.out.println(sl1.dejPlur("knife"));
        System.out.println("Expected: knives");
        System.out.println(sl1.dejPlur("radio"));
        System.out.println("Expected: radios");
        System.out.println("zadej něco");
        Scanner myObj = new Scanner(System.in);
        
    
    }
}
