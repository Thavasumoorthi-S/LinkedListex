package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arrayoperation
{
    Logger logger=Logger.getLogger("com-apii-jaar");
    int[] data;
;//;/
    int size=0;
    int capacity;

    Arrayoperation(int limit)
    {
        data= new int[limit];
        capacity=limit;
    }

    public void add(int value)
    {
        if(capacity==size)
        {
            expandarray();
        }
        data[size++]=value;
    }
    private void expandarray()
    {
        capacity=capacity*2;
        data=java.util.Arrays.copyOf(data,capacity);

    }
    public void delete()
    {
        size=size-1;
    }
    public void insertatindex(int index,int value)
    {
        for(int i=size;i>=index;i--)
        {
            data[i]=data[i-1];
        }
        data[index]=value;
        size++;
    }

    public void deleteatindex(int index)
    {
        for (int i=index+1;i<size;i++){
            data[i-1]=data[i];

        }
        size--;
    }
    public void insertatbegin(int value)
    {
        for(int i=size;i>=0;i--)
        {
            if(capacity-1==size)
            {
                expandarray();
            }

            data[i+1]=data[i];
        }

        data[0]=value;
        size++;
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            logger.log(Level.INFO, Integer.toString(data[i]),data[i]);
        }
    }
    public void deleteatend()
    {
        size=size-1;
    }
    public void search(int value)
    {
        int flag=0;
        for(int i=0;i<size;i++)
        {
            if(data[i]==value)
            {
                flag=1;
                logger.info("Value is found ");
                break;
            }
        }
        if(flag==0)
        {
            logger.info("Value is  not found ");
        }

    }


    public static void main(String[] args)
    {
        Logger logger=Logger.getLogger("com-api-jar");
        int size;
        Scanner sc=new Scanner(System.in);
        logger.info("Enter the array size ");
        size=sc.nextInt();
        Arrayoperation ex=new Arrayoperation(size);
        int choice;
        int index;
        int element;
        while(true)
        {
            logger.info("\n1)Add element \n2)Remove element \n3)insert at particular index position \n4)delete at particularindex position \n5)display \n6)insert at beginning \n7)Delete at end \n8)search element \n9)Exit");
            logger.info("Choose any one of the option in the above :");
            choice=sc.nextInt();
            if(choice==1)
            {
                logger.info("Enter the value: ");
                element=sc.nextInt();
                ex.add(element);
            }
            else if(choice==2)
            {
                ex.delete();
            }
            else if(choice==3)
            {
                logger.info("Enter the index ");
                index=sc.nextInt();
                logger.info("Enter the value ");
                element=sc.nextInt();
                ex.insertatindex(index,element);
            }
            else if(choice==4)
            {
                logger.info("Enter the index ");
                index=sc.nextInt();
                ex.deleteatindex(index);
            }
            else if(choice==5)
            {
                ex.display();
            }
            else if(choice==6)
            {
                logger.info("Enter the element :");
                element=sc.nextInt();
                ex.insertatbegin(element);
            }
            else if(choice==7)
            {
                ex.deleteatend();
            }
            else if(choice==8)
            {
                logger.info("Enter the value ");
                element=sc.nextInt();
                ex.search(element);
            }
            else if(choice==9)
            {
                break;
            }
        }

    }
}