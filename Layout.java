import java.awt.*;
import java.awt.event.*;

class Layout extends Frame implements ActionListener{
	Button a;
	Label b;
	TextField c;

	Layout(){	/** コンストラクタ **/;
		setSize(400,300);
		setTitle("フリーレイアウト");
		this.setBackground(Color.green);

		a = new Button("ボタン");	// インスタンス化
		b = new Label("ここに表示",Label.CENTER);
		b.setBackground(new Color(255,255,0));
		c = new TextField();

		setLayout(null);	// どこでも配置できるレイアウトに指定

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