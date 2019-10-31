class Darts {
    private double x;
    private double y;
    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double answer = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (answer <= 1){
            return 10;
        }

        else if( answer <= 5){
            return 5;
        }

        else if (answer <= 10){
            return 1;
        }

        else{
            return 0;
        }
    }

}
