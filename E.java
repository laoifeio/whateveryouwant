public class E {

    static double mean(double[] doesntmatter){
        double sum = 0.0;
        for (double num:doesntmatter){
            sum += num;
        }
        return sum / doesntmatter.length;
    }
    
    public static void main(String[] args){
        System.out.println(mean(new double[]{1,3,6.25,736.6,24888789.365487921}));
    }
}
