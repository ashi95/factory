/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;
/**
 *
 * @author alucard
 */
public class Project1 {

    public static void filter(String hel)
    {
     
        int cptV=0,cptC=0,cptW=0,cptS=0;
        char ch;
         
        for(int i=0;i<hel.length();i++)
        {
            ch=hel.charAt(i);
           
            
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||ch == 'I' 
                    || ch == 'o' || ch == 'O' || ch == 'u' || ch=='U')
            
            {
                cptV++;
            }
            
            
            else if (Character.isWhitespace(ch))
            {
                cptW++;
            }
            
            
        
            
            else if (ch=='z'||ch=='Z'||ch=='r'||ch=='R'||ch=='t'||ch=='T'||ch=='p'||ch=='P'||
                    ch=='q'||ch=='Q'||ch=='s'||ch=='S'||ch=='d'||ch=='D'||ch=='F'||ch=='g'||ch=='G'||
                            ch=='h'||ch=='H'||ch=='j'||ch=='J'||ch=='k'||ch=='K'||ch=='l'||ch=='L'||
                                    ch=='m'||ch=='M'||ch=='w'||ch=='W'||ch=='x'||ch=='X'||ch=='c'||
                                            ch=='C'||ch=='v'||ch=='V'||ch=='b'||ch=='B'||ch=='n'||ch=='N')
            {
                    cptC++;
                    }
            else{
                    cptS++;
                    }
        }
        
        System.out.println("nombre de voyelle " +cptV);
        System.out.println("nombre de consomme " +cptC);
        System.out.println("nombre d'espace " +cptW);
        System.out.println("nombre de mots " +(cptW+1));
         System.out.println("nombre de caractere special " +cptS);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
       
    String hel;
    Scanner sc = new Scanner(System.in);
    System.out.println("veuillez saisir une phrase s'il vous plait");
    hel=sc.nextLine();
    filter(hel);
    
            
        
}
}