import java.util.*;
import java.lang.*;

//for testing only
import java.io.*;

public class Dice {
  int numOfDice, dice, modifier;

  public static void main(String[] args){
    Dice dice = new Dice();
    dice.tester();
  }// end main

  public Dice(){
    Scanner sc = new Scanner(System.in);
    boolean keepGoing = true;
    try {
      System.out.print("How Many Dice to Roll: ");
      setDiceNum(sc.nextLine());
      System.out.println();
      System.out.println("What type of dice?");
      System.out.println("20) d20");
      System.out.println("12) d12");
      System.out.println("10) d10");
      System.out.println("8) d8");
      System.out.println("4) d4");
      System.out.println("2) d2");
      System.out.print("or type any number for a custom dice roll...");
      setDiceType(sc.nextLine());
      System.out.println();
      System.out.print("Please enter modifier (0 for no modifier): ");
      setModifier(sc.nextLine());
      System.out.println();
    } catch (Exception e){
      System.out.println(e.getMessage());
    }// end try catch
  }// end construct
  

  public Dice(int numOfDice, int dice, int modifier){

  }// end alt construct


  public int roll(){

  }// end roll

  public void setDiceNum(int numOfDice){
    this.numOfDice = numOfDice;
  }// end setDiceNum

  public int getDiceNum(){
    return this.numOfDice;
  }// end getDiceNum

  public void setDiceType(int dice){

    
 
  //TESTING CLASS ONLY

}// end Dice

