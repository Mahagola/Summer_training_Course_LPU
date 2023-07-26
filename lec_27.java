// two pointers------------------------
public class lec_26 {
    public static void main(String[] args) {
        int arr[]={10,33,53,24,64};
        int target=77;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("found " + target + " as sum of values on indices " + left + " and " +  right) ; 
                return;
            }
            else if(target<sum)right--;
            else left++;
        }
        System.out.println("target sum not found");
    }
}
