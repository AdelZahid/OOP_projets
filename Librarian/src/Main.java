import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Library {
    public String name;
    private int Id;

    Library(String name, int id) {
        this.name = name;
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}

interface Organize {
    void sortinID(List<Library> L);
}

class Block implements Organize {
    private char Blockname;
    private List<Library> Lib = new ArrayList<>();

    public List<Library> getLib() {
        return Lib;
    }

    public void addLib(Library lib) {
        // Ensure the library belongs to this block based on the first character of its name
        if (Character.toUpperCase(lib.name.charAt(0)) == Blockname) {
            Lib.add(lib);
        }
    }

    public Block(char blockname) {
        Blockname = blockname;
    }

    public char getBlockname() {
        return Blockname;
    }

    public void setBlockname(char blockname) {
        Blockname = blockname;
    }

    // Fixed sorting algorithm to sort in ascending order by ID
    @Override
    public void sortinID(List<Library> L) {
        for (int i = 0; i < L.size() - 1; i++) {
            for (int j = 0; j < L.size() - i - 1; j++) {
                if (L.get(j).getId() > L.get(j + 1).getId()) {
                    Library temp = L.get(j);
                    L.set(j, L.get(j + 1));
                    L.set(j + 1, temp);
                }
            }
        }
    }

    // Output method to display sorted libraries within a block
    public void printLibraries() {
        System.out.println("Block " + Blockname + ":");
        for (Library lib : Lib) {
            System.out.println("Library Name: " + lib.name + ", ID: " + lib.getId());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        Library[] L = new Library[n];
        Block[] B = new Block[26];
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            B[i] = new Block(ch);
        }
        for (int i = 0; i < n; i++) {
            String name = s.nextLine();
            int Id = Integer.parseInt(s.nextLine());
            L[i] = new Library(name, Id);
            char firstChar = Character.toUpperCase(name.charAt(0));
            if (firstChar >= 'A' && firstChar <= 'Z') {
                B[firstChar - 'A'].addLib(L[i]);
            }
        }
        s.close(); // Close the scanner

        // Sort and print the libraries in each block
        for (int i = 0; i < 26; i++) {
            B[i].sortinID(B[i].getLib());
            B[i].printLibraries();
        }
    }
}