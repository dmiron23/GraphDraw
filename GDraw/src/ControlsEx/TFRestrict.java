package ControlsEx;

import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import canvas.AnimationControl;

@SuppressWarnings("serial")
public class TFRestrict extends TextField implements TextListener, ActionListener {

	private AnimationControl ac;

	public TFRestrict(AnimationControl _ac) throws HeadlessException {
		addTextListener(this);
		addActionListener(this);
		ac = _ac;
	}

	public void setAnimationControl(AnimationControl _ac) {
		setText("");
		ac = _ac;
	}

	@Override
	public void textValueChanged(TextEvent arg0) {
		ac.checkInput(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ac.processB1(getText());
		setText("");
	}

}
