import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        System.out.println("ok");
        Set<String> set = new HashSet<>();

        String[] names = {"shizuka_rin", "higuthi_kaede", "tukino_mito"};

        set.add("shizuka_rin");

        for (String var : set) {
            System.out.println(var);
        }

        for (String var : names) {
            System.out.println(var);
        }
        
        BufferedReader br = null;

        try ( Reader fr = new FileReader("fruit_2.csv") ) {
            br = new BufferedReader(fr);
            String line = null;
        
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }       
        } catch (IOException e) {
            //TODO: handle exception
        }
    }

}
