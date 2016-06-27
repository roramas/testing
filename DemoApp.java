package app.driver;

import gui.SentiWordGUI;
import java.io.IOException;
import text.emotion.SentiWordNet;

public class DemoApp {

    public static void main(String[] args) throws IOException {
        String pathToSWN = "SentiWordNet.txt";
        new SentiWordGUI(pathToSWN).setVisible(true);
        /*
        SentiWordNet sentiwordnet = new SentiWordNet(pathToSWN);

        String cadPos = "winner great champion happy work";
        String cadNeg = "looser bad word";
        
        System.out.println(sentiwordnet.getPNPolarity(
                sentiwordnet.extractSentence(cadPos)));
        System.out.println(sentiwordnet.getPNPolarity(
                sentiwordnet.extractSentence(cadNeg)));
        System.out.println("good#a "+sentiwordnet.extract("good"));
        System.out.println("bad#a "+sentiwordnet.extract("bad"));*/
	//System.out.println("blue#a "+sentiwordnet.extract("bluex"));
	//	System.out.println("blue#n "+sentiwordnet.extract("blue"));
    }
}
