public class demo07_array1 {
    public static void main(String[] args){

        int[] ages = new int[]{22, 21, 22};
        double[] source = new double[]{22.1, 44.5, 99};

        char[] ch1 = new char[3];
        for (int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);
        }
//        System.out.println(ch1[0]);
//        System.out.println(ch1[1]);
//        System.out.println(ch1[2]);

        ch1[0] = 'h';
        ch1[1] = 'h';
        ch1[2] = 'h';
        for (int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);
        }
    }
}
