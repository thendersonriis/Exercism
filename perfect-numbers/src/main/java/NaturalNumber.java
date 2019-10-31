class NaturalNumber {
    private int number;
    public NaturalNumber(int i){
        if (i < 1){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        number = i;
    }


    public Classification getClassification() {
        if (number == 1){
            return Classification.DEFICIENT;
        }

        int classNum = 1;
        for (int x = 2; x < number; x++){
            if (number % x == 0){
                classNum+= x;
            }
        }

        if (classNum == number){
            return Classification.PERFECT;
        }

        else if(classNum > number){
            return Classification.ABUNDANT;
        }

        return Classification.DEFICIENT;
    }
}
