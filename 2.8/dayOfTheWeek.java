import java.util.Scanner;

public class DayOfWeek
{
    public static void main (String args[])
    {
        new DayOfWeek ();
    }

    public DayOfWeek ()
    {
        Scanner scanner = new Scanner(System.in);
        char notend = 'y';
        while (notend != 'n')
        {
            System.out.println("Enter day: ");
            String day = scanner.next();
            System.out.println ("Planet: " + planet (day));
            System.out.println ("In French: " + French(day));
            System.out.println("In Germanic Language: " + Germanic(day));
            System.out.println("In ISO: " + ISO(day));
            System.out.println("Child: " + Bday(day));
            System.out.println("Enter another day of the week? (y/n) ");
            notend = scanner.next().charAt(0);
        }
        System.out.println ("Thanks for entering days!");
    }
    public String planet (String d)
    {
        if (d.equalsIgnoreCase ("Monday"))
            return "Diana, the Moon";
        else if (d.equalsIgnoreCase ("Tuesday"))
            return "Mars";
        else if (d.equalsIgnoreCase ("Wednesday"))
            return "Mercury";
        else if (d.equalsIgnoreCase ("Thursday"))
            return "Jupiter";
        else if (d.equalsIgnoreCase ("Friday"))
            return "Venus";
        else if (d.equalsIgnoreCase ("Saturday"))
            return "Saturn";
        else if (d.equalsIgnoreCase ("Sunday"))
            return "Apollo, the Sun";
        else
            return "Error, incorrect date";
    }
    public String French (String f)
    {
        if (f.equalsIgnoreCase ("Monday"))
            return "Lundi";
        else if (f.equalsIgnoreCase ("Tuesday"))
            return "Mardi";
        else if (f.equalsIgnoreCase ("Wednesday"))
            return "Mercredi";
        else if (f.equalsIgnoreCase ("Thursday"))
            return "Jeudi";
        else if (f.equalsIgnoreCase ("Friday"))
            return "Vendredi";
        else if (f.equalsIgnoreCase ("Saturday"))
            return "Samedi";
        else if (f.equalsIgnoreCase ("Sunday"))
            return "Dimanche";
        else
            return "Error, incorrect date";
    }
    public String Germanic (String g)
    {
        if (g.equalsIgnoreCase ("Monday"))
            return "Mani's Day";
        else if (g.equalsIgnoreCase ("Tuesday"))
            return "Tiw's Day";
        else if (g.equalsIgnoreCase ("Wednesday"))
            return "Woden's Day";
        else if (g.equalsIgnoreCase ("Thursday"))
            return "Thor's Day";
        else if (g.equalsIgnoreCase ("Friday"))
            return "Frigga's Day";
        else if (g.equalsIgnoreCase ("Saturday"))
            return "No Saturday";
        else if (g.equalsIgnoreCase ("Sunday"))
            return "Sol's Day";
        else
            return "Error, incorrect date";
    }
    public String ISO (String i)
    {
        if (i.equalsIgnoreCase ("Monday"))
            return "Day 1";
        else if (i.equalsIgnoreCase ("Tuesday"))
            return "Day 2";
        else if (i.equalsIgnoreCase ("Wednesday"))
            return "Day 3";
        else if (i.equalsIgnoreCase ("Thursday"))
            return "Day 4";
        else if (i.equalsIgnoreCase ("Friday"))
            return "Day 5";
        else if (i.equalsIgnoreCase ("Saturday"))
            return "Day 6";
        else if (i.equalsIgnoreCase ("Sunday"))
            return "Day 7";
        else
            return "Error, incorrect date";
    }
    public String Bday (String b)
    {
        if (b.equalsIgnoreCase ("Monday"))
            return "Monday's child is fair of face,";
        else if (b.equalsIgnoreCase ("Tuesday"))
            return "Tuesday's child is full of grace;";
        else if (b.equalsIgnoreCase ("Wednesday"))
            return "Wednesday's child is full of woe,";
        else if (b.equalsIgnoreCase ("Thursday"))
            return "Thursday's child has far to go;";
        else if (b.equalsIgnoreCase ("Friday"))
            return "Friday's child is loving and giving,";
        else if (b.equalsIgnoreCase ("Saturday"))
            return "Saturday's child works hard for its living;";
        else if (b.equalsIgnoreCase ("Sunday")) // I'm pretty sure Sabbath is Saturday
            return "But the child that is born on the Sabbath day\n" +
                    "Is bonny and blithe as all do say.";
        else
            return "Error, incorrect date";
    }
}
