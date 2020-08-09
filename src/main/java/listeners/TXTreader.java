package listeners;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class TXTreader {

    public static void main(String[] args) {

    }

    public  static ArrayList<String>  get(String s){
ArrayList<String> res=new ArrayList<String>();
        s =read(s);
      //  System.out.println(s);
        Pattern pattern = Pattern.compile("(\\d)(\\..*?) (.+)");
        Matcher matcher = pattern.matcher(s);
        int lastnunber=-99;
        int count=0;
        String arr[]=new String[10];
        while (matcher.find()) {
            System.out.println(matcher.group(2));
            System.out.println("=======================");
            String sq = matcher.group();

         res.add(matcher.group().replaceAll("#",System.lineSeparator()));
        }
         return  res;
    }


 public  static   String read(String s){
        StringBuilder stringBuilder = new StringBuilder();
     try(FileReader reader = new FileReader(s+".txt"))
     {

          // читаем посимвольно
         int c;
         while((c=reader.read())!=-1){
       stringBuilder.append((char)c );

         }
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     }
   return  stringBuilder.toString();
 }

}
