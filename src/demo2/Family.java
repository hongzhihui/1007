package demo2;

public class Family {
	 TV homeTV;
	    void buyTV(TV tv) {
	       homeTV=tv;           //������tv��ֵ��homeTV
	    }
	    void remoteControl(int m) {
	       homeTV.setChannel(m);  
	    }
	    void seeTV() {
	       homeTV.showProgram();  //homeTV����showProgram()����
	    }
		//haha
}
