package tuio;

import TUIO.*;

import java.util.*;

import mygeom.Point2;
import widget.*;

public class MTedt implements TuioListener {

	TuioClient client=null;
	MTSurface surface; // la surface qui recevra les messages des curseurs.
	
	private void initConnexion() {
		int port=3333;
		client=new TuioClient(port);
		client.connect();
		if (!client.isConnected()) {
			System.exit(1);
		}
		System.out.println("connexion");		
	}
	
	public MTedt() {
		initConnexion();
		client.addTuioListener(this);
	}
	
	public MTedt(MTSurface s) {
		initConnexion();
		surface=s;
		client.addTuioListener(this);
	}
	
	public void stop() {
		client.disconnect();
		System.out.println("deconnexion");
	}
	
		
	/** Listeners **/
	
	public void addTuioObject(TuioObject tobj) {
	}

	public void updateTuioObject(TuioObject tobj) {
	}
	
	public void removeTuioObject(TuioObject tobj) {
	}

	/*
	 * (non-Javadoc)
	 * @see TUIO.TuioListener#addTuioCursor(TUIO.TuioCursor)
	 * L ID correspond à l'ID du curseur (il peut y en avoir plusieur via CTRL dans le simulateur)
	 * La position correspond  la position depuis le coin en haut a gauche
	 */
	public void addTuioCursor(TuioCursor tcur) {
		surface.addCursor(tcur.getCursorID(), new Point2(tcur.getX(),tcur.getY()));
	}

	public void updateTuioCursor(TuioCursor tcur) {
		surface.updateCursor(tcur.getCursorID(), new Point2(tcur.getX(),tcur.getY()));
	}
	
	public void removeTuioCursor(TuioCursor tcur) {
		surface.removeCursor(tcur.getCursorID(), new Point2(tcur.getX(),tcur.getY()));
	}

	
	public void refresh(TuioTime frameTime) {
	}

}
