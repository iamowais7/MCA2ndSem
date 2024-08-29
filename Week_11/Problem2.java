package Week11;

import java.io.*;

public class Problem2 {
    public static void main(String[] args) {
        try{
            try(FileInputStream fis=new FileInputStream("C:\\Users\\reala\\Desktop\\MCA\\Semester 2\\CAMS2P01-Lab\\Practice\\quad2.txt")){
                try(BufferedReader br=new BufferedReader(new InputStreamReader(fis))){
                    try(FileOutputStream fos=new FileOutputStream("C:\\Users\\reala\\Desktop\\MCA\\Semester 2\\CAMS2P01-Lab\\Practice\\roots3.txt", true)){
                        try(BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fos))){
                            String line;
                            while((line= br.readLine())!=null){
                                String[] str=line.split(" ");
                                double a=Double.parseDouble(str[0]);
                                double b=Double.parseDouble(str[1]);
                                double c=Double.parseDouble(str[2]);
                                double discriminant=b*b-4*a*c;
                                if(discriminant==0){
                                    double r1=-b/(2*a);
                                    bw.write("Roots are : " +r1+ " and " +r1+ "\n");
                                } else if (discriminant>0) {
                                    double r1=(-b+Math.sqrt(discriminant))/(2*a);
                                    double r2=(-b-Math.sqrt(discriminant))/(2*a);
                                    bw.write("Roots are : " +r1+ " and " +r2+ "\n");
                                } else{
                                    double real=-b/(2*a);
                                    double imag=(Math.sqrt(-discriminant))/(2*a);
                                    bw.write("Roots are : " +real+ " + (" +imag+")i and " +real+ " - (" +imag+ ")i" +"\n");
                                }
                            }
                        }
                    }

                }
            }

        } catch (FileNotFoundException e){
            System.err.println("File not found.");
        } catch (IOException e){
            System.err.println("error reading/writing the file.");
        }
    }
}
