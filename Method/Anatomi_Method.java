package Method;

    public class Anatomi_Method {
    
        static double luasPersegiPanjang(double panjang, double lebar) {
            return panjang * lebar;
        }
        
        public static void main(String[] args){
            double luas = luasPersegiPanjang(5,3);
            System.out.println("luas:" + luas);
            
        
        }
    }
