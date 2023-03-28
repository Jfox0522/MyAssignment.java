public class Main {
public static void main(String[] args) {

public int sumDigits(int n) {
  if (n < 10) return n; // integer n is less than 10//
return (n % 10) + sumDigits(n/10); 
}



public String missingFront(String str)
{
    return str.substring(3); //string value returns the string without the first 3 characters//
}


public String swapEnds(String str) {
    if (str.length()<2) {
            return str;
        }
        else {
             StringBuffer string = new StringBuffer(str);
            char first = string.charAt(0);
            char last = string.charAt(string.length() - 1);
            string.deleteCharAt(0);
            string.deleteCharAt(string.length() - 1);
            string.append(first);
            string.insert(0, last);
            return str = String.valueOf(string);
        }
}



public String everyOther(String str) {
  String result = "";
    for (int i = 0; i < str.length(); i += 2) {
        result += str.charAt(i);
    }
    return result;
}


public String nonStart(String a, String b) {
  return a.substring(1,a.length()) + b.substring(1,b.length());

}

public int fibonacci(int n) {
  if (n <= 1)
        return n;
    return fibonacci(n-1) + fibonacci(n-2);

}




public int luckySum(int a, int b, int c) {
  
if(a == 13) {
return 0;
} else if(b == 13) {
return a;
} else if(c == 13) {
return a + b;
} else {
return a + b + c;
}
}


public boolean hasPalindrome(String str) {
  if (str.length() <= 1) {
        return true;
    } else {
        return str.charAt(0) == str.charAt(str.length()-1) && hasPalindrome(str.substring(1, str.length()-1));
    }
}
}
}
