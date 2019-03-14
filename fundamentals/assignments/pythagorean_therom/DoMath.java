import java.lang.Math;

public class DoMath{
    public double calculateHypotenuse(int legA, int legB){
        double sumLegs = legA * legA + legB * legB;
        double answer = Math.sqrt(sumLegs);
        return answer;
    }
}

