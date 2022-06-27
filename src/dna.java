class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rna = new String();

        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='G')
                rna+="C";
            else if(dnaStrand.charAt(i)=='C')
                rna+="G";
            else if(dnaStrand.charAt(i)=='T')
                rna+="A";
            else
                rna+="U";
        }
        return rna;
    }

}

public class dna {

    public static void main(String[] args) {
        RnaTranscription obj = new RnaTranscription();
        System.out.println(obj.transcribe("GCTA"));
    }
}
