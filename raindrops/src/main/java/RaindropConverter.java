class RaindropConverter {

    String convert(int number) {
        String answer = "";
        if (isMultipleOf3(number)){
            answer += "Pling";
        }

        if (isMultipleOf5(number)){
            answer += "Plang";
        }

        if (isMultipleOf7(number)){
            answer += "Plong";
        }
        if (answer == ""){
            return String.valueOf(number);
        }

        return answer;

    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf7(int number) {
        return number % 7 == 0;
    }

}
