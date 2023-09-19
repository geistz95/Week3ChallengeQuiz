package org.example;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String str = "Hello There, There are 15 vowels in this sentence\n";
        System.out.println(str+"Question 16 \n"+VowelsCounter(str));

        String[] strArray={"Hello","There","This","Is","Going","To","Be","Swapped"};
        System.out.println(Arrays.toString(swapString(strArray)));

        String farmerStr="The Farmer went to the store to get 1 dollar's worth of fertilizer";
        System.out.println(replaceCharacters(farmerStr));

        String wuTangStr="The small brown dog hopped the fence";
        System.out.println(replaceWuTangTwoThreeDivisible(wuTangStr));

        int fibSeq=10;
        System.out.println(createStringOfFibonnaciUpToMax(fibSeq));

    }

    //Question 16
    public static int VowelsCounter(String str){
        int counter=0;
        str=str.toLowerCase();
        char[] sentenceArray=str.toCharArray();
        for(int i = 0 ; i<sentenceArray.length;i++){
            if (sentenceArray[i] == 'a' || sentenceArray[i] == 'e' || sentenceArray[i]=='i' || sentenceArray[i]=='o' || sentenceArray[i]=='u') {
                counter++;
            }
        }
        return counter;
    }

    //Question 17
    public static String[] swapString(String[] stringArray){
        String swap=stringArray[0];
        stringArray[0]=stringArray[stringArray.length-1];
        stringArray[stringArray.length-1]=swap;
        return stringArray;
    }


    /**
     * Given the following legend
     *
     * f >> 7
     * s >> $
     * 1 >> !
     * a >> @
     *
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     *
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */



    //Question 18
    public static String replaceCharacters(String str) {
        HashMap<Character, Character> legend=new HashMap<>();
        legend.put('f','7');
        legend.put('F','7');
        legend.put('s','$');
        legend.put('S','$');
        legend.put('1', '!');
        legend.put('a', '@');
        legend.put('A', '@');
        char[] sentenceArray=str.toCharArray();
        for(int i = 0 ; i< sentenceArray.length;i++){
            if(legend.containsKey(sentenceArray[i])){
                sentenceArray[i]=legend.get(sentenceArray[i]);
            }
        }
        return new String(sentenceArray);
    }

    //Question 19

    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        String[] arrayString=stringInput.split(" ");
        for(int i =0 ; i<arrayString.length;i++){
            if((i+1)%2==0){
                arrayString[i]="Wu";
            }else if((i+1)%3==0){
                arrayString[i]="Tang";
            }
        }
        StringBuilder buildString= new StringBuilder();
        for(String i:arrayString){
            buildString.append(i).append(" ");
        }

        return buildString.toString();

    }

    //Question 20
    public static String createStringOfFibonnaciUpToMax(int maxNumber) {
        if (maxNumber <= 0) {
            return "Invalid maxNumber";
        }
        else if(maxNumber==1){
            return "The First Number is 0";
        }else if(maxNumber==2){
            return "The first two numbers are 0, 1";
        }else{
            int numOne=0;
            int numTwo=1;
            int numHold;
            String fibonnaciNums="The numbers are : \n"+numOne+"\n"+numTwo;
            for(int i =2 ; i<maxNumber; i++){
                numHold=numOne;
                numOne=numTwo;
                numTwo+=numHold;
                fibonnaciNums+="\n"+numTwo;
            }
            return fibonnaciNums;
        }

    }



}