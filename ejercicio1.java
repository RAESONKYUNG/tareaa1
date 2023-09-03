
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
    // 		ejercicio  1a
    if (6 < 6*5) 
    System.out.print("Hello"); 
    System.out.print(" There");
    
    //   Respuesta : Hello 
   //    There
   
   
    //          1b
    int x=1, y=2, z=3;
   if(x>y)
   if(x>z)
    System.out.println("1111");
  else
    System.out.println("2222");
    // Respuesta : no imprime nada
    
    
    //       1c
    int x=1, y=2, z=3;
    
    if (x < z)
    System.out.println("*");
    else if (x == 2) System.out.println("&");
  else
    System.out.println("$");
    //   Respuesta : *
    
    
    //      1d
    int x=1, y=2, z=3;
    
    if(x<y)
    System.out.println("####");
    else
    System.out.println("&&&&");
    System.out.println("****");
    //   Respuesta : ####
    //               ****
    
    
    
    //     1e
    int x=1, y=2, z=3;
    if(x>y)
    System.out.println("####");
    else {
    System.out.println("&&&&");
    System.out.println("****");
    }
    // Respuesta : &&&&
    //             ****
    
    
    
    //    1f
    int al=100; int a2=200;
    if(al>100 && a2<=200)
    System.out.print(al+" "+a2+" "+(al+a2)); 
    else
    System.out.print(al+" "+a2+" "+(2*al-a2));
    // Respuesta : 100 200 200
    
    
    //    1g
    int x=1, y=2, z=3;
    if(++x > y++ || x--> 0)
    z++;
    else
    z--;
    System.out.println(x+" "+y+" "+z);
    // Respuesta : 1 3 4
    
    
    
    //    1h
    int x=1, y=2, z=3;
    if(x<y){
    System.out.println("####");
    System.out.println("****");
    }
    else
    System.out.println("&&&&");
    // Respuesta : ####
    //             ****
    
    
    //    1i
    int x=1, y=2, z=3;
    if ('x' > 'y' || 66 > (int)('A'))
    System.out.println("#*#");
    // Respuesta : #*#
    
    
    
    //    1j
    int x=1, y=2, z=3;
    if (x < z) System.out.println("*");
    else if(x==2)
    System.out.println("&");
    else
    System.out.println("$");
    // Respuesta : *
    
	}
}
