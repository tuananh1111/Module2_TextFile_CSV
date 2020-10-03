import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader file= new FileReader("quocgia");
            BufferedReader buffer= new BufferedReader(file);
            String line = "";
            while ((line=buffer.readLine()) !=null){
                String[] quocgia= line.split(",");
                System.out.println("Quoc gia = ["+ quocgia[4]+" ,"+quocgia[5]+" ]");
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
