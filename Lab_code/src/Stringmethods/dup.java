package Stringmethods;

class dup {
    public static int findDup(int arr[]){
        int slow=arr[0];
        int fast=arr[0];
        do{
            System.out.println(slow+" "+fast);
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);
        System.out.println();
        int ptr1=arr[0];
        int ptr2=slow;
        while(ptr1!=ptr2){
            System.out.println(ptr1+" "+ptr2);
            ptr1=arr[ptr1];
            ptr2=arr[ptr2];

        }
        return ptr1;
    }
    public static void main(String args[]){
        int []arr = {1, 3, 2,8,7 ,1,4,9,5};
        System.out.println(findDup(arr));
    }
}