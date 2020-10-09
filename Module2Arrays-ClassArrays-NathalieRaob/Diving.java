/*
author: Nathalie Raobimanana
Subject: CSC 201
Professor: Emilia Butu
*/

import java.util.*;
public class Diving
{
   
   //method to enter a valid score
    public static double inputValidScore(int i )
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.print("Judge #"+i+" score :");
            double score = input.nextDouble();
            if(score>=0 && score<=10)
            {
                return score;
            }
        }
    }
    //this method return an array
    public static double[] inputAllScores()
    {
        double arr[] = new double[7];
        for(int i =0;i<7;i++)
        {
            arr[i] = inputValidScore(i+1);
        }
        return arr;
    }
  
    public static double inputValidDegreeOfDifficulty( )
    {
        Scanner input = new Scanner(System.in);
        //defining scanner Object
        while(true)
        {
            System.out.print("Degree of difficulty : ");
            double score = input.nextDouble();
            if(score>=1.2 && score<=3.8)
            {
                return score;
            }
        }
    }
  
    public static double calculateScore()
    {
        double degree = inputValidDegreeOfDifficulty();
        double arr[] = inputAllScores();
        double max = 0;
        double min = 11;
        
        
        //calculating max and min
        for(int i =0;i<7;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            else if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        //removing the max and min
        double sum = 0;
        for(int i =0;i<7;i++)
        {
            if(arr[i]!=min&&arr[i]!=max)
            {
                sum+=arr[i];
            }
        }
        //multiply by degree
        sum = sum*degree;
        //return sum
        return sum*0.6;
    }
   //Main method that uses the previous methods to determine the score for the diver and then print out the score to the console
   public static void main(String[] args) {
       double score = calculateScore();
       System.out.printf("The divers score is " + score);
   }
   }