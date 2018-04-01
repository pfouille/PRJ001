package com.fouille.www;

import java.io.IOException;

import org.json.*;
import com.opencsv.*;

public class PRJ001 {

	public static void main(String[] args) {
				
		try {
			OpenCSVReader.load_csv();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Application monApplication = new Application ("SUPER_PROGRAM", "Le super programme de la mort qui tue");

        JSONObject jsonObj = new JSONObject( monApplication );

        System.out.println( jsonObj );
		
	}
}
