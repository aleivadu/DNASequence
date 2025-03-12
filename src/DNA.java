public class DNA {
    public String dna;
    public String protein;

    public DNA(String sequence) {
        dna = sequence;
        protein = proteinSequence();
    }

    public boolean hasProtein() {
        int starCodonIndex = dna.indexOf("ATG");
        int endCodonIndex = dna.indexOf("TGA");

        return starCodonIndex != -1 && endCodonIndex != -1 && (endCodonIndex - starCodonIndex + 3) % 3 == 0;

    }

    public String proteinSequence() {
        if (hasProtein()) {
            protein = dna.substring(dna.indexOf("ATG") + 3, dna.indexOf("TGA"));
            System.out.println("!!!");
        } else {
            protein = "No protein";
        }
        return protein;
    }


}
