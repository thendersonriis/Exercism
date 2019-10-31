class RnaTranscription {
    /* Loops through the dnaStrand string and transcribes each character to the
     * correct character. G -> C, C -> G, T -> A, A -> U
     */
    String transcribe(String dnaStrand) {
        String answer = "";
        for (int x = 0; x < dnaStrand.length(); x++){
            switch(dnaStrand.charAt(x)){
                case 'C':
                    answer += 'G';
                    break;

                case 'G':
                    answer += 'C';
                    break;

                case 'T':
                    answer += 'A';
                    break;

                case 'A':
                    answer += 'U';
                    break;
            }
        }
        return answer;

    }

}
