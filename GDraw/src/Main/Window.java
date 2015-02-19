package Main;

import graphics.TweenClass.Tween;

import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.TextField;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import canvas.AnimationControl;
import canvas.DelayThread;
import canvas.FileCreator;
import canvas.canvas;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.swing.JRadioButton;

import controller.DrawController;

import javax.swing.SwingConstants;

public class Window {
	public int i, j;
	public JRadioButton[][] buttons;
	private JFrame frmGraphDraw;
	private AnimationControl ac;
	private canvas canvasPanel;
	private TextField textField;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel label_41;
	private JLabel label_42;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_45;
	private JLabel label_46;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel label_49;
	private JLabel label_50;
	private JLabel label_51;
	private JLabel label_52;
	private JLabel label_53;
	private JLabel label_54;
	private JLabel label_55;
	private JLabel[] horizontalLabels;
	private JLabel[] verticalLabels;
	private TextField pairSizeBox;
	private TextField numPairsBox;
	private TextField aut1_1;
	private TextField aut1_2;
	private TextField aut1_3;
	private TextField aut1_4;
	private TextField aut1_5;
	private TextField aut1_6;
	private TextField aut1_7;
	private TextField aut1_8;
	private TextField aut1_9;
	private TextField aut1_10;
	private TextField aut2_1;
	private TextField aut2_2;
	private TextField aut2_3;
	private TextField aut2_4;
	private TextField aut2_5;
	private TextField aut2_6;
	private TextField aut2_7;
	private TextField aut2_8;
	private TextField aut2_9;
	private TextField aut2_10;
	private TextField aut3_1;
	private TextField aut3_2;
	private TextField aut3_3;
	private TextField aut3_4;
	private TextField aut3_5;
	private TextField aut3_6;
	private TextField aut3_7;
	private TextField aut3_8;
	private TextField aut3_9;
	private TextField aut3_10;
	private TextField aut4_1;
	private TextField aut4_2;
	private TextField aut4_3;
	private TextField aut4_4;
	private TextField aut4_5;
	private TextField aut4_6;
	private TextField aut4_7;
	private TextField aut4_8;
	private TextField aut4_9;
	private TextField aut4_10;
	private TextField aut5_1;
	private TextField aut5_2;
	private TextField aut5_3;
	private TextField aut5_4;
	private TextField aut5_5;
	private TextField aut5_6;
	private TextField aut5_7;
	private TextField aut5_8;
	private TextField aut5_9;
	private TextField aut5_10;
	private TextField aut6_1;
	private TextField aut6_2;
	private TextField aut6_3;
	private TextField aut6_4;
	private TextField aut6_5;
	private TextField aut6_6;
	private TextField aut6_7;
	private TextField aut6_8;
	private TextField aut6_9;
	private TextField aut6_10;
	private TextField aut7_1;
	private TextField aut7_2;
	private TextField aut7_3;
	private TextField aut7_4;
	private TextField aut7_5;
	private TextField aut7_6;
	private TextField aut7_7;
	private TextField aut7_8;
	private TextField aut7_9;
	private TextField aut7_10;
	private TextField aut8_1;
	private TextField aut8_2;
	private TextField aut8_3;
	private TextField aut8_4;
	private TextField aut8_5;
	private TextField aut8_6;
	private TextField aut8_7;
	private TextField aut8_8;
	private TextField aut8_9;
	private TextField aut8_10;
	private TextField aut9_1;
	private TextField aut9_2;
	private TextField aut9_3;
	private TextField aut9_4;
	private TextField aut9_5;
	private TextField aut9_6;
	private TextField aut9_7;
	private TextField aut9_8;
	private TextField aut9_9;
	private TextField aut9_10;
	private TextField aut10_1;
	private TextField aut10_2;
	private TextField aut10_3;
	private TextField aut10_4;
	private TextField aut10_5;
	private TextField aut10_6;
	private TextField aut10_7;
	private TextField aut10_8;
	private TextField aut10_9;
	private TextField aut10_10;
	protected int pairSize = 10;
	protected int numPairs = 10;
	private TextField[][] auts;
	protected static int numNodes = 25;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmGraphDraw.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmGraphDraw = new JFrame();
		try {
		    UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");
		} catch (Exception e) {
		    e.printStackTrace();
		}
		frmGraphDraw.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		frmGraphDraw.setTitle("Graph Draw");
		frmGraphDraw.getContentPane().setFont(
				new Font("Comic Sans MS", Font.PLAIN, 11));
		frmGraphDraw.setAutoRequestFocus(false);
		frmGraphDraw.setResizable(false);
		frmGraphDraw.setBounds(10, 10, 800, 640);
		frmGraphDraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGraphDraw.getContentPane().setLayout(null);
		frmGraphDraw.setCursor(new java.awt.Cursor(
				java.awt.Cursor.DEFAULT_CURSOR));
		final JPanel panel_4 = new JPanel();
		panel_4.setBounds(5, 104, 779, 508);
		frmGraphDraw.getContentPane().add(panel_4);
		panel_4.setLayout(null);

		JLabel label_1 = new JLabel("1");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_1.setBounds(20, -3, 20, 20);
		panel_4.add(label_1);

		label_2 = new JLabel("2");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_2.setBounds(40, -3, 20, 20);
		panel_4.add(label_2);

		label_3 = new JLabel("3");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_3.setBounds(60, -3, 20, 20);
		panel_4.add(label_3);

		label_4 = new JLabel("4");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_4.setBounds(80, -3, 20, 20);
		panel_4.add(label_4);

		label_5 = new JLabel("5");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_5.setBounds(100, -3, 20, 20);
		panel_4.add(label_5);

		label_6 = new JLabel("6");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_6.setBounds(120, -3, 20, 20);
		panel_4.add(label_6);

		label_7 = new JLabel("7");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_7.setBounds(140, -3, 20, 20);
		panel_4.add(label_7);

		label_8 = new JLabel("8");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_8.setBounds(160, -3, 20, 20);
		panel_4.add(label_8);

		label_9 = new JLabel("9");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_9.setBounds(180, -3, 20, 20);
		panel_4.add(label_9);

		label_10 = new JLabel("10");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_10.setBounds(200, -3, 20, 20);
		panel_4.add(label_10);

		label_11 = new JLabel("11");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_11.setBounds(220, -3, 20, 20);
		panel_4.add(label_11);

		label_12 = new JLabel("12");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_12.setBounds(240, -3, 20, 20);
		panel_4.add(label_12);

		label_13 = new JLabel("13");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_13.setBounds(260, -3, 20, 20);
		panel_4.add(label_13);

		label_14 = new JLabel("14");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_14.setBounds(280, -3, 20, 20);
		panel_4.add(label_14);

		label_15 = new JLabel("15");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_15.setBounds(300, -3, 20, 20);
		panel_4.add(label_15);

		label_16 = new JLabel("16");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_16.setBounds(320, -3, 20, 20);
		panel_4.add(label_16);

		label_17 = new JLabel("17");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_17.setBounds(340, -3, 20, 20);
		panel_4.add(label_17);

		label_18 = new JLabel("18");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_18.setBounds(360, -3, 20, 20);
		panel_4.add(label_18);

		label_19 = new JLabel("19");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_19.setBounds(380, -3, 20, 20);
		panel_4.add(label_19);

		label_20 = new JLabel("20");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_20.setBounds(400, -3, 20, 20);
		panel_4.add(label_20);

		label_21 = new JLabel("21");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_21.setBounds(420, -3, 20, 20);
		panel_4.add(label_21);

		label_22 = new JLabel("22");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_22.setBounds(440, -3, 20, 20);
		panel_4.add(label_22);

		label_23 = new JLabel("23");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_23.setBounds(460, -3, 20, 20);
		panel_4.add(label_23);

		label_24 = new JLabel("24");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_24.setBounds(480, -3, 20, 20);
		panel_4.add(label_24);

		label_25 = new JLabel("25");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_25.setBounds(500, -3, 20, 20);
		panel_4.add(label_25);

		label_31 = new JLabel("1");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_31.setBounds(0, 15, 20, 20);
		panel_4.add(label_31);

		label_32 = new JLabel("2");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_32.setBounds(0, 33, 20, 20);
		panel_4.add(label_32);

		label_33 = new JLabel("3");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_33.setBounds(0, 51, 20, 20);
		panel_4.add(label_33);

		label_34 = new JLabel("4");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_34.setBounds(0, 69, 20, 20);
		panel_4.add(label_34);

		label_35 = new JLabel("5");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_35.setBounds(0, 87, 20, 20);
		panel_4.add(label_35);

		label_36 = new JLabel("6");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_36.setBounds(0, 105, 20, 20);
		panel_4.add(label_36);

		label_37 = new JLabel("7");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_37.setBounds(0, 123, 20, 20);
		panel_4.add(label_37);

		label_38 = new JLabel("8");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_38.setBounds(0, 141, 20, 20);
		panel_4.add(label_38);

		label_39 = new JLabel("9");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_39.setBounds(0, 159, 20, 20);
		panel_4.add(label_39);

		label_40 = new JLabel("10");
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_40.setBounds(0, 177, 20, 20);
		panel_4.add(label_40);

		label_41 = new JLabel("11");
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_41.setBounds(0, 195, 20, 20);
		panel_4.add(label_41);

		label_42 = new JLabel("12");
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		label_42.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_42.setBounds(0, 213, 20, 20);
		panel_4.add(label_42);

		label_43 = new JLabel("13");
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_43.setBounds(0, 231, 20, 20);
		panel_4.add(label_43);

		label_44 = new JLabel("14");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_44.setBounds(0, 249, 20, 20);
		panel_4.add(label_44);

		label_45 = new JLabel("15");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_45.setBounds(0, 267, 20, 20);
		panel_4.add(label_45);

		label_46 = new JLabel("16");
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		label_46.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_46.setBounds(0, 285, 20, 20);
		panel_4.add(label_46);

		label_47 = new JLabel("17");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		label_47.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_47.setBounds(0, 303, 20, 20);
		panel_4.add(label_47);

		label_48 = new JLabel("18");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		label_48.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_48.setBounds(0, 321, 20, 20);
		panel_4.add(label_48);

		label_49 = new JLabel("19");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_49.setBounds(0, 339, 20, 20);
		panel_4.add(label_49);

		label_50 = new JLabel("20");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_50.setBounds(0, 357, 20, 20);
		panel_4.add(label_50);

		label_51 = new JLabel("21");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_51.setBounds(0, 375, 20, 20);
		panel_4.add(label_51);

		label_52 = new JLabel("22");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_52.setBounds(0, 393, 20, 20);
		panel_4.add(label_52);

		label_53 = new JLabel("23");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_53.setBounds(0, 411, 20, 20);
		panel_4.add(label_53);

		label_54 = new JLabel("24");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_54.setBounds(0, 429, 20, 20);
		panel_4.add(label_54);

		label_55 = new JLabel("25");
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_55.setBounds(0, 447, 20, 20);
		panel_4.add(label_55);

		verticalLabels = new JLabel[26];
		horizontalLabels = new JLabel[26];

		verticalLabels[1] = label_1;
		verticalLabels[2] = label_2;
		verticalLabels[3] = label_3;
		verticalLabels[4] = label_4;
		verticalLabels[5] = label_5;
		verticalLabels[6] = label_6;
		verticalLabels[7] = label_7;
		verticalLabels[8] = label_8;
		verticalLabels[9] = label_9;
		verticalLabels[10] = label_10;
		verticalLabels[11] = label_11;
		verticalLabels[12] = label_12;
		verticalLabels[13] = label_13;
		verticalLabels[14] = label_14;
		verticalLabels[15] = label_15;
		verticalLabels[16] = label_16;
		verticalLabels[17] = label_17;
		verticalLabels[18] = label_18;
		verticalLabels[19] = label_19;
		verticalLabels[20] = label_20;
		verticalLabels[21] = label_21;
		verticalLabels[22] = label_22;
		verticalLabels[23] = label_23;
		verticalLabels[24] = label_24;
		verticalLabels[25] = label_25;
		horizontalLabels[1] = label_31;
		horizontalLabels[2] = label_32;
		horizontalLabels[3] = label_33;
		horizontalLabels[4] = label_34;
		horizontalLabels[5] = label_35;
		horizontalLabels[6] = label_36;
		horizontalLabels[7] = label_37;
		horizontalLabels[8] = label_38;
		horizontalLabels[9] = label_39;
		horizontalLabels[10] = label_40;
		horizontalLabels[11] = label_41;
		horizontalLabels[12] = label_42;
		horizontalLabels[13] = label_43;
		horizontalLabels[14] = label_44;
		horizontalLabels[15] = label_45;
		horizontalLabels[16] = label_46;
		horizontalLabels[17] = label_47;
		horizontalLabels[18] = label_48;
		horizontalLabels[19] = label_49;
		horizontalLabels[20] = label_50;
		horizontalLabels[21] = label_51;
		horizontalLabels[22] = label_52;
		horizontalLabels[23] = label_53;
		horizontalLabels[24] = label_54;
		horizontalLabels[25] = label_55;
		JRadioButton button1_1 = new JRadioButton("");
		button1_1.setBounds(20, 15, 20, 23);
		panel_4.add(button1_1);

		JRadioButton button1_2 = new JRadioButton("");
		button1_2.setBounds(40, 15, 20, 23);
		panel_4.add(button1_2);

		JRadioButton button1_3 = new JRadioButton("");
		button1_3.setBounds(60, 15, 20, 23);
		panel_4.add(button1_3);

		JRadioButton button1_4 = new JRadioButton("");
		button1_4.setBounds(80, 15, 20, 23);
		panel_4.add(button1_4);

		JRadioButton button1_5 = new JRadioButton("");
		button1_5.setBounds(100, 15, 20, 23);
		panel_4.add(button1_5);

		JRadioButton button1_6 = new JRadioButton("");
		button1_6.setBounds(120, 15, 20, 23);
		panel_4.add(button1_6);

		JRadioButton button1_7 = new JRadioButton("");
		button1_7.setBounds(140, 15, 20, 23);
		panel_4.add(button1_7);

		JRadioButton button1_8 = new JRadioButton("");
		button1_8.setBounds(160, 15, 20, 23);
		panel_4.add(button1_8);

		JRadioButton button1_9 = new JRadioButton("");
		button1_9.setBounds(180, 15, 20, 23);
		panel_4.add(button1_9);

		JRadioButton button1_10 = new JRadioButton("");
		button1_10.setBounds(200, 15, 20, 23);
		panel_4.add(button1_10);

		JRadioButton button1_11 = new JRadioButton("");
		button1_11.setBounds(220, 15, 20, 23);
		panel_4.add(button1_11);

		JRadioButton button1_12 = new JRadioButton("");
		button1_12.setBounds(240, 15, 20, 23);
		panel_4.add(button1_12);

		JRadioButton button1_13 = new JRadioButton("");
		button1_13.setBounds(260, 15, 20, 23);
		panel_4.add(button1_13);

		JRadioButton button1_14 = new JRadioButton("");
		button1_14.setBounds(280, 15, 20, 23);
		panel_4.add(button1_14);

		JRadioButton button1_15 = new JRadioButton("");
		button1_15.setBounds(300, 15, 20, 23);
		panel_4.add(button1_15);

		JRadioButton button1_16 = new JRadioButton("");
		button1_16.setBounds(320, 15, 20, 23);
		panel_4.add(button1_16);

		JRadioButton button1_17 = new JRadioButton("");
		button1_17.setBounds(340, 15, 20, 23);
		panel_4.add(button1_17);

		JRadioButton button1_18 = new JRadioButton("");
		button1_18.setBounds(360, 15, 20, 23);
		panel_4.add(button1_18);

		JRadioButton button1_19 = new JRadioButton("");
		button1_19.setBounds(380, 15, 20, 23);
		panel_4.add(button1_19);

		JRadioButton button1_20 = new JRadioButton("");
		button1_20.setBounds(400, 15, 20, 23);
		panel_4.add(button1_20);

		JRadioButton button1_21 = new JRadioButton("");
		button1_21.setBounds(420, 15, 20, 23);
		panel_4.add(button1_21);

		JRadioButton button1_22 = new JRadioButton("");
		button1_22.setBounds(440, 15, 20, 23);
		panel_4.add(button1_22);

		JRadioButton button1_23 = new JRadioButton("");
		button1_23.setBounds(460, 15, 20, 23);
		panel_4.add(button1_23);

		JRadioButton button1_24 = new JRadioButton("");
		button1_24.setBounds(480, 15, 20, 23);
		panel_4.add(button1_24);

		JRadioButton button1_25 = new JRadioButton("");
		button1_25.setBounds(500, 15, 20, 23);
		panel_4.add(button1_25);

		JRadioButton button2_1 = new JRadioButton("");
		button2_1.setBounds(20, 33, 20, 23);
		panel_4.add(button2_1);

		JRadioButton button2_2 = new JRadioButton("");
		button2_2.setBounds(40, 33, 20, 23);
		panel_4.add(button2_2);

		JRadioButton button2_3 = new JRadioButton("");
		button2_3.setBounds(60, 33, 20, 23);
		panel_4.add(button2_3);

		JRadioButton button2_4 = new JRadioButton("");
		button2_4.setBounds(80, 33, 20, 23);
		panel_4.add(button2_4);

		JRadioButton button2_5 = new JRadioButton("");
		button2_5.setBounds(100, 33, 20, 23);
		panel_4.add(button2_5);

		JRadioButton button2_6 = new JRadioButton("");
		button2_6.setBounds(120, 33, 20, 23);
		panel_4.add(button2_6);

		JRadioButton button2_7 = new JRadioButton("");
		button2_7.setBounds(140, 33, 20, 23);
		panel_4.add(button2_7);

		JRadioButton button2_8 = new JRadioButton("");
		button2_8.setBounds(160, 33, 20, 23);
		panel_4.add(button2_8);

		JRadioButton button2_9 = new JRadioButton("");
		button2_9.setBounds(180, 33, 20, 23);
		panel_4.add(button2_9);

		JRadioButton button2_10 = new JRadioButton("");
		button2_10.setBounds(200, 33, 20, 23);
		panel_4.add(button2_10);

		JRadioButton button2_11 = new JRadioButton("");
		button2_11.setBounds(220, 33, 20, 23);
		panel_4.add(button2_11);

		JRadioButton button2_12 = new JRadioButton("");
		button2_12.setBounds(240, 33, 20, 23);
		panel_4.add(button2_12);

		JRadioButton button2_13 = new JRadioButton("");
		button2_13.setBounds(260, 33, 20, 23);
		panel_4.add(button2_13);

		JRadioButton button2_14 = new JRadioButton("");
		button2_14.setBounds(280, 33, 20, 23);
		panel_4.add(button2_14);

		JRadioButton button2_15 = new JRadioButton("");
		button2_15.setBounds(300, 33, 20, 23);
		panel_4.add(button2_15);

		JRadioButton button2_16 = new JRadioButton("");
		button2_16.setBounds(320, 33, 20, 23);
		panel_4.add(button2_16);

		JRadioButton button2_17 = new JRadioButton("");
		button2_17.setBounds(340, 33, 20, 23);
		panel_4.add(button2_17);

		JRadioButton button2_18 = new JRadioButton("");
		button2_18.setBounds(360, 33, 20, 23);
		panel_4.add(button2_18);

		JRadioButton button2_19 = new JRadioButton("");
		button2_19.setBounds(380, 33, 20, 23);
		panel_4.add(button2_19);

		JRadioButton button2_20 = new JRadioButton("");
		button2_20.setBounds(400, 33, 20, 23);
		panel_4.add(button2_20);

		JRadioButton button2_21 = new JRadioButton("");
		button2_21.setBounds(420, 33, 20, 23);
		panel_4.add(button2_21);

		JRadioButton button2_22 = new JRadioButton("");
		button2_22.setBounds(440, 33, 20, 23);
		panel_4.add(button2_22);

		JRadioButton button2_23 = new JRadioButton("");
		button2_23.setBounds(460, 33, 20, 23);
		panel_4.add(button2_23);

		JRadioButton button2_24 = new JRadioButton("");
		button2_24.setBounds(480, 33, 20, 23);
		panel_4.add(button2_24);

		JRadioButton button2_25 = new JRadioButton("");
		button2_25.setBounds(500, 33, 20, 23);
		panel_4.add(button2_25);

		JRadioButton button3_1 = new JRadioButton("");
		button3_1.setBounds(20, 51, 20, 23);
		panel_4.add(button3_1);

		JRadioButton button3_2 = new JRadioButton("");
		button3_2.setBounds(40, 51, 20, 23);
		panel_4.add(button3_2);

		JRadioButton button3_3 = new JRadioButton("");
		button3_3.setBounds(60, 51, 20, 23);
		panel_4.add(button3_3);

		JRadioButton button3_4 = new JRadioButton("");
		button3_4.setBounds(80, 51, 20, 23);
		panel_4.add(button3_4);

		JRadioButton button3_5 = new JRadioButton("");
		button3_5.setBounds(100, 51, 20, 23);
		panel_4.add(button3_5);

		JRadioButton button3_6 = new JRadioButton("");
		button3_6.setBounds(120, 51, 20, 23);
		panel_4.add(button3_6);

		JRadioButton button3_7 = new JRadioButton("");
		button3_7.setBounds(140, 51, 20, 23);
		panel_4.add(button3_7);

		JRadioButton button3_8 = new JRadioButton("");
		button3_8.setBounds(160, 51, 20, 23);
		panel_4.add(button3_8);

		JRadioButton button3_9 = new JRadioButton("");
		button3_9.setBounds(180, 51, 20, 23);
		panel_4.add(button3_9);

		JRadioButton button3_10 = new JRadioButton("");
		button3_10.setBounds(200, 51, 20, 23);
		panel_4.add(button3_10);

		JRadioButton button3_11 = new JRadioButton("");
		button3_11.setBounds(220, 51, 20, 23);
		panel_4.add(button3_11);

		JRadioButton button3_12 = new JRadioButton("");
		button3_12.setBounds(240, 51, 20, 23);
		panel_4.add(button3_12);

		JRadioButton button3_13 = new JRadioButton("");
		button3_13.setBounds(260, 51, 20, 23);
		panel_4.add(button3_13);

		JRadioButton button3_14 = new JRadioButton("");
		button3_14.setBounds(280, 51, 20, 23);
		panel_4.add(button3_14);

		JRadioButton button3_15 = new JRadioButton("");
		button3_15.setBounds(300, 51, 20, 23);
		panel_4.add(button3_15);

		JRadioButton button3_16 = new JRadioButton("");
		button3_16.setBounds(320, 51, 20, 23);
		panel_4.add(button3_16);

		JRadioButton button3_17 = new JRadioButton("");
		button3_17.setBounds(340, 51, 20, 23);
		panel_4.add(button3_17);

		JRadioButton button3_18 = new JRadioButton("");
		button3_18.setBounds(360, 51, 20, 23);
		panel_4.add(button3_18);

		JRadioButton button3_19 = new JRadioButton("");
		button3_19.setBounds(380, 51, 20, 23);
		panel_4.add(button3_19);

		JRadioButton button3_20 = new JRadioButton("");
		button3_20.setBounds(400, 51, 20, 23);
		panel_4.add(button3_20);

