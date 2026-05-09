package LambdaExpression;

interface LightAction {
    void activate();
}

public class Ques1 {
    public static void main(String[] args) {

        LightAction motionLight = () ->
                System.out.println("Motion detected -> Hall lights ON");

        LightAction nightLight = () ->
                System.out.println("Night mode -> Dim lights activated");

        LightAction voiceLight = () ->
                System.out.println("Voice command -> Bedroom lights ON");

        motionLight.activate();
        nightLight.activate();
        voiceLight.activate();
    }
}