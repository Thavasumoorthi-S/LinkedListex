package org.example;

import java.util.Scanner;

public class LinkedList
{
    Node rootNode=null;
    int count=0;
    Node middnode=null;

    class Node
    {
        int data;
        Node nextNode;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void addElement(int value){
        if(this.rootNode == null){
            this.rootNode= new Node(value);
            this.count++;
        }else{
            var temp = this.rootNode;
            while(temp.nextNode != null){
                temp = temp.nextNode;
            }
            temp.nextNode = new Node(value);
            this.count++;
        }
        System.out.println("successfully Element added ");
    }
    public void removeElement(int indecx){
        Node prev= this.rootNode;
        Node temp1=this.rootNode.nextNode;
        int index=1;
        while(index!=indecx-1)
        {
            temp1=temp1.nextNode;
            prev=prev.nextNode;
            index++;
        }
        prev.nextNode=temp1.nextNode;
        System.out.println("Successfully Removed Element ");
    }
    public void addMiddleElement(int value,int indecx)
    {
        Node prev= this.rootNode;
        Node temp1=this.rootNode.nextNode;
        int  count1=1;
        while(count1!=(indecx-1))
        {
            temp1=temp1.nextNode;
            prev=prev.nextNode;
            count1++;
        }
        this.middnode=new Node(value);
        this.middnode.nextNode=prev.nextNode;
        prev.nextNode=this.middnode;
        System.out.println("Successfully index based Element inserted ");
    }
    public void display() {
        Node temp = this.rootNode;

        if (temp == null) {
            System.out.println(" LinkedList Is empty!");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.nextNode;
            }

        }
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int index;
        int choice;
        int element;
        while(true)
        {
            System.out.println("\n1)add the Element \n2)index based remove element \n3)particular index based insert element\n4)display \n5)exit");
            System.out.println("Choose any one of the option in the above: ");
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the  element:");
                element=sc.nextInt();
                list.addElement(element);
            }
            else if(choice==2)
            {
                System.out.println("Enter the index ");
                index=sc.nextInt();
                list.removeElement(index);
            }
            else if(choice==3)
            {
                System.out.println("Enter the  element:");
                element=sc.nextInt();
                System.out.println("Enter the index ");
                index=sc.nextInt();
                list.addMiddleElement(element,index);
            }
            else if(choice==4)
            {
                list.display();
            }
            else if(choice==5)
            {
                break;
            }
        }
    }
}