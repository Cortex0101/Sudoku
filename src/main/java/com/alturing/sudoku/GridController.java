package com.alturing.sudoku;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import org.controlsfx.control.spreadsheet.Grid;

public class GridController {
  @FXML
  private GridPane gridPane;


  public void onMouseEntered(MouseEvent mouseEvent) {
    Label label = (Label) mouseEvent.getSource();
    label.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    label.setText("test");
  }

  public void onMouseExited(MouseEvent mouseEvent) {
    Label label = (Label) mouseEvent.getSource();
    label.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
    label.setText("test");
  }


}
