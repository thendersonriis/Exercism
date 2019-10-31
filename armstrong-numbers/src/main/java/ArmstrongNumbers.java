import java.util.ArrayList;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int ans = 0;
		String num = String.valueOf(numberToCheck);
		String[] a = num.split("");
		int length = String.valueOf(numberToCheck).length();
		for (int x = 0; x < length; x++){

			ans += Math.pow(Integer.valueOf(a[x]), length);
		}

		if (ans == numberToCheck){
			return true;
		}

		return false;
		
	}

}
