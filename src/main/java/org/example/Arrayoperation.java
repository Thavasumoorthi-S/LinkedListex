package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Arrayoperation
{
    int index=0;
    int size;
    Logger logger=Logger.getLogger("com.api.jar");
    Arrayoperation(int size)
    {
        this.size=size;
    }
    int arr[]=new int[size];
    public void addelement(int value)
    {
        arr[index++]=value;
    }
    public void removeelement()
    {
        arr[--index]=0;
    }
    public void display()
    {
        for(int i=0;i<this.size;i++)
        {
            logger.info("Element is :"+arr[i]);
        }
    }
    public void insertatpos(int pos,int value)
    {
        for(int i=this.index-1;i>=pos-1;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos-1]=value;
       this.index++;
    }
    public void search(int value)
    {
        int count=0;
        for(int i=0;i<this.size;i++)
        {
            if(arr[i]==value)
            {
                count=1;
            }
        }
        if(count==1)
        {
            logger.info("Element is found ");
        }
        else {
            logger.info("Element not found ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Logger logger=Logger.getLogger("com.api.jar");
        int size;
        int size2;
        int choice;
        int element;
        int pos;
        int element1;
        int element2;
        logger.info("Enter the size of the array: ");
        size=sc.nextInt();
        Arrayoperation ap=new Arrayoperation(size);
        while(true) {
            logger.info("\n1)Add the element \n2) Remove the element  \n3)Display \n4)Insert at particular position \n5)search element \n6)exit");
            logger.info("Choose any one of the option in the above :");
            choice = sc.nextInt();
            if (choice == 1) {
                logger.info("Enter the element : ");
                element = sc.nextInt();
                ap.addelement(element);
            } else if (choice == 2) {
                ap.removeelement();
                logger.info("Successfully element removed");
            } else if (choice == 3) {
                ap.display();
            } else if (choice == 4) {
                logger.info("Enter the position :");
                pos=sc.nextInt();
                logger.info("Enter the element :");
                element1=sc.nextInt();
                ap.insertatpos(pos,element1);
            }
            else if(choice==5)
            {
                logger.info("Enter the element :");
                element2=sc.nextInt();
                ap.search(element2);
            }
            else if(choice==6)
            {
                break;
            }
        }
    }
}
