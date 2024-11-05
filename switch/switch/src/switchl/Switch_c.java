package switchl;

import java.util.Scanner;

public class Switch_c {
    public static void main(String[] args) {
        Scanner sw=new Scanner(System.in);
        System.out.print("enter a day name : ");
        String fill=sw.nextLine();
        switch (fill)
        {
            case "saturday" :
            System.out.println("go to cours and uneversity ");
            break;
            case "sanday" :
            System.out.println("football and english");
            break;
            case "monday" :
            System.out.println("programing and A+");
            break;
            case "thusday" :
            System.out.println("dancing and singinging");
            break;
            case "wednsday" :
            System.out.println("going to paghman");
            break;
            case "tursday" :
            System.out.println("swiming and english");
            break;
            case "friday" :
            System.out.println("washing the clothes and drama");
            break;
            default:
            System.out.println("pleas enter a day name");
            break;
        }
    }

}
