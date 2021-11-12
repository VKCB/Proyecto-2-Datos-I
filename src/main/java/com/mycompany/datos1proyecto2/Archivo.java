/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datos1proyecto2;

/**
 *
 * @author Valerine
 */

import com.opencsv.CSVWriter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Archivo {
    
    private static final String PATH = "C:\\Users\\Valerine\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto-2-Datos-I\\src\\main\\java\\com\\mycompany\\datos1proyecto2\\Datos.csv";

    public static void main(String[] args) throws IOException {
        List list = new ArrayList();

        
        CSVWriter writer = new CSVWriter(new FileWriter(PATH));
        
        String Dato[] = {"4", "8(5+2)"};
        
        list.add(Dato);

        writer.writeAll(list);
        writer.flush();


    }
}
