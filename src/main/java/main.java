import Flowers.bucket;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        colours my_colour = colours.RED;
        flover fl = new flover();
        fl.setPrice(10);
        fl.setColour(my_colour);
        fl.setType(flowers_types.Romashka);
        bucket bucket = new bucket();
        for (int i = 0; i < 5; i++) {
            bucket.addFlower(fl);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! \n You want to order our bouqets(Enter 1) or create yours(Enter 0) ?");
        System.out.println("Our current proposition:"+bucket.getFlovers()+ "\n Price"+bucket.getBouqPrice());
        int decision = sc.nextInt();
        if (decision == 1){
            System.out.println("Congrats! YOu have ordered our brilliant bouqet!");

        } else if (decision == 0){
            System.out.println("Enter name of type of the flower");
            Scanner sc1 = new Scanner(System.in);
            String type = sc1.nextLine();
            if (type.equals("Ромашка")){
                System.out.println("Your order:"+bucket.getFlovers()+ "\n Price"+bucket.getBouqPrice());
            } else  if (type.equals("Тюльпан")) {
                colours my_colour1 = colours.RED;
                flover fl1 = new flover();
                fl1.setPrice(18);
                fl1.setColour(my_colour1);
                fl1.setType(flowers_types.Tulpan);
                bucket bucket1 = new bucket();
                for (int i = 0; i < 5; i++) {
                    bucket1.addFlower(fl1);
                }
                System.out.println("Your order:" + bucket1.getFlovers() + "\n Price" + bucket1.getBouqPrice());
            } else  if (type.equals("Троянда")) {
                colours my_colour1 = colours.RED;
                flover fl1 = new flover();
                fl1.setPrice(30);
                fl1.setColour(my_colour1);
                fl1.setType(flowers_types.Troyanda);
                bucket bucket1 = new bucket();
                for (int i = 0; i < 5; i++) {
                    bucket1.addFlower(fl1);
                }
                System.out.println("Your order:" + bucket1.getFlovers() + "\n Price" + bucket1.getBouqPrice());
            } else  if (type.equals("Роза")) {
                colours my_colour1 = colours.RED;
                flover fl1 = new flover();
                fl1.setPrice(20);
                fl1.setColour(my_colour1);
                fl1.setType(flowers_types.Rosa);
                bucket bucket1 = new bucket();
                for (int i = 0; i < 5; i++) {
                    bucket1.addFlower(fl1);
                }
                System.out.println("Your order:" + bucket1.getFlovers() + "\n Price" + bucket1.getBouqPrice());
            }
            }

    }

}
