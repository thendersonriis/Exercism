
class Acronym {
    String acronym = "";
    Acronym(String phrase) {
        String[] phraseList = phrase.split("\\s|-|\\_");
        for (String x: phraseList) {
            if (!x.isEmpty()){
                acronym += x.charAt(0);
            }
        }
    }

    String get() {
        return acronym.toUpperCase();
    }

}