		JRadioButton button3_21 = new JRadioButton("");
		button3_21.setBounds(420, 51, 20, 23);
		panel_4.add(button3_21);

		JRadioButton button3_22 = new JRadioButton("");
		button3_22.setBounds(440, 51, 20, 23);
		panel_4.add(button3_22);

		JRadioButton button3_23 = new JRadioButton("");
		button3_23.setBounds(460, 51, 20, 23);
		panel_4.add(button3_23);

		JRadioButton button3_24 = new JRadioButton("");
		button3_24.setBounds(480, 51, 20, 23);
		panel_4.add(button3_24);

		JRadioButton button3_25 = new JRadioButton("");
		button3_25.setBounds(500, 51, 20, 23);
		panel_4.add(button3_25);

		JRadioButton button4_1 = new JRadioButton("");
		button4_1.setBounds(20, 69, 20, 23);
		panel_4.add(button4_1);

		JRadioButton button4_2 = new JRadioButton("");
		button4_2.setBounds(40, 69, 20, 23);
		panel_4.add(button4_2);

		JRadioButton button4_3 = new JRadioButton("");
		button4_3.setBounds(60, 69, 20, 23);
		panel_4.add(button4_3);

		JRadioButton button4_4 = new JRadioButton("");
		button4_4.setBounds(80, 69, 20, 23);
		panel_4.add(button4_4);

		JRadioButton button4_5 = new JRadioButton("");
		button4_5.setBounds(100, 69, 20, 23);
		panel_4.add(button4_5);

		JRadioButton button4_6 = new JRadioButton("");
		button4_6.setBounds(120, 69, 20, 23);
		panel_4.add(button4_6);

		JRadioButton button4_7 = new JRadioButton("");
		button4_7.setBounds(140, 69, 20, 23);
		panel_4.add(button4_7);

		JRadioButton button4_8 = new JRadioButton("");
		button4_8.setBounds(160, 69, 20, 23);
		panel_4.add(button4_8);

		JRadioButton button4_9 = new JRadioButton("");
		button4_9.setBounds(180, 69, 20, 23);
		panel_4.add(button4_9);

		JRadioButton button4_10 = new JRadioButton("");
		button4_10.setBounds(200, 69, 20, 23);
		panel_4.add(button4_10);

		JRadioButton button4_11 = new JRadioButton("");
		button4_11.setBounds(220, 69, 20, 23);
		panel_4.add(button4_11);

		JRadioButton button4_12 = new JRadioButton("");
		button4_12.setBounds(240, 69, 20, 23);
		panel_4.add(button4_12);

		JRadioButton button4_13 = new JRadioButton("");
		button4_13.setBounds(260, 69, 20, 23);
		panel_4.add(button4_13);

		JRadioButton button4_14 = new JRadioButton("");
		button4_14.setBounds(280, 69, 20, 23);
		panel_4.add(button4_14);

		JRadioButton button4_15 = new JRadioButton("");
		button4_15.setBounds(300, 69, 20, 23);
		panel_4.add(button4_15);

		JRadioButton button4_16 = new JRadioButton("");
		button4_16.setBounds(320, 69, 20, 23);
		panel_4.add(button4_16);

		JRadioButton button4_17 = new JRadioButton("");
		button4_17.setBounds(340, 69, 20, 23);
		panel_4.add(button4_17);

		JRadioButton button4_18 = new JRadioButton("");
		button4_18.setBounds(360, 69, 20, 23);
		panel_4.add(button4_18);

		JRadioButton button4_19 = new JRadioButton("");
		button4_19.setBounds(380, 69, 20, 23);
		panel_4.add(button4_19);

		JRadioButton button4_20 = new JRadioButton("");
		button4_20.setBounds(400, 69, 20, 23);
		panel_4.add(button4_20);

		JRadioButton button4_21 = new JRadioButton("");
		button4_21.setBounds(420, 69, 20, 23);
		panel_4.add(button4_21);

		JRadioButton button4_22 = new JRadioButton("");
		button4_22.setBounds(440, 69, 20, 23);
		panel_4.add(button4_22);

		JRadioButton button4_23 = new JRadioButton("");
		button4_23.setBounds(460, 69, 20, 23);
		panel_4.add(button4_23);

		JRadioButton button4_24 = new JRadioButton("");
		button4_24.setBounds(480, 69, 20, 23);
		panel_4.add(button4_24);

		JRadioButton button4_25 = new JRadioButton("");
		button4_25.setBounds(500, 69, 20, 23);
		panel_4.add(button4_25);

		JRadioButton button5_1 = new JRadioButton("");
		button5_1.setBounds(20, 87, 20, 23);
		panel_4.add(button5_1);

		JRadioButton button5_2 = new JRadioButton("");
		button5_2.setBounds(40, 87, 20, 23);
		panel_4.add(button5_2);

		JRadioButton button5_3 = new JRadioButton("");
		button5_3.setBounds(60, 87, 20, 23);
		panel_4.add(button5_3);

		JRadioButton button5_4 = new JRadioButton("");
		button5_4.setBounds(80, 87, 20, 23);
		panel_4.add(button5_4);

		JRadioButton button5_5 = new JRadioButton("");
		button5_5.setBounds(100, 87, 20, 23);
		panel_4.add(button5_5);

		JRadioButton button5_6 = new JRadioButton("");
		button5_6.setBounds(120, 87, 20, 23);
		panel_4.add(button5_6);

		JRadioButton button5_7 = new JRadioButton("");
		button5_7.setBounds(140, 87, 20, 23);
		panel_4.add(button5_7);

		JRadioButton button5_8 = new JRadioButton("");
		button5_8.setBounds(160, 87, 20, 23);
		panel_4.add(button5_8);

		JRadioButton button5_9 = new JRadioButton("");
		button5_9.setBounds(180, 87, 20, 23);
		panel_4.add(button5_9);

		JRadioButton button5_10 = new JRadioButton("");
		button5_10.setBounds(200, 87, 20, 23);
		panel_4.add(button5_10);

		JRadioButton button5_11 = new JRadioButton("");
		button5_11.setBounds(220, 87, 20, 23);
		panel_4.add(button5_11);

		JRadioButton button5_12 = new JRadioButton("");
		button5_12.setBounds(240, 87, 20, 23);
		panel_4.add(button5_12);

		JRadioButton button5_13 = new JRadioButton("");
		button5_13.setBounds(260, 87, 20, 23);
		panel_4.add(button5_13);

		JRadioButton button5_14 = new JRadioButton("");
		button5_14.setBounds(280, 87, 20, 23);
		panel_4.add(button5_14);

		JRadioButton button5_15 = new JRadioButton("");
		button5_15.setBounds(300, 87, 20, 23);
		panel_4.add(button5_15);

		JRadioButton button5_16 = new JRadioButton("");
		button5_16.setBounds(320, 87, 20, 23);
		panel_4.add(button5_16);

		JRadioButton button5_17 = new JRadioButton("");
		button5_17.setBounds(340, 87, 20, 23);
		panel_4.add(button5_17);

		JRadioButton button5_18 = new JRadioButton("");
		button5_18.setBounds(360, 87, 20, 23);
		panel_4.add(button5_18);

		JRadioButton button5_19 = new JRadioButton("");
		button5_19.setBounds(380, 87, 20, 23);
		panel_4.add(button5_19);

		JRadioButton button5_20 = new JRadioButton("");
		button5_20.setBounds(400, 87, 20, 23);
		panel_4.add(button5_20);

		JRadioButton button5_21 = new JRadioButton("");
		button5_21.setBounds(420, 87, 20, 23);
		panel_4.add(button5_21);

		JRadioButton button5_22 = new JRadioButton("");
		button5_22.setBounds(440, 87, 20, 23);
		panel_4.add(button5_22);

		JRadioButton button5_23 = new JRadioButton("");
		button5_23.setBounds(460, 87, 20, 23);
		panel_4.add(button5_23);

		JRadioButton button5_24 = new JRadioButton("");
		button5_24.setBounds(480, 87, 20, 23);
		panel_4.add(button5_24);

		JRadioButton button5_25 = new JRadioButton("");
		button5_25.setBounds(500, 87, 20, 23);
		panel_4.add(button5_25);

		JRadioButton button6_1 = new JRadioButton("");
		button6_1.setBounds(20, 105, 20, 23);
		panel_4.add(button6_1);

		JRadioButton button6_2 = new JRadioButton("");
		button6_2.setBounds(40, 105, 20, 23);
		panel_4.add(button6_2);

		JRadioButton button6_3 = new JRadioButton("");
		button6_3.setBounds(60, 105, 20, 23);
		panel_4.add(button6_3);

		JRadioButton button6_4 = new JRadioButton("");
		button6_4.setBounds(80, 105, 20, 23);
		panel_4.add(button6_4);

		JRadioButton button6_5 = new JRadioButton("");
		button6_5.setBounds(100, 105, 20, 23);
		panel_4.add(button6_5);

		JRadioButton button6_6 = new JRadioButton("");
		button6_6.setBounds(120, 105, 20, 23);
		panel_4.add(button6_6);

		JRadioButton button6_7 = new JRadioButton("");
		button6_7.setBounds(140, 105, 20, 23);
		panel_4.add(button6_7);

		JRadioButton button6_8 = new JRadioButton("");
		button6_8.setBounds(160, 105, 20, 23);
		panel_4.add(button6_8);

		JRadioButton button6_9 = new JRadioButton("");
		button6_9.setBounds(180, 105, 20, 23);
		panel_4.add(button6_9);

		JRadioButton button6_10 = new JRadioButton("");
		button6_10.setBounds(200, 105, 20, 23);
		panel_4.add(button6_10);

		JRadioButton button6_11 = new JRadioButton("");
		button6_11.setBounds(220, 105, 20, 23);
		panel_4.add(button6_11);

		JRadioButton button6_12 = new JRadioButton("");
		button6_12.setBounds(240, 105, 20, 23);
		panel_4.add(button6_12);

		JRadioButton button6_13 = new JRadioButton("");
		button6_13.setBounds(260, 105, 20, 23);
		panel_4.add(button6_13);

		JRadioButton button6_14 = new JRadioButton("");
		button6_14.setBounds(280, 105, 20, 23);
		panel_4.add(button6_14);

		JRadioButton button6_15 = new JRadioButton("");
		button6_15.setBounds(300, 105, 20, 23);
		panel_4.add(button6_15);

		JRadioButton button6_16 = new JRadioButton("");
		button6_16.setBounds(320, 105, 20, 23);
		panel_4.add(button6_16);

		JRadioButton button6_17 = new JRadioButton("");
		button6_17.setBounds(340, 105, 20, 23);
		panel_4.add(button6_17);

		JRadioButton button6_18 = new JRadioButton("");
		button6_18.setBounds(360, 105, 20, 23);
		panel_4.add(button6_18);

		JRadioButton button6_19 = new JRadioButton("");
		button6_19.setBounds(380, 105, 20, 23);
		panel_4.add(button6_19);

		JRadioButton button6_20 = new JRadioButton("");
		button6_20.setBounds(400, 105, 20, 23);
		panel_4.add(button6_20);

		JRadioButton button6_21 = new JRadioButton("");
		button6_21.setBounds(420, 105, 20, 23);
		panel_4.add(button6_21);

		JRadioButton button6_22 = new JRadioButton("");
		button6_22.setBounds(440, 105, 20, 23);
		panel_4.add(button6_22);

		JRadioButton button6_23 = new JRadioButton("");
		button6_23.setBounds(460, 105, 20, 23);
		panel_4.add(button6_23);

		JRadioButton button6_24 = new JRadioButton("");
		button6_24.setBounds(480, 105, 20, 23);
		panel_4.add(button6_24);

		JRadioButton button6_25 = new JRadioButton("");
		button6_25.setBounds(500, 105, 20, 23);
		panel_4.add(button6_25);

		JRadioButton button7_1 = new JRadioButton("");
		button7_1.setBounds(20, 123, 20, 23);
		panel_4.add(button7_1);

		JRadioButton button7_2 = new JRadioButton("");
		button7_2.setBounds(40, 123, 20, 23);
		panel_4.add(button7_2);

		JRadioButton button7_3 = new JRadioButton("");
		button7_3.setBounds(60, 123, 20, 23);
		panel_4.add(button7_3);

		JRadioButton button7_4 = new JRadioButton("");
		button7_4.setBounds(80, 123, 20, 23);
		panel_4.add(button7_4);

		JRadioButton button7_5 = new JRadioButton("");
		button7_5.setBounds(100, 123, 20, 23);
		panel_4.add(button7_5);

		JRadioButton button7_6 = new JRadioButton("");
		button7_6.setBounds(120, 123, 20, 23);
		panel_4.add(button7_6);

		JRadioButton button7_7 = new JRadioButton("");
		button7_7.setBounds(140, 123, 20, 23);
		panel_4.add(button7_7);

		JRadioButton button7_8 = new JRadioButton("");
		button7_8.setBounds(160, 123, 20, 23);
		panel_4.add(button7_8);

		JRadioButton button7_9 = new JRadioButton("");
		button7_9.setBounds(180, 123, 20, 23);
		panel_4.add(button7_9);

		JRadioButton button7_10 = new JRadioButton("");
		button7_10.setBounds(200, 123, 20, 23);
		panel_4.add(button7_10);

		JRadioButton button7_11 = new JRadioButton("");
		button7_11.setBounds(220, 123, 20, 23);
		panel_4.add(button7_11);

		JRadioButton button7_12 = new JRadioButton("");
		button7_12.setBounds(240, 123, 20, 23);
		panel_4.add(button7_12);

		JRadioButton button7_13 = new JRadioButton("");
		button7_13.setBounds(260, 123, 20, 23);
		panel_4.add(button7_13);

		JRadioButton button7_14 = new JRadioButton("");
		button7_14.setBounds(280, 123, 20, 23);
		panel_4.add(button7_14);

		JRadioButton button7_15 = new JRadioButton("");
		button7_15.setBounds(300, 123, 20, 23);
		panel_4.add(button7_15);

		JRadioButton button7_16 = new JRadioButton("");
		button7_16.setBounds(320, 123, 20, 23);
		panel_4.add(button7_16);

		JRadioButton button7_17 = new JRadioButton("");
		button7_17.setBounds(340, 123, 20, 23);
		panel_4.add(button7_17);

		JRadioButton button7_18 = new JRadioButton("");
		button7_18.setBounds(360, 123, 20, 23);
		panel_4.add(button7_18);

		JRadioButton button7_19 = new JRadioButton("");
		button7_19.setBounds(380, 123, 20, 23);
		panel_4.add(button7_19);

		JRadioButton button7_20 = new JRadioButton("");
		button7_20.setBounds(400, 123, 20, 23);
		panel_4.add(button7_20);

		JRadioButton button7_21 = new JRadioButton("");
		button7_21.setBounds(420, 123, 20, 23);
		panel_4.add(button7_21);

		JRadioButton button7_22 = new JRadioButton("");
		button7_22.setBounds(440, 123, 20, 23);
		panel_4.add(button7_22);

		JRadioButton button7_23 = new JRadioButton("");
		button7_23.setBounds(460, 123, 20, 23);
		panel_4.add(button7_23);

		JRadioButton button7_24 = new JRadioButton("");
		button7_24.setBounds(480, 123, 20, 23);
		panel_4.add(button7_24);

		JRadioButton button7_25 = new JRadioButton("");
		button7_25.setBounds(500, 123, 20, 23);
		panel_4.add(button7_25);

		JRadioButton button8_1 = new JRadioButton("");
		button8_1.setBounds(20, 141, 20, 23);
		panel_4.add(button8_1);

		JRadioButton button8_2 = new JRadioButton("");
		button8_2.setBounds(40, 141, 20, 23);
		panel_4.add(button8_2);

		JRadioButton button8_3 = new JRadioButton("");
		button8_3.setBounds(60, 141, 20, 23);
		panel_4.add(button8_3);

		JRadioButton button8_4 = new JRadioButton("");
		button8_4.setBounds(80, 141, 20, 23);
		panel_4.add(button8_4);

		JRadioButton button8_5 = new JRadioButton("");
		button8_5.setBounds(100, 141, 20, 23);
		panel_4.add(button8_5);

		JRadioButton button8_6 = new JRadioButton("");
		button8_6.setBounds(120, 141, 20, 23);
		panel_4.add(button8_6);

		JRadioButton button8_7 = new JRadioButton("");
		button8_7.setBounds(140, 141, 20, 23);
		panel_4.add(button8_7);

		JRadioButton button8_8 = new JRadioButton("");
		button8_8.setBounds(160, 141, 20, 23);
		panel_4.add(button8_8);

		JRadioButton button8_9 = new JRadioButton("");
		button8_9.setBounds(180, 141, 20, 23);
		panel_4.add(button8_9);

		JRadioButton button8_10 = new JRadioButton("");
		button8_10.setBounds(200, 141, 20, 23);
		panel_4.add(button8_10);

		JRadioButton button8_11 = new JRadioButton("");
		button8_11.setBounds(220, 141, 20, 23);
		panel_4.add(button8_11);

		JRadioButton button8_12 = new JRadioButton("");
		button8_12.setBounds(240, 141, 20, 23);
		panel_4.add(button8_12);

		JRadioButton button8_13 = new JRadioButton("");
		button8_13.setBounds(260, 141, 20, 23);
		panel_4.add(button8_13);

		JRadioButton button8_14 = new JRadioButton("");
		button8_14.setBounds(280, 141, 20, 23);
		panel_4.add(button8_14);

		JRadioButton button8_15 = new JRadioButton("");
		button8_15.setBounds(300, 141, 20, 23);
		panel_4.add(button8_15);

		JRadioButton button8_16 = new JRadioButton("");
		button8_16.setBounds(320, 141, 20, 23);
		panel_4.add(button8_16);

		JRadioButton button8_17 = new JRadioButton("");
		button8_17.setBounds(340, 141, 20, 23);
		panel_4.add(button8_17);

		JRadioButton button8_18 = new JRadioButton("");
		button8_18.setBounds(360, 141, 20, 23);
		panel_4.add(button8_18);

		JRadioButton button8_19 = new JRadioButton("");
		button8_19.setBounds(380, 141, 20, 23);
		panel_4.add(button8_19);

		JRadioButton button8_20 = new JRadioButton("");
		button8_20.setBounds(400, 141, 20, 23);
		panel_4.add(button8_20);

		JRadioButton button8_21 = new JRadioButton("");
		button8_21.setBounds(420, 141, 20, 23);
		panel_4.add(button8_21);

		JRadioButton button8_22 = new JRadioButton("");
		button8_22.setBounds(440, 141, 20, 23);
		panel_4.add(button8_22);

		JRadioButton button8_23 = new JRadioButton("");
		button8_23.setBounds(460, 141, 20, 23);
		panel_4.add(button8_23);

		JRadioButton button8_24 = new JRadioButton("");
		button8_24.setBounds(480, 141, 20, 23);
		panel_4.add(button8_24);

		JRadioButton button8_25 = new JRadioButton("");
		button8_25.setBounds(500, 141, 20, 23);
		panel_4.add(button8_25);

		JRadioButton button9_1 = new JRadioButton("");
		button9_1.setBounds(20, 159, 20, 23);
		panel_4.add(button9_1);

		JRadioButton button9_2 = new JRadioButton("");
		button9_2.setBounds(40, 159, 20, 23);
		panel_4.add(button9_2);

		JRadioButton button9_3 = new JRadioButton("");
		button9_3.setBounds(60, 159, 20, 23);
		panel_4.add(button9_3);

		JRadioButton button9_4 = new JRadioButton("");
		button9_4.setBounds(80, 159, 20, 23);
		panel_4.add(button9_4);

		JRadioButton button9_5 = new JRadioButton("");
		button9_5.setBounds(100, 159, 20, 23);
		panel_4.add(button9_5);

		JRadioButton button9_6 = new JRadioButton("");
		button9_6.setBounds(120, 159, 20, 23);
		panel_4.add(button9_6);

		JRadioButton button9_7 = new JRadioButton("");
		button9_7.setBounds(140, 159, 20, 23);
		panel_4.add(button9_7);

		JRadioButton button9_8 = new JRadioButton("");
		button9_8.setBounds(160, 159, 20, 23);
		panel_4.add(button9_8);

		JRadioButton button9_9 = new JRadioButton("");
		button9_9.setBounds(180, 159, 20, 23);
		panel_4.add(button9_9);

		JRadioButton button9_10 = new JRadioButton("");
		button9_10.setBounds(200, 159, 20, 23);
		panel_4.add(button9_10);

		JRadioButton button9_11 = new JRadioButton("");
		button9_11.setBounds(220, 159, 20, 23);
		panel_4.add(button9_11);

		JRadioButton button9_12 = new JRadioButton("");
		button9_12.setBounds(240, 159, 20, 23);
		panel_4.add(button9_12);

		JRadioButton button9_13 = new JRadioButton("");
		button9_13.setBounds(260, 159, 20, 23);
		panel_4.add(button9_13);

		JRadioButton button9_14 = new JRadioButton("");
		button9_14.setBounds(280, 159, 20, 23);
		panel_4.add(button9_14);

		JRadioButton button9_15 = new JRadioButton("");
		button9_15.setBounds(300, 159, 20, 23);
		panel_4.add(button9_15);

		JRadioButton button9_16 = new JRadioButton("");
		button9_16.setBounds(320, 159, 20, 23);
		panel_4.add(button9_16);

		JRadioButton button9_17 = new JRadioButton("");
		button9_17.setBounds(340, 159, 20, 23);
		panel_4.add(button9_17);

		JRadioButton button9_18 = new JRadioButton("");
		button9_18.setBounds(360, 159, 20, 23);
		panel_4.add(button9_18);

		JRadioButton button9_19 = new JRadioButton("");
		button9_19.setBounds(380, 159, 20, 23);
		panel_4.add(button9_19);

		JRadioButton button9_20 = new JRadioButton("");
		button9_20.setBounds(400, 159, 20, 23);
		panel_4.add(button9_20);

		JRadioButton button9_21 = new JRadioButton("");
		button9_21.setBounds(420, 159, 20, 23);
		panel_4.add(button9_21);

		JRadioButton button9_22 = new JRadioButton("");
		button9_22.setBounds(440, 159, 20, 23);
		panel_4.add(button9_22);

		JRadioButton button9_23 = new JRadioButton("");
		button9_23.setBounds(460, 159, 20, 23);
		panel_4.add(button9_23);

		JRadioButton button9_24 = new JRadioButton("");
		button9_24.setBounds(480, 159, 20, 23);
		panel_4.add(button9_24);

		JRadioButton button9_25 = new JRadioButton("");
		button9_25.setBounds(500, 159, 20, 23);
		panel_4.add(button9_25);

		JRadioButton button10_1 = new JRadioButton("");
		button10_1.setBounds(20, 177, 20, 23);
		panel_4.add(button10_1);

		JRadioButton button10_2 = new JRadioButton("");
		button10_2.setBounds(40, 177, 20, 23);
		panel_4.add(button10_2);

		JRadioButton button10_3 = new JRadioButton("");
		button10_3.setBounds(60, 177, 20, 23);
		panel_4.add(button10_3);

