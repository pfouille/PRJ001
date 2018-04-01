package com.fouille.www;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVReader {
    
	private static final String SAMPLE_CSV_FILE_PATH = "./catalogue_program.csv";

    public static void load_csv() throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name : " + nextRecord[0]);
                System.out.println("Description : " + nextRecord[1]);
                System.out.println("==========================");
            }
        }
    }
}
