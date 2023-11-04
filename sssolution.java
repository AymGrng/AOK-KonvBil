import java.util.Scanner;

public class sssolution {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String nama1, nama2, pil1, pil2;

        nama1 = input.next();
        pil1 = input.next();
        nama2 = input.next();
        pil2 = input.next();
        
        if(pil1.equals(pil2)){
            System.out.println(nama1+" dan "+ nama2+" seri");
        } else
        if(pil1.equals("kertas")&&pil2.equals("batu")||pil1.equals("gunting")&& pil2.equals("kertas")||pil1.equals("batu")&& pil2.equals("gunting")){
            System.out.println(nama1+ " menang");
        } else {
            System.out.println(nama2+" menang");
        }

    }
}