		JRadioButton button10_4 = new JRadioButton("");
		button10_4.setBounds(80, 177, 20, 23);
		panel_4.add(button10_4);

		JRadioButton button10_5 = new JRadioButton("");
		button10_5.setBounds(100, 177, 20, 23);
		panel_4.add(button10_5);

		JRadioButton button10_6 = new JRadioButton("");
		button10_6.setBounds(120, 177, 20, 23);
		panel_4.add(button10_6);

		JRadioButton button10_7 = new JRadioButton("");
		button10_7.setBounds(140, 177, 20, 23);
		panel_4.add(button10_7);

		JRadioButton button10_8 = new JRadioButton("");
		button10_8.setBounds(160, 177, 20, 23);
		panel_4.add(button10_8);

		JRadioButton button10_9 = new JRadioButton("");
		button10_9.setBounds(180, 177, 20, 23);
		panel_4.add(button10_9);

		JRadioButton button10_10 = new JRadioButton("");
		button10_10.setBounds(200, 177, 20, 23);
		panel_4.add(button10_10);

		JRadioButton button10_11 = new JRadioButton("");
		button10_11.setBounds(220, 177, 20, 23);
		panel_4.add(button10_11);

		JRadioButton button10_12 = new JRadioButton("");
		button10_12.setBounds(240, 177, 20, 23);
		panel_4.add(button10_12);

		JRadioButton button10_13 = new JRadioButton("");
		button10_13.setBounds(260, 177, 20, 23);
		panel_4.add(button10_13);

		JRadioButton button10_14 = new JRadioButton("");
		button10_14.setBounds(280, 177, 20, 23);
		panel_4.add(button10_14);

		JRadioButton button10_15 = new JRadioButton("");
		button10_15.setBounds(300, 177, 20, 23);
		panel_4.add(button10_15);

		JRadioButton button10_16 = new JRadioButton("");
		button10_16.setBounds(320, 177, 20, 23);
		panel_4.add(button10_16);

		JRadioButton button10_17 = new JRadioButton("");
		button10_17.setBounds(340, 177, 20, 23);
		panel_4.add(button10_17);

		JRadioButton button10_18 = new JRadioButton("");
		button10_18.setBounds(360, 177, 20, 23);
		panel_4.add(button10_18);

		JRadioButton button10_19 = new JRadioButton("");
		button10_19.setBounds(380, 177, 20, 23);
		panel_4.add(button10_19);

		JRadioButton button10_20 = new JRadioButton("");
		button10_20.setBounds(400, 177, 20, 23);
		panel_4.add(button10_20);

		JRadioButton button10_21 = new JRadioButton("");
		button10_21.setBounds(420, 177, 20, 23);
		panel_4.add(button10_21);

		JRadioButton button10_22 = new JRadioButton("");
		button10_22.setBounds(440, 177, 20, 23);
		panel_4.add(button10_22);

		JRadioButton button10_23 = new JRadioButton("");
		button10_23.setBounds(460, 177, 20, 23);
		panel_4.add(button10_23);

		JRadioButton button10_24 = new JRadioButton("");
		button10_24.setBounds(480, 177, 20, 23);
		panel_4.add(button10_24);

		JRadioButton button10_25 = new JRadioButton("");
		button10_25.setBounds(500, 177, 20, 23);
		panel_4.add(button10_25);

		JRadioButton button11_1 = new JRadioButton("");
		button11_1.setBounds(20, 195, 20, 23);
		panel_4.add(button11_1);

		JRadioButton button11_2 = new JRadioButton("");
		button11_2.setBounds(40, 195, 20, 23);
		panel_4.add(button11_2);

		JRadioButton button11_3 = new JRadioButton("");
		button11_3.setBounds(60, 195, 20, 23);
		panel_4.add(button11_3);

		JRadioButton button11_4 = new JRadioButton("");
		button11_4.setBounds(80, 195, 20, 23);
		panel_4.add(button11_4);

		JRadioButton button11_5 = new JRadioButton("");
		button11_5.setBounds(100, 195, 20, 23);
		panel_4.add(button11_5);

		JRadioButton button11_6 = new JRadioButton("");
		button11_6.setBounds(120, 195, 20, 23);
		panel_4.add(button11_6);

		JRadioButton button11_7 = new JRadioButton("");
		button11_7.setBounds(140, 195, 20, 23);
		panel_4.add(button11_7);

		JRadioButton button11_8 = new JRadioButton("");
		button11_8.setBounds(160, 195, 20, 23);
		panel_4.add(button11_8);

		JRadioButton button11_9 = new JRadioButton("");
		button11_9.setBounds(180, 195, 20, 23);
		panel_4.add(button11_9);

		JRadioButton button11_10 = new JRadioButton("");
		button11_10.setBounds(200, 195, 20, 23);
		panel_4.add(button11_10);

		JRadioButton button11_11 = new JRadioButton("");
		button11_11.setBounds(220, 195, 20, 23);
		panel_4.add(button11_11);

		JRadioButton button11_12 = new JRadioButton("");
		button11_12.setBounds(240, 195, 20, 23);
		panel_4.add(button11_12);

		JRadioButton button11_13 = new JRadioButton("");
		button11_13.setBounds(260, 195, 20, 23);
		panel_4.add(button11_13);

		JRadioButton button11_14 = new JRadioButton("");
		button11_14.setBounds(280, 195, 20, 23);
		panel_4.add(button11_14);

		JRadioButton button11_15 = new JRadioButton("");
		button11_15.setBounds(300, 195, 20, 23);
		panel_4.add(button11_15);

		JRadioButton button11_16 = new JRadioButton("");
		button11_16.setBounds(320, 195, 20, 23);
		panel_4.add(button11_16);

		JRadioButton button11_17 = new JRadioButton("");
		button11_17.setBounds(340, 195, 20, 23);
		panel_4.add(button11_17);

		JRadioButton button11_18 = new JRadioButton("");
		button11_18.setBounds(360, 195, 20, 23);
		panel_4.add(button11_18);

		JRadioButton button11_19 = new JRadioButton("");
		button11_19.setBounds(380, 195, 20, 23);
		panel_4.add(button11_19);

		JRadioButton button11_20 = new JRadioButton("");
		button11_20.setBounds(400, 195, 20, 23);
		panel_4.add(button11_20);

		JRadioButton button11_21 = new JRadioButton("");
		button11_21.setBounds(420, 195, 20, 23);
		panel_4.add(button11_21);

		JRadioButton button11_22 = new JRadioButton("");
		button11_22.setBounds(440, 195, 20, 23);
		panel_4.add(button11_22);

		JRadioButton button11_23 = new JRadioButton("");
		button11_23.setBounds(460, 195, 20, 23);
		panel_4.add(button11_23);

		JRadioButton button11_24 = new JRadioButton("");
		button11_24.setBounds(480, 195, 20, 23);
		panel_4.add(button11_24);

		JRadioButton button11_25 = new JRadioButton("");
		button11_25.setBounds(500, 195, 20, 23);
		panel_4.add(button11_25);

		JRadioButton button12_1 = new JRadioButton("");
		button12_1.setBounds(20, 213, 20, 23);
		panel_4.add(button12_1);

		JRadioButton button12_2 = new JRadioButton("");
		button12_2.setBounds(40, 213, 20, 23);
		panel_4.add(button12_2);

		JRadioButton button12_3 = new JRadioButton("");
		button12_3.setBounds(60, 213, 20, 23);
		panel_4.add(button12_3);

		JRadioButton button12_4 = new JRadioButton("");
		button12_4.setBounds(80, 213, 20, 23);
		panel_4.add(button12_4);

		JRadioButton button12_5 = new JRadioButton("");
		button12_5.setBounds(100, 213, 20, 23);
		panel_4.add(button12_5);

		JRadioButton button12_6 = new JRadioButton("");
		button12_6.setBounds(120, 213, 20, 23);
		panel_4.add(button12_6);

		JRadioButton button12_7 = new JRadioButton("");
		button12_7.setBounds(140, 213, 20, 23);
		panel_4.add(button12_7);

		JRadioButton button12_8 = new JRadioButton("");
		button12_8.setBounds(160, 213, 20, 23);
		panel_4.add(button12_8);

		JRadioButton button12_9 = new JRadioButton("");
		button12_9.setBounds(180, 213, 20, 23);
		panel_4.add(button12_9);

		JRadioButton button12_10 = new JRadioButton("");
		button12_10.setBounds(200, 213, 20, 23);
		panel_4.add(button12_10);

		JRadioButton button12_11 = new JRadioButton("");
		button12_11.setBounds(220, 213, 20, 23);
		panel_4.add(button12_11);

		JRadioButton button12_12 = new JRadioButton("");
		button12_12.setBounds(240, 213, 20, 23);
		panel_4.add(button12_12);

		JRadioButton button12_13 = new JRadioButton("");
		button12_13.setBounds(260, 213, 20, 23);
		panel_4.add(button12_13);

		JRadioButton button12_14 = new JRadioButton("");
		button12_14.setBounds(280, 213, 20, 23);
		panel_4.add(button12_14);

		JRadioButton button12_15 = new JRadioButton("");
		button12_15.setBounds(300, 213, 20, 23);
		panel_4.add(button12_15);

		JRadioButton button12_16 = new JRadioButton("");
		button12_16.setBounds(320, 213, 20, 23);
		panel_4.add(button12_16);

		JRadioButton button12_17 = new JRadioButton("");
		button12_17.setBounds(340, 213, 20, 23);
		panel_4.add(button12_17);

		JRadioButton button12_18 = new JRadioButton("");
		button12_18.setBounds(360, 213, 20, 23);
		panel_4.add(button12_18);

		JRadioButton button12_19 = new JRadioButton("");
		button12_19.setBounds(380, 213, 20, 23);
		panel_4.add(button12_19);

		JRadioButton button12_20 = new JRadioButton("");
		button12_20.setBounds(400, 213, 20, 23);
		panel_4.add(button12_20);

		JRadioButton button12_21 = new JRadioButton("");
		button12_21.setBounds(420, 213, 20, 23);
		panel_4.add(button12_21);

		JRadioButton button12_22 = new JRadioButton("");
		button12_22.setBounds(440, 213, 20, 23);
		panel_4.add(button12_22);

		JRadioButton button12_23 = new JRadioButton("");
		button12_23.setBounds(460, 213, 20, 23);
		panel_4.add(button12_23);

		JRadioButton button12_24 = new JRadioButton("");
		button12_24.setBounds(480, 213, 20, 23);
		panel_4.add(button12_24);

		JRadioButton button12_25 = new JRadioButton("");
		button12_25.setBounds(500, 213, 20, 23);
		panel_4.add(button12_25);

		JRadioButton button13_1 = new JRadioButton("");
		button13_1.setBounds(20, 231, 20, 23);
		panel_4.add(button13_1);

		JRadioButton button13_2 = new JRadioButton("");
		button13_2.setBounds(40, 231, 20, 23);
		panel_4.add(button13_2);

		JRadioButton button13_3 = new JRadioButton("");
		button13_3.setBounds(60, 231, 20, 23);
		panel_4.add(button13_3);

		JRadioButton button13_4 = new JRadioButton("");
		button13_4.setBounds(80, 231, 20, 23);
		panel_4.add(button13_4);

		JRadioButton button13_5 = new JRadioButton("");
		button13_5.setBounds(100, 231, 20, 23);
		panel_4.add(button13_5);

		JRadioButton button13_6 = new JRadioButton("");
		button13_6.setBounds(120, 231, 20, 23);
		panel_4.add(button13_6);

		JRadioButton button13_7 = new JRadioButton("");
		button13_7.setBounds(140, 231, 20, 23);
		panel_4.add(button13_7);

		JRadioButton button13_8 = new JRadioButton("");
		button13_8.setBounds(160, 231, 20, 23);
		panel_4.add(button13_8);

		JRadioButton button13_9 = new JRadioButton("");
		button13_9.setBounds(180, 231, 20, 23);
		panel_4.add(button13_9);

		JRadioButton button13_10 = new JRadioButton("");
		button13_10.setBounds(200, 231, 20, 23);
		panel_4.add(button13_10);

		JRadioButton button13_11 = new JRadioButton("");
		button13_11.setBounds(220, 231, 20, 23);
		panel_4.add(button13_11);

		JRadioButton button13_12 = new JRadioButton("");
		button13_12.setBounds(240, 231, 20, 23);
		panel_4.add(button13_12);

		JRadioButton button13_13 = new JRadioButton("");
		button13_13.setBounds(260, 231, 20, 23);
		panel_4.add(button13_13);

		JRadioButton button13_14 = new JRadioButton("");
		button13_14.setBounds(280, 231, 20, 23);
		panel_4.add(button13_14);

		JRadioButton button13_15 = new JRadioButton("");
		button13_15.setBounds(300, 231, 20, 23);
		panel_4.add(button13_15);

		JRadioButton button13_16 = new JRadioButton("");
		button13_16.setBounds(320, 231, 20, 23);
		panel_4.add(button13_16);

		JRadioButton button13_17 = new JRadioButton("");
		button13_17.setBounds(340, 231, 20, 23);
		panel_4.add(button13_17);

		JRadioButton button13_18 = new JRadioButton("");
		button13_18.setBounds(360, 231, 20, 23);
		panel_4.add(button13_18);

		JRadioButton button13_19 = new JRadioButton("");
		button13_19.setBounds(380, 231, 20, 23);
		panel_4.add(button13_19);

		JRadioButton button13_20 = new JRadioButton("");
		button13_20.setBounds(400, 231, 20, 23);
		panel_4.add(button13_20);

		JRadioButton button13_21 = new JRadioButton("");
		button13_21.setBounds(420, 231, 20, 23);
		panel_4.add(button13_21);

		JRadioButton button13_22 = new JRadioButton("");
		button13_22.setBounds(440, 231, 20, 23);
		panel_4.add(button13_22);

		JRadioButton button13_23 = new JRadioButton("");
		button13_23.setBounds(460, 231, 20, 23);
		panel_4.add(button13_23);

		JRadioButton button13_24 = new JRadioButton("");
		button13_24.setBounds(480, 231, 20, 23);
		panel_4.add(button13_24);

		JRadioButton button13_25 = new JRadioButton("");
		button13_25.setBounds(500, 231, 20, 23);
		panel_4.add(button13_25);

		JRadioButton button14_1 = new JRadioButton("");
		button14_1.setBounds(20, 249, 20, 23);
		panel_4.add(button14_1);

		JRadioButton button14_2 = new JRadioButton("");
		button14_2.setBounds(40, 249, 20, 23);
		panel_4.add(button14_2);

		JRadioButton button14_3 = new JRadioButton("");
		button14_3.setBounds(60, 249, 20, 23);
		panel_4.add(button14_3);

		JRadioButton button14_4 = new JRadioButton("");
		button14_4.setBounds(80, 249, 20, 23);
		panel_4.add(button14_4);

		JRadioButton button14_5 = new JRadioButton("");
		button14_5.setBounds(100, 249, 20, 23);
		panel_4.add(button14_5);

		JRadioButton button14_6 = new JRadioButton("");
		button14_6.setBounds(120, 249, 20, 23);
		panel_4.add(button14_6);

		JRadioButton button14_7 = new JRadioButton("");
		button14_7.setBounds(140, 249, 20, 23);
		panel_4.add(button14_7);

		JRadioButton button14_8 = new JRadioButton("");
		button14_8.setBounds(160, 249, 20, 23);
		panel_4.add(button14_8);

		JRadioButton button14_9 = new JRadioButton("");
		button14_9.setBounds(180, 249, 20, 23);
		panel_4.add(button14_9);

		JRadioButton button14_10 = new JRadioButton("");
		button14_10.setBounds(200, 249, 20, 23);
		panel_4.add(button14_10);

		JRadioButton button14_11 = new JRadioButton("");
		button14_11.setBounds(220, 249, 20, 23);
		panel_4.add(button14_11);

		JRadioButton button14_12 = new JRadioButton("");
		button14_12.setBounds(240, 249, 20, 23);
		panel_4.add(button14_12);

		JRadioButton button14_13 = new JRadioButton("");
		button14_13.setBounds(260, 249, 20, 23);
		panel_4.add(button14_13);

		JRadioButton button14_14 = new JRadioButton("");
		button14_14.setBounds(280, 249, 20, 23);
		panel_4.add(button14_14);

		JRadioButton button14_15 = new JRadioButton("");
		button14_15.setBounds(300, 249, 20, 23);
		panel_4.add(button14_15);

		JRadioButton button14_16 = new JRadioButton("");
		button14_16.setBounds(320, 249, 20, 23);
		panel_4.add(button14_16);

		JRadioButton button14_17 = new JRadioButton("");
		button14_17.setBounds(340, 249, 20, 23);
		panel_4.add(button14_17);

		JRadioButton button14_18 = new JRadioButton("");
		button14_18.setBounds(360, 249, 20, 23);
		panel_4.add(button14_18);

		JRadioButton button14_19 = new JRadioButton("");
		button14_19.setBounds(380, 249, 20, 23);
		panel_4.add(button14_19);

		JRadioButton button14_20 = new JRadioButton("");
		button14_20.setBounds(400, 249, 20, 23);
		panel_4.add(button14_20);

		JRadioButton button14_21 = new JRadioButton("");
		button14_21.setBounds(420, 249, 20, 23);
		panel_4.add(button14_21);

		JRadioButton button14_22 = new JRadioButton("");
		button14_22.setBounds(440, 249, 20, 23);
		panel_4.add(button14_22);

		JRadioButton button14_23 = new JRadioButton("");
		button14_23.setBounds(460, 249, 20, 23);
		panel_4.add(button14_23);

		JRadioButton button14_24 = new JRadioButton("");
		button14_24.setBounds(480, 249, 20, 23);
		panel_4.add(button14_24);

		JRadioButton button14_25 = new JRadioButton("");
		button14_25.setBounds(500, 249, 20, 23);
		panel_4.add(button14_25);

		JRadioButton button15_1 = new JRadioButton("");
		button15_1.setBounds(20, 267, 20, 23);
		panel_4.add(button15_1);

		JRadioButton button15_2 = new JRadioButton("");
		button15_2.setBounds(40, 267, 20, 23);
		panel_4.add(button15_2);

		JRadioButton button15_3 = new JRadioButton("");
		button15_3.setBounds(60, 267, 20, 23);
		panel_4.add(button15_3);

		JRadioButton button15_4 = new JRadioButton("");
		button15_4.setBounds(80, 267, 20, 23);
		panel_4.add(button15_4);

		JRadioButton button15_5 = new JRadioButton("");
		button15_5.setBounds(100, 267, 20, 23);
		panel_4.add(button15_5);

		JRadioButton button15_6 = new JRadioButton("");
		button15_6.setBounds(120, 267, 20, 23);
		panel_4.add(button15_6);

		JRadioButton button15_7 = new JRadioButton("");
		button15_7.setBounds(140, 267, 20, 23);
		panel_4.add(button15_7);

		JRadioButton button15_8 = new JRadioButton("");
		button15_8.setBounds(160, 267, 20, 23);
		panel_4.add(button15_8);

		JRadioButton button15_9 = new JRadioButton("");
		button15_9.setBounds(180, 267, 20, 23);
		panel_4.add(button15_9);

		JRadioButton button15_10 = new JRadioButton("");
		button15_10.setBounds(200, 267, 20, 23);
		panel_4.add(button15_10);

		JRadioButton button15_11 = new JRadioButton("");
		button15_11.setBounds(220, 267, 20, 23);
		panel_4.add(button15_11);

		JRadioButton button15_12 = new JRadioButton("");
		button15_12.setBounds(240, 267, 20, 23);
		panel_4.add(button15_12);

		JRadioButton button15_13 = new JRadioButton("");
		button15_13.setBounds(260, 267, 20, 23);
		panel_4.add(button15_13);

		JRadioButton button15_14 = new JRadioButton("");
		button15_14.setBounds(280, 267, 20, 23);
		panel_4.add(button15_14);

		JRadioButton button15_15 = new JRadioButton("");
		button15_15.setBounds(300, 267, 20, 23);
		panel_4.add(button15_15);

		JRadioButton button15_16 = new JRadioButton("");
		button15_16.setBounds(320, 267, 20, 23);
		panel_4.add(button15_16);

		JRadioButton button15_17 = new JRadioButton("");
		button15_17.setBounds(340, 267, 20, 23);
		panel_4.add(button15_17);

		JRadioButton button15_18 = new JRadioButton("");
		button15_18.setBounds(360, 267, 20, 23);
		panel_4.add(button15_18);

		JRadioButton button15_19 = new JRadioButton("");
		button15_19.setBounds(380, 267, 20, 23);
		panel_4.add(button15_19);

		JRadioButton button15_20 = new JRadioButton("");
		button15_20.setBounds(400, 267, 20, 23);
		panel_4.add(button15_20);

		JRadioButton button15_21 = new JRadioButton("");
		button15_21.setBounds(420, 267, 20, 23);
		panel_4.add(button15_21);

		JRadioButton button15_22 = new JRadioButton("");
		button15_22.setBounds(440, 267, 20, 23);
		panel_4.add(button15_22);

		JRadioButton button15_23 = new JRadioButton("");
		button15_23.setBounds(460, 267, 20, 23);
		panel_4.add(button15_23);

		JRadioButton button15_24 = new JRadioButton("");
		button15_24.setBounds(480, 267, 20, 23);
		panel_4.add(button15_24);

		JRadioButton button15_25 = new JRadioButton("");
		button15_25.setBounds(500, 267, 20, 23);
		panel_4.add(button15_25);

		JRadioButton button16_1 = new JRadioButton("");
		button16_1.setBounds(20, 285, 20, 23);
		panel_4.add(button16_1);

		JRadioButton button16_2 = new JRadioButton("");
		button16_2.setBounds(40, 285, 20, 23);
		panel_4.add(button16_2);

		JRadioButton button16_3 = new JRadioButton("");
		button16_3.setBounds(60, 285, 20, 23);
		panel_4.add(button16_3);

		JRadioButton button16_4 = new JRadioButton("");
		button16_4.setBounds(80, 285, 20, 23);
		panel_4.add(button16_4);

		JRadioButton button16_5 = new JRadioButton("");
		button16_5.setBounds(100, 285, 20, 23);
		panel_4.add(button16_5);

		JRadioButton button16_6 = new JRadioButton("");
		button16_6.setBounds(120, 285, 20, 23);
		panel_4.add(button16_6);

		JRadioButton button16_7 = new JRadioButton("");
		button16_7.setBounds(140, 285, 20, 23);
		panel_4.add(button16_7);

		JRadioButton button16_8 = new JRadioButton("");
		button16_8.setBounds(160, 285, 20, 23);
		panel_4.add(button16_8);

		JRadioButton button16_9 = new JRadioButton("");
		button16_9.setBounds(180, 285, 20, 23);
		panel_4.add(button16_9);

		JRadioButton button16_10 = new JRadioButton("");
		button16_10.setBounds(200, 285, 20, 23);
		panel_4.add(button16_10);

		JRadioButton button16_11 = new JRadioButton("");
		button16_11.setBounds(220, 285, 20, 23);
		panel_4.add(button16_11);

