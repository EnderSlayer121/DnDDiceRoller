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

  //TESTING CLASS ONLY

}// end Dice

