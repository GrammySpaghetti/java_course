import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava{
    public ArrayList<Integer> greaterThan10(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> output = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                output.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(output);
        return output;

    }

    public ArrayList<String> nameShuffle(){
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        ArrayList<String> output = new ArrayList<String>();
        Collections.shuffle(names);
        for(String val : names){
            System.out.println(val);
            if(val.length() > 5){
                output.add(val);
            }
        }
        System.out.println(names);
        System.out.println(output);
        return output;
    }

    public void alphabetArray(){
        ArrayList<String> alph = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        Collections.shuffle(alph);
        System.out.println(alph.get(alph.size()-1));
        String first = alph.get(0);
        if(first == "a" || first ==  "e" || first ==  "i" || first == "o" || first == "u"){
            System.out.println("this character is a vowel");
        }
        else{
            System.out.println(alph.get(0));
        }

    }

    public ArrayList<Integer> randomArray(){
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list.add(r.nextInt(100 + 1 - 55) + 55);
        }
        System.out.println(list);
        return list;
    }

    public void randomSorted(){
        ArrayList<Integer> list = this.randomArray();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
    
    public String randomString(){
        ArrayList<String> alph = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        String word = new String();
        for(int i = 0; i < 5; i++){
            Collections.shuffle(alph);
            // System.out.println(alph.get(0));
            word = word.concat(alph.get(0));
        }
        System.out.println(word);
        return word;
    }
    public void randomList(){
        ArrayList<String> randomWords = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            randomWords.add(this.randomString());
        }
        System.out.println(randomWords);
    }
}