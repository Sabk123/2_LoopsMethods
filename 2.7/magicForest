import java.util.Scanner;

public class SuperHappyMagicForest {
    public static void main(String args[]) {
        new SuperHappyMagicForest();
    }

    public SuperHappyMagicForest() {
        System.out.println("Welcome to the SUPER HAPPY MAGIC FOREST!!!\n");
        System.out.println("Here everybody enjoys picnics, fun, and dancing all year round.");
        System.out.println("Enjoy the rainbows, sunshine and good times.\n");
        OldOak();
    }

    public void OldOak() {
        System.out.println("You have found the OLD OAK.");
        System.out.println("If it is wisdom to you seek, well, you might have some luck.");
        System.out.println("It is the wisest oak tree in the whole forest.");
        System.out.println("If you just want acorns, there's a bunch of those too. \n");
        System.out.println("Where would you like to go next?");
        System.out.println("(p) Pixie Housing");
        System.out.println("(h) Happy Bunnies");
        System.out.println("(r) Rainbow Falls");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'p')
            PixieHousing();
        else if (Character.toLowerCase(choice) == 'h')
            HappyBunnies();
        else
            RainbowFalls();
    }

    public void PixieHousing() {
        System.out.println("Welcome to Pixie Housing");
        System.out.println("If it is their dust you seek, they will not give it to outsiders.");
        System.out.println("You may try and gain their trust in order to get their dusts.");
        System.out.println("Where would you like to go next?");
        System.out.println("(o) Old Oak Forest");
        System.out.println("(l) Lollipop Pond");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'o')
            OldOak();
        else
            LollipopPond();
    }

    public void HappyBunnies() {
        System.out.println("You've came to Happy Bunnies.");
        System.out.println("Here is the place where bunnies roam freely and happily.");
        System.out.println("Without any worries or strife.");
        System.out.println("Where would you like to go next?");
        System.out.println("(o) Old Oak");
        System.out.println("(n) Never Ending Picnic");
        System.out.println("(m) Magic Stones");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'o')
            OldOak();
        else if (Character.toLowerCase(choice) == 'n')
            NeverEndingPicnic();
        else
            MagicStones();
    }

    public void RainbowFalls() {
        System.out.println("Welcome to Rainbow Falls");
        System.out.println("This is a place only accessible via Old Oak");
        System.out.println("This hidden gem is an astonishing landmark, renowned for the Rainbow Waterfalls");
        System.out.println("We should pack up and go back to Old Oak now, in order to continue our journey");
        System.out.println();
        OldOak();
    }

    public void ButterflyHorse() {
        System.out.println("Welcome to Butterfly Horse.");
        System.out.println("Whilst you might think of a landscape of butterfly's and horses, you are most assuredly wrong.");
        System.out.println("After a genetic mutation, Horses have suddenly grown butterfly like wings, as well as hostility towards outsiders.");
        System.out.println("Look up.");
        System.out.println("I'm sure that's quite a sight to behold, we should leave back to Lollipop Pond before they spot us and attack us.");
        LollipopPond();
    }

    public void LollipopPond() {
        System.out.println("Welcome to Lollipop Pond.");
        System.out.println("This is a place where there are Lollipops for trees, and ponds galore.");
        System.out.println("You should taste the trees!");
        System.out.println("Where would you like to go next?");
        System.out.println("(p) Pixie Housing");
        System.out.println("(b) Butterfly Horse");
        System.out.println("(d) Dancing Fields");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'p')
            PixieHousing();
        else if (Character.toLowerCase(choice) == 'b')
            ButterflyHorse();
        else
            DancingFields();
    }

    public void DancingFields() {
        System.out.println("Welcome to Dancing Fields.");
        System.out.println("Everyone who steps foot in this field has a sudden sensation to start dancing.");
        System.out.println("I can see your feet starting to move.");
        System.out.println("We should probably leave before we get too embroiled in the dancing, where would you like to go?");
        System.out.println("(l) Lollipop Pond");
        System.out.println("(c) Mystical Crystals of Life");
        System.out.println("(b) Best Fishing Ponds");
        System.out.println("(m) Magic Stones");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'l')
            LollipopPond();
        else if (Character.toLowerCase(choice) == 'c')
            MysticalCrystalsOfLife();
        else if (Character.toLowerCase(choice) == 'b')
            BestFishingPond();
        else
            MagicStones();

    }

    public void BestFishingPond() {
        System.out.println("This is just the best fishing place... Nothing else to it...");
        System.out.println("Where would you like to go next?");
        System.out.println("(m) Magic Stones");
        System.out.println("(d) Dancing Fields");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'm')
            MagicStones();
        else
            DancingFields();
    }

    public void MysticalCrystalsOfLife() {
        System.out.println("A few small pieces of these crystals can cause temporary relief all diseases one may have.");
        System.out.println("A consequence for taking this is that it comes back stronger.");
        System.out.println("Take it if you dare.");
        System.out.println("We should exit this cave back the way we came from.");
        DancingFields();
    }

    public void MagicStones() {
        System.out.println("These stones are magic.");
        System.out.println("If you eat a stone, then you'll gain a power for 24 hours, but you'll be paralyzed for a week after taking it");
        System.out.println("You can only take it once a year");
        System.out.println("Where do you want to go next?");
        System.out.println("(d) Dancing Fields");
        System.out.println("(b) Best Fishing Pond");
        System.out.println("(c) Cotton Candy Cave");
        System.out.println("(h) Happy Bunnies");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'd')
            DancingFields();
        else if (Character.toLowerCase(choice) == 'b')
            BestFishingPond();
        else if (Character.toLowerCase(choice) == 'c')
            CottonCandyCave();
        else
            HappyBunnies();

    }

    public void CottonCandyCave() {
        System.out.println("OH MY GOD THERE IS SO MUCH COTTON CANDY!");
        System.out.println("I mean, this cave is full of Cotton Candy.");
        System.out.println("We should get going before I eat it all");
        System.out.println("Where would you like to go next?");
        System.out.println("(m) Magic Stones");
        System.out.println("(n) Never Ending Picnic");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'm')
            MagicStones();
        else
            NeverEndingPicnic();
    }

    public void NeverEndingPicnic() {
        System.out.println("In this field, there are robots that can read your mind and give you what food you want.");
        System.out.println("A teeny tiny side effect is there is a chance it's poisoned and you'll die.");
        System.out.println("I wouldn't risk this... We should leave.");
        System.out.println("Where should we go next?");
        System.out.println("(c) Cotton Candy Cave");
        System.out.println("(h) Happy Bunnies");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        System.out.println();
        if (Character.toLowerCase(choice) == 'c')
            CottonCandyCave();
        else
            HappyBunnies();
    }
    // this felt more like a writing assignment
}
