import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> translation = new ArrayList<>();
        for (int x = 0; x < rnaSequence.length();){
            String temp = "";
            temp += rnaSequence.charAt(x);
            temp += rnaSequence.charAt(x+1);
            temp += rnaSequence.charAt(x+2);
            if (temp.equals("AUG")){
                translation.add("Methionine");
            }
            else if (temp.equals("UUU") || temp.equals("UUC")){
                translation.add("Phenylalanine");
            }
            else if (temp.equals("UUA") || temp.equals("UUG")){
                translation.add("Leucine");
            }
            else if (temp.equals("UCU") || temp.equals("UCC") || temp.equals("UCA") || temp.equals("UCG")){
                translation.add("Serine");
            }
            else if (temp.equals("UAU") || temp.equals("UAC")){
                translation.add("Tyrosine");
            }
            else if (temp.equals("UGU") || temp.equals("UGC")){
                translation.add("Cysteine");
            }
            else if (temp.equals("UGG")){
                translation.add("Tryptophan");
            }
            else if (temp.equals("UAA") || temp.equals("UAG") || temp.equals("UGA")){
                break;
            }
            x+=3;
        }
        return translation;
    }
}