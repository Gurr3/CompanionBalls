
import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.Iterator;


import se.nicklasgavelin.sphero.Robot;


public class Main {
	
	
	public static void main(String[] args) {
		//Example_Site_API example = new Example_Site_API();
		// new Thread( new Example_Site_API() ).start();
		//	DirectionalKeysPanel DKP = null;// = new DirectionalKeysPanel();if( ct != null )
		//ct.stopThread();
		// Create a new thread
		//		ConnectThread ct = new ConnectThread();
		//		ct.start();
		//		while(ct.getRobotArray().size()==0){}
		
		
		//backgroundvariables, do not touch
		//server sends commands - clients recieves and does them
		int server = 0;
		int client = 1;
		WebsocketClient	wc;
		WebsocketServer ws;
		
	
		
		
		
		
		
		
		
		
		//CONFIGS
		int ApplicationType = client;
		int port = 8080;
		String socketname = "130.240.95.209" ;
		
		
		

		if (ApplicationType==server)
			try 
			{
				ws = new WebsocketServer(port);
				ws.start();
				GurrUI gurrui = new GurrUI(new ConnectThread(), ws);
				gurrui.fixGUI();
			} catch (IOException e) {e.printStackTrace();}

		else if (ApplicationType==client){
			wc = new WebsocketClient(port, socketname);
		GurrUI gurrui = new GurrUI(new ConnectThread());
		gurrui.fixGUI();
		}
		else {
			System.out.println("Warning: Single Player only");
		//SpheroGUI commander = new SpheroGUI();
		
		GurrUI gurrui = new GurrUI(new ConnectThread());
		gurrui.fixGUI();
		}
		
	}

}

