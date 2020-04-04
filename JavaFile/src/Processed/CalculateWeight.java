package Processed;

import MainPackage.ResultClass;
import ObjectOriented.PriorityData;

import javax.swing.*;

public class CalculateWeight {
    double optimizeValue;
    ResultClass resultClass = new ResultClass();
    public  void  regressionResult(double betaZero, double betaOne, double
            betaTwo, double betaThree, PriorityData[] priorityData, int numberOfBooks){

        int i;


            for(i=0;i<numberOfBooks;i++){
            optimizeValue = ((betaOne * priorityData[i].borrowPriority)+
                    (betaTwo * priorityData[i].timePriority)+(betaThree * priorityData[i].pricePriority));
              //  System.out.println("********* "+optimizeValue+" *********");


            priorityData[i].setWeight(optimizeValue);
            }

       resultClass.sortingProcess(priorityData,numberOfBooks);

    }
}
