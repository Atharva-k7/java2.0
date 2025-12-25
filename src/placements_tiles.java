public class placements_tiles {
    static void main(String[] args) {
        System.out.println(placement(4,2));
    }
    public static int placement(int n ,int m){
        if(n ==m){
            return 1;
        }
        if (n<m){
            return 2;
        }

        int vertiplacement=placement(n-m,m);
        int horizplacement=placement(n-1,m);
        return vertiplacement+horizplacement;
    }
}