		JRadioButton button16_12 = new JRadioButton("");
		button16_12.setBounds(240, 285, 20, 23);
		panel_4.add(button16_12);

		JRadioButton button16_13 = new JRadioButton("");
		button16_13.setBounds(260, 285, 20, 23);
		panel_4.add(button16_13);

		JRadioButton button16_14 = new JRadioButton("");
		button16_14.setBounds(280, 285, 20, 23);
		panel_4.add(button16_14);

		JRadioButton button16_15 = new JRadioButton("");
		button16_15.setBounds(300, 285, 20, 23);
		panel_4.add(button16_15);

		JRadioButton button16_16 = new JRadioButton("");
		button16_16.setBounds(320, 285, 20, 23);
		panel_4.add(button16_16);

		JRadioButton button16_17 = new JRadioButton("");
		button16_17.setBounds(340, 285, 20, 23);
		panel_4.add(button16_17);

		JRadioButton button16_18 = new JRadioButton("");
		button16_18.setBounds(360, 285, 20, 23);
		panel_4.add(button16_18);

		JRadioButton button16_19 = new JRadioButton("");
		button16_19.setBounds(380, 285, 20, 23);
		panel_4.add(button16_19);

		JRadioButton button16_20 = new JRadioButton("");
		button16_20.setBounds(400, 285, 20, 23);
		panel_4.add(button16_20);

		JRadioButton button16_21 = new JRadioButton("");
		button16_21.setBounds(420, 285, 20, 23);
		panel_4.add(button16_21);

		JRadioButton button16_22 = new JRadioButton("");
		button16_22.setBounds(440, 285, 20, 23);
		panel_4.add(button16_22);

		JRadioButton button16_23 = new JRadioButton("");
		button16_23.setBounds(460, 285, 20, 23);
		panel_4.add(button16_23);

		JRadioButton button16_24 = new JRadioButton("");
		button16_24.setBounds(480, 285, 20, 23);
		panel_4.add(button16_24);

		JRadioButton button16_25 = new JRadioButton("");
		button16_25.setBounds(500, 285, 20, 23);
		panel_4.add(button16_25);

		JRadioButton button17_1 = new JRadioButton("");
		button17_1.setBounds(20, 303, 20, 23);
		panel_4.add(button17_1);

		JRadioButton button17_2 = new JRadioButton("");
		button17_2.setBounds(40, 303, 20, 23);
		panel_4.add(button17_2);

		JRadioButton button17_3 = new JRadioButton("");
		button17_3.setBounds(60, 303, 20, 23);
		panel_4.add(button17_3);

		JRadioButton button17_4 = new JRadioButton("");
		button17_4.setBounds(80, 303, 20, 23);
		panel_4.add(button17_4);

		JRadioButton button17_5 = new JRadioButton("");
		button17_5.setBounds(100, 303, 20, 23);
		panel_4.add(button17_5);

		JRadioButton button17_6 = new JRadioButton("");
		button17_6.setBounds(120, 303, 20, 23);
		panel_4.add(button17_6);

		JRadioButton button17_7 = new JRadioButton("");
		button17_7.setBounds(140, 303, 20, 23);
		panel_4.add(button17_7);

		JRadioButton button17_8 = new JRadioButton("");
		button17_8.setBounds(160, 303, 20, 23);
		panel_4.add(button17_8);

		JRadioButton button17_9 = new JRadioButton("");
		button17_9.setBounds(180, 303, 20, 23);
		panel_4.add(button17_9);

		JRadioButton button17_10 = new JRadioButton("");
		button17_10.setBounds(200, 303, 20, 23);
		panel_4.add(button17_10);

		JRadioButton button17_11 = new JRadioButton("");
		button17_11.setBounds(220, 303, 20, 23);
		panel_4.add(button17_11);

		JRadioButton button17_12 = new JRadioButton("");
		button17_12.setBounds(240, 303, 20, 23);
		panel_4.add(button17_12);

		JRadioButton button17_13 = new JRadioButton("");
		button17_13.setBounds(260, 303, 20, 23);
		panel_4.add(button17_13);

		JRadioButton button17_14 = new JRadioButton("");
		button17_14.setBounds(280, 303, 20, 23);
		panel_4.add(button17_14);

		JRadioButton button17_15 = new JRadioButton("");
		button17_15.setBounds(300, 303, 20, 23);
		panel_4.add(button17_15);

		JRadioButton button17_16 = new JRadioButton("");
		button17_16.setBounds(320, 303, 20, 23);
		panel_4.add(button17_16);

		JRadioButton button17_17 = new JRadioButton("");
		button17_17.setBounds(340, 303, 20, 23);
		panel_4.add(button17_17);

		JRadioButton button17_18 = new JRadioButton("");
		button17_18.setBounds(360, 303, 20, 23);
		panel_4.add(button17_18);

		JRadioButton button17_19 = new JRadioButton("");
		button17_19.setBounds(380, 303, 20, 23);
		panel_4.add(button17_19);

		JRadioButton button17_20 = new JRadioButton("");
		button17_20.setBounds(400, 303, 20, 23);
		panel_4.add(button17_20);

		JRadioButton button17_21 = new JRadioButton("");
		button17_21.setBounds(420, 303, 20, 23);
		panel_4.add(button17_21);

		JRadioButton button17_22 = new JRadioButton("");
		button17_22.setBounds(440, 303, 20, 23);
		panel_4.add(button17_22);

		JRadioButton button17_23 = new JRadioButton("");
		button17_23.setBounds(460, 303, 20, 23);
		panel_4.add(button17_23);

		JRadioButton button17_24 = new JRadioButton("");
		button17_24.setBounds(480, 303, 20, 23);
		panel_4.add(button17_24);

		JRadioButton button17_25 = new JRadioButton("");
		button17_25.setBounds(500, 303, 20, 23);
		panel_4.add(button17_25);

		JRadioButton button18_1 = new JRadioButton("");
		button18_1.setBounds(20, 321, 20, 23);
		panel_4.add(button18_1);

		JRadioButton button18_2 = new JRadioButton("");
		button18_2.setBounds(40, 321, 20, 23);
		panel_4.add(button18_2);

		JRadioButton button18_3 = new JRadioButton("");
		button18_3.setBounds(60, 321, 20, 23);
		panel_4.add(button18_3);

		JRadioButton button18_4 = new JRadioButton("");
		button18_4.setBounds(80, 321, 20, 23);
		panel_4.add(button18_4);

		JRadioButton button18_5 = new JRadioButton("");
		button18_5.setBounds(100, 321, 20, 23);
		panel_4.add(button18_5);

		JRadioButton button18_6 = new JRadioButton("");
		button18_6.setBounds(120, 321, 20, 23);
		panel_4.add(button18_6);

		JRadioButton button18_7 = new JRadioButton("");
		button18_7.setBounds(140, 321, 20, 23);
		panel_4.add(button18_7);

		JRadioButton button18_8 = new JRadioButton("");
		button18_8.setBounds(160, 321, 20, 23);
		panel_4.add(button18_8);

		JRadioButton button18_9 = new JRadioButton("");
		button18_9.setBounds(180, 321, 20, 23);
		panel_4.add(button18_9);

		JRadioButton button18_10 = new JRadioButton("");
		button18_10.setBounds(200, 321, 20, 23);
		panel_4.add(button18_10);

		JRadioButton button18_11 = new JRadioButton("");
		button18_11.setBounds(220, 321, 20, 23);
		panel_4.add(button18_11);

		JRadioButton button18_12 = new JRadioButton("");
		button18_12.setBounds(240, 321, 20, 23);
		panel_4.add(button18_12);

		JRadioButton button18_13 = new JRadioButton("");
		button18_13.setBounds(260, 321, 20, 23);
		panel_4.add(button18_13);

		JRadioButton button18_14 = new JRadioButton("");
		button18_14.setBounds(280, 321, 20, 23);
		panel_4.add(button18_14);

		JRadioButton button18_15 = new JRadioButton("");
		button18_15.setBounds(300, 321, 20, 23);
		panel_4.add(button18_15);

		JRadioButton button18_16 = new JRadioButton("");
		button18_16.setBounds(320, 321, 20, 23);
		panel_4.add(button18_16);

		JRadioButton button18_17 = new JRadioButton("");
		button18_17.setBounds(340, 321, 20, 23);
		panel_4.add(button18_17);

		JRadioButton button18_18 = new JRadioButton("");
		button18_18.setBounds(360, 321, 20, 23);
		panel_4.add(button18_18);

		JRadioButton button18_19 = new JRadioButton("");
		button18_19.setBounds(380, 321, 20, 23);
		panel_4.add(button18_19);

		JRadioButton button18_20 = new JRadioButton("");
		button18_20.setBounds(400, 321, 20, 23);
		panel_4.add(button18_20);

		JRadioButton button18_21 = new JRadioButton("");
		button18_21.setBounds(420, 321, 20, 23);
		panel_4.add(button18_21);

		JRadioButton button18_22 = new JRadioButton("");
		button18_22.setBounds(440, 321, 20, 23);
		panel_4.add(button18_22);

		JRadioButton button18_23 = new JRadioButton("");
		button18_23.setBounds(460, 321, 20, 23);
		panel_4.add(button18_23);

		JRadioButton button18_24 = new JRadioButton("");
		button18_24.setBounds(480, 321, 20, 23);
		panel_4.add(button18_24);

		JRadioButton button18_25 = new JRadioButton("");
		button18_25.setBounds(500, 321, 20, 23);
		panel_4.add(button18_25);

		JRadioButton button19_1 = new JRadioButton("");
		button19_1.setBounds(20, 339, 20, 23);
		panel_4.add(button19_1);

		JRadioButton button19_2 = new JRadioButton("");
		button19_2.setBounds(40, 339, 20, 23);
		panel_4.add(button19_2);

		JRadioButton button19_3 = new JRadioButton("");
		button19_3.setBounds(60, 339, 20, 23);
		panel_4.add(button19_3);

		JRadioButton button19_4 = new JRadioButton("");
		button19_4.setBounds(80, 339, 20, 23);
		panel_4.add(button19_4);

		JRadioButton button19_5 = new JRadioButton("");
		button19_5.setBounds(100, 339, 20, 23);
		panel_4.add(button19_5);

		JRadioButton button19_6 = new JRadioButton("");
		button19_6.setBounds(120, 339, 20, 23);
		panel_4.add(button19_6);

		JRadioButton button19_7 = new JRadioButton("");
		button19_7.setBounds(140, 339, 20, 23);
		panel_4.add(button19_7);

		JRadioButton button19_8 = new JRadioButton("");
		button19_8.setBounds(160, 339, 20, 23);
		panel_4.add(button19_8);

		JRadioButton button19_9 = new JRadioButton("");
		button19_9.setBounds(180, 339, 20, 23);
		panel_4.add(button19_9);

		JRadioButton button19_10 = new JRadioButton("");
		button19_10.setBounds(200, 339, 20, 23);
		panel_4.add(button19_10);

		JRadioButton button19_11 = new JRadioButton("");
		button19_11.setBounds(220, 339, 20, 23);
		panel_4.add(button19_11);

		JRadioButton button19_12 = new JRadioButton("");
		button19_12.setBounds(240, 339, 20, 23);
		panel_4.add(button19_12);

		JRadioButton button19_13 = new JRadioButton("");
		button19_13.setBounds(260, 339, 20, 23);
		panel_4.add(button19_13);

		JRadioButton button19_14 = new JRadioButton("");
		button19_14.setBounds(280, 339, 20, 23);
		panel_4.add(button19_14);

		JRadioButton button19_15 = new JRadioButton("");
		button19_15.setBounds(300, 339, 20, 23);
		panel_4.add(button19_15);

		JRadioButton button19_16 = new JRadioButton("");
		button19_16.setBounds(320, 339, 20, 23);
		panel_4.add(button19_16);

		JRadioButton button19_17 = new JRadioButton("");
		button19_17.setBounds(340, 339, 20, 23);
		panel_4.add(button19_17);

		JRadioButton button19_18 = new JRadioButton("");
		button19_18.setBounds(360, 339, 20, 23);
		panel_4.add(button19_18);

		JRadioButton button19_19 = new JRadioButton("");
		button19_19.setBounds(380, 339, 20, 23);
		panel_4.add(button19_19);

		JRadioButton button19_20 = new JRadioButton("");
		button19_20.setBounds(400, 339, 20, 23);
		panel_4.add(button19_20);

		JRadioButton button19_21 = new JRadioButton("");
		button19_21.setBounds(420, 339, 20, 23);
		panel_4.add(button19_21);

		JRadioButton button19_22 = new JRadioButton("");
		button19_22.setBounds(440, 339, 20, 23);
		panel_4.add(button19_22);

		JRadioButton button19_23 = new JRadioButton("");
		button19_23.setBounds(460, 339, 20, 23);
		panel_4.add(button19_23);

		JRadioButton button19_24 = new JRadioButton("");
		button19_24.setBounds(480, 339, 20, 23);
		panel_4.add(button19_24);

		JRadioButton button19_25 = new JRadioButton("");
		button19_25.setBounds(500, 339, 20, 23);
		panel_4.add(button19_25);

		JRadioButton button20_1 = new JRadioButton("");
		button20_1.setBounds(20, 357, 20, 23);
		panel_4.add(button20_1);

		JRadioButton button20_2 = new JRadioButton("");
		button20_2.setBounds(40, 357, 20, 23);
		panel_4.add(button20_2);

		JRadioButton button20_3 = new JRadioButton("");
		button20_3.setBounds(60, 357, 20, 23);
		panel_4.add(button20_3);

		JRadioButton button20_4 = new JRadioButton("");
		button20_4.setBounds(80, 357, 20, 23);
		panel_4.add(button20_4);

		JRadioButton button20_5 = new JRadioButton("");
		button20_5.setBounds(100, 357, 20, 23);
		panel_4.add(button20_5);

		JRadioButton button20_6 = new JRadioButton("");
		button20_6.setBounds(120, 357, 20, 23);
		panel_4.add(button20_6);

		JRadioButton button20_7 = new JRadioButton("");
		button20_7.setBounds(140, 357, 20, 23);
		panel_4.add(button20_7);

		JRadioButton button20_8 = new JRadioButton("");
		button20_8.setBounds(160, 357, 20, 23);
		panel_4.add(button20_8);

		JRadioButton button20_9 = new JRadioButton("");
		button20_9.setBounds(180, 357, 20, 23);
		panel_4.add(button20_9);

		JRadioButton button20_10 = new JRadioButton("");
		button20_10.setBounds(200, 357, 20, 23);
		panel_4.add(button20_10);

		JRadioButton button20_11 = new JRadioButton("");
		button20_11.setBounds(220, 357, 20, 23);
		panel_4.add(button20_11);

		JRadioButton button20_12 = new JRadioButton("");
		button20_12.setBounds(240, 357, 20, 23);
		panel_4.add(button20_12);

		JRadioButton button20_13 = new JRadioButton("");
		button20_13.setBounds(260, 357, 20, 23);
		panel_4.add(button20_13);

		JRadioButton button20_14 = new JRadioButton("");
		button20_14.setBounds(280, 357, 20, 23);
		panel_4.add(button20_14);

		JRadioButton button20_15 = new JRadioButton("");
		button20_15.setBounds(300, 357, 20, 23);
		panel_4.add(button20_15);

		JRadioButton button20_16 = new JRadioButton("");
		button20_16.setBounds(320, 357, 20, 23);
		panel_4.add(button20_16);

		JRadioButton button20_17 = new JRadioButton("");
		button20_17.setBounds(340, 357, 20, 23);
		panel_4.add(button20_17);

		JRadioButton button20_18 = new JRadioButton("");
		button20_18.setBounds(360, 357, 20, 23);
		panel_4.add(button20_18);

		JRadioButton button20_19 = new JRadioButton("");
		button20_19.setBounds(380, 357, 20, 23);
		panel_4.add(button20_19);

		JRadioButton button20_20 = new JRadioButton("");
		button20_20.setBounds(400, 357, 20, 23);
		panel_4.add(button20_20);

		JRadioButton button20_21 = new JRadioButton("");
		button20_21.setBounds(420, 357, 20, 23);
		panel_4.add(button20_21);

		JRadioButton button20_22 = new JRadioButton("");
		button20_22.setBounds(440, 357, 20, 23);
		panel_4.add(button20_22);

		JRadioButton button20_23 = new JRadioButton("");
		button20_23.setBounds(460, 357, 20, 23);
		panel_4.add(button20_23);

		JRadioButton button20_24 = new JRadioButton("");
		button20_24.setBounds(480, 357, 20, 23);
		panel_4.add(button20_24);

		JRadioButton button20_25 = new JRadioButton("");
		button20_25.setBounds(500, 357, 20, 23);
		panel_4.add(button20_25);

		JRadioButton button21_1 = new JRadioButton("");
		button21_1.setBounds(20, 375, 20, 23);
		panel_4.add(button21_1);

		JRadioButton button21_2 = new JRadioButton("");
		button21_2.setBounds(40, 375, 20, 23);
		panel_4.add(button21_2);

		JRadioButton button21_3 = new JRadioButton("");
		button21_3.setBounds(60, 375, 20, 23);
		panel_4.add(button21_3);

		JRadioButton button21_4 = new JRadioButton("");
		button21_4.setBounds(80, 375, 20, 23);
		panel_4.add(button21_4);

		JRadioButton button21_5 = new JRadioButton("");
		button21_5.setBounds(100, 375, 20, 23);
		panel_4.add(button21_5);

		JRadioButton button21_6 = new JRadioButton("");
		button21_6.setBounds(120, 375, 20, 23);
		panel_4.add(button21_6);

		JRadioButton button21_7 = new JRadioButton("");
		button21_7.setBounds(140, 375, 20, 23);
		panel_4.add(button21_7);

		JRadioButton button21_8 = new JRadioButton("");
		button21_8.setBounds(160, 375, 20, 23);
		panel_4.add(button21_8);

		JRadioButton button21_9 = new JRadioButton("");
		button21_9.setBounds(180, 375, 20, 23);
		panel_4.add(button21_9);

		JRadioButton button21_10 = new JRadioButton("");
		button21_10.setBounds(200, 375, 20, 23);
		panel_4.add(button21_10);

		JRadioButton button21_11 = new JRadioButton("");
		button21_11.setBounds(220, 375, 20, 23);
		panel_4.add(button21_11);

		JRadioButton button21_12 = new JRadioButton("");
		button21_12.setBounds(240, 375, 20, 23);
		panel_4.add(button21_12);

		JRadioButton button21_13 = new JRadioButton("");
		button21_13.setBounds(260, 375, 20, 23);
		panel_4.add(button21_13);

		JRadioButton button21_14 = new JRadioButton("");
		button21_14.setBounds(280, 375, 20, 23);
		panel_4.add(button21_14);

		JRadioButton button21_15 = new JRadioButton("");
		button21_15.setBounds(300, 375, 20, 23);
		panel_4.add(button21_15);

		JRadioButton button21_16 = new JRadioButton("");
		button21_16.setBounds(320, 375, 20, 23);
		panel_4.add(button21_16);

		JRadioButton button21_17 = new JRadioButton("");
		button21_17.setBounds(340, 375, 20, 23);
		panel_4.add(button21_17);

		JRadioButton button21_18 = new JRadioButton("");
		button21_18.setBounds(360, 375, 20, 23);
		panel_4.add(button21_18);

		JRadioButton button21_19 = new JRadioButton("");
		button21_19.setBounds(380, 375, 20, 23);
		panel_4.add(button21_19);

		JRadioButton button21_20 = new JRadioButton("");
		button21_20.setBounds(400, 375, 20, 23);
		panel_4.add(button21_20);

		JRadioButton button21_21 = new JRadioButton("");
		button21_21.setBounds(420, 375, 20, 23);
		panel_4.add(button21_21);

		JRadioButton button21_22 = new JRadioButton("");
		button21_22.setBounds(440, 375, 20, 23);
		panel_4.add(button21_22);

		JRadioButton button21_23 = new JRadioButton("");
		button21_23.setBounds(460, 375, 20, 23);
		panel_4.add(button21_23);

		JRadioButton button21_24 = new JRadioButton("");
		button21_24.setBounds(480, 375, 20, 23);
		panel_4.add(button21_24);

		JRadioButton button21_25 = new JRadioButton("");
		button21_25.setBounds(500, 375, 20, 23);
		panel_4.add(button21_25);

		JRadioButton button22_1 = new JRadioButton("");
		button22_1.setBounds(20, 393, 20, 23);
		panel_4.add(button22_1);

		JRadioButton button22_2 = new JRadioButton("");
		button22_2.setBounds(40, 393, 20, 23);
		panel_4.add(button22_2);

		JRadioButton button22_3 = new JRadioButton("");
		button22_3.setBounds(60, 393, 20, 23);
		panel_4.add(button22_3);

		JRadioButton button22_4 = new JRadioButton("");
		button22_4.setBounds(80, 393, 20, 23);
		panel_4.add(button22_4);

		JRadioButton button22_5 = new JRadioButton("");
		button22_5.setBounds(100, 393, 20, 23);
		panel_4.add(button22_5);

		JRadioButton button22_6 = new JRadioButton("");
		button22_6.setBounds(120, 393, 20, 23);
		panel_4.add(button22_6);

		JRadioButton button22_7 = new JRadioButton("");
		button22_7.setBounds(140, 393, 20, 23);
		panel_4.add(button22_7);

		JRadioButton button22_8 = new JRadioButton("");
		button22_8.setBounds(160, 393, 20, 23);
		panel_4.add(button22_8);

		JRadioButton button22_9 = new JRadioButton("");
		button22_9.setBounds(180, 393, 20, 23);
		panel_4.add(button22_9);

		JRadioButton button22_10 = new JRadioButton("");
		button22_10.setBounds(200, 393, 20, 23);
		panel_4.add(button22_10);

		JRadioButton button22_11 = new JRadioButton("");
		button22_11.setBounds(220, 393, 20, 23);
		panel_4.add(button22_11);

		JRadioButton button22_12 = new JRadioButton("");
		button22_12.setBounds(240, 393, 20, 23);
		panel_4.add(button22_12);

		JRadioButton button22_13 = new JRadioButton("");
		button22_13.setBounds(260, 393, 20, 23);
		panel_4.add(button22_13);

		JRadioButton button22_14 = new JRadioButton("");
		button22_14.setBounds(280, 393, 20, 23);
		panel_4.add(button22_14);

		JRadioButton button22_15 = new JRadioButton("");
		button22_15.setBounds(300, 393, 20, 23);
		panel_4.add(button22_15);

		JRadioButton button22_16 = new JRadioButton("");
		button22_16.setBounds(320, 393, 20, 23);
		panel_4.add(button22_16);

		JRadioButton button22_17 = new JRadioButton("");
		button22_17.setBounds(340, 393, 20, 23);
		panel_4.add(button22_17);

		JRadioButton button22_18 = new JRadioButton("");
		button22_18.setBounds(360, 393, 20, 23);
		panel_4.add(button22_18);

		JRadioButton button22_19 = new JRadioButton("");
		button22_19.setBounds(380, 393, 20, 23);
		panel_4.add(button22_19);

