import java.util.Arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int altitude=0;
        int highestAltitude=0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];

            if (altitude > highestAltitude) {
                highestAltitude = altitude;
            }
        }
        System.out.println(Arrays.toString(gain));
        System.out.println("The Highest Altitude is : "+ highestAltitude);
    }
}
