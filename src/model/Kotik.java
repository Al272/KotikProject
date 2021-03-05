package model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meuw;

    private static int amountKotik;

    public Kotik(int prettiness, int weight, String name, String meuw) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meuw = meuw;
        ++amountKotik;
    }
    public Kotik(){
        //dafault Kotik
        setPrettiness(1);
        setWeight(5);
        setName("noName");
        setMeuw("meow");
        ++amountKotik;
    }

    public int getPrettiness() {
        return prettiness;
    }

    private void setPrettiness(int prettiness) {
        this.prettiness += prettiness;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight>0 && weight<20)
        this.weight = weight;
        else
            System.out.println("Set correct weight!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.length()<2)
            System.out.println("Set correct name!");
        else
            this.name = name;
    }

    public String getMeuw() {
        return meuw;
    }

    public void setMeuw(String meuw) {
        this.meuw = meuw;
    }

    public static int getAmountKotik() {
        return amountKotik;
    }
    public boolean wantEat(){
        System.out.print("I want eat!!!");
        return false;
    }
    public boolean sleep() {
        if (getPrettiness()> 0) {
            setPrettiness(-1);
            System.out.println("Kotik sleep");
            return true;
        } else
           return wantEat();
    }
    public boolean walk () {
        if (getPrettiness() > 0) {
            setPrettiness(-2);
            System.out.println("Kotik walk");
            return true;
        } else
                return wantEat();
    }
        public boolean play () {
            if (getPrettiness() > 0) {
                setPrettiness(-3);
                System.out.println("Kotik play");
                return true;
            } else
                return wantEat();
        }
        public boolean catchMouse () {
            if (getPrettiness() > 0) {
                setPrettiness(-3);
                System.out.println("Kotik catch mouse");
                return true;
            } else
                return wantEat();
        }
        public boolean runAwayFromDog () {
            if (getPrettiness() > 0) {
                setPrettiness(-4);
                System.out.println("Kotik run away from dog");
                return true;
            } else
                return wantEat();
        }
        public void eat(int prettinessAmout){
            System.out.println(" -> Kotik eat");
            setPrettiness(prettinessAmout);
        }
    public void eat(int prettinessAmout,String food){
        System.out.print(" -> Kotik eat "+food+"\n");
        setPrettiness(prettinessAmout);
    }
    public void eat(){
       //default eat
        eat(1,"kitiKat");
    }
    public void liveAnotherDay(){
        for(int i=1; i<25; i++){
            System.out.print(i+" iteration -> ");
            int random = (int)(Math.random()*5)+1;
            switch (random){
                case 1 : if(!sleep())
                    eat();
                break;
                case 2 : if(!walk())
                    eat(random*2,"Fish");
                break;
                case 3 : if(!play())
                    eat(random*2);
                break;
                case 4 : if(!catchMouse())
                    eat(random,"Chicken");
                break;
                case 5 : if(!runAwayFromDog())
                    eat(random-2);
                break;
                default:
                    System.out.println("number in switch is not valid");
            }
        }
    }
}
