import java.awt.*;
import java.awt.event.*;

class Layout extends Frame implements ActionListener{
	Button a;
	Label b;
	TextField c;

	Layout(){	/** �R���X�g���N�^ **/;
		setSize(400,300);
		setTitle("�t���[���C�A�E�g");
		this.setBackground(Color.green);

		a = new Button("�{�^��");	// �C���X�^���X��
		b = new Label("�����ɕ\��",Label.CENTER);
		b.setBackground(new Color(255,255,0));
		c = new TextField();

		setLayout(null);	// �ǂ��ł��z�u�ł��郌�C�A�E�g�Ɏw��

		a.setBounds(50,120,300,40);	// (x,y,w,h);
		c.setBounds(50,60,300,40);
		b.setBounds(50,180,300,40);

		add(a);
		add(c);
		add(b);

		a.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == a){
			String moji = c.getText();
			b.setText(moji);
		}
	}

	public static void main(String args[]){
		Layout obj = new Layout();
		obj.setVisible(true);
	}
}