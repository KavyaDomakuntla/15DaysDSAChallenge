package Day2;

public class Q125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        StringBuffer sb=new StringBuffer();
        s=s.toLowerCase();
        int i=0;
        while(i<s.length())
        {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
            i++;
        }
        i=0;
        int j=sb.length()-1;
        while(i<j)
        {
            if(sb.charAt(i)==sb.charAt(j))
            {
                i++;
                j--;
            }
            else
            return false;
        }
        return true;
    }
    
}
