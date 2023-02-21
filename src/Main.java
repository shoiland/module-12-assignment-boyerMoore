import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharSequence text = "srhksmgsrhkrhrhhhstosrksrhxsrhkrhddkddfssssdsrhhhhhdshdkm";
        CharSequence pattern = "srhkrh";
        CharacterComparator comparator = new CharacterComparator();
        List<Integer> counts = PatternMatching.boyerMoore(pattern, text, comparator);
        System.out.println(counts);

    }
}

//Todo: The charaactet comparator is there to allow us to see how many times you have called compare()
//Todo: