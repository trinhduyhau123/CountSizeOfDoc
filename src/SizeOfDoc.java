import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SizeOfDoc {

    public static int getSize(String path) throws IOException {
        int dodai=0;
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("This file is not exists");
        }

        if (file.isDirectory()) {
            File[] list = file.listFiles();
            if (list != null) {
                for (File f : list) {
                    //System.out.println(f.length());
                    dodai+=f.length();
                }
            }
        }
        return dodai;
    }
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path of the directory: ");

        String path = scanner.nextLine();
        getSize(path);
        System.out.println("Do dai: "+ getSize(path) );
    }
}
