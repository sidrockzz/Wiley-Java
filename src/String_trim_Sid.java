public class String_trim_Sid {
    public static void main(String [] args) {
        //trim
        String s1 = " ab c ";
        System.out.println(s1);
        String s2 = s1.trim();
        System.out.println(s2);
        //replace
        String s3 ="aaBBccDD";
        String rep1 = s3.replace('a','X');
        String rep2 = s3.replace('c','X');
        System.out.println(rep1+ " "+rep2);
    }
}
