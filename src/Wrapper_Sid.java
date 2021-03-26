public class Wrapper_Sid {
    public static void main(String [] args){
        int n = 10;
        Integer N = n;
        String s = "10";
        String x ="101.101";
        Double c = Double.valueOf(x);
        Integer z = Integer.valueOf(s);
        Integer m = Integer.valueOf(n);
        Integer t = new Integer(n);
        System.out.println(n);
        System.out.println(N);
        System.out.println(m);
        System.out.println(t);
        System.out.println(c);
        System.out.println(z);
        System.out.println(z.getClass());
        int v = z.intValue();
        System.out.println(v);
        double b = (double) c;
        System.out.println(b);
        System.out.println(c.getClass());
    }
}
