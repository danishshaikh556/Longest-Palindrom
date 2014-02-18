/* LONGEST PALINDROME */
/*RUN TIME O(n²)*/

public class LongestPalindrome {
	
	public static void main(String []args){
        int max         = 0;
        int start       = 0;
        int stop        = 0;
        int maxIndex    = 0;
        String given    = "abcdeedcbadgefdadadaddd";
        String toreturn = "";
        
        for(int i=0;i<given.length();i++)
        {
            int a = i;
            int j = i;
            
            //This takes care of the unsymetric but same palindrones like ggggg
            // if(i-1>=0 && i+1<given.length()-1){if(given.charAt(i+1)==given.charAt(i) && given.charAt(i)==given.charAt(i-1))j=i;}
            //This takes care of symetricpalindromes like aeea and ggggg;
            
            if(i+1<given.length()-1 && i-1>=0){if(given.charAt(i+1)==given.charAt(i) && given.charAt(i)!=given.charAt(i-1))j =i+1;}
            int count = 0;
            while(a>=0 && j<given.length())
            {
                if(given.charAt(a) != given.charAt(j)) break;
                
                count++;
                if(max<count) {max=count;start=a;stop=j;maxIndex=i;}
                a--;
                j++;
                   
            }
        }
        
        for(int m=start;m<stop+1;m++)  toreturn += given.charAt(m);
        
        System.out.println(toreturn +""+ max + ""+ start + ""+ stop);
        
     }
	}

