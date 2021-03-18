package uk.co.bernardmcgeever;

public class Main {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        // Generic dna for testing
        String dna;
        dna = dna1;

        int dnaLength = dna.length();
        System.out.println("Length: " + dnaLength);

        // Start codon
        int dnaATGPossition = dna.indexOf("ATG");
        System.out.println("ATG: " + dnaATGPossition);

        // Stop codon
        int dnaTGAPossition = dna.indexOf("TGA");
        System.out.println("TGA: " + dnaATGPossition);

        // find the protein
        if (dnaATGPossition >= 0 && dnaTGAPossition > dnaATGPossition && (dnaATGPossition - dnaTGAPossition) % 3 == 0){
            String protein = dna.substring(dnaATGPossition, dnaTGAPossition + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein.");
        }

    }
}
