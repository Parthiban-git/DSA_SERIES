// [1,2,3,4,5]
class Solution{
    int arr[]=new int[5];
    int front=0,rear=0,count=0;
    void push(int x){
         if(count<n){
            arr[rear%n]=x;
            rear++;count++;
         }
    }
    void pop(){
        if(count==0) return ;
        front++;count--;
    }
    void top(){
        arr[front%n];
    }
    // print all ele
    for(int i=front;i<rear;i++){
        print(i%n);
    }
}