package file;

import directory.Directory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    public static void writeFile(List<Directory> list, String path)
    {
        try {
            java.io.File file = new java.io.File(path);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Directory d : list) {
                bw.write(d.toString());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public  static List<Directory> readFile(String path)
    {
        List<Directory> list = new ArrayList<>();
        try {
            java.io.File file = new java.io.File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line=br.readLine())!=null)
            {
                String[] split=line.split(",");
                if(split.length<7) continue;
                    list.add(new Directory(split[0],split[1],split[2],split[3],split[4],split[5],split[6]));

            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
