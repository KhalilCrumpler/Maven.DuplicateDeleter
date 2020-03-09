package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    public int getOccurances(int c){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(c == array[i])
                count++;
        }
        return count;
    }
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        int secondCount = 0;
        Integer[] tempArray = new Integer[0];

        for(int i = 0; i < array.length; i++){
            if(getOccurances(array[i]) < maxNumberOfDuplications){
                tempArray = new Integer[tempArray.length + 1];
                tempArray[count] = array[i];
                count++;
            }
        }
        Integer[] newArray = new Integer[tempArray.length];
        for(int i = 0; i < array.length; i++){
            if(getOccurances(array[i]) < maxNumberOfDuplications){
                newArray[secondCount] = array[i];
                secondCount++;
            }
        }
        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        Integer[] newArray = new Integer[this.array.length];
        for(int i = 0; i < this.array.length; i++){
            int arrayCount = 0;
            for(int j = 1; j < this.array.length; j++){
                if(this.array[i].equals(this.array[j])){
                    arrayCount += 1;
                }
            }
            if(arrayCount > 0 && arrayCount <= exactNumberOfDuplications){
                newArray[i] = this.array[i];
            }
        }

        return newArray;
    }
}
