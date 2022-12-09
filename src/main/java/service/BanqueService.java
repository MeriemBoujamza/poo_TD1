package service;

import com.google.gson.Gson;
import model.Compte;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

public class BanqueService {

    private static String FILE_PATH = "C:\\Users\\kazah\\OneDrive\\Bureau\\A7 - S7- ENSIM\\TD1_POO\\test.txt";
    private static final Logger logger = LogManager.getLogger("BankLogger");



    public ArrayList<Compte> sortBySolde(ArrayList<Compte> comptes){
        Collections.sort(comptes);
        logger.info("bank accounts are being sorted");
        return comptes;
    }

    public void writeJson(Compte compte){
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            Gson gson = new Gson();
            String compteJson = gson.toJson(compte);
            fileWriter.append(compteJson);
            fileWriter.close();

        } catch (IOException e) {
            logger.error("error while writing the object compte to the json file");
            throw new RuntimeException(e);
        }


    }
}
