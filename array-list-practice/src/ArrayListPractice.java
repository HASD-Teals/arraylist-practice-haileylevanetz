import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {
    public static void main(String[] args) throws Exception {
        //example();
        List <String> hahaFunny = new ArrayList <String>();
        fillList(hahaFunny);
        System.out.println(hahaFunny);
        removeEvenLength(hahaFunny);
        System.out.println(hahaFunny);
    }  

    public static void example(){
        List <String> myList = new ArrayList <String>();
        System.out.println(myList);
        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");
        System.out.println(myList);
        myList.add(2, "Cat");
        System.out.println(myList);
        myList.set(2, "Crab");
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        int lengthAnimalName=(myList.get(1)).toString().length();
        System.out.println(lengthAnimalName);
    }
    public static void fillList (List <String> hahaFunny){
        hahaFunny.add("I");
        hahaFunny.add("just");
        hahaFunny.add("got");
        hahaFunny.add("kicked");
        hahaFunny.add("out");
        hahaFunny.add("of");
        hahaFunny.add("a");
        hahaFunny.add("secret");
        hahaFunny.add("cooking");
        hahaFunny.add("society.");
        hahaFunny.add("I");
        hahaFunny.add("spilled");
        hahaFunny.add("the");
        hahaFunny.add("beans.");
    }
    public static void removeEvenLength(List <String> hahaFunny){
        for(int i=0; i<hahaFunny.size(); i++){
            if(hahaFunny.get(i).length() %2 ==0){
                hahaFunny.remove(i);
            }
        }
    }
    public static void averageVowels(List <String> hahaFunny){
        int numVowel=0;
        for(int i =0; i<hahaFunny.size(); i++){
           int k= hahaFunny.get(i).length();
           String word= hahaFunny.get(i);
           for(int j =0; j<k; j++){
               if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) =='i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                   numVowel++;
               }
           }
        }
    }
}
