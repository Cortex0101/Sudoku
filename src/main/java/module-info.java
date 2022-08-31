module com.alturing.sudoku {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.web;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.ikonli.javafx;
  requires eu.hansolo.tilesfx;

  opens com.alturing.sudoku to javafx.fxml;
  exports com.alturing.sudoku;
}