import java.math.BigInteger;

class Grains {
    /*takes the square and uses it as an exponent of 2. ex: 2^square-1*/
    BigInteger computeNumberOfGrainsOnSquare(final int square) {
        if (square > 0 && square < 65) {
            return BigInteger.TWO.pow(square - 1);
        }
        else{
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
    }
    /*Adds all grains on squares and returns it*/
    BigInteger computeTotalNumberOfGrainsOnBoard() {
        return BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
    }

}
