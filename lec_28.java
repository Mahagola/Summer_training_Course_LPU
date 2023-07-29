// reverse the string
public class lec_28{
    public static void main(String[] args) {
        String s1="cipherschools";
        // approach 1-------------------------------
        int n=s1.length();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=s1.charAt(n-1-i); //putting elements from the back of the string into the array
        }
        String res=new String(arr);
        System.out.println(res);

        // approach 2-----------------------------
        String res2=new String();
        for(int i=n-1;i>=0;i--){
            res2=res2+s1.charAt(i); //will create new object again and again
        }
        System.out.println(res2);

        //approach 3------------------------------
        char strarr[]=s1.toCharArray();
        int l=0;
        int r=n-1;
        while(l<r){
            char temp=strarr[l];
            strarr[l]=strarr[r];
            strarr[r]=temp;
            l++;
            r--;
        }
        String res3=new String(strarr);
        System.out.println(res3);
    }
}
