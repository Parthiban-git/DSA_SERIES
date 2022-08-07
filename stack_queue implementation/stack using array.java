// [1,2,3,4,5]
class Solution{
    int arr[]=new int[5];
    int top=-1;
    void push(int x){
         top++;
         arr[top]=x;
    }
    void pop(){
        top--;
    }
    void top(){
        return arr[top];
    }
}