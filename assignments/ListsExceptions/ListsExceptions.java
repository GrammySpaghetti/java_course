import java.util.ArrayList;

public class ListsExceptions{
    public static void main(String[] args){

    }
    public void testCase(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch(ClassCastException e){
                System.out.println("oops something happened");
            }
        }
    }

    // public void tryMethod(){
    //     try{
    //         this.testCase();
    //         System.out.println("the casting is complete");
    //     }
    //     catch (ListsExceptions e){
    //         System.out.println("oops something went wrong");
    //     }
    // }
}