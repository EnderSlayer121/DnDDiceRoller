Dice.class: Dice.java
	javac -g Dice.java
testDice: Dice.class
	Java Dice
clean: 
	rm *.class