		JRadioButton button22_20 = new JRadioButton("");
		button22_20.setBounds(400, 393, 20, 23);
		panel_4.add(button22_20);

		JRadioButton button22_21 = new JRadioButton("");
		button22_21.setBounds(420, 393, 20, 23);
		panel_4.add(button22_21);

		JRadioButton button22_22 = new JRadioButton("");
		button22_22.setBounds(440, 393, 20, 23);
		panel_4.add(button22_22);

		JRadioButton button22_23 = new JRadioButton("");
		button22_23.setBounds(460, 393, 20, 23);
		panel_4.add(button22_23);

		JRadioButton button22_24 = new JRadioButton("");
		button22_24.setBounds(480, 393, 20, 23);
		panel_4.add(button22_24);

		JRadioButton button22_25 = new JRadioButton("");
		button22_25.setBounds(500, 393, 20, 23);
		panel_4.add(button22_25);

		JRadioButton button23_1 = new JRadioButton("");
		button23_1.setBounds(20, 411, 20, 23);
		panel_4.add(button23_1);

		JRadioButton button23_2 = new JRadioButton("");
		button23_2.setBounds(40, 411, 20, 23);
		panel_4.add(button23_2);

		JRadioButton button23_3 = new JRadioButton("");
		button23_3.setBounds(60, 411, 20, 23);
		panel_4.add(button23_3);

		JRadioButton button23_4 = new JRadioButton("");
		button23_4.setBounds(80, 411, 20, 23);
		panel_4.add(button23_4);

		JRadioButton button23_5 = new JRadioButton("");
		button23_5.setBounds(100, 411, 20, 23);
		panel_4.add(button23_5);

		JRadioButton button23_6 = new JRadioButton("");
		button23_6.setBounds(120, 411, 20, 23);
		panel_4.add(button23_6);

		JRadioButton button23_7 = new JRadioButton("");
		button23_7.setBounds(140, 411, 20, 23);
		panel_4.add(button23_7);

		JRadioButton button23_8 = new JRadioButton("");
		button23_8.setBounds(160, 411, 20, 23);
		panel_4.add(button23_8);

		JRadioButton button23_9 = new JRadioButton("");
		button23_9.setBounds(180, 411, 20, 23);
		panel_4.add(button23_9);

		JRadioButton button23_10 = new JRadioButton("");
		button23_10.setBounds(200, 411, 20, 23);
		panel_4.add(button23_10);

		JRadioButton button23_11 = new JRadioButton("");
		button23_11.setBounds(220, 411, 20, 23);
		panel_4.add(button23_11);

		JRadioButton button23_12 = new JRadioButton("");
		button23_12.setBounds(240, 411, 20, 23);
		panel_4.add(button23_12);

		JRadioButton button23_13 = new JRadioButton("");
		button23_13.setBounds(260, 411, 20, 23);
		panel_4.add(button23_13);

		JRadioButton button23_14 = new JRadioButton("");
		button23_14.setBounds(280, 411, 20, 23);
		panel_4.add(button23_14);

		JRadioButton button23_15 = new JRadioButton("");
		button23_15.setBounds(300, 411, 20, 23);
		panel_4.add(button23_15);

		JRadioButton button23_16 = new JRadioButton("");
		button23_16.setBounds(320, 411, 20, 23);
		panel_4.add(button23_16);

		JRadioButton button23_17 = new JRadioButton("");
		button23_17.setBounds(340, 411, 20, 23);
		panel_4.add(button23_17);

		JRadioButton button23_18 = new JRadioButton("");
		button23_18.setBounds(360, 411, 20, 23);
		panel_4.add(button23_18);

		JRadioButton button23_19 = new JRadioButton("");
		button23_19.setBounds(380, 411, 20, 23);
		panel_4.add(button23_19);

		JRadioButton button23_20 = new JRadioButton("");
		button23_20.setBounds(400, 411, 20, 23);
		panel_4.add(button23_20);

		JRadioButton button23_21 = new JRadioButton("");
		button23_21.setBounds(420, 411, 20, 23);
		panel_4.add(button23_21);

		JRadioButton button23_22 = new JRadioButton("");
		button23_22.setBounds(440, 411, 20, 23);
		panel_4.add(button23_22);

		JRadioButton button23_23 = new JRadioButton("");
		button23_23.setBounds(460, 411, 20, 23);
		panel_4.add(button23_23);

		JRadioButton button23_24 = new JRadioButton("");
		button23_24.setBounds(480, 411, 20, 23);
		panel_4.add(button23_24);

		JRadioButton button23_25 = new JRadioButton("");
		button23_25.setBounds(500, 411, 20, 23);
		panel_4.add(button23_25);

		JRadioButton button24_1 = new JRadioButton("");
		button24_1.setBounds(20, 429, 20, 23);
		panel_4.add(button24_1);

		JRadioButton button24_2 = new JRadioButton("");
		button24_2.setBounds(40, 429, 20, 23);
		panel_4.add(button24_2);

		JRadioButton button24_3 = new JRadioButton("");
		button24_3.setBounds(60, 429, 20, 23);
		panel_4.add(button24_3);

		JRadioButton button24_4 = new JRadioButton("");
		button24_4.setBounds(80, 429, 20, 23);
		panel_4.add(button24_4);

		JRadioButton button24_5 = new JRadioButton("");
		button24_5.setBounds(100, 429, 20, 23);
		panel_4.add(button24_5);

		JRadioButton button24_6 = new JRadioButton("");
		button24_6.setBounds(120, 429, 20, 23);
		panel_4.add(button24_6);

		JRadioButton button24_7 = new JRadioButton("");
		button24_7.setBounds(140, 429, 20, 23);
		panel_4.add(button24_7);

		JRadioButton button24_8 = new JRadioButton("");
		button24_8.setBounds(160, 429, 20, 23);
		panel_4.add(button24_8);

		JRadioButton button24_9 = new JRadioButton("");
		button24_9.setBounds(180, 429, 20, 23);
		panel_4.add(button24_9);

		JRadioButton button24_10 = new JRadioButton("");
		button24_10.setBounds(200, 429, 20, 23);
		panel_4.add(button24_10);

		JRadioButton button24_11 = new JRadioButton("");
		button24_11.setBounds(220, 429, 20, 23);
		panel_4.add(button24_11);

		JRadioButton button24_12 = new JRadioButton("");
		button24_12.setBounds(240, 429, 20, 23);
		panel_4.add(button24_12);

		JRadioButton button24_13 = new JRadioButton("");
		button24_13.setBounds(260, 429, 20, 23);
		panel_4.add(button24_13);

		JRadioButton button24_14 = new JRadioButton("");
		button24_14.setBounds(280, 429, 20, 23);
		panel_4.add(button24_14);

		JRadioButton button24_15 = new JRadioButton("");
		button24_15.setBounds(300, 429, 20, 23);
		panel_4.add(button24_15);

		JRadioButton button24_16 = new JRadioButton("");
		button24_16.setBounds(320, 429, 20, 23);
		panel_4.add(button24_16);

		JRadioButton button24_17 = new JRadioButton("");
		button24_17.setBounds(340, 429, 20, 23);
		panel_4.add(button24_17);

		JRadioButton button24_18 = new JRadioButton("");
		button24_18.setBounds(360, 429, 20, 23);
		panel_4.add(button24_18);

		JRadioButton button24_19 = new JRadioButton("");
		button24_19.setBounds(380, 429, 20, 23);
		panel_4.add(button24_19);

		JRadioButton button24_20 = new JRadioButton("");
		button24_20.setBounds(400, 429, 20, 23);
		panel_4.add(button24_20);

		JRadioButton button24_21 = new JRadioButton("");
		button24_21.setBounds(420, 429, 20, 23);
		panel_4.add(button24_21);

		JRadioButton button24_22 = new JRadioButton("");
		button24_22.setBounds(440, 429, 20, 23);
		panel_4.add(button24_22);

		JRadioButton button24_23 = new JRadioButton("");
		button24_23.setBounds(460, 429, 20, 23);
		panel_4.add(button24_23);

		JRadioButton button24_24 = new JRadioButton("");
		button24_24.setBounds(480, 429, 20, 23);
		panel_4.add(button24_24);

		JRadioButton button24_25 = new JRadioButton("");
		button24_25.setBounds(500, 429, 20, 23);
		panel_4.add(button24_25);

		JRadioButton button25_1 = new JRadioButton("");
		button25_1.setBounds(20, 447, 20, 23);
		panel_4.add(button25_1);

		JRadioButton button25_2 = new JRadioButton("");
		button25_2.setBounds(40, 447, 20, 23);
		panel_4.add(button25_2);

		JRadioButton button25_3 = new JRadioButton("");
		button25_3.setBounds(60, 447, 20, 23);
		panel_4.add(button25_3);

		JRadioButton button25_4 = new JRadioButton("");
		button25_4.setBounds(80, 447, 20, 23);
		panel_4.add(button25_4);

		JRadioButton button25_5 = new JRadioButton("");
		button25_5.setBounds(100, 447, 20, 23);
		panel_4.add(button25_5);

		JRadioButton button25_6 = new JRadioButton("");
		button25_6.setBounds(120, 447, 20, 23);
		panel_4.add(button25_6);

		JRadioButton button25_7 = new JRadioButton("");
		button25_7.setBounds(140, 447, 20, 23);
		panel_4.add(button25_7);

		JRadioButton button25_8 = new JRadioButton("");
		button25_8.setBounds(160, 447, 20, 23);
		panel_4.add(button25_8);

		JRadioButton button25_9 = new JRadioButton("");
		button25_9.setBounds(180, 447, 20, 23);
		panel_4.add(button25_9);

		JRadioButton button25_10 = new JRadioButton("");
		button25_10.setBounds(200, 447, 20, 23);
		panel_4.add(button25_10);

		JRadioButton button25_11 = new JRadioButton("");
		button25_11.setBounds(220, 447, 20, 23);
		panel_4.add(button25_11);

		JRadioButton button25_12 = new JRadioButton("");
		button25_12.setBounds(240, 447, 20, 23);
		panel_4.add(button25_12);

		JRadioButton button25_13 = new JRadioButton("");
		button25_13.setBounds(260, 447, 20, 23);
		panel_4.add(button25_13);

		JRadioButton button25_14 = new JRadioButton("");
		button25_14.setBounds(280, 447, 20, 23);
		panel_4.add(button25_14);

		JRadioButton button25_15 = new JRadioButton("");
		button25_15.setBounds(300, 447, 20, 23);
		panel_4.add(button25_15);

		JRadioButton button25_16 = new JRadioButton("");
		button25_16.setBounds(320, 447, 20, 23);
		panel_4.add(button25_16);

		JRadioButton button25_17 = new JRadioButton("");
		button25_17.setBounds(340, 447, 20, 23);
		panel_4.add(button25_17);

		JRadioButton button25_18 = new JRadioButton("");
		button25_18.setBounds(360, 447, 20, 23);
		panel_4.add(button25_18);

		JRadioButton button25_19 = new JRadioButton("");
		button25_19.setBounds(380, 447, 20, 23);
		panel_4.add(button25_19);

		JRadioButton button25_20 = new JRadioButton("");
		button25_20.setBounds(400, 447, 20, 23);
		panel_4.add(button25_20);

		JRadioButton button25_21 = new JRadioButton("");
		button25_21.setBounds(420, 447, 20, 23);
		panel_4.add(button25_21);

		JRadioButton button25_22 = new JRadioButton("");
		button25_22.setBounds(440, 447, 20, 23);
		panel_4.add(button25_22);

		JRadioButton button25_23 = new JRadioButton("");
		button25_23.setBounds(460, 447, 20, 23);
		panel_4.add(button25_23);

		JRadioButton button25_24 = new JRadioButton("");
		button25_24.setBounds(480, 447, 20, 23);
		panel_4.add(button25_24);

		JRadioButton button25_25 = new JRadioButton("");
		button25_25.setBounds(500, 447, 20, 23);
		panel_4.add(button25_25);

