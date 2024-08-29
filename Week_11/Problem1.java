package Week11;

import java.io.*;

public class Problem1 {
    public static void main(String[] args) {
        File f=new File("StudentGrade2.txt");
        try{
            try(FileReader fr=new FileReader("C:\\Users\\reala\\Desktop\\MCA\\Semester 2\\inLab\\src\\Scorefile.txt")){
                try(BufferedReader br=new BufferedReader(fr)){
                    try(BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
                        String line;
                        while((line= br.readLine())!=null){
                            int a=Integer.parseInt(line);
                            bw.write(gradeConverter(a)+"\n");
                            bw.flush();
                        }
                    }
                }
            }
            System.out.println("Grade File Generated at the path " +f.getAbsolutePath());
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    private static String gradeConverter(int score){
        if(score>=90) return "A+";
        else if (score>=85) return "A";
        else if (score >=80) return "B+";
        else if (score>=75) return "B";
        else if (score>=65) return "C+";
        else if (score>=60) return "C";
        else if (score>=55) return "D+";
        else if (score>=50) return "D";
        else return "F";
    }
}
