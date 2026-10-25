package Method;
public class LatihanSoal {
    public static void main(String[] args){
        
        String[] prodi={"sistem informasi","arsitektur","matematika"};
        String[] kelas={"a","b","c"};
        String[][][] mahasiswa={
            {
                {"aa","ab","ac","ad","ae"},
                {"ba","bb","bc","bd","be"},
                {"ca","cb","cc","cd","ce"}
            },
            {
                {"da","db","dc","dd","de"},
                {"ea","eb","ec","ed","ee"},
                {"fa","fb","fc","fd","fe"}
            },
            {
                {"ga","gb","gc","gd","ge"},
                {"ha","hb","hc","hd","he"},
                {"ia","ib","ic","id","ie"}
            }
        };
        for(int i=0; i<3; i++){
            System.out.println("Prodi:"+prodi[i]);
            for(int j=0; j<3; j++){
                System.out.println("Kelas:"+kelas[j]);
                for (int k=0; k<5; k++){
                    System.out.println(mahasiswa[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}