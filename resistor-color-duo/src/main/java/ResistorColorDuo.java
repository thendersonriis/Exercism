class ResistorColorDuo {
    private static String[] answer = new String[10];
    private int limit = 2;
    public ResistorColorDuo(){
        answer[0] = "black";
        answer[1] = "brown";
        answer[2] = "red";
        answer[3] = "orange";
        answer[4] = "yellow";
        answer[5] = "green";
        answer[6] = "blue";
        answer[7] = "violet";
        answer[8] = "grey";
        answer[9] = "white";
    }
    int value(String[] colors) {
        String value = "";
        for (int x = 0; x < limit; x++){
            for (int y = 0; y < answer.length; y++){
                if (colors[x] == answer[y]){
                    value += y + "";
                }
            }
        }
        return Integer.valueOf(value);
    }
}
