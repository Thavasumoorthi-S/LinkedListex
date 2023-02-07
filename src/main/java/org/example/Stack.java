package org.example;

public class Static {
    Node rootNode=null;
    int count=0;
    class Node {
        int data;
        int index;
        Node nextNode;

        Node(int data, int index) {
            this.data = data;
            this.index = index;
        }
    }
        public void add(int data,int index)
        {
            if(this.rootNode==null)
            {
                this.rootNode=new Node(data,index);
                this.count++;
            }
            else
            {
                Node temp=this.rootNode;
                while(temp.nextNode!=null)
                {
                    temp=temp.nextNode;
                }
                temp.nextNode=new Node(data,index);
                this.count++;
            }
            console.log("successfully addded Element");
        }
        display()
        {
            var temp=this.rootNode;
            if(temp==null)
            {
                console.log("Stack is Empty ");
            }
            else{
                while(temp!=null)
                {
                    console.log(temp.data);
                    temp=temp.nextNode;
                }
            }
        }
        pop()
        {
            var temp1=this.rootNode;
            while(true)
            {
                if(temp1.index==(this.count-1))
                {
                    break;
                }
                temp1=temp1.nextNode;
            }
            temp1.nextNode=null;
            //console.log("successfully Remove the element " );
            this.count--;
            console.log("Successfully Removed the element");
        }
    }
    var stack=new Stack();
    var index1=0;
    var element;
while(true)
    {
        console.log("\n1)add the Element \n2)remove the element \n3)display the element \n4)exit ");
        var choice=parseInt(prompt("Choose any one of the option in the above: "));
        if(choice==1)
        {
            element=parseInt(prompt("Enter the  element:"));
            index1++;
            stack.add(element,index1);
        }
        else if(choice==2)
        {
            stack.pop();
        }
        else if(choice==3)
        {
            stack.display();
        }
        else if(choice==4)
        {
            break;
        }
    }
}
