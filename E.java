public class E {

    static double mean(double[] doesntmatter){
        double sum = 0.0;
        for (double num:doesntmatter){
            sum += num;
        }
        return sum / doesntmatter.length;
    }
    static double stdd(double[] mightmatter, int isPopulation){
    
        double mean = mean(mightmatter);
        double standeviat = 0;
        for (double num:mightmatter){
            double st1 = Math.pow(Math.abs(num-mean), 2);
            standeviat += st1;
        }
        if (isPopulation == 1){standeviat = Math.sqrt(standeviat/mightmatter.length);
        }
        else if(isPopulation == 0){
            standeviat = Math.sqrt(standeviat/(mightmatter.length-1));
        }
       
        return standeviat;
    }
    public static void main(String[] args){
        System.out.println(mean(new double[]{1,3,6.25,736.6,24888789.365487921}));
        System.out.println(stdd(new double[]{1,3,6.25,736.6,24888789.365487921}, 0));
    }
}
