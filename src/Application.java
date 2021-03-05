import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik streetCat = new Kotik();
        Kotik homeCat = new Kotik(10,18,"Barsik","meow");
        homeCat.liveAnotherDay();
        System.out.println("My name is - '"+homeCat.getName()+"' and my weight - "+homeCat.getWeight()+" kg");
        System.out.println("MeowCompareEquals = "+streetCat.getMeuw().equalsIgnoreCase(homeCat.getMeuw()));
        System.out.println("MeowComapre'==' = "+streetCat.getMeuw().equalsIgnoreCase(homeCat.getMeuw()));
        System.out.println("Total amoutn of Kotik = "+Kotik.getAmountKotik());
    }
}
