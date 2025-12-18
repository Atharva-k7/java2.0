import java.util.HashSet;
import java.util.LinkedList;

public class substring {
    public static void main(String[] args) {
                                                        //        abcbdcdcd
                                      //        then b remove ab
                                                        //        then add d then c in
                                                        //        so  remove the c from back


        System.out.println( logeststring("atharvakadam"));
    }
        public static int logeststring(String s){
            HashSet<Character>read=new HashSet<>();
            int maxlen=0;
            int left =0;
            for(int right=0;right<s.length();right++){
                                                        //            if the duplicate character found then
                                                        //            1.remove the left pointer char
                                                        //            2.move the left pointer to left ++
                while(read.contains(s.charAt(right))){
                    read.remove(s.charAt(left));
                    left++;
                }
                                                        //            3.add rigth char in hashset
                read.add(s.charAt(right));
                maxlen=Math.max(maxlen,right-left+1);
            }
            return maxlen;
    }
}
