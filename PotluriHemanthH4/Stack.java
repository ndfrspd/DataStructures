public class Stack {
int maxsize=10;
int[] stackArray = new int[maxsize];
int top = -1;

 void push(int a)
 {
   if(this.top + 1 >= maxsize){
     
     System.out.println("Can't push, list full");
   }
   else{
     this.top++;
     stackArray[this.top] = a;
 }
 }
 void pop()
 {
   if(this.top < 0)
   {
     System.out.println("Can't Pop, list empty");
   }
   else{
     System.out.println(stackArray[this.top]);
     this.top--;
   }
 }
 void top()
 {
   if(this.top >= 0)
     System.out.println(stackArray[this.top - 1]);
 }
 void print()
 {
   if(this.top >= 0)
   {
     for(int i = this.top; i>= 0; i--)
   {
     System.out.println(stackArray[i]);
   }
 }
   else
     System.out.println("Can't print, empt");
 }
 

 
 public static void main(String[] args) {
   // TODO Auto-generated method stub
   Stack s = new Stack();
   s.push(3);
   s.push(34);
   s.push(33);
   s.push(93);
   s.push(34);
   s.push(33);
   s.push(93);
   s.push(34);
   s.push(33);
   s.push(93);
   s.push(93);
   s.top(); 
   s.pop();
   s.top();
   s.push(67);
   s.print();
 }

}

