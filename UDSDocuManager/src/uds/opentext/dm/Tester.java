package uds.opentext.dm;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import com.opentext.livelink.service.docman.Node;

public class Tester {

	public static void main(String[] args) {
		
		/*//List<Node> children=OTUtility.excludedNodes(85457);
		//System.out.println("Excluded Node: "+children.size());
		String authToken=OTUtility.getAuthToken("otadmin@otds.admin", "SEC@crmp!2017");
		Map<String,String> retVal=OTUtility.getNode(authToken, 85457);
		//System.out.println(parent.getID());
		System.out.println(retVal.get("RequestNumber"));*/
		
		System.out.println(System.getProperty("java.io.tmpdir"));
}
}