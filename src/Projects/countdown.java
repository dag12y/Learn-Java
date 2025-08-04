package Projects;

import javax.imageio.spi.ImageInputStreamSpi;
import java.util.Scanner;

public class countdown {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);

        int start;
        String message;

        System.out.print("Enter the Start number : ");
        start=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the message you want to display after the countdown : ");
        message=scanner.nextLine();

        for(int i=start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println(message);
    }

}
