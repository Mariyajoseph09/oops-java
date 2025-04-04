import java.util.Arrays;
import java.util.Scanner;

class StringSorter {
    protected String[] strings;

    public void inputStrings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();
    }
}

class StringSortersub extends StringSorter {
    public void sortAndDisplay() {
        Arrays.sort(strings);
        System.out.println("\nSorted Strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        StringSortersub sorter = new StringSortersub();
        sorter.inputStrings();
        sorter.sortAndDisplay();
    }
}

