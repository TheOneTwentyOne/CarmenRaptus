module com.systems.petrichor.carmenraptus {

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    //requires transitive javafx.web;
    //requires transitive com.google.gson;

    opens com.systems.petrichor.carmenraptus;
    exports com.systems.petrichor.carmenraptus;
}