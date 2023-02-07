package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Queue {
    Node root = null;
    Node head=null;
    Node model=null;
    Logger logger=Logger.getLogger("com.api.jar");
    int count = 0;

    class Node {
        int data;
        Node nextNode;

        Node(int value) {
            this.data = value;
        }
    }
    public void add(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            this.count++;
        } else {
            Node temp = this.root;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = new Node(value);
            this.count++;
        }
    }
    public void display() {
       Node temp = this.root;
        if (temp == null) {
            logger.info("Queue is empty");
        }
        while (temp != null) {
            logger.log(Level.INFO,Integer.toString(temp.data),temp.data);

            temp= temp.nextNode;
        }
    }
    public void remove() {
        Node temp1 = this.root;
        this.root= temp1.nextNode;
    }
    public static void main(String[] args) {
        Queue queue=new Queue();
        int element;
        Scanner sc=new Scanner(System.in);
        Logger logger=Logger.getLogger("com.api.jar");
        int choice;
        while (true) {
            logger.info("\n1)add the Element \n2)remove the element \n3)display the element \n4)exit ");
            logger.info("Choose any one of the option in the above: ");
            choice=sc.nextInt();
            if (choice == 1) {
                logger.info("Enter the  element:");
                element=sc.nextInt();
                queue.add(element);
            } else if (choice == 2) {
                queue.remove();
            } else if (choice == 3) {
                queue.display();
            } else if (choice == 4) {
                break;
            }
        }
    }
}