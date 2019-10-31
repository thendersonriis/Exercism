class Hamming {
    private int ans = 0;
    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand == "" && rightStrand != ""){
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        else if (leftStrand != "" && rightStrand == ""){
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        else if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }


        for (int x = 0; x< leftStrand.length(); x++){
            if (leftStrand.charAt(x) != rightStrand.charAt(x)){
                ans++;
            }
        }

    }

    int getHammingDistance() {
        return ans;
    }

}
