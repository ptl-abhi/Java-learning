package checkboxdemo;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener {
	Label l;
	Checkbox c1, c2, c3;
CheckboxGroup cbg;
	public MyFrame() {
		super("checkbox demo");
		cbg=new CheckboxGroup();
		l = new Label(" Nothing is selected");
		c1 = new Checkbox("Java",false,cbg);
		c2 = new Checkbox("Python",false,cbg);
		c3 = new Checkbox("C#",false,cbg);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}

	public void itemStateChanged(ItemEvent e) {
		String str = "";
		if (c1.getState())
			str = str + " " + c1.getLabel();
		if (c2.getState())
			str = str + " " + c2.getLabel();
		if (c3.getState())
			str = str + " " + c3.getLabel();
		if(str.isEmpty())
			str="Nothing is selected";
		l.setText(str);

	}
}

public class CheckboxDemo {
	public static void main(String[] args) {
		MyFrame fm = new MyFrame();
		fm.setSize(300, 300);
		fm.setVisible(true);
	}
}
