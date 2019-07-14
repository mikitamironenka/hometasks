package by.mironenka.maintask;

import by.mironenka.maintask.customexceptions.DataIsNotNumberException;
import org.apache.commons.lang.math.NumberUtils;
import java.util.ArrayList;
import java.util.List;

public class NumbersManipulator {

    private final List<String> stringList;
    private final List<Double> doubleList;
//    private double summ;

    public NumbersManipulator(List<String> list) {
        this.stringList = list;
        this.doubleList = new ArrayList<>();
    }

    public List<String> getStringList() {
        return stringList;
    }

    public boolean areDataNumbers(){

        boolean result = false;
        for(String data : stringList) {

            if(!(NumberUtils.isNumber(data))) {
                return false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public void addDataToDoubleList() {

        for(String data : stringList) {

            
            doubleList.add(Double.parseDouble(data));
        }
    }

    public double calculateSummOfNumbers() {

        double summ = 0;
        for(Double number : doubleList) {
            summ+= number;
        }

        return summ;
    }

    public double calculateAverage(){



        return calculateSummOfNumbers() / doubleList.size();

    }
}
