package edu.citytech.cst.gui;

import java.util.Arrays;
import java.util.Collections;

import edu.citytech.cst.service.CounterService;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class CountController {

	@FXML
	private AnchorPane a_mainCount;

	@FXML
	private Label lblCell1;

	@FXML
	private Label lblCell2;

	@FXML
	private Label lblCell3;

	@FXML
	private Label lblCell4;

	@FXML
	private Label lblCell5;

	@FXML
	private Label lblCell6;

	@FXML
	private Label lblCell7;

	@FXML
	private Label lblCell8;

	@FXML
	private Label lblCell9;

	@FXML
	private Label lblCell10;

	@FXML
	private Label lblCell11;

	@FXML
	private Label lblCell12;

	@FXML
	private Label lblCell13;

	@FXML
	private Label lblCell14;

	@FXML
	private Label lblCell15;

	@FXML
	private Label lblCell16;

	@FXML
	private Label lblCell17;

	@FXML
	private Label lblCell18;

	@FXML
	private Label lblCell19;

	@FXML
	private Label lblCell20;

	@FXML
	private Label lblCell21;

	@FXML
	private Label lblCell22;

	@FXML
	private Label lblCell23;

	@FXML
	private Label lblCell24;

	@FXML
	private Label lblCell25;

	@FXML
	private Label lblCell26;

	@FXML
	private Label lblCell27;

	@FXML
	private Label lblCell28;

	@FXML
	private Label lblCell29;

	@FXML
	private Label lblCell30;

	@FXML
	private Label lblCell31;

	@FXML
	private Label lblCell32;

	@FXML
	private Label lblCell33;

	@FXML
	private Label lblCell34;

	@FXML
	private Label lblCell35;

	@FXML
	private Label lblCell36;

	@FXML
	private Label lblCell37;

	@FXML
	private Label lblCell38;

	@FXML
	private Label lblCell39;

	@FXML
	private Label lblCell40;

	@FXML
	private Label lblCell41;

	@FXML
	private Label lblCell42;

	@FXML
	private Label lblCell43;

	@FXML
	private Label lblCell44;

	@FXML
	private Label lblCell45;

	@FXML
	private Label lblCell46;

	@FXML
	private Label lblCell47;

	@FXML
	private Label lblCell48;

	@FXML
	private Label lblCell49;

	@FXML
	private Label lblCell50;

	@FXML
	private Label lblCell51;

	@FXML
	private Label lblCell52;

	@FXML
	private Label lblCell53;

	@FXML
	private Label lblCell54;

	@FXML
	private Label lblCell55;

	@FXML
	private Label lblCell56;

	@FXML
	private Label lblCell57;

	@FXML
	private Label lblCell58;

	@FXML
	private Label lblCell59;

	@FXML
	private Label lblCell60;

	@FXML
	private Label lblCell61;

	@FXML
	private Label lblCell62;

	@FXML
	private Label lblCell63;

	@FXML
	private Label lblCell64;

	@FXML
	private Label lblCell65;

	@FXML
	private Label lblCell66;

	@FXML
	private Button btn_abc;

	@FXML
	private Button btn_cba;

	@FXML
	private Button btn_123;

	@FXML
	private Button btn_321;

	@FXML
	private Label lbl_mode;

	@FXML
	private Button btn_clear;

	@FXML
	void btn_CountTo(MouseEvent event) {

		for (Node node : a_mainCount.getChildren()) {
			if (node instanceof Label) {

				((Label) node).setText("?");

			}
		}

	}
	

	@FXML
	void OnClick123(ActionEvent event) {

		String[] number = CounterService.getNumber123();
		
		Label[] cell = { lblCell1, lblCell2, lblCell3, lblCell4, lblCell5, lblCell6, lblCell7, lblCell8, lblCell9,
				lblCell10, lblCell11, lblCell12, lblCell13, lblCell14, lblCell15, lblCell16, lblCell17, lblCell18,
				lblCell19, lblCell20, lblCell21, lblCell22, lblCell23, lblCell24, lblCell25, lblCell26, lblCell27,
				lblCell28, lblCell29, lblCell30, lblCell31, lblCell32, lblCell33, lblCell34, lblCell35, lblCell36,
				lblCell37, lblCell38, lblCell39, lblCell40, lblCell41, lblCell42, lblCell43, lblCell44, lblCell45,
				lblCell46, lblCell47, lblCell48, lblCell49, lblCell50, lblCell51, lblCell52, lblCell53, lblCell54,
				lblCell55, lblCell56, lblCell57, lblCell58, lblCell59, lblCell60, lblCell61, lblCell62, lblCell63,
				lblCell64, lblCell65, lblCell66 };

		

		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < 66; j++) {
				cell[j].setText(number[j]);
			}
		}

	}

	@FXML
	void OnClick321(ActionEvent event) {
		
		String[] number2 = CounterService.getNumber321();
		
		Label[] cell = { lblCell1, lblCell2, lblCell3, lblCell4, lblCell5, lblCell6, lblCell7, lblCell8, lblCell9,
				lblCell10, lblCell11, lblCell12, lblCell13, lblCell14, lblCell15, lblCell16, lblCell17, lblCell18,
				lblCell19, lblCell20, lblCell21, lblCell22, lblCell23, lblCell24, lblCell25, lblCell26, lblCell27,
				lblCell28, lblCell29, lblCell30, lblCell31, lblCell32, lblCell33, lblCell34, lblCell35, lblCell36,
				lblCell37, lblCell38, lblCell39, lblCell40, lblCell41, lblCell42, lblCell43, lblCell44, lblCell45,
				lblCell46, lblCell47, lblCell48, lblCell49, lblCell50, lblCell51, lblCell52, lblCell53, lblCell54,
				lblCell55, lblCell56, lblCell57, lblCell58, lblCell59, lblCell60, lblCell61, lblCell62, lblCell63,
				lblCell64, lblCell65, lblCell66 };
		
		
		
		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < 66; j++) {
				cell[j].setText(number2[j]);
			}
		}

	}

	@FXML
	void OnClickABC(ActionEvent event) {
		
		for (Node node : a_mainCount.getChildren()) {
			if (node instanceof Label) {

				((Label) node).setText("?");

			}
		}
		
		String[] alpha  = CounterService.getAlphatbetABC();
		
		Label[] cell = { lblCell1, lblCell2, lblCell3, lblCell4, lblCell5, lblCell6, lblCell7, lblCell8, lblCell9,
				lblCell10, lblCell11, lblCell12, lblCell13, lblCell14, lblCell15, lblCell16, lblCell17, lblCell18,
				lblCell19, lblCell20, lblCell21, lblCell22, lblCell23, lblCell24, lblCell25, lblCell26};
		
		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < 26; j++) {
				cell[j].setText(alpha[j]);
			}
		}

	}

	@FXML
	void OnClickCBA(ActionEvent event) {
		
		for (Node node : a_mainCount.getChildren()) {
			if (node instanceof Label) {

				((Label) node).setText("?");

			}
		}
		
		String[] alpha2  = CounterService.getAlphatbetABC();
		
		Arrays.sort(alpha2, Collections.reverseOrder());
		
		Label[] cell = { lblCell1, lblCell2, lblCell3, lblCell4, lblCell5, lblCell6, lblCell7, lblCell8, lblCell9,
				lblCell10, lblCell11, lblCell12, lblCell13, lblCell14, lblCell15, lblCell16, lblCell17, lblCell18,
				lblCell19, lblCell20, lblCell21, lblCell22, lblCell23, lblCell24, lblCell25, lblCell26};
		
		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < 26; j++) {
				cell[j].setText(alpha2[j]);
			}
		}

	}

}
