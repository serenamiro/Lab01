package it.polito.tdp.parole;

import it.polito.tdp.parole.model.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempi;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) {
    	long startTime = System.nanoTime();
    	elenco.cancella(txtResult.getSelectedText());
    	txtResult.clear();
    	txtTempi.clear();
    	for(String s : elenco.getElenco()) {
    		txtResult.appendText(s+"\n");
    	}
    	long elapsedNanos = System.nanoTime() - startTime;
    	txtTempi.appendText("Tempo impiegato per l'operazione: "+elapsedNanos+" nanosecondi.");
    }


    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	long startTime = System.nanoTime();
    	String p = txtParola.getText();
    	if(p.length() == 0) {
    		txtResult.appendText("INSERISCI UNA PAROLA.");
    		return;
    	}
    	txtTempi.clear();
    	txtResult.clear();
    	elenco.addParola(p);
    	txtParola.clear();
    	txtResult.clear();
    	for(String s : elenco.getElenco()) {
    		txtResult.appendText(s+"\n");
    	}
    	long elapsedNanos = System.nanoTime() - startTime;
    	txtTempi.appendText("Tempo impiegato per l'operazione: "+elapsedNanos+" nanosecondi.");
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	long startTime = System.nanoTime();
    	elenco.reset();
    	txtResult.clear();
    	txtTempi.clear();
    	long elapsedNanos = System.nanoTime() - startTime;
    	txtTempi.appendText("Tempo impiegato per l'operazione: "+elapsedNanos+" nanosecondi.");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
