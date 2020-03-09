package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }
    public int getOccurances(String c){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(c.equals(array[i]))
                count++;
        }
        return count;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        int secondCount = 0;
        String[] tempArray = new String[0];

        for(int i = 0; i < array.length; i++){
            if(getOccurances(array[i]) < maxNumberOfDuplications){
                tempArray = new String[tempArray.length + 1];
                tempArray[count] = array[i];
                count++;
            }
        }
        String[] newArray = new String[tempArray.length];
        for(int i = 0; i < array.length; i++){
            if(getOccurances(array[i]) < maxNumberOfDuplications){
                newArray[secondCount] = array[i];
                secondCount++;
            }
        }
        return newArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        int secondCount = 0;
        String[] tempArray = new String[0];

        for(int i = 0; i < array.length; i++){
            if(getOccurances(array[i]) != exactNumberOfDuplications){
                tempArray = new String[tempArray.length + 1];
                tempArray[count] = array[i];
                count++;
            }
        }
        String[] newArray = new String[tempArray.length];
        for(int i = 0; i < array.length; i++){
            if(getOccurances(array[i]) != exactNumberOfDuplications){
                newArray[secondCount] = array[i];
                secondCount++;
            }
        }
        return newArray;
    }
}
