import dataBase.BDManager;
import dataBase.PersonEntity;

/**
 * Created by danil on 23.10.2017.
 */
public class Lab4{
    public static void main(String[]args){
        PersonEntity newPE = new PersonEntity();
        BDManager bdManager = new BDManager();
        newPE.setLogin("Vladick");
        newPE.setPersonHash(111L);
        PersonEntity peFromBD = bdManager.add(newPE);
        System.out.println(peFromBD);
    }
}
