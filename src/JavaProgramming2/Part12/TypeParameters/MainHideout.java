package JavaProgramming2.Part12.TypeParameters;

import JavaProgramming2.Part12.TypeParameters.TypeParameters.Hideout.Hideout;

public class MainHideout {
    public static void main(String[] args) {
//        Hideout<String> den = new Hideout<>();
//        System.out.println(den.isInHideout());
//        den.putIntoHideout("peekaboo");
//        System.out.println(den.isInHideout());
//        System.out.println(den.takeFromHideout());
//        System.out.println(den.isInHideout());
//        den.putIntoHideout("toodaloo");
//        den.putIntoHideout("heelloo");
//        System.out.println(den.isInHideout());
//        System.out.println(den.takeFromHideout());
//        System.out.println(den.isInHideout());

        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());

    }
}
