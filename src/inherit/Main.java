/*************************
 *
 *  @description The main class that will run test use cases for my Player and PlayerV2 classes
 *
 *  @author Ravi Chandra Rachamalla rach0022@algonquinlive.com
 *
 *  @version Mar 3, 2020
 *
 ***********************/

package inherit;

public class Main {
    public static void main(String[] args) {
//        Player p1 = new Player();
//        Player p2 = new Player("Grodin", "Viking", false, 32433, (short) 88, (short) 18, 23.7f);
//        p1.setName("Jacobian Jones");
//        p1.output();
//        p2.output();


        //the new keyword in java allows us to create an instance of some class or interface
        //this allows us to then use that instance of the object to run whatever code or functions
        //we need it for. The class file itself is not enough as we need to create the new instance of it first
        PlayerV2 p3 = new PlayerV2();
        PlayerV2 p4 = new PlayerV2("Nyarlathotep", "rEbEL", true, 45312, (short) 10, (short) 700, 55.8f, "ANCient ONES", (short) 180, (short) 89, (short) 5, -3242342);
        p3.output();
        p4.output();
        System.out.println("\n" + p3.getTitle());
        System.out.println(p4.getTitle());
    }
}

/* Reflection Comments:
    1.  I feel as though this is more organized code versus the version we made in c++. using different class
        files to keep all of the functionality of the base Player class was a good idea because if we wanted to go
        back and make a PlayerX class that had all different fields and methods that we didnt have in the PlayerV2
        we can just extend again from the player class or we could even go as far as to make a playerV3 that extends of the
        functionality of PlayerV2. The skies the limit

    2.  I like the keywords better in java, super is just such a fun keyword to use constantly while making a program. although
        C++ has some better keywords like vector.

    3.  I'm not sure what i don't like about java yet, its been few years since I have last touched the language, so I am waiting
        patiently to learn and see if there are any enw changes that null my old dislikes of java. Although I do dislike having to cast
        a short in a constructor, while I understand its safer I feel as though its tedious and annoying to write.

    4.  I like Inheritance, it keeps code clean and efficient. It allows you to target to change parts of a program without
        breaking other parts or add new features while keep the separate files themselves small and legible to a person.

    5.  I am excited to see where we go in future assignments now that we have all this base functionality for the player class.
        Im hoping we make a simulation type program where we compete different player objects and output the results in a fun way.
 */