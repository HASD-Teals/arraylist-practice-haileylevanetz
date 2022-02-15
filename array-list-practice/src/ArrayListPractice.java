import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {
    public static void main(String[] args) throws Exception {
        List <String> hahaFunny = new ArrayList <String>();
        fillList(hahaFunny);
        System.out.println(hahaFunny);
        doubleList(hahaFunny);
        System.out.println(hahaFunny);
        removeDuplicates(hahaFunny);
        System.out.println(hahaFunny);
        
    }  

    public static void example(List <String> myList){
        System.out.println(myList);
        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");
        System.out.println(myList);
        myList.add(2, "Cat");
        System.out.println(myList);
        myList.set(2, "Crab");
        myList.add("Dog");
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
        double numVowel=0;
        for(int i =0; i<hahaFunny.size(); i++){
           String word= hahaFunny.get(i);
           int k= word.length();
           for(int j =0; j<k; j++){
               String temp= word.toLowerCase();
               if(temp.charAt(j) == 'a' || temp.charAt(j) == 'e' || temp.charAt(j) =='i' || temp.charAt(j) == 'o' || temp.charAt(j) == 'u'){
                   numVowel++;
               }
           }
        }
        double average = (numVowel/(hahaFunny.size()));
        System.out.println("The average amount of vowels per word is "+ average );
    }
    public static void removeDuplicates(List <String> hahaFunny){
        for(int i=0; i<hahaFunny.size(); i++){
            for(int j=i+1; j<hahaFunny.size(); j++){
                if(hahaFunny.get(i).equals(hahaFunny.get(j))){
                    hahaFunny.remove(i);
                }
            }
        }
    }
    public static void doubleList(List <String> hahaFunny){
        for(int i=0; i<hahaFunny.size(); i++){
            String temp= hahaFunny.get(i);
            hahaFunny.add(i,temp);
        }
    }
}
