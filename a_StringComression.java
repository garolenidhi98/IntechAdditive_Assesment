/* a) String compression
 Implement a method to perform string compression. E.g. ‘aabcccccaaa’ should be a2b1c5a3. The
 code to implement this is given in the link - https://www.educative.io/answers/string-
 compression-using-run-length-encoding

 Think about memory occupied and how it can be improved.
 Bonus 1:
 The answer should be taken into second compressor and compress further.
 E.g. a2b2c1a3c3 should become ab2c1ac3
 Bonus 2: decompress2
 ab2c1ac3 should return aabbcaaaccc.
 Think about how you will test this code.*/


//Code

// I declare that all the solutuions given are my own and are not taken from internet or any other source
import java.util.*;

public class A_StringCompression {

    public static String simpleCompression(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        int count = 0;
        while(j < s.length()) {
            j=i+1;
            while ( j<s.length() && s.charAt(i) == s.charAt(j))
            {
                count++;
                i++;
                j++;
            }
            if(j<s.length() && s.charAt(i)!=s.charAt(j))
            {
                count++;
                result.append(s.charAt(i));
                result.append(Integer.toString(count));
                count=0;
                i++;
            }
        }
        if(i==s.length()-1 && j==s.length())
        {
            count++;
            result.append(s.charAt(i));
            result.append(Integer.toString(count));
        }
        return result.toString();
    }

    public static String advanceCompression(String s) {
        //String s="a1b2c3d3a2";
        List<Character> li1 = new ArrayList<Character>();
        List<String> li2 = new ArrayList<String>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                li1.add(c);
                i++;
            } else {
                StringBuilder str = new StringBuilder();
                while (i < s.length() && s.charAt(i) >= '1' && s.charAt(i) <= '9') {
                    str.append(s.charAt(i));
                    i++;
                }
                li2.add(str.toString());
            }
        }
        i = 0;
        int j = 0;
        StringBuilder ss = new StringBuilder();
        while (j < li1.size()) {
            j = i + 1;
            //a2b2c3d3a2
            //abcda
            //22332
            while (j < li1.size() && li2.get(i).equals(li2.get(j))) {
                ss.append(li1.get(i));
                i++;
                j++;
            }
            if (j < li1.size() && li2.get(i).equals(li2.get(j)) == false) {
                ss.append(li1.get(i));
                ss.append(li2.get(i));
                i++;
            }
            if (i == li1.size() - 1 && j == li1.size()) {
                ss.append(li1.get(i));
                ss.append(li2.get(i));
            }
        }
        return (ss.toString());
    }

    public static String Decompress(String s)
    {
        int size=s.length()-1;
        StringBuilder str=new StringBuilder();
        Stack<Character> stk2=new Stack<Character>();

        int num=0;
        int i=size;
        int flag=0;
        while(i>=0)
        {
            char c=s.charAt(i);
            if(i>=0 && c>='1' && c<='9')
            {
                 num=Character.getNumericValue(c);
                 flag=1;
                 i--;
            }
            else if(c>='a' && c<='z')
                {
                    for (int j = 0; j < num; j++) {
                        stk2.push(c);
                    }
                    i--;
                }
            }
        while(stk2.isEmpty()==false)
        {
            str.append(stk2.pop());
        }
        return str.toString();
        }


    public static void main(String[] args) {

        String s = "aabbcccdddaaqq";
        String output1=simpleCompression(s);
        System.out.println(output1);

        String output2=advanceCompression(output1);
        System.out.println(output2);

        String output3=Decompress(output2);
        System.out.println(output3);

    }
}