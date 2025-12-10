import java.io.FileNotFoundException;
import java.util.*;
class MicrosoftOffice {

    static class Word {
        void open(String fileName) throws SecurityException {
            if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {
                System.out.println("Microsoft Word has Opened " + fileName);
            } else {
                throw new SecurityException("Invalid file type for Microsoft Word");
            }
        }
    }


    static class PowerPoint {
        void open(String fileName) throws FileNotFoundException {
            if (fileName.endsWith(".ppt") || fileName.endsWith(".pps")) {
                System.out.println("Microsoft PowerPoint has Opened " + fileName);
            } else {
                throw new FileNotFoundException("Invalid file type for Microsoft PowerPoint");
            }
        }
    }
//
    public static  void main(String[] args) {
        Word word = new Word();
        PowerPoint powerPoint = new PowerPoint();
        Scanner sc= new Scanner(System.in);

        String wordFile= sc.nextLine();
        String powerPointFile=sc.nextLine();


        try {
            word.open(wordFile);
            powerPoint.open(powerPointFile);
            
        } catch (SecurityException e) {
            System.out.println("Security Exception: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception: " + e.getMessage());
        }
    }
}