		buttons = new JRadioButton[26][26];
		buttons[1][1] = button1_1;
		buttons[1][2] = button1_2;
		buttons[1][3] = button1_3;
		buttons[1][4] = button1_4;
		buttons[1][5] = button1_5;
		buttons[1][6] = button1_6;
		buttons[1][7] = button1_7;
		buttons[1][8] = button1_8;
		buttons[1][9] = button1_9;
		buttons[1][10] = button1_10;
		buttons[1][11] = button1_11;
		buttons[1][12] = button1_12;
		buttons[1][13] = button1_13;
		buttons[1][14] = button1_14;
		buttons[1][15] = button1_15;
		buttons[1][16] = button1_16;
		buttons[1][17] = button1_17;
		buttons[1][18] = button1_18;
		buttons[1][19] = button1_19;
		buttons[1][20] = button1_20;
		buttons[1][21] = button1_21;
		buttons[1][22] = button1_22;
		buttons[1][23] = button1_23;
		buttons[1][24] = button1_24;
		buttons[1][25] = button1_25;
		buttons[2][1] = button2_1;
		buttons[2][2] = button2_2;
		buttons[2][3] = button2_3;
		buttons[2][4] = button2_4;
		buttons[2][5] = button2_5;
		buttons[2][6] = button2_6;
		buttons[2][7] = button2_7;
		buttons[2][8] = button2_8;
		buttons[2][9] = button2_9;
		buttons[2][10] = button2_10;
		buttons[2][11] = button2_11;
		buttons[2][12] = button2_12;
		buttons[2][13] = button2_13;
		buttons[2][14] = button2_14;
		buttons[2][15] = button2_15;
		buttons[2][16] = button2_16;
		buttons[2][17] = button2_17;
		buttons[2][18] = button2_18;
		buttons[2][19] = button2_19;
		buttons[2][20] = button2_20;
		buttons[2][21] = button2_21;
		buttons[2][22] = button2_22;
		buttons[2][23] = button2_23;
		buttons[2][24] = button2_24;
		buttons[2][25] = button2_25;
		buttons[3][1] = button3_1;
		buttons[3][2] = button3_2;
		buttons[3][3] = button3_3;
		buttons[3][4] = button3_4;
		buttons[3][5] = button3_5;
		buttons[3][6] = button3_6;
		buttons[3][7] = button3_7;
		buttons[3][8] = button3_8;
		buttons[3][9] = button3_9;
		buttons[3][10] = button3_10;
		buttons[3][11] = button3_11;
		buttons[3][12] = button3_12;
		buttons[3][13] = button3_13;
		buttons[3][14] = button3_14;
		buttons[3][15] = button3_15;
		buttons[3][16] = button3_16;
		buttons[3][17] = button3_17;
		buttons[3][18] = button3_18;
		buttons[3][19] = button3_19;
		buttons[3][20] = button3_20;
		buttons[3][21] = button3_21;
		buttons[3][22] = button3_22;
		buttons[3][23] = button3_23;
		buttons[3][24] = button3_24;
		buttons[3][25] = button3_25;
		buttons[4][1] = button4_1;
		buttons[4][2] = button4_2;
		buttons[4][3] = button4_3;
		buttons[4][4] = button4_4;
		buttons[4][5] = button4_5;
		buttons[4][6] = button4_6;
		buttons[4][7] = button4_7;
		buttons[4][8] = button4_8;
		buttons[4][9] = button4_9;
		buttons[4][10] = button4_10;
		buttons[4][11] = button4_11;
		buttons[4][12] = button4_12;
		buttons[4][13] = button4_13;
		buttons[4][14] = button4_14;
		buttons[4][15] = button4_15;
		buttons[4][16] = button4_16;
		buttons[4][17] = button4_17;
		buttons[4][18] = button4_18;
		buttons[4][19] = button4_19;
		buttons[4][20] = button4_20;
		buttons[4][21] = button4_21;
		buttons[4][22] = button4_22;
		buttons[4][23] = button4_23;
		buttons[4][24] = button4_24;
		buttons[4][25] = button4_25;
		buttons[5][1] = button5_1;
		buttons[5][2] = button5_2;
		buttons[5][3] = button5_3;
		buttons[5][4] = button5_4;
		buttons[5][5] = button5_5;
		buttons[5][6] = button5_6;
		buttons[5][7] = button5_7;
		buttons[5][8] = button5_8;
		buttons[5][9] = button5_9;
		buttons[5][10] = button5_10;
		buttons[5][11] = button5_11;
		buttons[5][12] = button5_12;
		buttons[5][13] = button5_13;
		buttons[5][14] = button5_14;
		buttons[5][15] = button5_15;
		buttons[5][16] = button5_16;
		buttons[5][17] = button5_17;
		buttons[5][18] = button5_18;
		buttons[5][19] = button5_19;
		buttons[5][20] = button5_20;
		buttons[5][21] = button5_21;
		buttons[5][22] = button5_22;
		buttons[5][23] = button5_23;
		buttons[5][24] = button5_24;
		buttons[5][25] = button5_25;
		buttons[6][1] = button6_1;
		buttons[6][2] = button6_2;
		buttons[6][3] = button6_3;
		buttons[6][4] = button6_4;
		buttons[6][5] = button6_5;
		buttons[6][6] = button6_6;
		buttons[6][7] = button6_7;
		buttons[6][8] = button6_8;
		buttons[6][9] = button6_9;
		buttons[6][10] = button6_10;
		buttons[6][11] = button6_11;
		buttons[6][12] = button6_12;
		buttons[6][13] = button6_13;
		buttons[6][14] = button6_14;
		buttons[6][15] = button6_15;
		buttons[6][16] = button6_16;
		buttons[6][17] = button6_17;
		buttons[6][18] = button6_18;
		buttons[6][19] = button6_19;
		buttons[6][20] = button6_20;
		buttons[6][21] = button6_21;
		buttons[6][22] = button6_22;
		buttons[6][23] = button6_23;
		buttons[6][24] = button6_24;
		buttons[6][25] = button6_25;
		buttons[7][1] = button7_1;
		buttons[7][2] = button7_2;
		buttons[7][3] = button7_3;
		buttons[7][4] = button7_4;
		buttons[7][5] = button7_5;
		buttons[7][6] = button7_6;
		buttons[7][7] = button7_7;
		buttons[7][8] = button7_8;
		buttons[7][9] = button7_9;
		buttons[7][10] = button7_10;
		buttons[7][11] = button7_11;
		buttons[7][12] = button7_12;
		buttons[7][13] = button7_13;
		buttons[7][14] = button7_14;
		buttons[7][15] = button7_15;
		buttons[7][16] = button7_16;
		buttons[7][17] = button7_17;
		buttons[7][18] = button7_18;
		buttons[7][19] = button7_19;
		buttons[7][20] = button7_20;
		buttons[7][21] = button7_21;
		buttons[7][22] = button7_22;
		buttons[7][23] = button7_23;
		buttons[7][24] = button7_24;
		buttons[7][25] = button7_25;
		buttons[8][1] = button8_1;
		buttons[8][2] = button8_2;
		buttons[8][3] = button8_3;
		buttons[8][4] = button8_4;
		buttons[8][5] = button8_5;
		buttons[8][6] = button8_6;
		buttons[8][7] = button8_7;
		buttons[8][8] = button8_8;
		buttons[8][9] = button8_9;
		buttons[8][10] = button8_10;
		buttons[8][11] = button8_11;
		buttons[8][12] = button8_12;
		buttons[8][13] = button8_13;
		buttons[8][14] = button8_14;
		buttons[8][15] = button8_15;
		buttons[8][16] = button8_16;
		buttons[8][17] = button8_17;
		buttons[8][18] = button8_18;
		buttons[8][19] = button8_19;
		buttons[8][20] = button8_20;
		buttons[8][21] = button8_21;
		buttons[8][22] = button8_22;
		buttons[8][23] = button8_23;
		buttons[8][24] = button8_24;
		buttons[8][25] = button8_25;
		buttons[9][1] = button9_1;
		buttons[9][2] = button9_2;
		buttons[9][3] = button9_3;
		buttons[9][4] = button9_4;
		buttons[9][5] = button9_5;
		buttons[9][6] = button9_6;
		buttons[9][7] = button9_7;
		buttons[9][8] = button9_8;
		buttons[9][9] = button9_9;
		buttons[9][10] = button9_10;
		buttons[9][11] = button9_11;
		buttons[9][12] = button9_12;
		buttons[9][13] = button9_13;
		buttons[9][14] = button9_14;
		buttons[9][15] = button9_15;
		buttons[9][16] = button9_16;
		buttons[9][17] = button9_17;
		buttons[9][18] = button9_18;
		buttons[9][19] = button9_19;
		buttons[9][20] = button9_20;
		buttons[9][21] = button9_21;
		buttons[9][22] = button9_22;
		buttons[9][23] = button9_23;
		buttons[9][24] = button9_24;
		buttons[9][25] = button9_25;
		buttons[10][1] = button10_1;
		buttons[10][2] = button10_2;
		buttons[10][3] = button10_3;
		buttons[10][4] = button10_4;
		buttons[10][5] = button10_5;
		buttons[10][6] = button10_6;
		buttons[10][7] = button10_7;
		buttons[10][8] = button10_8;
		buttons[10][9] = button10_9;
		buttons[10][10] = button10_10;
		buttons[10][11] = button10_11;
		buttons[10][12] = button10_12;
		buttons[10][13] = button10_13;
		buttons[10][14] = button10_14;
		buttons[10][15] = button10_15;
		buttons[10][16] = button10_16;
		buttons[10][17] = button10_17;
		buttons[10][18] = button10_18;
		buttons[10][19] = button10_19;
		buttons[10][20] = button10_20;
		buttons[10][21] = button10_21;
		buttons[10][22] = button10_22;
		buttons[10][23] = button10_23;
		buttons[10][24] = button10_24;
		buttons[10][25] = button10_25;
		buttons[11][1] = button11_1;
		buttons[11][2] = button11_2;
		buttons[11][3] = button11_3;
		buttons[11][4] = button11_4;
		buttons[11][5] = button11_5;
		buttons[11][6] = button11_6;
		buttons[11][7] = button11_7;
		buttons[11][8] = button11_8;
		buttons[11][9] = button11_9;
		buttons[11][10] = button11_10;
		buttons[11][11] = button11_11;
		buttons[11][12] = button11_12;
		buttons[11][13] = button11_13;
		buttons[11][14] = button11_14;
		buttons[11][15] = button11_15;
		buttons[11][16] = button11_16;
		buttons[11][17] = button11_17;
		buttons[11][18] = button11_18;
		buttons[11][19] = button11_19;
		buttons[11][20] = button11_20;
		buttons[11][21] = button11_21;
		buttons[11][22] = button11_22;
		buttons[11][23] = button11_23;
		buttons[11][24] = button11_24;
		buttons[11][25] = button11_25;
		buttons[12][1] = button12_1;
		buttons[12][2] = button12_2;
		buttons[12][3] = button12_3;
		buttons[12][4] = button12_4;
		buttons[12][5] = button12_5;
		buttons[12][6] = button12_6;
		buttons[12][7] = button12_7;
		buttons[12][8] = button12_8;
		buttons[12][9] = button12_9;
		buttons[12][10] = button12_10;
		buttons[12][11] = button12_11;
		buttons[12][12] = button12_12;
		buttons[12][13] = button12_13;
		buttons[12][14] = button12_14;
		buttons[12][15] = button12_15;
		buttons[12][16] = button12_16;
		buttons[12][17] = button12_17;
		buttons[12][18] = button12_18;
		buttons[12][19] = button12_19;
		buttons[12][20] = button12_20;
		buttons[12][21] = button12_21;
		buttons[12][22] = button12_22;
		buttons[12][23] = button12_23;
		buttons[12][24] = button12_24;
		buttons[12][25] = button12_25;
		buttons[13][1] = button13_1;
		buttons[13][2] = button13_2;
		buttons[13][3] = button13_3;
		buttons[13][4] = button13_4;
		buttons[13][5] = button13_5;
		buttons[13][6] = button13_6;
		buttons[13][7] = button13_7;
		buttons[13][8] = button13_8;
		buttons[13][9] = button13_9;
		buttons[13][10] = button13_10;
		buttons[13][11] = button13_11;
		buttons[13][12] = button13_12;
		buttons[13][13] = button13_13;
		buttons[13][14] = button13_14;
		buttons[13][15] = button13_15;
		buttons[13][16] = button13_16;
		buttons[13][17] = button13_17;
		buttons[13][18] = button13_18;
		buttons[13][19] = button13_19;
		buttons[13][20] = button13_20;
		buttons[13][21] = button13_21;
		buttons[13][22] = button13_22;
		buttons[13][23] = button13_23;
		buttons[13][24] = button13_24;
		buttons[13][25] = button13_25;
		buttons[14][1] = button14_1;
		buttons[14][2] = button14_2;
		buttons[14][3] = button14_3;
		buttons[14][4] = button14_4;
		buttons[14][5] = button14_5;
		buttons[14][6] = button14_6;
		buttons[14][7] = button14_7;
		buttons[14][8] = button14_8;
		buttons[14][9] = button14_9;
		buttons[14][10] = button14_10;
		buttons[14][11] = button14_11;
		buttons[14][12] = button14_12;
		buttons[14][13] = button14_13;
		buttons[14][14] = button14_14;
		buttons[14][15] = button14_15;
		buttons[14][16] = button14_16;
		buttons[14][17] = button14_17;
		buttons[14][18] = button14_18;
		buttons[14][19] = button14_19;
		buttons[14][20] = button14_20;
		buttons[14][21] = button14_21;
		buttons[14][22] = button14_22;
		buttons[14][23] = button14_23;
		buttons[14][24] = button14_24;
		buttons[14][25] = button14_25;
		buttons[15][1] = button15_1;
		buttons[15][2] = button15_2;
		buttons[15][3] = button15_3;
		buttons[15][4] = button15_4;
		buttons[15][5] = button15_5;
		buttons[15][6] = button15_6;
		buttons[15][7] = button15_7;
		buttons[15][8] = button15_8;
		buttons[15][9] = button15_9;
		buttons[15][10] = button15_10;
		buttons[15][11] = button15_11;
		buttons[15][12] = button15_12;
		buttons[15][13] = button15_13;
		buttons[15][14] = button15_14;
		buttons[15][15] = button15_15;
		buttons[15][16] = button15_16;
		buttons[15][17] = button15_17;
		buttons[15][18] = button15_18;
		buttons[15][19] = button15_19;
		buttons[15][20] = button15_20;
		buttons[15][21] = button15_21;
		buttons[15][22] = button15_22;
		buttons[15][23] = button15_23;
		buttons[15][24] = button15_24;
		buttons[15][25] = button15_25;
		buttons[16][1] = button16_1;
		buttons[16][2] = button16_2;
		buttons[16][3] = button16_3;
		buttons[16][4] = button16_4;
		buttons[16][5] = button16_5;
		buttons[16][6] = button16_6;
		buttons[16][7] = button16_7;
		buttons[16][8] = button16_8;
		buttons[16][9] = button16_9;
		buttons[16][10] = button16_10;
		buttons[16][11] = button16_11;
		buttons[16][12] = button16_12;
		buttons[16][13] = button16_13;
		buttons[16][14] = button16_14;
		buttons[16][15] = button16_15;
		buttons[16][16] = button16_16;
		buttons[16][17] = button16_17;
		buttons[16][18] = button16_18;
		buttons[16][19] = button16_19;
		buttons[16][20] = button16_20;
		buttons[16][21] = button16_21;
		buttons[16][22] = button16_22;
		buttons[16][23] = button16_23;
		buttons[16][24] = button16_24;
		buttons[16][25] = button16_25;
		buttons[17][1] = button17_1;
		buttons[17][2] = button17_2;
		buttons[17][3] = button17_3;
		buttons[17][4] = button17_4;
		buttons[17][5] = button17_5;
		buttons[17][6] = button17_6;
		buttons[17][7] = button17_7;
		buttons[17][8] = button17_8;
		buttons[17][9] = button17_9;
		buttons[17][10] = button17_10;
		buttons[17][11] = button17_11;
		buttons[17][12] = button17_12;
		buttons[17][13] = button17_13;
		buttons[17][14] = button17_14;
		buttons[17][15] = button17_15;
		buttons[17][16] = button17_16;
		buttons[17][17] = button17_17;
		buttons[17][18] = button17_18;
		buttons[17][19] = button17_19;
		buttons[17][20] = button17_20;
		buttons[17][21] = button17_21;
		buttons[17][22] = button17_22;
		buttons[17][23] = button17_23;
		buttons[17][24] = button17_24;
		buttons[17][25] = button17_25;
		buttons[18][1] = button18_1;
		buttons[18][2] = button18_2;
		buttons[18][3] = button18_3;
		buttons[18][4] = button18_4;
		buttons[18][5] = button18_5;
		buttons[18][6] = button18_6;
		buttons[18][7] = button18_7;
		buttons[18][8] = button18_8;
		buttons[18][9] = button18_9;
		buttons[18][10] = button18_10;
		buttons[18][11] = button18_11;
		buttons[18][12] = button18_12;
		buttons[18][13] = button18_13;
		buttons[18][14] = button18_14;
		buttons[18][15] = button18_15;
		buttons[18][16] = button18_16;
		buttons[18][17] = button18_17;
		buttons[18][18] = button18_18;
		buttons[18][19] = button18_19;
		buttons[18][20] = button18_20;
		buttons[18][21] = button18_21;
		buttons[18][22] = button18_22;
		buttons[18][23] = button18_23;
		buttons[18][24] = button18_24;
		buttons[18][25] = button18_25;
		buttons[19][1] = button19_1;
		buttons[19][2] = button19_2;
		buttons[19][3] = button19_3;
		buttons[19][4] = button19_4;
		buttons[19][5] = button19_5;
		buttons[19][6] = button19_6;
		buttons[19][7] = button19_7;
		buttons[19][8] = button19_8;
		buttons[19][9] = button19_9;
		buttons[19][10] = button19_10;
		buttons[19][11] = button19_11;
		buttons[19][12] = button19_12;
		buttons[19][13] = button19_13;
		buttons[19][14] = button19_14;
		buttons[19][15] = button19_15;
		buttons[19][16] = button19_16;
		buttons[19][17] = button19_17;
		buttons[19][18] = button19_18;
		buttons[19][19] = button19_19;
		buttons[19][20] = button19_20;
		buttons[19][21] = button19_21;
		buttons[19][22] = button19_22;
		buttons[19][23] = button19_23;
		buttons[19][24] = button19_24;
		buttons[19][25] = button19_25;
		buttons[20][1] = button20_1;
		buttons[20][2] = button20_2;
		buttons[20][3] = button20_3;
		buttons[20][4] = button20_4;
		buttons[20][5] = button20_5;
		buttons[20][6] = button20_6;
		buttons[20][7] = button20_7;
		buttons[20][8] = button20_8;
		buttons[20][9] = button20_9;
		buttons[20][10] = button20_10;
		buttons[20][11] = button20_11;
		buttons[20][12] = button20_12;
		buttons[20][13] = button20_13;
		buttons[20][14] = button20_14;
		buttons[20][15] = button20_15;
		buttons[20][16] = button20_16;
		buttons[20][17] = button20_17;
		buttons[20][18] = button20_18;
		buttons[20][19] = button20_19;
		buttons[20][20] = button20_20;
		buttons[20][21] = button20_21;
		buttons[20][22] = button20_22;
		buttons[20][23] = button20_23;
		buttons[20][24] = button20_24;
		buttons[20][25] = button20_25;
		buttons[21][1] = button21_1;
		buttons[21][2] = button21_2;
		buttons[21][3] = button21_3;
		buttons[21][4] = button21_4;
		buttons[21][5] = button21_5;
		buttons[21][6] = button21_6;
		buttons[21][7] = button21_7;
		buttons[21][8] = button21_8;
		buttons[21][9] = button21_9;
		buttons[21][10] = button21_10;
		buttons[21][11] = button21_11;
		buttons[21][12] = button21_12;
		buttons[21][13] = button21_13;
		buttons[21][14] = button21_14;
		buttons[21][15] = button21_15;
		buttons[21][16] = button21_16;
		buttons[21][17] = button21_17;
		buttons[21][18] = button21_18;
		buttons[21][19] = button21_19;
		buttons[21][20] = button21_20;
		buttons[21][21] = button21_21;
		buttons[21][22] = button21_22;
		buttons[21][23] = button21_23;
		buttons[21][24] = button21_24;
		buttons[21][25] = button21_25;
		buttons[22][1] = button22_1;
		buttons[22][2] = button22_2;
		buttons[22][3] = button22_3;
		buttons[22][4] = button22_4;
		buttons[22][5] = button22_5;
		buttons[22][6] = button22_6;
		buttons[22][7] = button22_7;
		buttons[22][8] = button22_8;
		buttons[22][9] = button22_9;
		buttons[22][10] = button22_10;
		buttons[22][11] = button22_11;
		buttons[22][12] = button22_12;
		buttons[22][13] = button22_13;
		buttons[22][14] = button22_14;
		buttons[22][15] = button22_15;
		buttons[22][16] = button22_16;
		buttons[22][17] = button22_17;
		buttons[22][18] = button22_18;
		buttons[22][19] = button22_19;
		buttons[22][20] = button22_20;
		buttons[22][21] = button22_21;
		buttons[22][22] = button22_22;
		buttons[22][23] = button22_23;
		buttons[22][24] = button22_24;
		buttons[22][25] = button22_25;
		buttons[23][1] = button23_1;
		buttons[23][2] = button23_2;
		buttons[23][3] = button23_3;
		buttons[23][4] = button23_4;
		buttons[23][5] = button23_5;
		buttons[23][6] = button23_6;
		buttons[23][7] = button23_7;
		buttons[23][8] = button23_8;
		buttons[23][9] = button23_9;
		buttons[23][10] = button23_10;
		buttons[23][11] = button23_11;
		buttons[23][12] = button23_12;
		buttons[23][13] = button23_13;
		buttons[23][14] = button23_14;
		buttons[23][15] = button23_15;
		buttons[23][16] = button23_16;
		buttons[23][17] = button23_17;
		buttons[23][18] = button23_18;
		buttons[23][19] = button23_19;
		buttons[23][20] = button23_20;
		buttons[23][21] = button23_21;
		buttons[23][22] = button23_22;
		buttons[23][23] = button23_23;
		buttons[23][24] = button23_24;
		buttons[23][25] = button23_25;
		buttons[24][1] = button24_1;
		buttons[24][2] = button24_2;
		buttons[24][3] = button24_3;
		buttons[24][4] = button24_4;
		buttons[24][5] = button24_5;
		buttons[24][6] = button24_6;
		buttons[24][7] = button24_7;
		buttons[24][8] = button24_8;
		buttons[24][9] = button24_9;
		buttons[24][10] = button24_10;
		buttons[24][11] = button24_11;
		buttons[24][12] = button24_12;
		buttons[24][13] = button24_13;
		buttons[24][14] = button24_14;
		buttons[24][15] = button24_15;
		buttons[24][16] = button24_16;
		buttons[24][17] = button24_17;
		buttons[24][18] = button24_18;
		buttons[24][19] = button24_19;
		buttons[24][20] = button24_20;
		buttons[24][21] = button24_21;
		buttons[24][22] = button24_22;
		buttons[24][23] = button24_23;
		buttons[24][24] = button24_24;
		buttons[24][25] = button24_25;
		buttons[25][1] = button25_1;
		buttons[25][2] = button25_2;
		buttons[25][3] = button25_3;
		buttons[25][4] = button25_4;
		buttons[25][5] = button25_5;
		buttons[25][6] = button25_6;
		buttons[25][7] = button25_7;
		buttons[25][8] = button25_8;
		buttons[25][9] = button25_9;
		buttons[25][10] = button25_10;
		buttons[25][11] = button25_11;
		buttons[25][12] = button25_12;
		buttons[25][13] = button25_13;
		buttons[25][14] = button25_14;
		buttons[25][15] = button25_15;
		buttons[25][16] = button25_16;
		buttons[25][17] = button25_17;
		buttons[25][18] = button25_18;
		buttons[25][19] = button25_19;
		buttons[25][20] = button25_20;
		buttons[25][21] = button25_21;
		buttons[25][22] = button25_22;
		buttons[25][23] = button25_23;
		buttons[25][24] = button25_24;
		buttons[25][25] = button25_25;

