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

public class Window {

	private JFrame frame;
	private AnimationControl ac;
	private canvas canvasPanel;

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
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setFont(
				new Font("Comic Sans MS", Font.PLAIN, 11));
		frame.setAutoRequestFocus(false);
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		AnimationControl.form = this.frame;
		canvasPanel = new canvas();
		canvasPanel.setBounds(5, 105, 774, 460);
		frame.getContentPane().add(canvasPanel);
		ac = new DrawController(canvasPanel, null);
		setupAC(ac);
		ac.startAnimation();

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null,
				null));
		panel.setBounds(5, 5, 96, 95);
		frame.getContentPane().add(panel);
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
		frame.getContentPane().add(panel_1);
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
		frame.getContentPane().add(panel_2);
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
		frame.getContentPane().add(panel_3);
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

		JButton btnEditMode = new JButton("Edit Mode");
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
