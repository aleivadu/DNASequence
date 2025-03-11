public class Main {
    public static void main(String[] args) {
        String dna1 = "ATGCGAATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTTACTGA";

        String dna = dna1;

        int startCodonIndex = dna.indexOf("ATG");
        int endCodonIndex = dna.indexOf("TGA");

        System.out.println(startCodonIndex);
        System.out.println(endCodonIndex);
        System.out.println(dna.substring(startCodonIndex + 3, endCodonIndex).length());
        if (startCodonIndex != -1 && endCodonIndex != -1 && (endCodonIndex - startCodonIndex + 3) % 3 == 0){
           String protein = dna.substring(startCodonIndex + 3, endCodonIndex);
            System.out.println("protein:" + protein);
        }else {
            System.out.println("No protein");
        }
    }
}
