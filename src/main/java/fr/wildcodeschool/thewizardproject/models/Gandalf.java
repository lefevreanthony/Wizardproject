package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
    private Outfit myOutfit;
    @Override
    public String giveAdvice(){
        return "you shall not pass !";
    }
    @Override
    public String changeDress(){
        return this.myOutfit.describesOutfit();
    }
    public Gandalf(Outfit theOutfit){
        myOutfit = theOutfit;
    }
}