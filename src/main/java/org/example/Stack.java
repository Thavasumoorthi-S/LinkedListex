package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack {
    Node rootNode = null;
    int count = 0;
    Logger logger=Logger.getLogger("com.api.jar");
    class Node {
        int data;
        int index;
        Node nextNode;
        Node(int data, int index) {
            this.data = data;
            this.index = index;
        }
    }
    public void add(int data, int index) {
        if (this.rootNode == null) {
            this.rootNode = new Node(data, index);
            this.count++;
        } else {
            Node temp = this.rootNode;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = new Node(data, index);
            this.count++;
        }
        logger.info("successfully addded Element");
    }
    public void display() {
        Node temp = this.rootNode;
        if (temp == null) {
            logger.info("Stack is Empty ");
        } else {
            while (temp != null) {
                logger.log(Level.INFO,Integer.toString(temp.data),+temp.data);
                temp = temp.nextNode;
            }
        }
    }
    public void pop() {
        Node temp1 = this.rootNode;
        while (true) {
            if (temp1.index == (this.count - 1)) {
                break;
            }
            temp1 = temp1.nextNode;
        }
        temp1.nextNode = null;
        this.count--;
        logger.info("Successfully Removed the element");
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        Logger logger=Logger.getLogger("com.api.jar");
        int index1 = 0;
        int element;
        int choice;
        while (true) {
            logger.info("\n1)add the Element \n2)remove the element \n3)display the element \n4)exit ");
            logger.info("Choose any one of the option in the above: ");
            choice = sc.nextInt();
            if (choice == 1) {
                logger.info("Enter the  element:");
                element = sc.nextInt();
                index1++;
                stack.add(element, index1);
            } else if (choice == 2) {
                stack.pop();
            } else if (choice == 3) {
                stack.display();
            } else if (choice == 4) {
                break;
            }
        }
    }
}