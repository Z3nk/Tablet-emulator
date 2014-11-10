package mygeom;

import java.nio.file.Path;
import java.util.HashMap;


public class BlobQueue {
        HashMap<Integer,Path> cursor;

        public BlobQueue() {
                cursor=new HashMap<Integer,Path>();
        }
        public void addCursor(int idCursor, Point2 P)
        {
        	
        }
        
        
        public void removeCursor(int idCursor)
        {
        	cursor.remove(idCursor);
        }
        
        
        public void updateCursor(int idCursor, Point2 P)
        {
        	
        }
}