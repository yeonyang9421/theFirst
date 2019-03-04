package oop;

public abstract class  TangibleAsset extends Asset implements  Thing{
String magagerName;

    @Override
    public void getWeight() {
    }

    @Override
    public int setWeight(int weight) {
        return weight;
    }

    @Override
    public void manageFund() {
        System.out.println(this.magagerName + "이 펀드를 관리합니다,");
    }
}



