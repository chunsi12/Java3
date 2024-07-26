package day0401.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickHandler implements ActionListener{
//컴포넌트에 클릭이벤트가 발생하면 자동 호출
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌렸습니다.");
		
	}
	
}


public class ClickEventEx {

	public static void main(String[] args) {
		Frame f = new Frame("클릭이벤트");
		Button b = new Button("click button");
		
		b.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("버튼 클릭2");
						//익명 inner 클래스 선언 & 객체 생성
					}
				});
		
		f.add(b);
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);

	}

}

