 package html;
 
 import java.awt.Color;
 import java.awt.Component;
 import java.awt.Desktop;
 import java.awt.Point;
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.io.PrintStream;
 import javax.swing.JOptionPane;
 import javax.swing.JPanel;
 
 public class Functions
 {
   static int VERTICAL = 0;
   static int HORIZONTAL = 1;
   static int BOTH = 2;
   String path;
   private static Component create;
   
   public static void File_Copy(String dest, String source)
   {
     try
     {
       FileReader fr = new FileReader(source);
       BufferedReader br = new BufferedReader(fr);
       
       FileWriter fw = new FileWriter(dest);
       int inputline;
       while ((inputline = br.read()) != -1)
       {
         fw.flush();
         fw.write(inputline);
       }
       fr.close();
       fw.close();
     }
     catch (Exception e) {}
   }
   
   public static void File_Input(String data, String dest, Component create)
   {
     try
     {
       FileWriter fw = new FileWriter(dest);
       
 
 
       fw.flush();
       fw.write(data);
       
 
 
       fw.close();
     }
     catch (Exception e)
     {
       JOptionPane.showMessageDialog(create, "Some Error Occured");
       System.out.println(e.getMessage());
     }
   }
   
   public static String File_Output(String source)
   {
     String string = null;
     try
     {
       FileReader fr = new FileReader(source);
       BufferedReader br = new BufferedReader(fr);
       int inputline;
       while ((inputline = br.read()) != -1)
       {
         char c = (char)inputline;
         string = string + c;
       }
       fr.close();
     }
     catch (Exception e)
     {
       JOptionPane.showMessageDialog(create, e.getMessage() + "");
     }
     return string;
   }
   
   public static String[] File_Output_array(String source)
   {
     int cs = 0;
     
     String f = null;
     try
     {
       FileReader fr = new FileReader(source);
       BufferedReader br = new BufferedReader(fr);
       int inputline;
       while ((inputline = br.read()) != -1)
       {
         char c = (char)inputline;
         f = f + c;
         System.out.println(f);
       }
       fr.close();
     }
     catch (Exception e) {}
     return f.split(" ");
   }
   
   public static String System_Output(String data, String dest, Component create)
   {
     try
     {
       FileWriter fw = new FileWriter(dest);
       
 
 
       fw.write(System.in.toString());
       data = System.in.toString();
       
 
       fw.close();
     }
     catch (Exception e)
     {
       JOptionPane.showMessageDialog(create, "Some Error Occured");
     }
     return data;
   }
   
   public static Point add(Point p1, Point p2)
   {
     Point p = null;
     
     p1.x += p2.x;
     p1.y += p2.y;
     
 
     return p;
   }
   
   public static Point shift(Point p, int[] amount, int type)
   {
     if (type == BOTH)
     {
       p.x += amount[0];
       p.y += amount[1];
     }
     if (type == HORIZONTAL) {
       p.x += amount[0];
     }
     if (type == VERTICAL) {
       p.y += amount[0];
     }
     return p;
   }
   
   public void graphicsCollapse(Point[] p, Component parent, JPanel j) {}
   
   String last_word(String source)
   {
     String cataloger = null;
     String[] pathos = null;
     pathos = source.split(" ");
     try
     {
       cataloger = pathos[(pathos.length - 1)];
     }
     catch (Exception ex) {}
     return cataloger;
   }
   
   void Component_Color(Component c, Color c1, Color c2)
   {
     c.setBackground(c1);
     c.setForeground(c2);
   }
   
   public void sting_border_elements(char start, char end, String source)
   {
     String newSource = source;
     
 
     int i = 0;int j = 0;
     for (int k = 0; source.contains("" + start); k++)
     {
       j = source.indexOf(start);
       for (i = 0; source.charAt(i) != end; i++) {
         System.out.print(source.charAt(i));
       }
       String source_cut = source.substring(j, i);
       System.out.print("\n" + source_cut);
       source = source.replace(source.substring(j, i), source_cut.replace("<", ""));
     }
   }
   
   void copy_all_at_once(String path, String new_path)
     throws IOException
   {
     String directory_name = "Code Block";
     String abs_path = path + "\\" + directory_name;
     String kankar = "XCOPY \"" + abs_path + "\" \"" + new_path + "\\" + directory_name + "\"";
     File_Input(kankar + " /S /I /-Y  /Y /C", path + "\\copy.bat", create);
     File gf = new File(path + "\\copy.bat");
     Desktop.getDesktop().open(gf);
   }
   
   void copy_directory_Code_Block(String path, String new_path)
     throws IOException
   {
     String directory_name = "Code Block";
     String abs_path = path + "\\" + directory_name + "\\";
     
     String kankar = "XCOPY \"" + abs_path + "\" \"" + new_path + "\\" + directory_name + "\"";
     File_Input(kankar + "  /I /-Y  /Y", path + "\\copy.bat", create);
     File gf = new File(path + "\\copy.bat");
     Desktop.getDesktop().open(gf);
     kankar = "XCOPY \"" + abs_path + "tags\" \"" + new_path + "\\" + directory_name + "\\tags\" ";
     File_Input(kankar + "  /I /-Y  /Y", path + "\\copy.bat", create);
     gf = new File(path + "\\copy.bat");
     Desktop.getDesktop().open(gf);
     kankar = "XCOPY \"" + abs_path + "CSS\" \"" + new_path + "\\" + directory_name + "\\CSS\" ";
     File_Input(kankar + "  /I /Y /-Y", path + "\\copy.bat", create);
     gf = new File(path + "\\copy.bat");
     Desktop.getDesktop().open(gf);
     File faga = new File(abs_path + "attributes\\");
     String[] jacked = faga.list();
     for (int i = 0; i < jacked.length; i++) {
       kankar = kankar + "\n" + "XCOPY \"" + abs_path + "attributes\\" + jacked[i] + "\" \"" + new_path + "\\" + directory_name + "\\attributes\\" + jacked[i] + "\" /I /Y /-Y ";
     }
     File_Input(kankar, path + "\\copy.bat", create);
     gf = new File(path + "\\copy.bat");
     Desktop.getDesktop().open(gf);
     
 
 
 
 
     gf.delete();
     System.out.println("Copying " + path + "\\" + directory_name + " to " + new_path + "\\" + directory_name + ".........");
   }
   
   public Boolean check_null_array(String[] array)
   {
     int count = 0;
     for (int i = 0; i < array.length; i++) {
       if (array[i].equals(null)) {
         count++;
       }
     }
     if (count == array.length) {
       return Boolean.valueOf(true);
     }
     return Boolean.valueOf(false);
   }
   
   String give_extension(String type)
   {
     String gives = "NOTHING";
     if (type.toLowerCase().matches("javascript")) {
       gives = ".js";
     }
     if (type.toLowerCase().matches("xhtml")) {
       gives = ".xhtml";
     }
     if (type.toLowerCase().matches("css")) {
       gives = ".css";
     }
     if (type.toLowerCase().matches("plain")) {
       gives = ".txt";
     }
     if (type.toLowerCase().matches("xml")) {
       gives = ".xml";
     }
     if (type.toLowerCase().matches("javaserverpage")) {
       gives = ".jsp";
     }
     if (type.toLowerCase().matches("apache")) {
       gives = ".asp";
     }
     if (type.toLowerCase().matches("vbscript")) {
       gives = ".vbs";
     }
     if (type.toLowerCase().matches(" ")) {
       gives = ".usk";
     }
     if (type.toLowerCase().matches("javafile")) {
       gives = ".java";
     }
     if (type.toLowerCase().matches("jar")) {
       gives = ".jar";
     }
     if (type.toLowerCase().matches("javaarchive")) {
       gives = ".jar";
     }
     if (type.toLowerCase().matches("data")) {
       gives = ".dat";
     }
     if (type.toLowerCase().matches("c")) {
       gives = ".C";
     }
     if (type.toLowerCase().matches("c++")) {
       gives = ".cpp";
     }
     if (type.toLowerCase().matches("php")) {
       gives = ".php";
     }
     return gives;
   }
 }



