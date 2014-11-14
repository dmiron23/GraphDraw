package Main;

import graphics.TweenClass.Tween;
import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import canvas.AnimationControl;
import canvas.DelayThread;
import canvas.canvas;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import java.util.ArrayList;
import javax.swing.JRadioButton;
import controller.DrawController;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window {

	private JFrame frmGraphDraw;
	private AnimationControl ac;
	private canvas canvasPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_19;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_23;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_28;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label;
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
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JTextField textField_30;
	private JLabel label_31;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JLabel label_32;
	private JLabel label_33;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_64;
	private JTextField textField_63;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_69;
	private JTextField textField_68;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JTextField textField_112;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_120;
	private JTextField textField_121;
	private JTextField textField_122;
	private JTextField textField_123;
	private JTextField textField_124;
	private JTextField textField_125;
	private JTextField textField_126;
	private JTextField textField_127;
	private JTextField textField_128;
	private JTextField textField_129;
	private JTextField textField_130;
	private JTextField textField_131;
	private JTextField textField_132;
	private JTextField textField_133;
	private JTextField textField_134;
	private JTextField textField_135;
	private JTextField textField_136;
	private JTextField textField_137;
	private JTextField textField_138;
	private JTextField textField_139;
	private JTextField textField_140;
	private JTextField textField_141;
	private JTextField textField_142;
	private JTextField textField_143;
	private JTextField textField_144;
	private JTextField textField_145;
	private JTextField textField_146;
	private JTextField textField_147;
	private JTextField textField_148;
	private JTextField textField_149;
	private JTextField textField_150;
	private JTextField textField_151;
	private JTextField textField_152;
	private JTextField textField_153;
	private JTextField textField_154;
	private JTextField textField_155;
	private JTextField textField_156;
	private JTextField textField_157;
	private JTextField textField_158;
	private JTextField textField_159;
	private JTextField textField_160;
	private JTextField textField_161;
	private JTextField textField_162;
	private JTextField textField_163;
	private JTextField textField_164;
	private JTextField textField_165;
	private JTextField textField_166;
	private JTextField textField_167;
	private JTextField textField_168;
	private JTextField textField_169;
	private JTextField textField_170;
	private JTextField textField_171;
	private JTextField textField_172;
	private JTextField textField_173;
	private JTextField textField_174;
	private JTextField textField_175;
	private JTextField textField_176;
	private JTextField textField_177;
	private JTextField textField_178;
	private JTextField textField_179;
	private JTextField textField_180;
	private JTextField textField_181;
	private JTextField textField_182;
	private JTextField textField_183;
	private JTextField textField_184;
	private JTextField textField_185;
	private JTextField textField_186;
	private JTextField textField_187;
	private JTextField textField_188;
	private JTextField textField_189;
	private JTextField textField_190;
	private JTextField textField_191;
	private JTextField textField_192;
	private JTextField textField_193;
	private JTextField textField_194;
	private JTextField textField_195;
	private JTextField textField_196;
	private JTextField textField_197;
	private JTextField textField_198;
	private JTextField textField_199;
	private JTextField textField_200;
	private JTextField textField_201;
	private JTextField textField_202;
	private JTextField textField_203;
	private JTextField textField_204;
	private JTextField textField_205;
	private JTextField textField_206;
	private JTextField textField_207;
	private JTextField textField_208;
	private JTextField textField_209;
	private JTextField textField_210;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JTextField textField_211;
	private JTextField textField_212;
	private JTextField textField_213;
	private JTextField textField_214;
	private JTextField textField_215;
	private JTextField textField_216;
	private JTextField textField_217;
	private JTextField textField_218;
	private JTextField textField_219;
	private JTextField textField_220;
	private JTextField textField_221;
	private JTextField textField_222;
	private JTextField textField_223;
	private JTextField textField_224;
	private JTextField textField_225;
	private JTextField textField_226;
	private JTextField textField_227;
	private JTextField textField_228;
	private JTextField textField_229;
	private JTextField textField_230;
	private JTextField textField_231;
	private JTextField textField_232;
	private JTextField textField_233;
	private JTextField textField_234;
	private JTextField textField_235;
	private JTextField textField_236;
	private JTextField textField_237;
	private JTextField textField_238;
	private JTextField textField_239;
	private JTextField textField_240;
	private JTextField textField_241;
	private JTextField textField_242;
	private JTextField textField_243;
	private JTextField textField_244;
	private JTextField textField_245;
	private JTextField textField_246;
	private JTextField textField_247;
	private JTextField textField_248;
	private JTextField textField_249;
	private JTextField textField_250;
	private JTextField textField_251;
	private JTextField textField_252;
	private JTextField textField_253;
	private JTextField textField_254;
	private JTextField textField_255;
	private JTextField textField_256;
	private JTextField textField_257;
	private JTextField textField_258;
	private JTextField textField_259;
	private JTextField textField_260;
	private JTextField textField_261;
	private JTextField textField_262;
	private JTextField textField_263;
	private JTextField textField_264;
	private JTextField textField_265;
	private JTextField textField_266;
	private JTextField textField_267;
	private JTextField textField_268;
	private JTextField textField_269;
	private JTextField textField_270;
	private JTextField textField_271;
	private JTextField textField_272;
	private JTextField textField_273;
	private JTextField textField_274;
	private JTextField textField_275;
	private JTextField textField_276;
	private JTextField textField_277;
	private JTextField textField_278;
	private JTextField textField_279;
	private JTextField textField_280;
	private JTextField textField_281;
	private JTextField textField_282;
	private JTextField textField_283;
	private JTextField textField_284;
	private JTextField textField_285;
	private JTextField textField_286;
	private JTextField textField_287;
	private JTextField textField_288;
	private JTextField textField_289;
	private JTextField textField_290;
	private JTextField textField_291;
	private JTextField textField_292;
	private JTextField textField_293;
	private JTextField textField_294;
	private JTextField textField_295;
	private JTextField textField_296;
	private JTextField textField_297;
	private JTextField textField_298;
	private JTextField textField_299;
	private JTextField textField_300;
	private JTextField textField_301;
	private JTextField textField_302;
	private JTextField textField_303;
	private JTextField textField_304;
	private JTextField textField_305;
	private JTextField textField_306;
	private JTextField textField_307;
	private JTextField textField_308;
	private JTextField textField_309;
	private JTextField textField_310;
	private JTextField textField_311;
	private JTextField textField_312;
	private JTextField textField_313;
	private JTextField textField_314;
	private JTextField textField_315;
	private JTextField textField_316;
	private JTextField textField_317;
	private JTextField textField_318;
	private JTextField textField_319;
	private JTextField textField_320;
	private JTextField textField_321;
	private JTextField textField_322;
	private JTextField textField_323;
	private JTextField textField_324;
	private JTextField textField_325;
	private JTextField textField_326;
	private JTextField textField_327;
	private JTextField textField_328;
	private JTextField textField_329;
	private JTextField textField_330;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel label_41;
	private JLabel label_42;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_45;
	private JTextField textField_331;
	private JTextField textField_332;
	private JTextField textField_333;
	private JTextField textField_334;
	private JTextField textField_335;
	private JTextField textField_336;
	private JTextField textField_337;
	private JTextField textField_338;
	private JTextField textField_339;
	private JTextField textField_340;
	private JTextField textField_341;
	private JTextField textField_342;
	private JTextField textField_343;
	private JTextField textField_344;
	private JTextField textField_345;
	private JTextField textField_346;
	private JTextField textField_347;
	private JTextField textField_348;
	private JTextField textField_349;
	private JTextField textField_350;
	private JTextField textField_351;
	private JTextField textField_352;
	private JTextField textField_353;
	private JTextField textField_354;
	private JTextField textField_355;
	private JTextField textField_356;
	private JTextField textField_357;
	private JTextField textField_358;
	private JTextField textField_359;
	private JTextField textField_360;
	private JTextField textField_361;
	private JTextField textField_362;
	private JTextField textField_363;
	private JTextField textField_364;
	private JTextField textField_365;
	private JTextField textField_366;
	private JTextField textField_367;
	private JTextField textField_368;
	private JTextField textField_369;
	private JTextField textField_370;
	private JTextField textField_371;
	private JTextField textField_372;
	private JTextField textField_373;
	private JTextField textField_374;
	private JTextField textField_375;
	private JTextField textField_376;
	private JTextField textField_377;
	private JTextField textField_378;
	private JTextField textField_379;
	private JTextField textField_380;
	private JTextField textField_381;
	private JTextField textField_382;
	private JTextField textField_383;
	private JTextField textField_384;
	private JTextField textField_385;
	private JTextField textField_386;
	private JTextField textField_387;
	private JTextField textField_388;
	private JTextField textField_389;
	private JTextField textField_390;
	private JTextField textField_391;
	private JTextField textField_392;
	private JTextField textField_393;
	private JTextField textField_394;
	private JTextField textField_395;
	private JTextField textField_396;
	private JTextField textField_397;
	private JTextField textField_398;
	private JTextField textField_399;
	private JTextField textField_400;
	private JTextField textField_401;
	private JTextField textField_402;
	private JTextField textField_403;
	private JTextField textField_404;
	private JTextField textField_405;
	private JTextField textField_406;
	private JTextField textField_407;
	private JTextField textField_408;
	private JTextField textField_409;
	private JTextField textField_410;
	private JTextField textField_411;
	private JTextField textField_412;
	private JTextField textField_413;
	private JTextField textField_414;
	private JTextField textField_415;
	private JTextField textField_416;
	private JTextField textField_417;
	private JTextField textField_418;
	private JTextField textField_419;
	private JTextField textField_420;
	private JTextField textField_421;
	private JTextField textField_422;
	private JTextField textField_423;
	private JTextField textField_424;
	private JTextField textField_425;
	private JTextField textField_426;
	private JTextField textField_427;
	private JTextField textField_428;
	private JTextField textField_429;
	private JTextField textField_430;
	private JTextField textField_431;
	private JTextField textField_432;
	private JTextField textField_433;
	private JTextField textField_434;
	private JTextField textField_435;
	private JTextField textField_436;
	private JTextField textField_437;
	private JTextField textField_438;
	private JTextField textField_439;
	private JTextField textField_440;
	private JTextField textField_441;
	private JTextField textField_442;
	private JTextField textField_443;
	private JTextField textField_444;
	private JTextField textField_445;
	private JTextField textField_446;
	private JTextField textField_447;
	private JTextField textField_448;
	private JTextField textField_449;
	private JTextField textField_450;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
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
		frmGraphDraw.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		frmGraphDraw.setTitle("Graph Draw");
		frmGraphDraw.getContentPane().setFont(
				new Font("Comic Sans MS", Font.PLAIN, 11));
		frmGraphDraw.setAutoRequestFocus(false);
		frmGraphDraw.setResizable(false);
		frmGraphDraw.setBounds(100, 100, 800, 600);
		frmGraphDraw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGraphDraw.getContentPane().setLayout(null);
		frmGraphDraw.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(5, 105, 774, 460);
		frmGraphDraw.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNumberOfNodes = new JLabel("Number of nodes:");
		lblNumberOfNodes.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblNumberOfNodes.setBounds(10, 16, 112, 15);
		panel_4.add(lblNumberOfNodes);
		
		textField = new JTextField();
		textField.setBounds(116, 12, 41, 25);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(167, 12, 86, 25);
		panel_4.add(btnUpdate);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 73, 20, 20);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(45, 73, 20, 20);
		panel_4.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(95, 73, 20, 20);
		panel_4.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(70, 73, 20, 20);
		panel_4.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(120, 73, 20, 20);
		panel_4.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(145, 73, 20, 20);
		panel_4.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(170, 73, 20, 20);
		panel_4.add(textField_7);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(220, 73, 20, 20);
		panel_4.add(textField_9);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(195, 73, 20, 20);
		panel_4.add(textField_8);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(245, 73, 20, 20);
		panel_4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(270, 73, 20, 20);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(295, 73, 20, 20);
		panel_4.add(textField_12);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(345, 73, 20, 20);
		panel_4.add(textField_14);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(320, 73, 20, 20);
		panel_4.add(textField_13);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(370, 73, 20, 20);
		panel_4.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(395, 73, 20, 20);
		panel_4.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(420, 73, 20, 20);
		panel_4.add(textField_17);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(470, 73, 20, 20);
		panel_4.add(textField_19);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(445, 73, 20, 20);
		panel_4.add(textField_18);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(495, 73, 20, 20);
		panel_4.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(520, 73, 20, 20);
		panel_4.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(545, 73, 20, 20);
		panel_4.add(textField_22);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(595, 73, 20, 20);
		panel_4.add(textField_24);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(570, 73, 20, 20);
		panel_4.add(textField_23);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(620, 73, 20, 20);
		panel_4.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(645, 73, 20, 20);
		panel_4.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(670, 73, 20, 20);
		panel_4.add(textField_27);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(720, 73, 20, 20);
		panel_4.add(textField_29);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(695, 73, 20, 20);
		panel_4.add(textField_28);
		
		JLabel label_1 = new JLabel("1");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_1.setBounds(20, 47, 20, 20);
		panel_4.add(label_1);
		
		label_2 = new JLabel("2");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_2.setBounds(45, 47, 20, 20);
		panel_4.add(label_2);
		
		label_3 = new JLabel("3");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_3.setBounds(70, 47, 20, 20);
		panel_4.add(label_3);
		
		label_4 = new JLabel("4");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_4.setBounds(95, 47, 20, 20);
		panel_4.add(label_4);
		
		label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label.setBounds(470, 12, 20, 20);
		panel_4.add(label);
		
		label_5 = new JLabel("5");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_5.setBounds(120, 47, 20, 20);
		panel_4.add(label_5);
		
		label_6 = new JLabel("6");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_6.setBounds(145, 47, 20, 20);
		panel_4.add(label_6);
		
		label_7 = new JLabel("7");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_7.setBounds(170, 47, 20, 20);
		panel_4.add(label_7);
		
		label_8 = new JLabel("8");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_8.setBounds(195, 47, 20, 20);
		panel_4.add(label_8);
		
		label_9 = new JLabel("9");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_9.setBounds(220, 47, 20, 20);
		panel_4.add(label_9);
		
		label_10 = new JLabel("10");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_10.setBounds(245, 47, 20, 20);
		panel_4.add(label_10);
		
		label_11 = new JLabel("11");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_11.setBounds(270, 47, 20, 20);
		panel_4.add(label_11);
		
		label_12 = new JLabel("12");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_12.setBounds(295, 47, 20, 20);
		panel_4.add(label_12);
		
		label_13 = new JLabel("13");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_13.setBounds(320, 47, 20, 20);
		panel_4.add(label_13);
		
		label_14 = new JLabel("14");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_14.setBounds(345, 47, 20, 20);
		panel_4.add(label_14);
		
		label_15 = new JLabel("15");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_15.setBounds(370, 47, 20, 20);
		panel_4.add(label_15);
		
		label_16 = new JLabel("16");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_16.setBounds(395, 47, 20, 20);
		panel_4.add(label_16);
		
		label_17 = new JLabel("17");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_17.setBounds(420, 47, 20, 20);
		panel_4.add(label_17);
		
		label_18 = new JLabel("18");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_18.setBounds(445, 47, 20, 20);
		panel_4.add(label_18);
		
		label_19 = new JLabel("19");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_19.setBounds(470, 47, 20, 20);
		panel_4.add(label_19);
		
		label_20 = new JLabel("20");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_20.setBounds(495, 47, 20, 20);
		panel_4.add(label_20);
		
		label_21 = new JLabel("21");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_21.setBounds(520, 47, 20, 20);
		panel_4.add(label_21);
		
		label_22 = new JLabel("22");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_22.setBounds(545, 47, 20, 20);
		panel_4.add(label_22);
		
		label_23 = new JLabel("23");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_23.setBounds(570, 47, 20, 20);
		panel_4.add(label_23);
		
		label_24 = new JLabel("24");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_24.setBounds(595, 47, 20, 20);
		panel_4.add(label_24);
		
		label_25 = new JLabel("25");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_25.setBounds(620, 47, 20, 20);
		panel_4.add(label_25);
		
		label_26 = new JLabel("26");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_26.setBounds(645, 47, 20, 20);
		panel_4.add(label_26);
		
		label_27 = new JLabel("27");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_27.setBounds(670, 47, 20, 20);
		panel_4.add(label_27);
		
		label_28 = new JLabel("28");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_28.setBounds(695, 47, 20, 20);
		panel_4.add(label_28);
		
		label_29 = new JLabel("29");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_29.setBounds(720, 47, 20, 20);
		panel_4.add(label_29);
		
		label_30 = new JLabel("30");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_30.setBounds(745, 47, 20, 20);
		panel_4.add(label_30);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(745, 73, 20, 20);
		panel_4.add(textField_30);
		
		label_31 = new JLabel("1");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_31.setBounds(0, 73, 20, 20);
		panel_4.add(label_31);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(20, 98, 20, 20);
		panel_4.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(45, 98, 20, 20);
		panel_4.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(70, 98, 20, 20);
		panel_4.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(95, 98, 20, 20);
		panel_4.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(120, 98, 20, 20);
		panel_4.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(145, 98, 20, 20);
		panel_4.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(170, 98, 20, 20);
		panel_4.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(195, 98, 20, 20);
		panel_4.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(220, 98, 20, 20);
		panel_4.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(245, 98, 20, 20);
		panel_4.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(270, 98, 20, 20);
		panel_4.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(295, 98, 20, 20);
		panel_4.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(320, 98, 20, 20);
		panel_4.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(345, 98, 20, 20);
		panel_4.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(370, 98, 20, 20);
		panel_4.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(395, 98, 20, 20);
		panel_4.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(420, 98, 20, 20);
		panel_4.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(445, 98, 20, 20);
		panel_4.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(470, 98, 20, 20);
		panel_4.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(495, 98, 20, 20);
		panel_4.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(520, 98, 20, 20);
		panel_4.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(545, 98, 20, 20);
		panel_4.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(570, 98, 20, 20);
		panel_4.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(595, 98, 20, 20);
		panel_4.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(620, 98, 20, 20);
		panel_4.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(645, 98, 20, 20);
		panel_4.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(670, 98, 20, 20);
		panel_4.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(695, 98, 20, 20);
		panel_4.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(720, 98, 20, 20);
		panel_4.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(745, 98, 20, 20);
		panel_4.add(textField_60);
		
		label_32 = new JLabel("2");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_32.setBounds(0, 98, 20, 20);
		panel_4.add(label_32);
		
		label_33 = new JLabel("3");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_33.setBounds(0, 123, 20, 20);
		panel_4.add(label_33);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(20, 123, 20, 20);
		panel_4.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(45, 123, 20, 20);
		panel_4.add(textField_62);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(95, 123, 20, 20);
		panel_4.add(textField_64);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(70, 123, 20, 20);
		panel_4.add(textField_63);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(120, 123, 20, 20);
		panel_4.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(145, 123, 20, 20);
		panel_4.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(170, 123, 20, 20);
		panel_4.add(textField_67);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(220, 123, 20, 20);
		panel_4.add(textField_69);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(195, 123, 20, 20);
		panel_4.add(textField_68);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(245, 123, 20, 20);
		panel_4.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(270, 123, 20, 20);
		panel_4.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(295, 123, 20, 20);
		panel_4.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(320, 123, 20, 20);
		panel_4.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(345, 123, 20, 20);
		panel_4.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(370, 123, 20, 20);
		panel_4.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(395, 123, 20, 20);
		panel_4.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(420, 123, 20, 20);
		panel_4.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(445, 123, 20, 20);
		panel_4.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(470, 123, 20, 20);
		panel_4.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(495, 123, 20, 20);
		panel_4.add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(520, 123, 20, 20);
		panel_4.add(textField_81);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(545, 123, 20, 20);
		panel_4.add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(570, 123, 20, 20);
		panel_4.add(textField_83);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(595, 123, 20, 20);
		panel_4.add(textField_84);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(620, 123, 20, 20);
		panel_4.add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(645, 123, 20, 20);
		panel_4.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(670, 123, 20, 20);
		panel_4.add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(695, 123, 20, 20);
		panel_4.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(720, 123, 20, 20);
		panel_4.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(745, 123, 20, 20);
		panel_4.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBounds(20, 148, 20, 20);
		panel_4.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(45, 148, 20, 20);
		panel_4.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBounds(70, 148, 20, 20);
		panel_4.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(95, 148, 20, 20);
		panel_4.add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(120, 148, 20, 20);
		panel_4.add(textField_95);
		
		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBounds(145, 148, 20, 20);
		panel_4.add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setColumns(10);
		textField_97.setBounds(170, 148, 20, 20);
		panel_4.add(textField_97);
		
		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(195, 148, 20, 20);
		panel_4.add(textField_98);
		
		textField_99 = new JTextField();
		textField_99.setColumns(10);
		textField_99.setBounds(220, 148, 20, 20);
		panel_4.add(textField_99);
		
		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(245, 148, 20, 20);
		panel_4.add(textField_100);
		
		textField_101 = new JTextField();
		textField_101.setColumns(10);
		textField_101.setBounds(270, 148, 20, 20);
		panel_4.add(textField_101);
		
		textField_102 = new JTextField();
		textField_102.setColumns(10);
		textField_102.setBounds(295, 148, 20, 20);
		panel_4.add(textField_102);
		
		textField_103 = new JTextField();
		textField_103.setColumns(10);
		textField_103.setBounds(320, 148, 20, 20);
		panel_4.add(textField_103);
		
		textField_104 = new JTextField();
		textField_104.setColumns(10);
		textField_104.setBounds(345, 148, 20, 20);
		panel_4.add(textField_104);
		
		textField_105 = new JTextField();
		textField_105.setColumns(10);
		textField_105.setBounds(370, 148, 20, 20);
		panel_4.add(textField_105);
		
		textField_106 = new JTextField();
		textField_106.setColumns(10);
		textField_106.setBounds(395, 148, 20, 20);
		panel_4.add(textField_106);
		
		textField_107 = new JTextField();
		textField_107.setColumns(10);
		textField_107.setBounds(420, 148, 20, 20);
		panel_4.add(textField_107);
		
		textField_108 = new JTextField();
		textField_108.setColumns(10);
		textField_108.setBounds(445, 148, 20, 20);
		panel_4.add(textField_108);
		
		textField_109 = new JTextField();
		textField_109.setColumns(10);
		textField_109.setBounds(470, 148, 20, 20);
		panel_4.add(textField_109);
		
		textField_110 = new JTextField();
		textField_110.setColumns(10);
		textField_110.setBounds(495, 148, 20, 20);
		panel_4.add(textField_110);
		
		textField_111 = new JTextField();
		textField_111.setColumns(10);
		textField_111.setBounds(520, 148, 20, 20);
		panel_4.add(textField_111);
		
		textField_112 = new JTextField();
		textField_112.setColumns(10);
		textField_112.setBounds(545, 148, 20, 20);
		panel_4.add(textField_112);
		
		textField_113 = new JTextField();
		textField_113.setColumns(10);
		textField_113.setBounds(570, 148, 20, 20);
		panel_4.add(textField_113);
		
		textField_114 = new JTextField();
		textField_114.setColumns(10);
		textField_114.setBounds(595, 148, 20, 20);
		panel_4.add(textField_114);
		
		textField_115 = new JTextField();
		textField_115.setColumns(10);
		textField_115.setBounds(620, 148, 20, 20);
		panel_4.add(textField_115);
		
		textField_116 = new JTextField();
		textField_116.setColumns(10);
		textField_116.setBounds(645, 148, 20, 20);
		panel_4.add(textField_116);
		
		textField_117 = new JTextField();
		textField_117.setColumns(10);
		textField_117.setBounds(670, 148, 20, 20);
		panel_4.add(textField_117);
		
		textField_118 = new JTextField();
		textField_118.setColumns(10);
		textField_118.setBounds(695, 148, 20, 20);
		panel_4.add(textField_118);
		
		textField_119 = new JTextField();
		textField_119.setColumns(10);
		textField_119.setBounds(720, 148, 20, 20);
		panel_4.add(textField_119);
		
		textField_120 = new JTextField();
		textField_120.setColumns(10);
		textField_120.setBounds(745, 148, 20, 20);
		panel_4.add(textField_120);
		
		textField_121 = new JTextField();
		textField_121.setColumns(10);
		textField_121.setBounds(20, 173, 20, 20);
		panel_4.add(textField_121);
		
		textField_122 = new JTextField();
		textField_122.setColumns(10);
		textField_122.setBounds(45, 173, 20, 20);
		panel_4.add(textField_122);
		
		textField_123 = new JTextField();
		textField_123.setColumns(10);
		textField_123.setBounds(70, 173, 20, 20);
		panel_4.add(textField_123);
		
		textField_124 = new JTextField();
		textField_124.setColumns(10);
		textField_124.setBounds(95, 173, 20, 20);
		panel_4.add(textField_124);
		
		textField_125 = new JTextField();
		textField_125.setColumns(10);
		textField_125.setBounds(120, 173, 20, 20);
		panel_4.add(textField_125);
		
		textField_126 = new JTextField();
		textField_126.setColumns(10);
		textField_126.setBounds(145, 173, 20, 20);
		panel_4.add(textField_126);
		
		textField_127 = new JTextField();
		textField_127.setColumns(10);
		textField_127.setBounds(170, 173, 20, 20);
		panel_4.add(textField_127);
		
		textField_128 = new JTextField();
		textField_128.setColumns(10);
		textField_128.setBounds(195, 173, 20, 20);
		panel_4.add(textField_128);
		
		textField_129 = new JTextField();
		textField_129.setColumns(10);
		textField_129.setBounds(220, 173, 20, 20);
		panel_4.add(textField_129);
		
		textField_130 = new JTextField();
		textField_130.setColumns(10);
		textField_130.setBounds(245, 173, 20, 20);
		panel_4.add(textField_130);
		
		textField_131 = new JTextField();
		textField_131.setColumns(10);
		textField_131.setBounds(270, 173, 20, 20);
		panel_4.add(textField_131);
		
		textField_132 = new JTextField();
		textField_132.setColumns(10);
		textField_132.setBounds(295, 173, 20, 20);
		panel_4.add(textField_132);
		
		textField_133 = new JTextField();
		textField_133.setColumns(10);
		textField_133.setBounds(320, 173, 20, 20);
		panel_4.add(textField_133);
		
		textField_134 = new JTextField();
		textField_134.setColumns(10);
		textField_134.setBounds(345, 173, 20, 20);
		panel_4.add(textField_134);
		
		textField_135 = new JTextField();
		textField_135.setColumns(10);
		textField_135.setBounds(370, 173, 20, 20);
		panel_4.add(textField_135);
		
		textField_136 = new JTextField();
		textField_136.setColumns(10);
		textField_136.setBounds(395, 173, 20, 20);
		panel_4.add(textField_136);
		
		textField_137 = new JTextField();
		textField_137.setColumns(10);
		textField_137.setBounds(420, 173, 20, 20);
		panel_4.add(textField_137);
		
		textField_138 = new JTextField();
		textField_138.setColumns(10);
		textField_138.setBounds(445, 173, 20, 20);
		panel_4.add(textField_138);
		
		textField_139 = new JTextField();
		textField_139.setColumns(10);
		textField_139.setBounds(470, 173, 20, 20);
		panel_4.add(textField_139);
		
		textField_140 = new JTextField();
		textField_140.setColumns(10);
		textField_140.setBounds(495, 173, 20, 20);
		panel_4.add(textField_140);
		
		textField_141 = new JTextField();
		textField_141.setColumns(10);
		textField_141.setBounds(520, 173, 20, 20);
		panel_4.add(textField_141);
		
		textField_142 = new JTextField();
		textField_142.setColumns(10);
		textField_142.setBounds(545, 173, 20, 20);
		panel_4.add(textField_142);
		
		textField_143 = new JTextField();
		textField_143.setColumns(10);
		textField_143.setBounds(570, 173, 20, 20);
		panel_4.add(textField_143);
		
		textField_144 = new JTextField();
		textField_144.setColumns(10);
		textField_144.setBounds(595, 173, 20, 20);
		panel_4.add(textField_144);
		
		textField_145 = new JTextField();
		textField_145.setColumns(10);
		textField_145.setBounds(620, 173, 20, 20);
		panel_4.add(textField_145);
		
		textField_146 = new JTextField();
		textField_146.setColumns(10);
		textField_146.setBounds(645, 173, 20, 20);
		panel_4.add(textField_146);
		
		textField_147 = new JTextField();
		textField_147.setColumns(10);
		textField_147.setBounds(670, 173, 20, 20);
		panel_4.add(textField_147);
		
		textField_148 = new JTextField();
		textField_148.setColumns(10);
		textField_148.setBounds(695, 173, 20, 20);
		panel_4.add(textField_148);
		
		textField_149 = new JTextField();
		textField_149.setColumns(10);
		textField_149.setBounds(720, 173, 20, 20);
		panel_4.add(textField_149);
		
		textField_150 = new JTextField();
		textField_150.setColumns(10);
		textField_150.setBounds(745, 173, 20, 20);
		panel_4.add(textField_150);
		
		textField_151 = new JTextField();
		textField_151.setColumns(10);
		textField_151.setBounds(20, 198, 20, 20);
		panel_4.add(textField_151);
		
		textField_152 = new JTextField();
		textField_152.setColumns(10);
		textField_152.setBounds(45, 198, 20, 20);
		panel_4.add(textField_152);
		
		textField_153 = new JTextField();
		textField_153.setColumns(10);
		textField_153.setBounds(70, 198, 20, 20);
		panel_4.add(textField_153);
		
		textField_154 = new JTextField();
		textField_154.setColumns(10);
		textField_154.setBounds(95, 198, 20, 20);
		panel_4.add(textField_154);
		
		textField_155 = new JTextField();
		textField_155.setColumns(10);
		textField_155.setBounds(120, 198, 20, 20);
		panel_4.add(textField_155);
		
		textField_156 = new JTextField();
		textField_156.setColumns(10);
		textField_156.setBounds(145, 198, 20, 20);
		panel_4.add(textField_156);
		
		textField_157 = new JTextField();
		textField_157.setColumns(10);
		textField_157.setBounds(170, 198, 20, 20);
		panel_4.add(textField_157);
		
		textField_158 = new JTextField();
		textField_158.setColumns(10);
		textField_158.setBounds(195, 198, 20, 20);
		panel_4.add(textField_158);
		
		textField_159 = new JTextField();
		textField_159.setColumns(10);
		textField_159.setBounds(220, 198, 20, 20);
		panel_4.add(textField_159);
		
		textField_160 = new JTextField();
		textField_160.setColumns(10);
		textField_160.setBounds(245, 198, 20, 20);
		panel_4.add(textField_160);
		
		textField_161 = new JTextField();
		textField_161.setColumns(10);
		textField_161.setBounds(270, 198, 20, 20);
		panel_4.add(textField_161);
		
		textField_162 = new JTextField();
		textField_162.setColumns(10);
		textField_162.setBounds(295, 198, 20, 20);
		panel_4.add(textField_162);
		
		textField_163 = new JTextField();
		textField_163.setColumns(10);
		textField_163.setBounds(320, 198, 20, 20);
		panel_4.add(textField_163);
		
		textField_164 = new JTextField();
		textField_164.setColumns(10);
		textField_164.setBounds(345, 198, 20, 20);
		panel_4.add(textField_164);
		
		textField_165 = new JTextField();
		textField_165.setColumns(10);
		textField_165.setBounds(370, 198, 20, 20);
		panel_4.add(textField_165);
		
		textField_166 = new JTextField();
		textField_166.setColumns(10);
		textField_166.setBounds(395, 198, 20, 20);
		panel_4.add(textField_166);
		
		textField_167 = new JTextField();
		textField_167.setColumns(10);
		textField_167.setBounds(420, 198, 20, 20);
		panel_4.add(textField_167);
		
		textField_168 = new JTextField();
		textField_168.setColumns(10);
		textField_168.setBounds(445, 198, 20, 20);
		panel_4.add(textField_168);
		
		textField_169 = new JTextField();
		textField_169.setColumns(10);
		textField_169.setBounds(470, 198, 20, 20);
		panel_4.add(textField_169);
		
		textField_170 = new JTextField();
		textField_170.setColumns(10);
		textField_170.setBounds(495, 198, 20, 20);
		panel_4.add(textField_170);
		
		textField_171 = new JTextField();
		textField_171.setColumns(10);
		textField_171.setBounds(520, 198, 20, 20);
		panel_4.add(textField_171);
		
		textField_172 = new JTextField();
		textField_172.setColumns(10);
		textField_172.setBounds(545, 198, 20, 20);
		panel_4.add(textField_172);
		
		textField_173 = new JTextField();
		textField_173.setColumns(10);
		textField_173.setBounds(570, 198, 20, 20);
		panel_4.add(textField_173);
		
		textField_174 = new JTextField();
		textField_174.setColumns(10);
		textField_174.setBounds(595, 198, 20, 20);
		panel_4.add(textField_174);
		
		textField_175 = new JTextField();
		textField_175.setColumns(10);
		textField_175.setBounds(620, 198, 20, 20);
		panel_4.add(textField_175);
		
		textField_176 = new JTextField();
		textField_176.setColumns(10);
		textField_176.setBounds(645, 198, 20, 20);
		panel_4.add(textField_176);
		
		textField_177 = new JTextField();
		textField_177.setColumns(10);
		textField_177.setBounds(670, 198, 20, 20);
		panel_4.add(textField_177);
		
		textField_178 = new JTextField();
		textField_178.setColumns(10);
		textField_178.setBounds(695, 198, 20, 20);
		panel_4.add(textField_178);
		
		textField_179 = new JTextField();
		textField_179.setColumns(10);
		textField_179.setBounds(720, 198, 20, 20);
		panel_4.add(textField_179);
		
		textField_180 = new JTextField();
		textField_180.setColumns(10);
		textField_180.setBounds(745, 198, 20, 20);
		panel_4.add(textField_180);
		
		textField_181 = new JTextField();
		textField_181.setColumns(10);
		textField_181.setBounds(20, 223, 20, 20);
		panel_4.add(textField_181);
		
		textField_182 = new JTextField();
		textField_182.setColumns(10);
		textField_182.setBounds(45, 223, 20, 20);
		panel_4.add(textField_182);
		
		textField_183 = new JTextField();
		textField_183.setColumns(10);
		textField_183.setBounds(70, 223, 20, 20);
		panel_4.add(textField_183);
		
		textField_184 = new JTextField();
		textField_184.setColumns(10);
		textField_184.setBounds(95, 223, 20, 20);
		panel_4.add(textField_184);
		
		textField_185 = new JTextField();
		textField_185.setColumns(10);
		textField_185.setBounds(120, 223, 20, 20);
		panel_4.add(textField_185);
		
		textField_186 = new JTextField();
		textField_186.setColumns(10);
		textField_186.setBounds(145, 223, 20, 20);
		panel_4.add(textField_186);
		
		textField_187 = new JTextField();
		textField_187.setColumns(10);
		textField_187.setBounds(170, 223, 20, 20);
		panel_4.add(textField_187);
		
		textField_188 = new JTextField();
		textField_188.setColumns(10);
		textField_188.setBounds(195, 223, 20, 20);
		panel_4.add(textField_188);
		
		textField_189 = new JTextField();
		textField_189.setColumns(10);
		textField_189.setBounds(220, 223, 20, 20);
		panel_4.add(textField_189);
		
		textField_190 = new JTextField();
		textField_190.setColumns(10);
		textField_190.setBounds(245, 223, 20, 20);
		panel_4.add(textField_190);
		
		textField_191 = new JTextField();
		textField_191.setColumns(10);
		textField_191.setBounds(270, 223, 20, 20);
		panel_4.add(textField_191);
		
		textField_192 = new JTextField();
		textField_192.setColumns(10);
		textField_192.setBounds(295, 223, 20, 20);
		panel_4.add(textField_192);
		
		textField_193 = new JTextField();
		textField_193.setColumns(10);
		textField_193.setBounds(320, 223, 20, 20);
		panel_4.add(textField_193);
		
		textField_194 = new JTextField();
		textField_194.setColumns(10);
		textField_194.setBounds(345, 223, 20, 20);
		panel_4.add(textField_194);
		
		textField_195 = new JTextField();
		textField_195.setColumns(10);
		textField_195.setBounds(370, 223, 20, 20);
		panel_4.add(textField_195);
		
		textField_196 = new JTextField();
		textField_196.setColumns(10);
		textField_196.setBounds(395, 223, 20, 20);
		panel_4.add(textField_196);
		
		textField_197 = new JTextField();
		textField_197.setColumns(10);
		textField_197.setBounds(420, 223, 20, 20);
		panel_4.add(textField_197);
		
		textField_198 = new JTextField();
		textField_198.setColumns(10);
		textField_198.setBounds(445, 223, 20, 20);
		panel_4.add(textField_198);
		
		textField_199 = new JTextField();
		textField_199.setColumns(10);
		textField_199.setBounds(470, 223, 20, 20);
		panel_4.add(textField_199);
		
		textField_200 = new JTextField();
		textField_200.setColumns(10);
		textField_200.setBounds(495, 223, 20, 20);
		panel_4.add(textField_200);
		
		textField_201 = new JTextField();
		textField_201.setColumns(10);
		textField_201.setBounds(520, 223, 20, 20);
		panel_4.add(textField_201);
		
		textField_202 = new JTextField();
		textField_202.setColumns(10);
		textField_202.setBounds(545, 223, 20, 20);
		panel_4.add(textField_202);
		
		textField_203 = new JTextField();
		textField_203.setColumns(10);
		textField_203.setBounds(570, 223, 20, 20);
		panel_4.add(textField_203);
		
		textField_204 = new JTextField();
		textField_204.setColumns(10);
		textField_204.setBounds(595, 223, 20, 20);
		panel_4.add(textField_204);
		
		textField_205 = new JTextField();
		textField_205.setColumns(10);
		textField_205.setBounds(620, 223, 20, 20);
		panel_4.add(textField_205);
		
		textField_206 = new JTextField();
		textField_206.setColumns(10);
		textField_206.setBounds(645, 223, 20, 20);
		panel_4.add(textField_206);
		
		textField_207 = new JTextField();
		textField_207.setColumns(10);
		textField_207.setBounds(670, 223, 20, 20);
		panel_4.add(textField_207);
		
		textField_208 = new JTextField();
		textField_208.setColumns(10);
		textField_208.setBounds(695, 223, 20, 20);
		panel_4.add(textField_208);
		
		textField_209 = new JTextField();
		textField_209.setColumns(10);
		textField_209.setBounds(720, 223, 20, 20);
		panel_4.add(textField_209);
		
		textField_210 = new JTextField();
		textField_210.setColumns(10);
		textField_210.setBounds(745, 223, 20, 20);
		panel_4.add(textField_210);
		
		label_34 = new JLabel("4");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_34.setBounds(0, 148, 20, 20);
		panel_4.add(label_34);
		
		label_35 = new JLabel("5");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_35.setBounds(0, 173, 20, 20);
		panel_4.add(label_35);
		
		label_36 = new JLabel("6");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_36.setBounds(0, 198, 20, 20);
		panel_4.add(label_36);
		
		label_37 = new JLabel("7");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_37.setBounds(0, 223, 20, 20);
		panel_4.add(label_37);
		
		textField_211 = new JTextField();
		textField_211.setColumns(10);
		textField_211.setBounds(20, 248, 20, 20);
		panel_4.add(textField_211);
		
		textField_212 = new JTextField();
		textField_212.setColumns(10);
		textField_212.setBounds(45, 248, 20, 20);
		panel_4.add(textField_212);
		
		textField_213 = new JTextField();
		textField_213.setColumns(10);
		textField_213.setBounds(70, 248, 20, 20);
		panel_4.add(textField_213);
		
		textField_214 = new JTextField();
		textField_214.setColumns(10);
		textField_214.setBounds(95, 248, 20, 20);
		panel_4.add(textField_214);
		
		textField_215 = new JTextField();
		textField_215.setColumns(10);
		textField_215.setBounds(120, 248, 20, 20);
		panel_4.add(textField_215);
		
		textField_216 = new JTextField();
		textField_216.setColumns(10);
		textField_216.setBounds(145, 248, 20, 20);
		panel_4.add(textField_216);
		
		textField_217 = new JTextField();
		textField_217.setColumns(10);
		textField_217.setBounds(170, 248, 20, 20);
		panel_4.add(textField_217);
		
		textField_218 = new JTextField();
		textField_218.setColumns(10);
		textField_218.setBounds(195, 248, 20, 20);
		panel_4.add(textField_218);
		
		textField_219 = new JTextField();
		textField_219.setColumns(10);
		textField_219.setBounds(220, 248, 20, 20);
		panel_4.add(textField_219);
		
		textField_220 = new JTextField();
		textField_220.setColumns(10);
		textField_220.setBounds(245, 248, 20, 20);
		panel_4.add(textField_220);
		
		textField_221 = new JTextField();
		textField_221.setColumns(10);
		textField_221.setBounds(270, 248, 20, 20);
		panel_4.add(textField_221);
		
		textField_222 = new JTextField();
		textField_222.setColumns(10);
		textField_222.setBounds(295, 248, 20, 20);
		panel_4.add(textField_222);
		
		textField_223 = new JTextField();
		textField_223.setColumns(10);
		textField_223.setBounds(320, 248, 20, 20);
		panel_4.add(textField_223);
		
		textField_224 = new JTextField();
		textField_224.setColumns(10);
		textField_224.setBounds(345, 248, 20, 20);
		panel_4.add(textField_224);
		
		textField_225 = new JTextField();
		textField_225.setColumns(10);
		textField_225.setBounds(370, 248, 20, 20);
		panel_4.add(textField_225);
		
		textField_226 = new JTextField();
		textField_226.setColumns(10);
		textField_226.setBounds(395, 248, 20, 20);
		panel_4.add(textField_226);
		
		textField_227 = new JTextField();
		textField_227.setColumns(10);
		textField_227.setBounds(420, 248, 20, 20);
		panel_4.add(textField_227);
		
		textField_228 = new JTextField();
		textField_228.setColumns(10);
		textField_228.setBounds(445, 248, 20, 20);
		panel_4.add(textField_228);
		
		textField_229 = new JTextField();
		textField_229.setColumns(10);
		textField_229.setBounds(470, 248, 20, 20);
		panel_4.add(textField_229);
		
		textField_230 = new JTextField();
		textField_230.setColumns(10);
		textField_230.setBounds(495, 248, 20, 20);
		panel_4.add(textField_230);
		
		textField_231 = new JTextField();
		textField_231.setColumns(10);
		textField_231.setBounds(520, 248, 20, 20);
		panel_4.add(textField_231);
		
		textField_232 = new JTextField();
		textField_232.setColumns(10);
		textField_232.setBounds(545, 248, 20, 20);
		panel_4.add(textField_232);
		
		textField_233 = new JTextField();
		textField_233.setColumns(10);
		textField_233.setBounds(570, 248, 20, 20);
		panel_4.add(textField_233);
		
		textField_234 = new JTextField();
		textField_234.setColumns(10);
		textField_234.setBounds(595, 248, 20, 20);
		panel_4.add(textField_234);
		
		textField_235 = new JTextField();
		textField_235.setColumns(10);
		textField_235.setBounds(620, 248, 20, 20);
		panel_4.add(textField_235);
		
		textField_236 = new JTextField();
		textField_236.setColumns(10);
		textField_236.setBounds(645, 248, 20, 20);
		panel_4.add(textField_236);
		
		textField_237 = new JTextField();
		textField_237.setColumns(10);
		textField_237.setBounds(670, 248, 20, 20);
		panel_4.add(textField_237);
		
		textField_238 = new JTextField();
		textField_238.setColumns(10);
		textField_238.setBounds(695, 248, 20, 20);
		panel_4.add(textField_238);
		
		textField_239 = new JTextField();
		textField_239.setColumns(10);
		textField_239.setBounds(720, 248, 20, 20);
		panel_4.add(textField_239);
		
		textField_240 = new JTextField();
		textField_240.setColumns(10);
		textField_240.setBounds(745, 248, 20, 20);
		panel_4.add(textField_240);
		
		textField_241 = new JTextField();
		textField_241.setColumns(10);
		textField_241.setBounds(20, 273, 20, 20);
		panel_4.add(textField_241);
		
		textField_242 = new JTextField();
		textField_242.setColumns(10);
		textField_242.setBounds(45, 273, 20, 20);
		panel_4.add(textField_242);
		
		textField_243 = new JTextField();
		textField_243.setColumns(10);
		textField_243.setBounds(70, 273, 20, 20);
		panel_4.add(textField_243);
		
		textField_244 = new JTextField();
		textField_244.setColumns(10);
		textField_244.setBounds(95, 273, 20, 20);
		panel_4.add(textField_244);
		
		textField_245 = new JTextField();
		textField_245.setColumns(10);
		textField_245.setBounds(120, 273, 20, 20);
		panel_4.add(textField_245);
		
		textField_246 = new JTextField();
		textField_246.setColumns(10);
		textField_246.setBounds(145, 273, 20, 20);
		panel_4.add(textField_246);
		
		textField_247 = new JTextField();
		textField_247.setColumns(10);
		textField_247.setBounds(170, 273, 20, 20);
		panel_4.add(textField_247);
		
		textField_248 = new JTextField();
		textField_248.setColumns(10);
		textField_248.setBounds(195, 273, 20, 20);
		panel_4.add(textField_248);
		
		textField_249 = new JTextField();
		textField_249.setColumns(10);
		textField_249.setBounds(220, 273, 20, 20);
		panel_4.add(textField_249);
		
		textField_250 = new JTextField();
		textField_250.setColumns(10);
		textField_250.setBounds(245, 273, 20, 20);
		panel_4.add(textField_250);
		
		textField_251 = new JTextField();
		textField_251.setColumns(10);
		textField_251.setBounds(270, 273, 20, 20);
		panel_4.add(textField_251);
		
		textField_252 = new JTextField();
		textField_252.setColumns(10);
		textField_252.setBounds(295, 273, 20, 20);
		panel_4.add(textField_252);
		
		textField_253 = new JTextField();
		textField_253.setColumns(10);
		textField_253.setBounds(320, 273, 20, 20);
		panel_4.add(textField_253);
		
		textField_254 = new JTextField();
		textField_254.setColumns(10);
		textField_254.setBounds(345, 273, 20, 20);
		panel_4.add(textField_254);
		
		textField_255 = new JTextField();
		textField_255.setColumns(10);
		textField_255.setBounds(370, 273, 20, 20);
		panel_4.add(textField_255);
		
		textField_256 = new JTextField();
		textField_256.setColumns(10);
		textField_256.setBounds(395, 273, 20, 20);
		panel_4.add(textField_256);
		
		textField_257 = new JTextField();
		textField_257.setColumns(10);
		textField_257.setBounds(420, 273, 20, 20);
		panel_4.add(textField_257);
		
		textField_258 = new JTextField();
		textField_258.setColumns(10);
		textField_258.setBounds(445, 273, 20, 20);
		panel_4.add(textField_258);
		
		textField_259 = new JTextField();
		textField_259.setColumns(10);
		textField_259.setBounds(470, 273, 20, 20);
		panel_4.add(textField_259);
		
		textField_260 = new JTextField();
		textField_260.setColumns(10);
		textField_260.setBounds(495, 273, 20, 20);
		panel_4.add(textField_260);
		
		textField_261 = new JTextField();
		textField_261.setColumns(10);
		textField_261.setBounds(520, 273, 20, 20);
		panel_4.add(textField_261);
		
		textField_262 = new JTextField();
		textField_262.setColumns(10);
		textField_262.setBounds(545, 273, 20, 20);
		panel_4.add(textField_262);
		
		textField_263 = new JTextField();
		textField_263.setColumns(10);
		textField_263.setBounds(570, 273, 20, 20);
		panel_4.add(textField_263);
		
		textField_264 = new JTextField();
		textField_264.setColumns(10);
		textField_264.setBounds(595, 273, 20, 20);
		panel_4.add(textField_264);
		
		textField_265 = new JTextField();
		textField_265.setColumns(10);
		textField_265.setBounds(620, 273, 20, 20);
		panel_4.add(textField_265);
		
		textField_266 = new JTextField();
		textField_266.setColumns(10);
		textField_266.setBounds(645, 273, 20, 20);
		panel_4.add(textField_266);
		
		textField_267 = new JTextField();
		textField_267.setColumns(10);
		textField_267.setBounds(670, 273, 20, 20);
		panel_4.add(textField_267);
		
		textField_268 = new JTextField();
		textField_268.setColumns(10);
		textField_268.setBounds(695, 273, 20, 20);
		panel_4.add(textField_268);
		
		textField_269 = new JTextField();
		textField_269.setColumns(10);
		textField_269.setBounds(720, 273, 20, 20);
		panel_4.add(textField_269);
		
		textField_270 = new JTextField();
		textField_270.setColumns(10);
		textField_270.setBounds(745, 273, 20, 20);
		panel_4.add(textField_270);
		
		textField_271 = new JTextField();
		textField_271.setColumns(10);
		textField_271.setBounds(20, 298, 20, 20);
		panel_4.add(textField_271);
		
		textField_272 = new JTextField();
		textField_272.setColumns(10);
		textField_272.setBounds(45, 298, 20, 20);
		panel_4.add(textField_272);
		
		textField_273 = new JTextField();
		textField_273.setColumns(10);
		textField_273.setBounds(70, 298, 20, 20);
		panel_4.add(textField_273);
		
		textField_274 = new JTextField();
		textField_274.setColumns(10);
		textField_274.setBounds(95, 298, 20, 20);
		panel_4.add(textField_274);
		
		textField_275 = new JTextField();
		textField_275.setColumns(10);
		textField_275.setBounds(120, 298, 20, 20);
		panel_4.add(textField_275);
		
		textField_276 = new JTextField();
		textField_276.setColumns(10);
		textField_276.setBounds(145, 298, 20, 20);
		panel_4.add(textField_276);
		
		textField_277 = new JTextField();
		textField_277.setColumns(10);
		textField_277.setBounds(170, 298, 20, 20);
		panel_4.add(textField_277);
		
		textField_278 = new JTextField();
		textField_278.setColumns(10);
		textField_278.setBounds(195, 298, 20, 20);
		panel_4.add(textField_278);
		
		textField_279 = new JTextField();
		textField_279.setColumns(10);
		textField_279.setBounds(220, 298, 20, 20);
		panel_4.add(textField_279);
		
		textField_280 = new JTextField();
		textField_280.setColumns(10);
		textField_280.setBounds(245, 298, 20, 20);
		panel_4.add(textField_280);
		
		textField_281 = new JTextField();
		textField_281.setColumns(10);
		textField_281.setBounds(270, 298, 20, 20);
		panel_4.add(textField_281);
		
		textField_282 = new JTextField();
		textField_282.setColumns(10);
		textField_282.setBounds(295, 298, 20, 20);
		panel_4.add(textField_282);
		
		textField_283 = new JTextField();
		textField_283.setColumns(10);
		textField_283.setBounds(320, 298, 20, 20);
		panel_4.add(textField_283);
		
		textField_284 = new JTextField();
		textField_284.setColumns(10);
		textField_284.setBounds(345, 298, 20, 20);
		panel_4.add(textField_284);
		
		textField_285 = new JTextField();
		textField_285.setColumns(10);
		textField_285.setBounds(370, 298, 20, 20);
		panel_4.add(textField_285);
		
		textField_286 = new JTextField();
		textField_286.setColumns(10);
		textField_286.setBounds(395, 298, 20, 20);
		panel_4.add(textField_286);
		
		textField_287 = new JTextField();
		textField_287.setColumns(10);
		textField_287.setBounds(420, 298, 20, 20);
		panel_4.add(textField_287);
		
		textField_288 = new JTextField();
		textField_288.setColumns(10);
		textField_288.setBounds(445, 298, 20, 20);
		panel_4.add(textField_288);
		
		textField_289 = new JTextField();
		textField_289.setColumns(10);
		textField_289.setBounds(470, 298, 20, 20);
		panel_4.add(textField_289);
		
		textField_290 = new JTextField();
		textField_290.setColumns(10);
		textField_290.setBounds(495, 298, 20, 20);
		panel_4.add(textField_290);
		
		textField_291 = new JTextField();
		textField_291.setColumns(10);
		textField_291.setBounds(520, 298, 20, 20);
		panel_4.add(textField_291);
		
		textField_292 = new JTextField();
		textField_292.setColumns(10);
		textField_292.setBounds(545, 298, 20, 20);
		panel_4.add(textField_292);
		
		textField_293 = new JTextField();
		textField_293.setColumns(10);
		textField_293.setBounds(570, 298, 20, 20);
		panel_4.add(textField_293);
		
		textField_294 = new JTextField();
		textField_294.setColumns(10);
		textField_294.setBounds(595, 298, 20, 20);
		panel_4.add(textField_294);
		
		textField_295 = new JTextField();
		textField_295.setColumns(10);
		textField_295.setBounds(620, 298, 20, 20);
		panel_4.add(textField_295);
		
		textField_296 = new JTextField();
		textField_296.setColumns(10);
		textField_296.setBounds(645, 298, 20, 20);
		panel_4.add(textField_296);
		
		textField_297 = new JTextField();
		textField_297.setColumns(10);
		textField_297.setBounds(670, 298, 20, 20);
		panel_4.add(textField_297);
		
		textField_298 = new JTextField();
		textField_298.setColumns(10);
		textField_298.setBounds(695, 298, 20, 20);
		panel_4.add(textField_298);
		
		textField_299 = new JTextField();
		textField_299.setColumns(10);
		textField_299.setBounds(720, 298, 20, 20);
		panel_4.add(textField_299);
		
		textField_300 = new JTextField();
		textField_300.setColumns(10);
		textField_300.setBounds(745, 298, 20, 20);
		panel_4.add(textField_300);
		
		textField_301 = new JTextField();
		textField_301.setColumns(10);
		textField_301.setBounds(20, 323, 20, 20);
		panel_4.add(textField_301);
		
		textField_302 = new JTextField();
		textField_302.setColumns(10);
		textField_302.setBounds(45, 323, 20, 20);
		panel_4.add(textField_302);
		
		textField_303 = new JTextField();
		textField_303.setColumns(10);
		textField_303.setBounds(70, 323, 20, 20);
		panel_4.add(textField_303);
		
		textField_304 = new JTextField();
		textField_304.setColumns(10);
		textField_304.setBounds(95, 323, 20, 20);
		panel_4.add(textField_304);
		
		textField_305 = new JTextField();
		textField_305.setColumns(10);
		textField_305.setBounds(120, 323, 20, 20);
		panel_4.add(textField_305);
		
		textField_306 = new JTextField();
		textField_306.setColumns(10);
		textField_306.setBounds(145, 323, 20, 20);
		panel_4.add(textField_306);
		
		textField_307 = new JTextField();
		textField_307.setColumns(10);
		textField_307.setBounds(170, 323, 20, 20);
		panel_4.add(textField_307);
		
		textField_308 = new JTextField();
		textField_308.setColumns(10);
		textField_308.setBounds(195, 323, 20, 20);
		panel_4.add(textField_308);
		
		textField_309 = new JTextField();
		textField_309.setColumns(10);
		textField_309.setBounds(220, 323, 20, 20);
		panel_4.add(textField_309);
		
		textField_310 = new JTextField();
		textField_310.setColumns(10);
		textField_310.setBounds(245, 323, 20, 20);
		panel_4.add(textField_310);
		
		textField_311 = new JTextField();
		textField_311.setColumns(10);
		textField_311.setBounds(270, 323, 20, 20);
		panel_4.add(textField_311);
		
		textField_312 = new JTextField();
		textField_312.setColumns(10);
		textField_312.setBounds(295, 323, 20, 20);
		panel_4.add(textField_312);
		
		textField_313 = new JTextField();
		textField_313.setColumns(10);
		textField_313.setBounds(320, 323, 20, 20);
		panel_4.add(textField_313);
		
		textField_314 = new JTextField();
		textField_314.setColumns(10);
		textField_314.setBounds(345, 323, 20, 20);
		panel_4.add(textField_314);
		
		textField_315 = new JTextField();
		textField_315.setColumns(10);
		textField_315.setBounds(370, 323, 20, 20);
		panel_4.add(textField_315);
		
		textField_316 = new JTextField();
		textField_316.setColumns(10);
		textField_316.setBounds(395, 323, 20, 20);
		panel_4.add(textField_316);
		
		textField_317 = new JTextField();
		textField_317.setColumns(10);
		textField_317.setBounds(420, 323, 20, 20);
		panel_4.add(textField_317);
		
		textField_318 = new JTextField();
		textField_318.setColumns(10);
		textField_318.setBounds(445, 323, 20, 20);
		panel_4.add(textField_318);
		
		textField_319 = new JTextField();
		textField_319.setColumns(10);
		textField_319.setBounds(470, 323, 20, 20);
		panel_4.add(textField_319);
		
		textField_320 = new JTextField();
		textField_320.setColumns(10);
		textField_320.setBounds(495, 323, 20, 20);
		panel_4.add(textField_320);
		
		textField_321 = new JTextField();
		textField_321.setColumns(10);
		textField_321.setBounds(520, 323, 20, 20);
		panel_4.add(textField_321);
		
		textField_322 = new JTextField();
		textField_322.setColumns(10);
		textField_322.setBounds(545, 323, 20, 20);
		panel_4.add(textField_322);
		
		textField_323 = new JTextField();
		textField_323.setColumns(10);
		textField_323.setBounds(570, 323, 20, 20);
		panel_4.add(textField_323);
		
		textField_324 = new JTextField();
		textField_324.setColumns(10);
		textField_324.setBounds(595, 323, 20, 20);
		panel_4.add(textField_324);
		
		textField_325 = new JTextField();
		textField_325.setColumns(10);
		textField_325.setBounds(620, 323, 20, 20);
		panel_4.add(textField_325);
		
		textField_326 = new JTextField();
		textField_326.setColumns(10);
		textField_326.setBounds(645, 323, 20, 20);
		panel_4.add(textField_326);
		
		textField_327 = new JTextField();
		textField_327.setColumns(10);
		textField_327.setBounds(670, 323, 20, 20);
		panel_4.add(textField_327);
		
		textField_328 = new JTextField();
		textField_328.setColumns(10);
		textField_328.setBounds(695, 323, 20, 20);
		panel_4.add(textField_328);
		
		textField_329 = new JTextField();
		textField_329.setColumns(10);
		textField_329.setBounds(720, 323, 20, 20);
		panel_4.add(textField_329);
		
		textField_330 = new JTextField();
		textField_330.setColumns(10);
		textField_330.setBounds(745, 323, 20, 20);
		panel_4.add(textField_330);
		
		label_38 = new JLabel("8");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_38.setBounds(0, 248, 20, 20);
		panel_4.add(label_38);
		
		label_39 = new JLabel("9");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_39.setBounds(0, 273, 20, 20);
		panel_4.add(label_39);
		
		label_40 = new JLabel("10");
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_40.setBounds(0, 298, 20, 20);
		panel_4.add(label_40);
		
		label_41 = new JLabel("11");
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_41.setBounds(0, 323, 20, 20);
		panel_4.add(label_41);
		
		label_42 = new JLabel("12");
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		label_42.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_42.setBounds(0, 348, 20, 20);
		panel_4.add(label_42);
		
		label_43 = new JLabel("13");
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_43.setBounds(0, 373, 20, 20);
		panel_4.add(label_43);
		
		label_44 = new JLabel("14");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_44.setBounds(0, 398, 20, 20);
		panel_4.add(label_44);
		
		label_45 = new JLabel("15");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		label_45.setBounds(0, 423, 20, 20);
		panel_4.add(label_45);
		
		textField_331 = new JTextField();
		textField_331.setColumns(10);
		textField_331.setBounds(20, 348, 20, 20);
		panel_4.add(textField_331);
		
		textField_332 = new JTextField();
		textField_332.setColumns(10);
		textField_332.setBounds(45, 348, 20, 20);
		panel_4.add(textField_332);
		
		textField_333 = new JTextField();
		textField_333.setColumns(10);
		textField_333.setBounds(70, 348, 20, 20);
		panel_4.add(textField_333);
		
		textField_334 = new JTextField();
		textField_334.setColumns(10);
		textField_334.setBounds(95, 348, 20, 20);
		panel_4.add(textField_334);
		
		textField_335 = new JTextField();
		textField_335.setColumns(10);
		textField_335.setBounds(120, 348, 20, 20);
		panel_4.add(textField_335);
		
		textField_336 = new JTextField();
		textField_336.setColumns(10);
		textField_336.setBounds(145, 348, 20, 20);
		panel_4.add(textField_336);
		
		textField_337 = new JTextField();
		textField_337.setColumns(10);
		textField_337.setBounds(170, 348, 20, 20);
		panel_4.add(textField_337);
		
		textField_338 = new JTextField();
		textField_338.setColumns(10);
		textField_338.setBounds(195, 348, 20, 20);
		panel_4.add(textField_338);
		
		textField_339 = new JTextField();
		textField_339.setColumns(10);
		textField_339.setBounds(220, 348, 20, 20);
		panel_4.add(textField_339);
		
		textField_340 = new JTextField();
		textField_340.setColumns(10);
		textField_340.setBounds(245, 348, 20, 20);
		panel_4.add(textField_340);
		
		textField_341 = new JTextField();
		textField_341.setColumns(10);
		textField_341.setBounds(270, 348, 20, 20);
		panel_4.add(textField_341);
		
		textField_342 = new JTextField();
		textField_342.setColumns(10);
		textField_342.setBounds(295, 348, 20, 20);
		panel_4.add(textField_342);
		
		textField_343 = new JTextField();
		textField_343.setColumns(10);
		textField_343.setBounds(320, 348, 20, 20);
		panel_4.add(textField_343);
		
		textField_344 = new JTextField();
		textField_344.setColumns(10);
		textField_344.setBounds(345, 348, 20, 20);
		panel_4.add(textField_344);
		
		textField_345 = new JTextField();
		textField_345.setColumns(10);
		textField_345.setBounds(370, 348, 20, 20);
		panel_4.add(textField_345);
		
		textField_346 = new JTextField();
		textField_346.setColumns(10);
		textField_346.setBounds(395, 348, 20, 20);
		panel_4.add(textField_346);
		
		textField_347 = new JTextField();
		textField_347.setColumns(10);
		textField_347.setBounds(420, 348, 20, 20);
		panel_4.add(textField_347);
		
		textField_348 = new JTextField();
		textField_348.setColumns(10);
		textField_348.setBounds(445, 348, 20, 20);
		panel_4.add(textField_348);
		
		textField_349 = new JTextField();
		textField_349.setColumns(10);
		textField_349.setBounds(470, 348, 20, 20);
		panel_4.add(textField_349);
		
		textField_350 = new JTextField();
		textField_350.setColumns(10);
		textField_350.setBounds(495, 348, 20, 20);
		panel_4.add(textField_350);
		
		textField_351 = new JTextField();
		textField_351.setColumns(10);
		textField_351.setBounds(520, 348, 20, 20);
		panel_4.add(textField_351);
		
		textField_352 = new JTextField();
		textField_352.setColumns(10);
		textField_352.setBounds(545, 348, 20, 20);
		panel_4.add(textField_352);
		
		textField_353 = new JTextField();
		textField_353.setColumns(10);
		textField_353.setBounds(570, 348, 20, 20);
		panel_4.add(textField_353);
		
		textField_354 = new JTextField();
		textField_354.setColumns(10);
		textField_354.setBounds(595, 348, 20, 20);
		panel_4.add(textField_354);
		
		textField_355 = new JTextField();
		textField_355.setColumns(10);
		textField_355.setBounds(620, 348, 20, 20);
		panel_4.add(textField_355);
		
		textField_356 = new JTextField();
		textField_356.setColumns(10);
		textField_356.setBounds(645, 348, 20, 20);
		panel_4.add(textField_356);
		
		textField_357 = new JTextField();
		textField_357.setColumns(10);
		textField_357.setBounds(670, 348, 20, 20);
		panel_4.add(textField_357);
		
		textField_358 = new JTextField();
		textField_358.setColumns(10);
		textField_358.setBounds(695, 348, 20, 20);
		panel_4.add(textField_358);
		
		textField_359 = new JTextField();
		textField_359.setColumns(10);
		textField_359.setBounds(720, 348, 20, 20);
		panel_4.add(textField_359);
		
		textField_360 = new JTextField();
		textField_360.setColumns(10);
		textField_360.setBounds(745, 348, 20, 20);
		panel_4.add(textField_360);
		
		textField_361 = new JTextField();
		textField_361.setColumns(10);
		textField_361.setBounds(20, 373, 20, 20);
		panel_4.add(textField_361);
		
		textField_362 = new JTextField();
		textField_362.setColumns(10);
		textField_362.setBounds(45, 373, 20, 20);
		panel_4.add(textField_362);
		
		textField_363 = new JTextField();
		textField_363.setColumns(10);
		textField_363.setBounds(70, 373, 20, 20);
		panel_4.add(textField_363);
		
		textField_364 = new JTextField();
		textField_364.setColumns(10);
		textField_364.setBounds(95, 373, 20, 20);
		panel_4.add(textField_364);
		
		textField_365 = new JTextField();
		textField_365.setColumns(10);
		textField_365.setBounds(120, 373, 20, 20);
		panel_4.add(textField_365);
		
		textField_366 = new JTextField();
		textField_366.setColumns(10);
		textField_366.setBounds(145, 373, 20, 20);
		panel_4.add(textField_366);
		
		textField_367 = new JTextField();
		textField_367.setColumns(10);
		textField_367.setBounds(170, 373, 20, 20);
		panel_4.add(textField_367);
		
		textField_368 = new JTextField();
		textField_368.setColumns(10);
		textField_368.setBounds(195, 373, 20, 20);
		panel_4.add(textField_368);
		
		textField_369 = new JTextField();
		textField_369.setColumns(10);
		textField_369.setBounds(220, 373, 20, 20);
		panel_4.add(textField_369);
		
		textField_370 = new JTextField();
		textField_370.setColumns(10);
		textField_370.setBounds(245, 373, 20, 20);
		panel_4.add(textField_370);
		
		textField_371 = new JTextField();
		textField_371.setColumns(10);
		textField_371.setBounds(270, 373, 20, 20);
		panel_4.add(textField_371);
		
		textField_372 = new JTextField();
		textField_372.setColumns(10);
		textField_372.setBounds(295, 373, 20, 20);
		panel_4.add(textField_372);
		
		textField_373 = new JTextField();
		textField_373.setColumns(10);
		textField_373.setBounds(320, 373, 20, 20);
		panel_4.add(textField_373);
		
		textField_374 = new JTextField();
		textField_374.setColumns(10);
		textField_374.setBounds(345, 373, 20, 20);
		panel_4.add(textField_374);
		
		textField_375 = new JTextField();
		textField_375.setColumns(10);
		textField_375.setBounds(370, 373, 20, 20);
		panel_4.add(textField_375);
		
		textField_376 = new JTextField();
		textField_376.setColumns(10);
		textField_376.setBounds(395, 373, 20, 20);
		panel_4.add(textField_376);
		
		textField_377 = new JTextField();
		textField_377.setColumns(10);
		textField_377.setBounds(420, 373, 20, 20);
		panel_4.add(textField_377);
		
		textField_378 = new JTextField();
		textField_378.setColumns(10);
		textField_378.setBounds(445, 373, 20, 20);
		panel_4.add(textField_378);
		
		textField_379 = new JTextField();
		textField_379.setColumns(10);
		textField_379.setBounds(470, 373, 20, 20);
		panel_4.add(textField_379);
		
		textField_380 = new JTextField();
		textField_380.setColumns(10);
		textField_380.setBounds(495, 373, 20, 20);
		panel_4.add(textField_380);
		
		textField_381 = new JTextField();
		textField_381.setColumns(10);
		textField_381.setBounds(520, 373, 20, 20);
		panel_4.add(textField_381);
		
		textField_382 = new JTextField();
		textField_382.setColumns(10);
		textField_382.setBounds(545, 373, 20, 20);
		panel_4.add(textField_382);
		
		textField_383 = new JTextField();
		textField_383.setColumns(10);
		textField_383.setBounds(570, 373, 20, 20);
		panel_4.add(textField_383);
		
		textField_384 = new JTextField();
		textField_384.setColumns(10);
		textField_384.setBounds(595, 373, 20, 20);
		panel_4.add(textField_384);
		
		textField_385 = new JTextField();
		textField_385.setColumns(10);
		textField_385.setBounds(620, 373, 20, 20);
		panel_4.add(textField_385);
		
		textField_386 = new JTextField();
		textField_386.setColumns(10);
		textField_386.setBounds(645, 373, 20, 20);
		panel_4.add(textField_386);
		
		textField_387 = new JTextField();
		textField_387.setColumns(10);
		textField_387.setBounds(670, 373, 20, 20);
		panel_4.add(textField_387);
		
		textField_388 = new JTextField();
		textField_388.setColumns(10);
		textField_388.setBounds(695, 373, 20, 20);
		panel_4.add(textField_388);
		
		textField_389 = new JTextField();
		textField_389.setColumns(10);
		textField_389.setBounds(720, 373, 20, 20);
		panel_4.add(textField_389);
		
		textField_390 = new JTextField();
		textField_390.setColumns(10);
		textField_390.setBounds(745, 373, 20, 20);
		panel_4.add(textField_390);
		
		textField_391 = new JTextField();
		textField_391.setColumns(10);
		textField_391.setBounds(20, 398, 20, 20);
		panel_4.add(textField_391);
		
		textField_392 = new JTextField();
		textField_392.setColumns(10);
		textField_392.setBounds(45, 398, 20, 20);
		panel_4.add(textField_392);
		
		textField_393 = new JTextField();
		textField_393.setColumns(10);
		textField_393.setBounds(70, 398, 20, 20);
		panel_4.add(textField_393);
		
		textField_394 = new JTextField();
		textField_394.setColumns(10);
		textField_394.setBounds(95, 398, 20, 20);
		panel_4.add(textField_394);
		
		textField_395 = new JTextField();
		textField_395.setColumns(10);
		textField_395.setBounds(120, 398, 20, 20);
		panel_4.add(textField_395);
		
		textField_396 = new JTextField();
		textField_396.setColumns(10);
		textField_396.setBounds(145, 398, 20, 20);
		panel_4.add(textField_396);
		
		textField_397 = new JTextField();
		textField_397.setColumns(10);
		textField_397.setBounds(170, 398, 20, 20);
		panel_4.add(textField_397);
		
		textField_398 = new JTextField();
		textField_398.setColumns(10);
		textField_398.setBounds(195, 398, 20, 20);
		panel_4.add(textField_398);
		
		textField_399 = new JTextField();
		textField_399.setColumns(10);
		textField_399.setBounds(220, 398, 20, 20);
		panel_4.add(textField_399);
		
		textField_400 = new JTextField();
		textField_400.setColumns(10);
		textField_400.setBounds(245, 398, 20, 20);
		panel_4.add(textField_400);
		
		textField_401 = new JTextField();
		textField_401.setColumns(10);
		textField_401.setBounds(270, 398, 20, 20);
		panel_4.add(textField_401);
		
		textField_402 = new JTextField();
		textField_402.setColumns(10);
		textField_402.setBounds(295, 398, 20, 20);
		panel_4.add(textField_402);
		
		textField_403 = new JTextField();
		textField_403.setColumns(10);
		textField_403.setBounds(320, 398, 20, 20);
		panel_4.add(textField_403);
		
		textField_404 = new JTextField();
		textField_404.setColumns(10);
		textField_404.setBounds(345, 398, 20, 20);
		panel_4.add(textField_404);
		
		textField_405 = new JTextField();
		textField_405.setColumns(10);
		textField_405.setBounds(370, 398, 20, 20);
		panel_4.add(textField_405);
		
		textField_406 = new JTextField();
		textField_406.setColumns(10);
		textField_406.setBounds(395, 398, 20, 20);
		panel_4.add(textField_406);
		
		textField_407 = new JTextField();
		textField_407.setColumns(10);
		textField_407.setBounds(420, 398, 20, 20);
		panel_4.add(textField_407);
		
		textField_408 = new JTextField();
		textField_408.setColumns(10);
		textField_408.setBounds(445, 398, 20, 20);
		panel_4.add(textField_408);
		
		textField_409 = new JTextField();
		textField_409.setColumns(10);
		textField_409.setBounds(470, 398, 20, 20);
		panel_4.add(textField_409);
		
		textField_410 = new JTextField();
		textField_410.setColumns(10);
		textField_410.setBounds(495, 398, 20, 20);
		panel_4.add(textField_410);
		
		textField_411 = new JTextField();
		textField_411.setColumns(10);
		textField_411.setBounds(520, 398, 20, 20);
		panel_4.add(textField_411);
		
		textField_412 = new JTextField();
		textField_412.setColumns(10);
		textField_412.setBounds(545, 398, 20, 20);
		panel_4.add(textField_412);
		
		textField_413 = new JTextField();
		textField_413.setColumns(10);
		textField_413.setBounds(570, 398, 20, 20);
		panel_4.add(textField_413);
		
		textField_414 = new JTextField();
		textField_414.setColumns(10);
		textField_414.setBounds(595, 398, 20, 20);
		panel_4.add(textField_414);
		
		textField_415 = new JTextField();
		textField_415.setColumns(10);
		textField_415.setBounds(620, 398, 20, 20);
		panel_4.add(textField_415);
		
		textField_416 = new JTextField();
		textField_416.setColumns(10);
		textField_416.setBounds(645, 398, 20, 20);
		panel_4.add(textField_416);
		
		textField_417 = new JTextField();
		textField_417.setColumns(10);
		textField_417.setBounds(670, 398, 20, 20);
		panel_4.add(textField_417);
		
		textField_418 = new JTextField();
		textField_418.setColumns(10);
		textField_418.setBounds(695, 398, 20, 20);
		panel_4.add(textField_418);
		
		textField_419 = new JTextField();
		textField_419.setColumns(10);
		textField_419.setBounds(720, 398, 20, 20);
		panel_4.add(textField_419);
		
		textField_420 = new JTextField();
		textField_420.setColumns(10);
		textField_420.setBounds(745, 398, 20, 20);
		panel_4.add(textField_420);
		
		textField_421 = new JTextField();
		textField_421.setColumns(10);
		textField_421.setBounds(20, 423, 20, 20);
		panel_4.add(textField_421);
		
		textField_422 = new JTextField();
		textField_422.setColumns(10);
		textField_422.setBounds(45, 423, 20, 20);
		panel_4.add(textField_422);
		
		textField_423 = new JTextField();
		textField_423.setColumns(10);
		textField_423.setBounds(70, 423, 20, 20);
		panel_4.add(textField_423);
		
		textField_424 = new JTextField();
		textField_424.setColumns(10);
		textField_424.setBounds(95, 423, 20, 20);
		panel_4.add(textField_424);
		
		textField_425 = new JTextField();
		textField_425.setColumns(10);
		textField_425.setBounds(120, 423, 20, 20);
		panel_4.add(textField_425);
		
		textField_426 = new JTextField();
		textField_426.setColumns(10);
		textField_426.setBounds(145, 423, 20, 20);
		panel_4.add(textField_426);
		
		textField_427 = new JTextField();
		textField_427.setColumns(10);
		textField_427.setBounds(170, 423, 20, 20);
		panel_4.add(textField_427);
		
		textField_428 = new JTextField();
		textField_428.setColumns(10);
		textField_428.setBounds(195, 423, 20, 20);
		panel_4.add(textField_428);
		
		textField_429 = new JTextField();
		textField_429.setColumns(10);
		textField_429.setBounds(220, 423, 20, 20);
		panel_4.add(textField_429);
		
		textField_430 = new JTextField();
		textField_430.setColumns(10);
		textField_430.setBounds(245, 423, 20, 20);
		panel_4.add(textField_430);
		
		textField_431 = new JTextField();
		textField_431.setColumns(10);
		textField_431.setBounds(270, 423, 20, 20);
		panel_4.add(textField_431);
		
		textField_432 = new JTextField();
		textField_432.setColumns(10);
		textField_432.setBounds(295, 423, 20, 20);
		panel_4.add(textField_432);
		
		textField_433 = new JTextField();
		textField_433.setColumns(10);
		textField_433.setBounds(320, 423, 20, 20);
		panel_4.add(textField_433);
		
		textField_434 = new JTextField();
		textField_434.setColumns(10);
		textField_434.setBounds(345, 423, 20, 20);
		panel_4.add(textField_434);
		
		textField_435 = new JTextField();
		textField_435.setColumns(10);
		textField_435.setBounds(370, 423, 20, 20);
		panel_4.add(textField_435);
		
		textField_436 = new JTextField();
		textField_436.setColumns(10);
		textField_436.setBounds(395, 423, 20, 20);
		panel_4.add(textField_436);
		
		textField_437 = new JTextField();
		textField_437.setColumns(10);
		textField_437.setBounds(420, 423, 20, 20);
		panel_4.add(textField_437);
		
		textField_438 = new JTextField();
		textField_438.setColumns(10);
		textField_438.setBounds(445, 423, 20, 20);
		panel_4.add(textField_438);
		
		textField_439 = new JTextField();
		textField_439.setColumns(10);
		textField_439.setBounds(470, 423, 20, 20);
		panel_4.add(textField_439);
		
		textField_440 = new JTextField();
		textField_440.setColumns(10);
		textField_440.setBounds(495, 423, 20, 20);
		panel_4.add(textField_440);
		
		textField_441 = new JTextField();
		textField_441.setColumns(10);
		textField_441.setBounds(520, 423, 20, 20);
		panel_4.add(textField_441);
		
		textField_442 = new JTextField();
		textField_442.setColumns(10);
		textField_442.setBounds(545, 423, 20, 20);
		panel_4.add(textField_442);
		
		textField_443 = new JTextField();
		textField_443.setColumns(10);
		textField_443.setBounds(570, 423, 20, 20);
		panel_4.add(textField_443);
		
		textField_444 = new JTextField();
		textField_444.setColumns(10);
		textField_444.setBounds(595, 423, 20, 20);
		panel_4.add(textField_444);
		
		textField_445 = new JTextField();
		textField_445.setColumns(10);
		textField_445.setBounds(620, 423, 20, 20);
		panel_4.add(textField_445);
		
		textField_446 = new JTextField();
		textField_446.setColumns(10);
		textField_446.setBounds(645, 423, 20, 20);
		panel_4.add(textField_446);
		
		textField_447 = new JTextField();
		textField_447.setColumns(10);
		textField_447.setBounds(670, 423, 20, 20);
		panel_4.add(textField_447);
		
		textField_448 = new JTextField();
		textField_448.setColumns(10);
		textField_448.setBounds(695, 423, 20, 20);
		panel_4.add(textField_448);
		
		textField_449 = new JTextField();
		textField_449.setColumns(10);
		textField_449.setBounds(720, 423, 20, 20);
		panel_4.add(textField_449);
		
		textField_450 = new JTextField();
		textField_450.setColumns(10);
		textField_450.setBounds(745, 423, 20, 20);
		panel_4.add(textField_450);
		
		AnimationControl.form = this.frmGraphDraw;
		canvasPanel = new canvas();
		canvasPanel.setBounds(5, 105, 774, 460);
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
		JPanel panel_1 = new JPanel();
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

		final ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
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

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_2.setBounds(483, 5, 195, 95);
		frmGraphDraw.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		final JRadioButton rdbtnDrawOnA = new JRadioButton("Draw on a line");
		rdbtnDrawOnA.setBounds(5, 45, 150, 15);
		panel_2.add(rdbtnDrawOnA);
		rdbtnDrawOnA.setEnabled(false);
		rdbtnDrawOnA.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));

		final JRadioButton rdbtnDrawOnAn = new JRadioButton(
				"Draw on an inner circle");
		rdbtnDrawOnAn.setBounds(5, 25, 150, 15);
		panel_2.add(rdbtnDrawOnAn);
		rdbtnDrawOnAn.setEnabled(false);
		rdbtnDrawOnAn.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));

		JLabel lblNodesNotIn = new JLabel("Nodes not in automorphism group");
		lblNodesNotIn.setBounds(5, 5, 185, 15);
		panel_2.add(lblNodesNotIn);
		lblNodesNotIn.setFont(new Font("Comic Sans MS", Font.BOLD, 11));

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		panel_3.setBounds(683, 5, 96, 95);
		frmGraphDraw.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JButton btnHelp = new JButton("Help");
		btnHelp.setToolTipText("Open the documentation");
		btnHelp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnHelp.setBounds(5, 5, 86, 25);
		panel_3.add(btnHelp);

		JButton btnRedraw = new JButton("Redraw");
		btnRedraw.setToolTipText("Redraws an imported graph");
		btnRedraw.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnRedraw.setBounds(5, 35, 86, 25);
		panel_3.add(btnRedraw);

		final JButton btnEditMode = new JButton("Edit Mode");
		btnEditMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean resultBoolean = (canvasPanel.isVisible()) ? false : true;
				canvasPanel.setVisible(resultBoolean);
				String resultString = (canvasPanel.isVisible()) ? "Edit Mode" : "Back";
				btnEditMode.setText(resultString);
			}
		});
		btnEditMode.setToolTipText("Open the documentation");
		btnEditMode.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnEditMode.setBounds(5, 65, 86, 25);
		panel_3.add(btnEditMode);
		
		
		

		btnRedraw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ac.redraw();

			}
		});

		rdbtnDrawOnAn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rdbtnDrawOnA.setSelected(false);
				rdbtnDrawOnAn.setSelected(true);
				ac.setNonAutOption(0);
				ac.redraw();

			}
		});

		rdbtnDrawOnA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				rdbtnDrawOnA.setSelected(true);
				rdbtnDrawOnAn.setSelected(false);
				ac.setNonAutOption(1);
				ac.redraw();

			}
		});

		for (final JRadioButton a : radioButtons) {
			a.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					for (JRadioButton b : radioButtons)
						b.setSelected(false);
					if (a.equals(rdbtnRandom) || a.equals(rdbtnRandomCircle)) {
						rdbtnDrawOnA.setSelected(false);
						rdbtnDrawOnAn.setSelected(false);
						rdbtnDrawOnA.setEnabled(false);
						rdbtnDrawOnAn.setEnabled(false);
					} else {
						rdbtnDrawOnA.setSelected(false);
						rdbtnDrawOnAn.setSelected(true);
						rdbtnDrawOnA.setEnabled(true);
						rdbtnDrawOnAn.setEnabled(true);
					}

					;
					a.setSelected(true);

					if (a.equals(rdbtnRandom))
						ac.setAutOption(0);
					if (a.equals(rdbtnRandomCircle))
						ac.setAutOption(1);
					if (a.equals(rdbtnSymmetricalCircle1))
						ac.setAutOption(2);
					if (a.equals(rdbtnSymmetricalCircle2))
						ac.setAutOption(3);
					if (a.equals(rdbtnSymmetricalMultiple1))
						ac.setAutOption(4);
					if (a.equals(rdbtnSymmetricalMultiple2))
						ac.setAutOption(5);
					ac.redraw();
				}
			});
		}

		btnImport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(null);
				if (returnVal == JFileChooser.APPROVE_OPTION)
					ac.processImport(fc.getSelectedFile());
			}
		});

		btnExport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ac.processExport();
			}
		});
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
}
