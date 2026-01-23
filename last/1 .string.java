
class string_concatinating{
    public static void main(String[] args) {

System.out.println(concatating("hi its atharva kadam"));
        System.out.println(concatating("and i haev to complete dsa in a 2 months "));
        System.out.println(concatating("and git hub application too "));
        System.out.println();
    }
        public static String concatating(String... strs){
            StringBuilder sb=new StringBuilder();
            for (String str:strs){
                sb.append(str).append(" _ ");
            }
        return sb.toString();
    }}

