import java.util.HashMap;
import java.util.Set;

public class HashMaps{
    public void trackList(){
        HashMap<String, String> setList = new HashMap<String, String>();
        setList.put("Song 1", "this is the song that never ends");
        setList.put("Song 2", "nah nah nah i don't know the word");
        setList.put("Song 3", "singing in the bathtub");
        setList.put("Song 4", "the rain in spain stays mainly in the plains");
        Set<String> keys = setList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(setList.get(key));
        }
    }
}