		for (i = 1; i < 26; i++)
			for (j = 1; j < 26; j++) {
				if (i == j)
					buttons[i][i].setEnabled(false);
				buttons[i][j].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JRadioButton jrb = (JRadioButton) e.getSource();
						for (i = 1; i < 26; i++)
							for (j = 1; j < 26; j++)
								if (jrb.equals(buttons[i][j]))
									buttons[j][i].setSelected(buttons[i][j]
											.isSelected());

					}
				});
			}
		AnimationControl.form = this.frmGraphDraw;

		final JPanel panel_help = new JPanel();
		panel_help.setVisible(false);
		panel_help.setEnabled(false);
		panel_help.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_help.setBounds(5, 110, 774, 496);
		frmGraphDraw.getContentPane().add(panel_help);
		panel_help.setLayout(null);

		JLabel lblFirstTimeUser = new JLabel("First time user demo");
		lblFirstTimeUser.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblFirstTimeUser.setBounds(5, 5, 112, 15);
		panel_help.add(lblFirstTimeUser);

		JLabel lblToDemonstrateThe = new JLabel(
				"To demonstrate the usage of this software, please click the import demo button. This will import a 21 nodes graph with the following automorphism");
		lblToDemonstrateThe.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblToDemonstrateThe.setBounds(12, 25, 749, 15);
		panel_help.add(lblToDemonstrateThe);

		JLabel lblGroupGenerator = new JLabel(
				"group generator: (1,8,7), (3,17,13), (4,11,19), (5,20,10), (6,14,16) and the following adjaciency matrix:");
		lblGroupGenerator.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblGroupGenerator.setBounds(12, 40, 530, 15);
		panel_help.add(lblGroupGenerator);

		JLabel label = new JLabel("011111000000000000000");
		label.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label.setBounds(17, 55, 157, 15);
		panel_help.add(label);

		JLabel label_26 = new JLabel("100000111000000000000");
		label_26.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_26.setBounds(17, 62, 157, 15);
		panel_help.add(label_26);

		JLabel label_27 = new JLabel("100000000111000000000");
		label_27.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_27.setBounds(17, 69, 157, 15);
		panel_help.add(label_27);

		JLabel label_28 = new JLabel("100000000000111000000");
		label_28.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_28.setBounds(17, 76, 157, 15);
		panel_help.add(label_28);

		JLabel label_29 = new JLabel("100000000000000111000");
		label_29.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_29.setBounds(17, 83, 157, 15);
		panel_help.add(label_29);

		JLabel label_30 = new JLabel("100000000000000000111");
		label_30.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_30.setBounds(17, 90, 157, 15);
		panel_help.add(label_30);

		JLabel label_56 = new JLabel("010000000100100100100");
		label_56.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_56.setBounds(17, 97, 157, 15);
		panel_help.add(label_56);

		JLabel label_57 = new JLabel("010000000010010010010");
		label_57.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_57.setBounds(17, 104, 157, 15);
		panel_help.add(label_57);

		JLabel label_58 = new JLabel("010000000001001001000");
		label_58.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_58.setBounds(17, 111, 157, 15);
		panel_help.add(label_58);

		JLabel label_59 = new JLabel("001000100000010001000");
		label_59.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_59.setBounds(17, 118, 157, 15);
		panel_help.add(label_59);

		JLabel label_60 = new JLabel("001000010000001100000");
		label_60.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_60.setBounds(17, 125, 157, 15);
		panel_help.add(label_60);

		JLabel label_61 = new JLabel("001000001000100010001");
		label_61.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_61.setBounds(17, 132, 157, 15);
		panel_help.add(label_61);

		JLabel label_62 = new JLabel("000100100001000000010");
		label_62.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_62.setBounds(17, 139, 157, 15);
		panel_help.add(label_62);

		JLabel label_63 = new JLabel("000100010100000000001");
		label_63.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_63.setBounds(17, 146, 157, 15);
		panel_help.add(label_63);

		JLabel label_64 = new JLabel("000100001010000000100");
		label_64.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_64.setBounds(17, 153, 157, 15);
		panel_help.add(label_64);

		JLabel label_65 = new JLabel("000010100010000000001");
		label_65.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_65.setBounds(17, 160, 157, 15);
		panel_help.add(label_65);

		JLabel label_66 = new JLabel("000010010001000000100");
		label_66.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_66.setBounds(17, 167, 157, 15);
		panel_help.add(label_66);

		JLabel label_67 = new JLabel("000010001100000000010");
		label_67.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_67.setBounds(17, 174, 157, 15);
		panel_help.add(label_67);

		JLabel label_68 = new JLabel("000001100000001010000");
		label_68.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_68.setBounds(17, 181, 157, 15);
		panel_help.add(label_68);

		JLabel label_69 = new JLabel("000001010000100001000");
		label_69.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_69.setBounds(17, 188, 157, 15);
		panel_help.add(label_69);

		JLabel label_70 = new JLabel("000001000001010100000");
		label_70.setFont(new Font("Monospaced", Font.PLAIN, 10));
		label_70.setBounds(17, 195, 157, 15);
		panel_help.add(label_70);

		JLabel lblAfterImportingThe = new JLabel(
				"After importing the matrix, select one of the 6 options from the \"Draw mode\" panel. Each option will represent the");
		lblAfterImportingThe.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblAfterImportingThe.setBounds(167, 56, 597, 15);
		panel_help.add(lblAfterImportingThe);

		JLabel lblGraphInA = new JLabel("graph in a different way as follows:");
		lblGraphInA.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblGraphInA.setBounds(167, 71, 582, 15);
		panel_help.add(lblGraphInA);

		JLabel lblRandom = new JLabel(
				"1. Random -- will simply place every node at a random position on the canvas area; this option does not use the");
		lblRandom.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblRandom.setBounds(167, 86, 597, 15);
		panel_help.add(lblRandom);

		JLabel lblAutomorphismGroupGenerators = new JLabel(
				"                     automorphism group generators. There are 2 optimisations to the random mode: reduction of the sum of");
		lblAutomorphismGroupGenerators.setFont(new Font("Comic Sans MS",
				Font.PLAIN, 11));
		lblAutomorphismGroupGenerators.setBounds(167, 101, 597, 15);
		panel_help.add(lblAutomorphismGroupGenerators);

		JLabel lblThereAre = new JLabel(
				"                     all edge lengths and of the number of edge crossings; these are done by swapping nodes around.");
		lblThereAre.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblThereAre.setBounds(167, 116, 582, 15);
		panel_help.add(lblThereAre);

		JLabel lblRandomOn = new JLabel(
				"2. Random on Circle -- will place every node at a random position on an imaginary circle; this option does not use the");
		lblRandomOn.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblRandomOn.setBounds(167, 140, 597, 15);
		panel_help.add(lblRandomOn);

		JLabel lblTheAutomorphismGroup = new JLabel(
				"                     automorphism group generators. There are 2optimisations to the random on circle mode: reduction of the");
		lblTheAutomorphismGroup.setFont(new Font("Comic Sans MS", Font.PLAIN,
				11));
		lblTheAutomorphismGroup.setBounds(167, 155, 597, 15);
		panel_help.add(lblTheAutomorphismGroup);

		JLabel lblThereAre_1 = new JLabel(
				"                     sum of all edge lengths and of the number of crossings; these are done by swapping nodes around.");
		lblThereAre_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblThereAre_1.setBounds(167, 170, 597, 15);
		panel_help.add(lblThereAre_1);

		JLabel lblSymmetrical = new JLabel(
				"3. Symmetrical on Circle (1) -- will place the nodes on an imaginary circle, grouping each orbit. For this example, nodes 1,8 and 7 will be paired in ");
		lblSymmetrical.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblSymmetrical.setBounds(12, 207, 749, 15);
		panel_help.add(lblSymmetrical);

		JLabel lblAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = new JLabel(
				"                     one orbit, 3, 17 and 13 in another orbit and so on. The are 3 optimisations to the symmetrical on a circle mode: modification of the ");
		lblAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.setFont(new Font(
				"Comic Sans MS", Font.PLAIN, 11));
		lblAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.setBounds(12, 222, 749,
				15);
		panel_help.add(lblAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa);

		JLabel lblDistanceBetweenNodes = new JLabel(
				"                     distance between nodes from the same orbit, reduction of the sum of all edge lengths and of the number of crossings, by moving ");
		lblDistanceBetweenNodes.setFont(new Font("Comic Sans MS", Font.PLAIN,
				11));
		lblDistanceBetweenNodes.setBounds(12, 237, 749, 15);
		panel_help.add(lblDistanceBetweenNodes);

		JLabel lblAroundTheNodes = new JLabel(
				"                     around the nodes that are not in the automorphism group generator. Also, there are 2 preset modes for arranging these nodes.");
		lblAroundTheNodes.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblAroundTheNodes.setBounds(12, 252, 749, 15);
		panel_help.add(lblAroundTheNodes);

		JLabel lblSymmetricalOn = new JLabel(
				"4. Symmetrical on Circle (2) -- will place the nodes in the same way the previous mode does, with the difference that the nodes from the orbits are");
		lblSymmetricalOn.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblSymmetricalOn.setBounds(12, 276, 749, 15);
		panel_help.add(lblSymmetricalOn);

		JLabel lblNotGroupedBut = new JLabel(
				"                     not grouped, but placed so on opposite sides of the circle. We can now consider that there are no longer 5 orbits of 3 nodes, but 3 ");
		lblNotGroupedBut.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblNotGroupedBut.setBounds(12, 291, 749, 15);
		panel_help.add(lblNotGroupedBut);

		JLabel lblOrbitsOf = new JLabel(
				"                     orbits of 5 nodes: 1,3,4,5 and 6 forming one. The same optimisations apply.");
		lblOrbitsOf.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblOrbitsOf.setBounds(12, 306, 749, 15);
		panel_help.add(lblOrbitsOf);

		JLabel lblSymmetricalOn_1 = new JLabel(
				"5. Symmetrical on Multiple Circles (1) -- will place the nodes on more imaginary circles, having each orbit on a different circle. For this example, ");
		lblSymmetricalOn_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblSymmetricalOn_1.setBounds(12, 330, 749, 15);
		panel_help.add(lblSymmetricalOn_1);

		JLabel lblNodes = new JLabel(
				"                     nodes 1, 8 and 7 will form an orbit and will occupy one imaginary circle etc.. There are 5 optimisations for this mode: modification");
		lblNodes.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblNodes.setBounds(12, 345, 749, 15);
		panel_help.add(lblNodes);

		JLabel lblOfTheDistance = new JLabel(
				"                     of the distance between the imaginary circles, modification of the size of the circles, reduction of the sum of all edge lengths and of ");
		lblOfTheDistance.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblOfTheDistance.setBounds(12, 360, 749, 15);
		panel_help.add(lblOfTheDistance);

		JLabel lblTheNumberOf = new JLabel(
				"                     the number of crossings, by moving around the nodes that are not in the automorphism group generator and flipping some nodes on the ");
		lblTheNumberOf.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblTheNumberOf.setBounds(12, 375, 749, 15);
		panel_help.add(lblTheNumberOf);

		JLabel lblForArrangingThese = new JLabel(
				"                      orbits to achieve perfect symmetry. Also, there are 2 preset modes for arranging these nodes.");
		lblForArrangingThese.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblForArrangingThese.setBounds(12, 390, 749, 15);
		panel_help.add(lblForArrangingThese);

		JLabel lblSymmetricalOn_2 = new JLabel(
				"6. Symmetrical on Multiple Circles (2) -- will place the nodes in the same way the previous mode does, with the difference that the nodes from the");
		lblSymmetricalOn_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblSymmetricalOn_2.setBounds(12, 414, 749, 15);
		panel_help.add(lblSymmetricalOn_2);

		JLabel lblOrbitsAreNot = new JLabel(
				"                     orbits are not grouped but placed on a different circle. We can now consider that there are no longer 5 orbits of 3 nodes, but 3 orbits");
		lblOrbitsAreNot.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblOrbitsAreNot.setBounds(12, 429, 749, 15);
		panel_help.add(lblOrbitsAreNot);

		JLabel lblOfNodes = new JLabel(
				"                     of 5 nodes: 1,3,4,5 and 6 forming one. The same optimisations apply.");
		lblOfNodes.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblOfNodes.setBounds(12, 444, 749, 15);
		panel_help.add(lblOfNodes);

		JButton btnImportDemo = new JButton("Import demo");
		btnImportDemo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ac.processImportDemo();
			}
		});
		btnImportDemo.setToolTipText("Open the documentation");
		btnImportDemo.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnImportDemo.setBounds(482, 455, 102, 25);
		panel_help.add(btnImportDemo);

		JButton btnMoreDetails = new JButton("More details");
		btnMoreDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					java.awt.Desktop.getDesktop().browse(
							new URI("http://www.dcs.gla.ac.uk/"));
				} catch (IOException | URISyntaxException e) {
					e.printStackTrace();
				}
			}
		});
		btnMoreDetails.setToolTipText("Open the documentation");
		btnMoreDetails.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnMoreDetails.setBounds(605, 455, 102, 25);
		panel_help.add(btnMoreDetails);
		canvasPanel = new canvas();
		canvasPanel.setBounds(5, 105, 774, 507);
		frmGraphDraw.getContentPane().add(canvasPanel);
		ac = new DrawController(canvasPanel, null);
		setupAC(ac);
		ac.startAnimation();

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null,
				null));
		panel.setBounds(5, 5, 96, 95);
		frmGraphDraw.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnImport = new JButton("Import");
		btnImport.setBounds(5, 5, 86, 25);
		panel.add(btnImport);
		btnImport.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnImport.setToolTipText("Import a graph from a file");

		panel_4.setEnabled(false);

		aut1_1 = new TextField();
		aut1_1.setColumns(10);
		aut1_1.setBounds(526, 159, 25, 25);
		panel_4.add(aut1_1);

		aut1_2 = new TextField();
		aut1_2.setColumns(10);
		aut1_2.setBounds(551, 159, 25, 25);
		panel_4.add(aut1_2);

		aut1_3 = new TextField();
		aut1_3.setColumns(10);
		aut1_3.setBounds(576, 159, 25, 25);
		panel_4.add(aut1_3);

		aut1_4 = new TextField();
		aut1_4.setColumns(10);
		aut1_4.setBounds(601, 159, 25, 25);
		panel_4.add(aut1_4);

		aut1_5 = new TextField();
		aut1_5.setColumns(10);
		aut1_5.setBounds(626, 159, 25, 25);
		panel_4.add(aut1_5);

		aut1_6 = new TextField();
		aut1_6.setColumns(10);
		aut1_6.setBounds(651, 159, 25, 25);
		panel_4.add(aut1_6);

		aut1_7 = new TextField();
		aut1_7.setColumns(10);
		aut1_7.setBounds(676, 159, 25, 25);
		panel_4.add(aut1_7);

		aut1_8 = new TextField();
		aut1_8.setColumns(10);
		aut1_8.setBounds(701, 159, 25, 25);
		panel_4.add(aut1_8);

		aut1_9 = new TextField();
		aut1_9.setColumns(10);
		aut1_9.setBounds(726, 159, 25, 25);
		panel_4.add(aut1_9);

		aut1_10 = new TextField();
		aut1_10.setColumns(10);
		aut1_10.setBounds(751, 159, 25, 25);
		panel_4.add(aut1_10);

		// /
		aut2_1 = new TextField();
		aut2_1.setColumns(10);
		aut2_1.setBounds(526, 184, 25, 25);
		panel_4.add(aut2_1);

		aut2_2 = new TextField();
		aut2_2.setColumns(10);
		aut2_2.setBounds(551, 184, 25, 25);
		panel_4.add(aut2_2);

		aut2_3 = new TextField();
		aut2_3.setColumns(10);
		aut2_3.setBounds(576, 184, 25, 25);
		panel_4.add(aut2_3);

		aut2_4 = new TextField();
		aut2_4.setColumns(10);
		aut2_4.setBounds(601, 184, 25, 25);
		panel_4.add(aut2_4);

		aut2_5 = new TextField();
		aut2_5.setColumns(10);
		aut2_5.setBounds(626, 184, 25, 25);
		panel_4.add(aut2_5);

		aut2_6 = new TextField();
		aut2_6.setColumns(10);
		aut2_6.setBounds(651, 184, 25, 25);
		panel_4.add(aut2_6);

		aut2_7 = new TextField();
		aut2_7.setColumns(10);
		aut2_7.setBounds(676, 184, 25, 25);
		panel_4.add(aut2_7);

		aut2_8 = new TextField();
		aut2_8.setColumns(10);
		aut2_8.setBounds(701, 184, 25, 25);
		panel_4.add(aut2_8);

		aut2_9 = new TextField();
		aut2_9.setColumns(10);
		aut2_9.setBounds(726, 184, 25, 25);
		panel_4.add(aut2_9);

		aut2_10 = new TextField();
		aut2_10.setColumns(10);
		aut2_10.setBounds(751, 184, 25, 25);
		panel_4.add(aut2_10);

		// //

		// /
		aut3_1 = new TextField();
		aut3_1.setColumns(10);
		aut3_1.setBounds(526, 209, 25, 25);
		panel_4.add(aut3_1);

		aut3_2 = new TextField();
		aut3_2.setColumns(10);
		aut3_2.setBounds(551, 209, 25, 25);
		panel_4.add(aut3_2);

		aut3_3 = new TextField();
		aut3_3.setColumns(10);
		aut3_3.setBounds(576, 209, 25, 25);
		panel_4.add(aut3_3);

		aut3_4 = new TextField();
		aut3_4.setColumns(10);
		aut3_4.setBounds(601, 209, 25, 25);
		panel_4.add(aut3_4);

		aut3_5 = new TextField();
		aut3_5.setColumns(10);
		aut3_5.setBounds(626, 209, 25, 25);
		panel_4.add(aut3_5);

		aut3_6 = new TextField();
		aut3_6.setColumns(10);
		aut3_6.setBounds(651, 209, 25, 25);
		panel_4.add(aut3_6);

		aut3_7 = new TextField();
		aut3_7.setColumns(10);
		aut3_7.setBounds(676, 209, 25, 25);
		panel_4.add(aut3_7);

		aut3_8 = new TextField();
		aut3_8.setColumns(10);
		aut3_8.setBounds(701, 209, 25, 25);
		panel_4.add(aut3_8);

		aut3_9 = new TextField();
		aut3_9.setColumns(10);
		aut3_9.setBounds(726, 209, 25, 25);
		panel_4.add(aut3_9);

		aut3_10 = new TextField();
		aut3_10.setColumns(10);
		aut3_10.setBounds(751, 209, 25, 25);
		panel_4.add(aut3_10);

		// //

		// /
		aut4_1 = new TextField();
		aut4_1.setColumns(10);
		aut4_1.setBounds(526, 234, 25, 25);
		panel_4.add(aut4_1);

		aut4_2 = new TextField();
		aut4_2.setColumns(10);
		aut4_2.setBounds(551, 234, 25, 25);
		panel_4.add(aut4_2);

		aut4_3 = new TextField();
		aut4_3.setColumns(10);
		aut4_3.setBounds(576, 234, 25, 25);
		panel_4.add(aut4_3);

		aut4_4 = new TextField();
		aut4_4.setColumns(10);
		aut4_4.setBounds(601, 234, 25, 25);
		panel_4.add(aut4_4);

		aut4_5 = new TextField();
		aut4_5.setColumns(10);
		aut4_5.setBounds(626, 234, 25, 25);
		panel_4.add(aut4_5);

		aut4_6 = new TextField();
		aut4_6.setColumns(10);
		aut4_6.setBounds(651, 234, 25, 25);
		panel_4.add(aut4_6);

		aut4_7 = new TextField();
		aut4_7.setColumns(10);
		aut4_7.setBounds(676, 234, 25, 25);
		panel_4.add(aut4_7);

		aut4_8 = new TextField();
		aut4_8.setColumns(10);
		aut4_8.setBounds(701, 234, 25, 25);
		panel_4.add(aut4_8);

		aut4_9 = new TextField();
		aut4_9.setColumns(10);
		aut4_9.setBounds(726, 234, 25, 25);
		panel_4.add(aut4_9);

		aut4_10 = new TextField();
		aut4_10.setColumns(10);
		aut4_10.setBounds(751, 234, 25, 25);
		panel_4.add(aut4_10);

		// //

		// /
		aut5_1 = new TextField();
		aut5_1.setColumns(10);
		aut5_1.setBounds(526, 259, 25, 25);
		panel_4.add(aut5_1);

		aut5_2 = new TextField();
		aut5_2.setColumns(10);
		aut5_2.setBounds(551, 259, 25, 25);
		panel_4.add(aut5_2);

		aut5_3 = new TextField();
		aut5_3.setColumns(10);
		aut5_3.setBounds(576, 259, 25, 25);
		panel_4.add(aut5_3);

		aut5_4 = new TextField();
		aut5_4.setColumns(10);
		aut5_4.setBounds(601, 259, 25, 25);
		panel_4.add(aut5_4);

		aut5_5 = new TextField();
		aut5_5.setColumns(10);
		aut5_5.setBounds(626, 259, 25, 25);
		panel_4.add(aut5_5);

		aut5_6 = new TextField();
		aut5_6.setColumns(10);
		aut5_6.setBounds(651, 259, 25, 25);
		panel_4.add(aut5_6);

		aut5_7 = new TextField();
		aut5_7.setColumns(10);
		aut5_7.setBounds(676, 259, 25, 25);
		panel_4.add(aut5_7);

		aut5_8 = new TextField();
		aut5_8.setColumns(10);
		aut5_8.setBounds(701, 259, 25, 25);
		panel_4.add(aut5_8);

		aut5_9 = new TextField();
		aut5_9.setColumns(10);
		aut5_9.setBounds(726, 259, 25, 25);
		panel_4.add(aut5_9);

		aut5_10 = new TextField();
		aut5_10.setColumns(10);
		aut5_10.setBounds(751, 259, 25, 25);
		panel_4.add(aut5_10);

		// //

		// /
		aut6_1 = new TextField();
		aut6_1.setColumns(10);
		aut6_1.setBounds(526, 284, 25, 25);
		panel_4.add(aut6_1);

		aut6_2 = new TextField();
		aut6_2.setColumns(10);
		aut6_2.setBounds(551, 284, 25, 25);
		panel_4.add(aut6_2);

		aut6_3 = new TextField();
		aut6_3.setColumns(10);
		aut6_3.setBounds(576, 284, 25, 25);
		panel_4.add(aut6_3);

		aut6_4 = new TextField();
		aut6_4.setColumns(10);
		aut6_4.setBounds(601, 284, 25, 25);
		panel_4.add(aut6_4);

		aut6_5 = new TextField();
		aut6_5.setColumns(10);
		aut6_5.setBounds(626, 284, 25, 25);
		panel_4.add(aut6_5);

		aut6_6 = new TextField();
		aut6_6.setColumns(10);
		aut6_6.setBounds(651, 284, 25, 25);
		panel_4.add(aut6_6);

		aut6_7 = new TextField();
		aut6_7.setColumns(10);
		aut6_7.setBounds(676, 284, 25, 25);
		panel_4.add(aut6_7);

		aut6_8 = new TextField();
		aut6_8.setColumns(10);
		aut6_8.setBounds(701, 284, 25, 25);
		panel_4.add(aut6_8);

		aut6_9 = new TextField();
		aut6_9.setColumns(10);
		aut6_9.setBounds(726, 284, 25, 25);
		panel_4.add(aut6_9);

		aut6_10 = new TextField();
		aut6_10.setColumns(10);
		aut6_10.setBounds(751, 284, 25, 25);
		panel_4.add(aut6_10);

		// //

		aut7_1 = new TextField();
		aut7_1.setColumns(10);
		aut7_1.setBounds(526, 309, 25, 25);
		panel_4.add(aut7_1);

		aut7_2 = new TextField();
		aut7_2.setColumns(10);
		aut7_2.setBounds(551, 309, 25, 25);
		panel_4.add(aut7_2);

		aut7_3 = new TextField();
		aut7_3.setColumns(10);
		aut7_3.setBounds(576, 309, 25, 25);
		panel_4.add(aut7_3);

		aut7_4 = new TextField();
		aut7_4.setColumns(10);
		aut7_4.setBounds(601, 309, 25, 25);
		panel_4.add(aut7_4);

		aut7_5 = new TextField();
		aut7_5.setColumns(10);
		aut7_5.setBounds(626, 309, 25, 25);
		panel_4.add(aut7_5);

		aut7_6 = new TextField();
		aut7_6.setColumns(10);
		aut7_6.setBounds(651, 309, 25, 25);
		panel_4.add(aut7_6);

		aut7_7 = new TextField();
		aut7_7.setColumns(10);
		aut7_7.setBounds(676, 309, 25, 25);
		panel_4.add(aut7_7);

		aut7_8 = new TextField();
		aut7_8.setColumns(10);
		aut7_8.setBounds(701, 309, 25, 25);
		panel_4.add(aut7_8);

		aut7_9 = new TextField();
		aut7_9.setColumns(10);
		aut7_9.setBounds(726, 309, 25, 25);
		panel_4.add(aut7_9);

		aut7_10 = new TextField();
		aut7_10.setColumns(10);
		aut7_10.setBounds(751, 309, 25, 25);
		panel_4.add(aut7_10);

		aut8_1 = new TextField();
		aut8_1.setColumns(10);
		aut8_1.setBounds(526, 334, 25, 25);
		panel_4.add(aut8_1);

		aut8_2 = new TextField();
		aut8_2.setColumns(10);
		aut8_2.setBounds(551, 334, 25, 25);
		panel_4.add(aut8_2);

		aut8_3 = new TextField();
		aut8_3.setColumns(10);
		aut8_3.setBounds(576, 334, 25, 25);
		panel_4.add(aut8_3);

		aut8_4 = new TextField();
		aut8_4.setColumns(10);
		aut8_4.setBounds(601, 334, 25, 25);
		panel_4.add(aut8_4);

		aut8_5 = new TextField();
		aut8_5.setColumns(10);
		aut8_5.setBounds(626, 334, 25, 25);
		panel_4.add(aut8_5);

		aut8_6 = new TextField();
		aut8_6.setColumns(10);
		aut8_6.setBounds(651, 334, 25, 25);
		panel_4.add(aut8_6);

		aut8_7 = new TextField();
		aut8_7.setColumns(10);
		aut8_7.setBounds(676, 334, 25, 25);
		panel_4.add(aut8_7);

		aut8_8 = new TextField();
		aut8_8.setColumns(10);
		aut8_8.setBounds(701, 334, 25, 25);
		panel_4.add(aut8_8);

		aut8_9 = new TextField();
		aut8_9.setColumns(10);
		aut8_9.setBounds(726, 334, 25, 25);
		panel_4.add(aut8_9);

		aut8_10 = new TextField();
		aut8_10.setColumns(10);
		aut8_10.setBounds(751, 334, 25, 25);
		panel_4.add(aut8_10);

		aut9_1 = new TextField();
		aut9_1.setColumns(10);
		aut9_1.setBounds(526, 359, 25, 25);
		panel_4.add(aut9_1);

		aut9_2 = new TextField();
		aut9_2.setColumns(10);
		aut9_2.setBounds(551, 359, 25, 25);
		panel_4.add(aut9_2);

		aut9_3 = new TextField();
		aut9_3.setColumns(10);
		aut9_3.setBounds(576, 359, 25, 25);
		panel_4.add(aut9_3);

		aut9_4 = new TextField();
		aut9_4.setColumns(10);
		aut9_4.setBounds(601, 359, 25, 25);
		panel_4.add(aut9_4);

		aut9_5 = new TextField();
		aut9_5.setColumns(10);
		aut9_5.setBounds(626, 359, 25, 25);
		panel_4.add(aut9_5);

		aut9_6 = new TextField();
		aut9_6.setColumns(10);
		aut9_6.setBounds(651, 359, 25, 25);
		panel_4.add(aut9_6);

		aut9_7 = new TextField();
		aut9_7.setColumns(10);
		aut9_7.setBounds(676, 359, 25, 25);
		panel_4.add(aut9_7);

		aut9_8 = new TextField();
		aut9_8.setColumns(10);
		aut9_8.setBounds(701, 359, 25, 25);
		panel_4.add(aut9_8);

		aut9_9 = new TextField();
		aut9_9.setColumns(10);
		aut9_9.setBounds(726, 359, 25, 25);
		panel_4.add(aut9_9);

		aut9_10 = new TextField();
		aut9_10.setColumns(10);
		aut9_10.setBounds(751, 359, 25, 25);
		panel_4.add(aut9_10);

		aut10_1 = new TextField();
		aut10_1.setColumns(10);
		aut10_1.setBounds(526, 384, 25, 25);
		panel_4.add(aut10_1);

		aut10_2 = new TextField();
		aut10_2.setColumns(10);
		aut10_2.setBounds(551, 384, 25, 25);
		panel_4.add(aut10_2);

		aut10_3 = new TextField();
		aut10_3.setColumns(10);
		aut10_3.setBounds(576, 384, 25, 25);
		panel_4.add(aut10_3);

		aut10_4 = new TextField();
		aut10_4.setColumns(10);
		aut10_4.setBounds(601, 384, 25, 25);
		panel_4.add(aut10_4);

		aut10_5 = new TextField();
		aut10_5.setColumns(10);
		aut10_5.setBounds(626, 384, 25, 25);
		panel_4.add(aut10_5);

		aut10_6 = new TextField();
		aut10_6.setColumns(10);
		aut10_6.setBounds(651, 384, 25, 25);
		panel_4.add(aut10_6);

		aut10_7 = new TextField();
		aut10_7.setColumns(10);
		aut10_7.setBounds(676, 384, 25, 25);
		panel_4.add(aut10_7);

		aut10_8 = new TextField();
		aut10_8.setColumns(10);
		aut10_8.setBounds(701, 384, 25, 25);
		panel_4.add(aut10_8);

		aut10_9 = new TextField();
		aut10_9.setColumns(10);
		aut10_9.setBounds(726, 384, 25, 25);
		panel_4.add(aut10_9);

		aut10_10 = new TextField();
		aut10_10.setColumns(10);
		aut10_10.setBounds(751, 384, 25, 25);
		panel_4.add(aut10_10);

		auts = new TextField[11][11];

		auts[1][1] = aut1_1;
		auts[1][2] = aut1_2;
		auts[1][3] = aut1_3;
		auts[1][4] = aut1_4;
		auts[1][5] = aut1_5;
		auts[1][6] = aut1_6;
		auts[1][7] = aut1_7;
		auts[1][8] = aut1_8;
		auts[1][9] = aut1_9;
		auts[1][10] = aut1_10;

		auts[2][1] = aut2_1;
		auts[2][2] = aut2_2;
		auts[2][3] = aut2_3;
		auts[2][4] = aut2_4;
		auts[2][5] = aut2_5;
		auts[2][6] = aut2_6;
		auts[2][7] = aut2_7;
		auts[2][8] = aut2_8;
		auts[2][9] = aut2_9;
		auts[2][10] = aut2_10;

		auts[3][1] = aut3_1;
		auts[3][2] = aut3_2;
		auts[3][3] = aut3_3;
		auts[3][4] = aut3_4;
		auts[3][5] = aut3_5;
		auts[3][6] = aut3_6;
		auts[3][7] = aut3_7;
		auts[3][8] = aut3_8;
		auts[3][9] = aut3_9;
		auts[3][10] = aut3_10;

		auts[4][1] = aut4_1;
		auts[4][2] = aut4_2;
		auts[4][3] = aut4_3;
		auts[4][4] = aut4_4;
		auts[4][5] = aut4_5;
		auts[4][6] = aut4_6;
		auts[4][7] = aut4_7;
		auts[4][8] = aut4_8;
		auts[4][9] = aut4_9;
		auts[4][10] = aut4_10;

		auts[5][1] = aut5_1;
		auts[5][2] = aut5_2;
		auts[5][3] = aut5_3;
		auts[5][4] = aut5_4;
		auts[5][5] = aut5_5;
		auts[5][6] = aut5_6;
		auts[5][7] = aut5_7;
		auts[5][8] = aut5_8;
		auts[5][9] = aut5_9;
		auts[5][10] = aut5_10;

		auts[6][1] = aut6_1;
		auts[6][2] = aut6_2;
		auts[6][3] = aut6_3;
		auts[6][4] = aut6_4;
		auts[6][5] = aut6_5;
		auts[6][6] = aut6_6;
		auts[6][7] = aut6_7;
		auts[6][8] = aut6_8;
		auts[6][9] = aut6_9;
		auts[6][10] = aut6_10;

		auts[7][1] = aut7_1;
		auts[7][2] = aut7_2;
		auts[7][3] = aut7_3;
		auts[7][4] = aut7_4;
		auts[7][5] = aut7_5;
		auts[7][6] = aut7_6;
		auts[7][7] = aut7_7;
		auts[7][8] = aut7_8;
		auts[7][9] = aut7_9;
		auts[7][10] = aut7_10;

		auts[8][1] = aut8_1;
		auts[8][2] = aut8_2;
		auts[8][3] = aut8_3;
		auts[8][4] = aut8_4;
		auts[8][5] = aut8_5;
		auts[8][6] = aut8_6;
		auts[8][7] = aut8_7;
		auts[8][8] = aut8_8;
		auts[8][9] = aut8_9;
		auts[8][10] = aut8_10;

		auts[9][1] = aut9_1;
		auts[9][2] = aut9_2;
		auts[9][3] = aut9_3;
		auts[9][4] = aut9_4;
		auts[9][5] = aut9_5;
		auts[9][6] = aut9_6;
		auts[9][7] = aut9_7;
		auts[9][8] = aut9_8;
		auts[9][9] = aut9_9;
		auts[9][10] = aut9_10;

		auts[10][1] = aut10_1;
		auts[10][2] = aut10_2;
		auts[10][3] = aut10_3;
		auts[10][4] = aut10_4;
		auts[10][5] = aut10_5;
		auts[10][6] = aut10_6;
		auts[10][7] = aut10_7;
		auts[10][8] = aut10_8;
		auts[10][9] = aut10_9;
		auts[10][10] = aut10_10;

		//for (i = 1; i <= 10; i++)
			//for (j = 1; j <= 10; j++)
				//auts[i][j].setInputVerifier(new NumInputVerifier());
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_5.setBounds(525, 2, 254, 116);
		panel_4.add(panel_5);
		panel_5.setLayout(null);

		textField = new TextField();
		textField.setBounds(10, 41, 50, 20);
		panel_5.add(textField);
		textField.setColumns(10);

		JLabel lblNumberOfNodes = new JLabel("Number of nodes:");
		lblNumberOfNodes.setBounds(10, 21, 98, 15);
		panel_5.add(lblNumberOfNodes);
		lblNumberOfNodes.setFont(new Font("Comic Sans MS", Font.BOLD, 11));

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(70, 41, 86, 20);
		panel_5.add(btnUpdate);

		JLabel lblAutomorphismGroupGenerator = new JLabel(
				"Automorphism group generator size:");
		lblAutomorphismGroupGenerator.setBounds(10, 66, 201, 15);
		panel_5.add(lblAutomorphismGroupGenerator);
		lblAutomorphismGroupGenerator.setFont(new Font("Comic Sans MS",
				Font.BOLD, 11));

		JLabel lblControlPanel = new JLabel("Control Panel");
		lblControlPanel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblControlPanel.setBounds(92, 5, 98, 15);
		panel_5.add(lblControlPanel);

		pairSizeBox = new TextField();
		
		//pairSizeBox.setInputVerifier(new MaxTenInputVerifier());
		pairSizeBox.setBounds(10, 86, 35, 20);
		panel_5.add(pairSizeBox);
		pairSizeBox.setColumns(1);

		numPairsBox = new TextField();
		//numPairsBox.setInputVerifier(new MaxTenInputVerifier());
		numPairsBox.setBounds(75, 86, 35, 20);
		panel_5.add(numPairsBox);
		numPairsBox.setColumns(1);

		JLabel by = new JLabel("by");
		by.setBounds(50, 88, 20, 15);
		panel_5.add(by);
		by.setHorizontalAlignment(SwingConstants.CENTER);
		by.setFont(new Font("Comic Sans MS", Font.BOLD, 11));

		JButton buttonUpdate = new JButton("Update");
		buttonUpdate.setBounds(120, 86, 86, 20);
		panel_5.add(buttonUpdate);

		JLabel lblAutomorphismGroupGenerator_1 = new JLabel(
				"Automorphism group generator");
		lblAutomorphismGroupGenerator_1.setFont(new Font("Comic Sans MS",
				Font.BOLD, 11));
		lblAutomorphismGroupGenerator_1.setBounds(564, 135, 176, 15);
		panel_4.add(lblAutomorphismGroupGenerator_1);

		final JButton btnSaveGraph = new JButton("Save");
		btnSaveGraph.setEnabled(false);
		btnSaveGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());;
				    System.out.println("YEP");
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
				
				File f = null;
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showSaveDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					f = fc.getSelectedFile();
					try {
						FileCreator.write(f, createPrintables());
					} catch (IOException e) {
					}
				}
				ac.setLastFile(f);
			
				try {
				    UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
			}
			

			

			

		});
		btnSaveGraph.setToolTipText("Open the documentation");
		btnSaveGraph.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnSaveGraph.setBounds(611, 427, 80, 25);
		panel_4.add(btnSaveGraph);

		final JButton btnDraw = new JButton("Draw");
		btnDraw.setEnabled(false);
		btnDraw.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnDraw.setBounds(696, 427, 80, 25);
		btnDraw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (ac.getLastFile() != null){
					if (ac.getLastFile().getAbsolutePath().contains("tmp"))
						ac.getLastFile().delete();
						}
					ac.setLastFile(null);
				
				
				if (ac.getLastFile() == null) {
					File f = new File("tmp"
							+ ((Double) (Math.random() * 5000)).intValue()
							+ ((Double) (Math.random() * 5000)).intValue());
					try {
						FileCreator.write(f, createPrintables());
					} catch (IOException e1) {
					}
					ac.setLastFile(f);
					f.deleteOnExit();
				}
				ac.processImport(ac.getLastFile());
			}
		});

		panel_4.add(btnDraw);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// here I check if the automorphisms have been mentioned
				for (i = 1; i <= numPairs; i++)
					for (j = 1; j <= pairSize; j++)
						if (auts[i][j].getText().isEmpty()) {
							btnDraw.setEnabled(false);
							btnSaveGraph.setEnabled(false);
							return;
						}
				btnDraw.setEnabled(true);
				btnSaveGraph.setEnabled(true);

			}
		});
		btnConfirm.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnConfirm.setBounds(526, 427, 80, 25);
		panel_4.add(btnConfirm);
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				for (i = 1; i <= 10; i++)
					for (j = 1; j <= 10; j++)
						auts[i][j].setText("");

				try {
					String text = pairSizeBox.getText();
					pairSize = Integer.parseInt(text);

					text = numPairsBox.getText();
					numPairs = Integer.parseInt(text);

					updateAut(pairSize, numPairs);

				} catch (Exception e) {
				}
			}

			private void updateAut(int pairSize, int numPairs) {
				for (int i = 1; i <= 10; i++)
					for (int j = 1; j <= 10; j++)
						if (i <= numPairs && j <= pairSize) {
							auts[i][j].setVisible(true);
							auts[i][j].setEnabled(true);
						} else {
							auts[i][j].setVisible(false);
							auts[i][j].setEnabled(false);
						}

			}
		});
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String text = textField.getText();
					numNodes = Integer.parseInt(text);
					update(numNodes);

				} catch (Exception e) {
				}
			}

		});

		panel_4.setVisible(false);

		JButton btnExport = new JButton("Export");
		btnExport.setBounds(5, 35, 86, 25);
		panel.add(btnExport);
		btnExport.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnExport.setToolTipText("Export the graph to a file");

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(5, 65, 86, 25);
		panel.add(btnClear);
		btnClear.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnClear.setToolTipText("Clear the graph");
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ac.processClear();

			}
		});

		final ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_1.setBounds(111, 5, 365, 95);
		frmGraphDraw.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		

		final JRadioButton rdbtnRandom = new JRadioButton("Random");
		rdbtnRandom.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		rdbtnRandom.setBounds(5, 25, 110, 15);
		panel_1.add(rdbtnRandom);

		final JRadioButton rdbtnRandomCircle = new JRadioButton(
				"Random - Circle");
		rdbtnRandomCircle.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		rdbtnRandomCircle.setBounds(5, 45, 110, 15);
		panel_1.add(rdbtnRandomCircle);

		final JRadioButton rdbtnSymmetricalCircle1 = new JRadioButton(
				"Symmetrical - Circle (1)");
		rdbtnSymmetricalCircle1.setFont(new Font("Comic Sans MS", Font.PLAIN,
				11));
		rdbtnSymmetricalCircle1.setBounds(5, 65, 150, 15);
		panel_1.add(rdbtnSymmetricalCircle1);

		final JRadioButton rdbtnSymmetricalCircle2 = new JRadioButton(
				"Symmetrical - Circle (2)");
		rdbtnSymmetricalCircle2.setFont(new Font("Comic Sans MS", Font.PLAIN,
				11));
		rdbtnSymmetricalCircle2.setBounds(160, 25, 150, 15);
		panel_1.add(rdbtnSymmetricalCircle2);

		final JRadioButton rdbtnSymmetricalMultiple1 = new JRadioButton(
				"Symmetrical - Multiple Circles (1)");
		rdbtnSymmetricalMultiple1.setFont(new Font("Comic Sans MS", Font.PLAIN,
				11));
		rdbtnSymmetricalMultiple1.setBounds(160, 45, 200, 15);
		panel_1.add(rdbtnSymmetricalMultiple1);

		final JRadioButton rdbtnSymmetricalMultiple2 = new JRadioButton(
				"Symmetrical - Multiple Circles (2)");
		rdbtnSymmetricalMultiple2.setFont(new Font("Comic Sans MS", Font.PLAIN,
				11));
		rdbtnSymmetricalMultiple2.setBounds(160, 65, 200, 15);
		panel_1.add(rdbtnSymmetricalMultiple2);
		radioButtons.add(rdbtnRandom);
		radioButtons.add(rdbtnRandomCircle);
		radioButtons.add(rdbtnSymmetricalCircle1);
		radioButtons.add(rdbtnSymmetricalCircle2);
		radioButtons.add(rdbtnSymmetricalMultiple1);
		radioButtons.add(rdbtnSymmetricalMultiple2);

		rdbtnRandom.setSelected(true);

		JLabel lblNewLabel = new JLabel("Draw mode");
		lblNewLabel.setBounds(5, 5, 85, 15);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 11));

		final JButton btnHelp = new JButton("Help");
		final JPanel panel_1_alternative = new JPanel();
		panel_1_alternative.setEnabled(false);
		panel_1_alternative.setVisible(false);
		panel_1_alternative.setBorder(new BevelBorder(BevelBorder.LOWERED,
				null, null, null, null));
		panel_1_alternative.setBounds(111, 5, 365, 95);
		frmGraphDraw.getContentPane().add(panel_1_alternative);
		panel_1_alternative.setLayout(null);

		JLabel lblDrawingSettings = new JLabel("Settings");
		lblDrawingSettings.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblDrawingSettings.setBounds(5, 5, 60, 15);
		panel_1_alternative.add(lblDrawingSettings);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1_alternative.setVisible(false);
				panel_1_alternative.setEnabled(false);
				panel_1.setVisible(true);
				panel_1.setEnabled(true);
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnBack.setBounds(274, 65, 86, 25);
		panel_1_alternative.add(btnBack);

		JLabel lblOptionSelected = new JLabel("Option selected:");
		lblOptionSelected.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblOptionSelected.setBounds(71, 5, 92, 14);
		panel_1_alternative.add(lblOptionSelected);

		final JLabel Selected = new JLabel("You should not see this. Bug!!!");
		Selected.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		Selected.setBounds(158, 5, 185, 14);
		panel_1_alternative.add(Selected);

		final JButton btnFlip = new JButton("Flip");
		btnFlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ac.f();
			}
		});
		btnFlip.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnFlip.setBounds(15, 31, 86, 25);
		panel_1_alternative.add(btnFlip);

		final JButton btnReduceCrossings = new JButton("Reduce crossings");
		btnReduceCrossings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ac.reduceCrossings();
			}
		});
		btnReduceCrossings.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnReduceCrossings.setBounds(15, 31, 131, 25);
		panel_1_alternative.add(btnReduceCrossings);

		final JButton btnReduceSumOf = new JButton("Reduce sum of edge lenghts");
		btnReduceSumOf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ac.reduceSumOfEdges();
			}
		});
		btnReduceSumOf.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnReduceSumOf.setBounds(168, 30, 192, 25);
		panel_1_alternative.add(btnReduceSumOf);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_2.setBounds(482, 5, 195, 49);
		frmGraphDraw.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNodesNotIn = new JLabel("View code:");
		lblNodesNotIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblNodesNotIn.setBounds(10, 14, 86, 15);
		panel_2.add(lblNodesNotIn);
		lblNodesNotIn.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		
		JButton btnOnGithub = new JButton("On Github");
		btnOnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					java.awt.Desktop.getDesktop().browse(
							new URI("https://github.com/dmiron23/GraphDraw"));
				} catch (IOException | URISyntaxException e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnOnGithub.setToolTipText("Opens GitHub repository containing all the files.");
		btnOnGithub.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnOnGithub.setBounds(99, 9, 86, 25);
		panel_2.add(btnOnGithub);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_3.setBounds(683, 5, 96, 95);
		frmGraphDraw.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		final JButton btnSaveImage = new JButton("Save JPG");
		btnSaveImage.setToolTipText("Saves a JPEG of the Graph");
		btnSaveImage.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnSaveImage.setBounds(5, 35, 86, 25);
		panel_3.add(btnSaveImage);

		final JButton btnEditMode = new JButton("Edit Mode");
		btnEditMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean resultBoolean = (canvasPanel.isVisible()) ? false
						: true;
				
				
				canvasPanel.setVisible(resultBoolean);
				canvasPanel.setEnabled(resultBoolean);
				btnHelp.setEnabled(resultBoolean);
				btnSaveImage.setEnabled(resultBoolean);
				panel_4.setVisible(!resultBoolean);
				panel_4.setEnabled(!resultBoolean);
				String resultString = (canvasPanel.isVisible()) ? "Edit Mode"
						: "Back";
				btnEditMode.setText(resultString);
			}
		});
		btnEditMode.setToolTipText("Open the documentation");
		btnEditMode.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnEditMode.setBounds(5, 65, 86, 25);
		panel_3.add(btnEditMode);

		btnHelp.setToolTipText("Open the documentation");
		btnHelp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnHelp.setBounds(5, 5, 86, 25);
		btnHelp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean i1 = panel_4.isVisible(), i2 = panel_4.isEnabled(), i3 = canvasPanel
						.isVisible(), i4 = canvasPanel.isEnabled();// initial
																	// states of
																	// panel_4
																	// and
																	// canvas_panel
				if (btnHelp.getText().equals("Help")) {
					btnHelp.setText("Back");
					canvasPanel.setVisible(false);
					canvasPanel.setEnabled(false);
					panel_4.setVisible(false);
					panel_4.setEnabled(false);
					panel_help.setVisible(true);
					panel_help.setEnabled(true);
					btnSaveImage.setEnabled(false);
					btnEditMode.setEnabled(false);
				} else {
					btnHelp.setText("Help");
					canvasPanel.setVisible(true);
					canvasPanel.setEnabled(true);
					panel_4.setVisible(i1);
					panel_4.setEnabled(i2);
					panel_help.setVisible(i3);
					panel_help.setEnabled(i4);
					btnSaveImage.setEnabled(true);
					btnEditMode.setEnabled(true);
				}

			}
		});
		panel_3.add(btnHelp);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBounds(482, 57, 195, 42);
		frmGraphDraw.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblDiameter = new JLabel("Diameter:");
		lblDiameter.setBounds(16, 9, 58, 17);
		lblDiameter.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiameter.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		panel_6.add(lblDiameter);
		
		final JRadioButton radio50 = new JRadioButton("");
		radio50.setSelected(true);
		radio50.setBounds(79, 8, 21, 21);
		panel_6.add(radio50);
		
		final JRadioButton radio60 = new JRadioButton("");
		radio60.setBounds(100, 8, 21, 21);
		panel_6.add(radio60);
		
		final JRadioButton radio70 = new JRadioButton("");
		radio70.setBounds(121, 8, 21, 21);
		panel_6.add(radio70);
		
		final JRadioButton radio80 = new JRadioButton("");
		radio80.setBounds(142, 8, 21, 21);
		panel_6.add(radio80);
		
		final JRadioButton radio120 = new JRadioButton("");
		radio120.setBounds(163, 8, 21, 21);
		panel_6.add(radio120);
		
		radio50.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radio50.setSelected(true);
				radio70.setSelected(false);
				radio80.setSelected(false);
				radio60.setSelected(false);
				radio120.setSelected(false);
				ac.setVSize(50);
				ac.redraw();
				
			}
		});
		
