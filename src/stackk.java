import stack.stackemptyexception;

public class stackk
{
    int data[];
    int top;

    public stackk(){
        data = new int[10];
        top = -1;
    }

    public stackk(int capacity){
        data = new int[capacity];
        top = -1;
    }

     public boolean isempty(){
         if(top==-1){
            return true;
        }
         else
            return false;
    }

      public int size(){
      return top+1;
      }

      public int top() throws stackemptyexception
      {
        if(size()==0){
          stackemptyexception e =new stackemptyexception();
          throw e;
        }
        return data[top];
      }

      public void push(int elem){
        if (size()==data.length){
           // System.out.println("stack full");
        }
        top++;
        data[top] = elem;
      }

      public int pop(){
        int temp = data[top];
        top--;
        return temp;
      }

}
class main {
    public static void main(String[] args) throws stackemptyexception {
        stackk s = new stackk();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while (!s.isempty()) {
            try {
                System.out.println(s.pop());
            } catch (Exception e) {

            }

        }
    }
}