import java.util.*;
public class stringss {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(str.substring(1));

//minimum length word
        // String[] arr = str.split(" ");
        // int minlength = Integer.MAX_VALUE;
        // int min = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i].length() < minlength){
        //         minlength = arr[i].length();
        //         min = i;
        //     }
        // }
        // System.out.println(arr[min]);
        //System.out.println(minlength);

//time conversion
    // String ans = "";
    // String hh = str.substring(0,2);
    // String rest = str.substring(2,8);
    // char ch = str.charAt(8);
    // int h = Integer.valueOf(hh);
    // if(ch == 'A' && h == 12){
    //     ans = "00:00:00";
    //     System.out.println(ans);   
    // }
    // else if(ch == 'P' && h == 12){
    //     ans = "12:00:00";
    //     System.out.println(ans);
    // } 
    // else if(ch == 'P'){
    //     h = h+12;
    //     hh = Integer.toString(h);
    //     ans = hh + rest;
    //     System.out.println(ans);
    // }
    // else{
    //     System.out.println(rest);
    // }

//remove vowels
        // String b = str.replaceAll("[aeiouAEIOU]", "");
        // System.out.print(b);


//defang ip
    //String b = ;
    //System.out.print(str.replaceAll("[.]", "[.]"));

//shuffle string 
    
    // int indices[] = new int[str.length()];
    //     for(int i=0; i<indices.length; i++){
    //         indices[i] = s.nextInt();
    //     }

    // char ch[] = new char[str.length()];
    //     for(int i=0; i<indices.length; i++){
    //         char cur = str.charAt(i);
    //         int index = indices[i];
    //         ch[index] = cur;
    //     }

    // String sh = new String(ch);
    // System.out.println(sh);

//Balanced Strings
    
    // String str = s.nextLine();

    // int countl = 0, countr = 0, ans = 0;
    //     for(int i=0; i<str.length(); i++){
    //         if(str.charAt(i)=='L'){
    //             countl++;
    //         }
    //         if(str.charAt(i) == 'R'){
    //             countr++;
    //         }
    //         if(countl == countr){
    //             ans++;
    //             countl = 0;
    //             countr = 0;
    //         }
    //     }
    //     System.out.println(ans);

//toLowercase

        // String str = s.nextLine();
        // //System.out.println(str.toLowerCase());
        // StringBuilder ans = new StringBuilder();
        // //String ans = "";
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     ans.append(ch > 64 && ch < 91 ? (char)(ch + 32) : ch) ;
        //     //ans += ch > 64 && ch < 91 ? (char)(ch + 32) : ch;
        // }
        // System.out.println(ans);

//Count Alphabets
//error
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        // String str = sc.next();

        // int count = 0;
        // for(int i=0; i<n; i++){
        //         char ch = str.charAt(i);
        //         if( ch > 64 && ch < 91){
        //                 count++;
        //         }
        //         if(ch > 96 && ch < 123){
        //                 count++;
        //         }
        // }
        // System.out.print(count);

//valid anagram

        // String str1 = s.nextLine();
        
        // int arr[] = new int[26];

        // for(int i=0; i<str.length(); i++){
        //     arr[str.charAt(i)-'a']++;
        // }
        // for(int i=0; i<str1.length(); i++){
        //     arr[str1.charAt(i)-'a']--;
        // }
        // int count = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] != 0){
        //         count++;
        //     }
        // }
        // if(count == 0){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.print("No");
        // }

//find the difference

        //for(int i=0; i<26; i++){
        //     if(arr[i] == -1){
        //         char c = (char)(i + 'a');
        //         return c;
        //     }
        // }



//split & trim
        // String b = str.trim();
        
        // String[] arr = b.split(" ");
        // System.out.println(arr.length);
        // for(String a : arr){
        //     System.out.print(a);
        // }

//word count
        // int count = 0;
        // int i = 0;
        // for(i=0; i < str.length()-1; i++){
        //     char ch = str.charAt(i);
        //     char chr = str.charAt(i+1);
        //     if(ch != ' ' && chr == ' '){
        //         count++;
        //     }
        // }
        // if(str.charAt(i) != ' '){
        //     count++;
        // }
        // System.out.println(count);   
        //     }
        s.close();
    }
}
