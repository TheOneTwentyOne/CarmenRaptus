package com.systems.petrichor.carmenraptus;

import javafx.application.Application;

public class DownloaderDriver {

    public static void main(String[] args) {
        try {
            Application.launch(DownloaderApp.class, args);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
