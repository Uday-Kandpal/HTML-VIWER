 package html;
 
 import java.awt.Component;
 import java.io.PrintStream;
 
 public class Systems
 {
   public class Resolution
   {
     int X;
     int Y;
     Component c;
     
     public Resolution(int X, int Y)
     {
       Functions.File_Input("(" + X + "," + Y + ")", "C:\\HTML\\sys.res", this.c);
     }
   }
   
   void setResolution(int X, int Y)
   {
     Resolution r = new Resolution(X, Y);
   }
   
   int[] getResolution()
   {
     try
     {
       String XnY = Functions.File_Output("C:\\HTML\\sys.res");
       XnY = XnY.replace("(", "");
       String[] XY = XnY.split(",");
       int x = Integer.parseInt(XY[0]);
       int y = Integer.parseInt(XY[1]);
       int[] xy = { x, y };
       System.out.println("\nResolution applied : (" + xy[0] + "," + xy[1] + ");");
       return xy;
     }
     catch (Exception ex)
     {
       Functions.File_Input("(1024,768)", "C:\\HTML\\sys.res", null);
       int[] xy = { 1024, 768 };
       System.out.println("\nResolution applied : (" + xy[0] + "," + xy[1] + ");");
       return xy;
     }
   }
   
   void applyResolution(Component[] c)
   {
     for (int i = 0; i < c.length; i++) {}
   }
 }



