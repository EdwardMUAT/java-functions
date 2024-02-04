import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        // Display a description of this app to the user
        System.out.println("*** The Silent Asylum ***");
        
        // Start the game
        introduction();
        chapter1();
    }

    public static void introduction() {
        System.out.println("You awaken in an abandoned asylum. Silence is the key to survival.");
        System.out.println("Explore, avoid threats, and solve puzzles to uncover dark secrets.\n\n");
    }

    public static void chapter1() {
        System.out.println("Chapter 1: Awakening");
        System.out.println("You stand in a dimly lit room. The only exit is a creaking door.\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Open the door and venture into the hallway.\n2. Inspect the faded paintings.\nYour choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            chapter2();
        } else if (choice.equals("2")) {
            System.out.println("You inspect the faded paintings, gaining insight into the asylum's history.\n\n");
            chapter2();
        } else {
            System.out.println("Invalid choice. Please try again.");
            chapter1();
        }
    }

    public static void chapter2() {
        System.out.println("Chapter 2: The Silent Hallways");
        System.out.println("The hallway is long and poorly lit. Doors line both sides. The silence is oppressive.\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Quietly explore the rooms.\n2. Move stealthily down the hallway.\nYour choice:");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("You explore the rooms, finding useful items and clues.\n\n");
            chapter3();
        } else if (choice.equals("2")) {
            System.out.println("You move stealthily down the hallway, avoiding attention.\n\n");
            chapter3();
        } else {
            System.out.println("Invalid choice. Please try again.");
            chapter2();
        }
    }

    public static void chapter3() {
        System.out.println("Chapter 3: Unseen Threats");
        System.out.println("Shadows dance at the edge of your vision. Unseen threats lurk. You must rely on your instincts.\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Hide in the shadows.\n2. Confront the unseen threat.\nYour choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("You hide in the shadows, avoiding detection.");
            chapter4();
        } else if (choice.equals("2")) {
            System.out.println("You confront the unseen threat, seeking a way to neutralize it.\n\n");
            chapter4();
        } else {
            System.out.println("Invalid choice. Please try again.");
            chapter3();
        }
    }

    public static void chapter4() {
        System.out.println("Chapter 4: Puzzle of the Past");
        System.out.println("You come across a locked door with an ancient-looking keypad. Solve the puzzle to progress.\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Examine the room for hidden clues.\n2. Attempt to brute force the keypad.\nYour choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("You examine the room, finding clues to solve the puzzle.");
            chapter5();
        } else if (choice.equals("2")) {
            System.out.println("You attempt to brute force the keypad, risking detection.");
            chapter5();
        } else {
            System.out.println("Invalid choice. Please try again.");
            chapter4();
        }
    }

    public static void chapter5() {
        System.out.println("Chapter 5: Dark Secrets Unveiled");
        System.out.println("You unlock the door, revealing a hidden chamber with dusty files and forgotten memories.\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Investigate the files.\n2. Escape the hidden chamber.\nYour choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("You investigate the files, uncovering dark secrets about the asylum's history.");
            System.out.println("Congratulations! You've completed The Silent Asylum.\n\n");
        } else if (choice.equals("2")) {
            System.out.println("You escape the hidden chamber, continuing your exploration.");
            System.out.println("Congratulations! You've completed The Silent Asylum.\n\n");
        } else {
            System.out.println("Invalid choice. Please try again.");
            chapter5();
        }
    }
}
