package game;

import java.util.Random;

public class words {
    private String[] randomwords = {"Cat", "Dog", "Snake", "Basketball", "Computer", "Food", "Keyboard", "Cellphone", "Headset", "Car", "Bus", "Roblox", "Fruit" };

    private String selectedWord;
    private Random random = new Random();
    private char[] letters;
        
     public words() {
            selectedWord = randomwords[random.nextInt(randomwords.length)];
            letters = new char[selectedWord.length()];
        }
        public String toString(){
            StringBuilder text = new StringBuilder();
            for(char letter:letters){
            if(letter == '\u0000'){
                text.append('-');
            }
            else{
                text.append(letter);
            }
            text.append(' ');
            }
            return text.toString();
        }
}
