package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {
    private Outfit myOutfit;
    @Override
    public String giveAdvice(){
        return "It does not do to dwell on dreams and forget to live, remember that.";
    }
    @Override
    public String changeDress(){
        return this.myOutfit.describesOutfit();
    }
    public Dumbledore(Outfit theOutfit){
        myOutfit = theOutfit;
    }
}