radio60.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				radio120.setSelected(false);
				radio50.setSelected(false);
				radio70.setSelected(false);
				radio80.setSelected(false);
				radio60.setSelected(true);
				ac.setVSize(60);
				ac.redraw();
				
			}
		});

radio70.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		radio120.setSelected(false);
		radio50.setSelected(false);
		radio70.setSelected(true);
		radio80.setSelected(false);
		radio60.setSelected(false);
		ac.setVSize(70);
		ac.redraw();
		
	}
});

radio80.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		radio120.setSelected(false);
		radio50.setSelected(false);
		radio70.setSelected(false);
		radio80.setSelected(true);
		radio60.setSelected(false);
		ac.setVSize(80);
		ac.redraw();
		
	}
});
radio120.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		radio50.setSelected(false);
		radio70.setSelected(false);
		radio80.setSelected(false);
		radio60.setSelected(false);
		radio120.setSelected(true);
		ac.setVSize(120);
		ac.redraw();
		
	}
});
		btnSaveImage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
				ac.saveImage();
				
				try {
				    UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");
				} catch (Exception e) {
				    e.printStackTrace();
				}
			}
		});

		for (final JRadioButton a : radioButtons) {
			a.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					for (JRadioButton b : radioButtons)
						b.setSelected(false);
					a.setSelected(true);

					if (a.equals(rdbtnRandom)) {
						ac.setAutOption(0);
						Selected.setText("Random");
						btnFlip.setVisible(false);
						btnFlip.setEnabled(false);
						btnReduceCrossings.setBounds(15, 31, 131, 25);
						btnReduceCrossings.setVisible(true);
						btnReduceCrossings.setEnabled(true);
						btnReduceSumOf.setVisible(true);
						btnReduceSumOf.setEnabled(true);
						// add here the optimisation buttons for random mode

					}
					if (a.equals(rdbtnRandomCircle)) {
						ac.setAutOption(1);
						Selected.setText("Random on a Circle");
						btnFlip.setVisible(false);
						btnFlip.setEnabled(false);
						btnReduceCrossings.setBounds(15, 31, 131, 25);
						btnReduceCrossings.setVisible(true);
						btnReduceCrossings.setEnabled(true);
						btnReduceSumOf.setVisible(true);
						btnReduceSumOf.setEnabled(true);
					}
					if (a.equals(rdbtnSymmetricalCircle1)) {
						ac.setAutOption(2);
						Selected.setText("Symmetrical on a Circle (1)");
						btnFlip.setVisible(false);
						btnFlip.setEnabled(false);
						btnReduceCrossings.setBounds(15, 31, 131, 25);
						btnReduceCrossings.setVisible(true);
						btnReduceCrossings.setEnabled(true);
						btnReduceSumOf.setVisible(false);
						btnReduceSumOf.setEnabled(false);
					}
					if (a.equals(rdbtnSymmetricalCircle2)) {
						ac.setAutOption(3);
						Selected.setText("Symmetrical on a Circle (2)");
						btnFlip.setVisible(false);
						btnFlip.setEnabled(false);
						btnReduceCrossings.setBounds(15, 31, 131, 25);
						btnReduceCrossings.setVisible(true);
						btnReduceCrossings.setEnabled(true);
						btnReduceSumOf.setVisible(false);
						btnReduceSumOf.setEnabled(false);
					}
					if (a.equals(rdbtnSymmetricalMultiple1)) {
						ac.setAutOption(4);
						Selected.setText("Symmetrical on Multiple Circles (1)");
						btnFlip.setVisible(true);
						btnFlip.setEnabled(true);
						btnReduceCrossings.setBounds(115, 31, 131, 25);
						btnReduceCrossings.setVisible(true);
						btnReduceCrossings.setEnabled(true);
						btnReduceSumOf.setVisible(false);
						btnReduceSumOf.setEnabled(false);
					}
					if (a.equals(rdbtnSymmetricalMultiple2)) {
						ac.setAutOption(5);
						Selected.setText("Symmetrical on Multiple Circles (2)");
						btnFlip.setVisible(true);
						btnFlip.setEnabled(true);
						btnReduceCrossings.setBounds(115, 31, 131, 25);
						btnReduceCrossings.setVisible(true);
						btnReduceCrossings.setEnabled(true);
						btnReduceSumOf.setVisible(false);
						btnReduceSumOf.setEnabled(false);
					}

					panel_1.setVisible(false);
					panel_1.setEnabled(false);
					panel_1_alternative.setVisible(true);
					panel_1_alternative.setEnabled(true);

					ac.redraw();
				}
			});
		}

		btnImport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				try {
				    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());;
				    System.out.println("YEP");
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(fc.getParent());
				
				try {
				    UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
				if (returnVal == JFileChooser.APPROVE_OPTION){
					ac.processImport(fc.getSelectedFile());
				}
			}
		});

		btnExport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
				    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());;
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
				ac.processExport();
				
				try {
				    UIManager.setLookAndFeel("napkin.NapkinLookAndFeel");
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
				
			}
		});
	}

	private void update(int i) {
		for (int j = 1; j <= 25; j++) {
			if (j <= i) {
				horizontalLabels[j].setVisible(true);
				verticalLabels[j].setVisible(true);
			} else {
				horizontalLabels[j].setVisible(false);
				verticalLabels[j].setVisible(false);
			}

			for (int k = 1; k <= 25; k++)
				if (j <= i && k <= i)
					buttons[j][k].setVisible(true);
				else
					buttons[j][k].setVisible(false);
		}
	}

	private void setupAC(AnimationControl _ac) {
		if (ac != null)
			ac.kill();
		ac = _ac;
		canvasPanel.setAnimationControl(ac);
		Tween.ac = ac;
		DelayThread.ac = ac;
		ac.startAnimation();
	}

	public static int getNumNodes() {
		return numNodes;
	}

	private ArrayList<String> createPrintables() {
		ArrayList<String> printables = new ArrayList<String>();

		// Title
		printables.add("Graph: " + numNodes + " nodes");
		String separationLine = "";
		for (int i = 0; i <= 2 * numNodes; i++)
			separationLine += "-";
		printables.add(separationLine);

		// Matrix
		for (int i = 1; i <= numNodes; i++) {
			String line = "[";
			for (int j = 1; j <= numNodes; j++) {
				if (j != numNodes) {
					String result = (buttons[i][j].isSelected()) ? "1" : "0";
					line += result + ",";
				} else {
					String result = (buttons[i][j].isSelected()) ? "1" : "0";
					line += result + "]";
				}
			}
			printables.add(line);
		}
		printables.add(separationLine);

		// auto

		printables.add("Automorphism: " + pairSize + "x" + numPairs);

		printables.add(separationLine);

		for (int i = 1; i <= numPairs; i++) {
			String line = "[";
			for (int j = 1; j <= pairSize; j++) {
				if (j != pairSize)
					line += auts[i][j].getText() + ",";

				else
					line += auts[i][j].getText() + "]";
			}
			printables.add(line);
		}

		printables.add(separationLine);

		return printables;
	}
}
