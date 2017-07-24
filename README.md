---------------------
# BookingApplication
---------------------

# * To setup the site on local web server:
------------------------------------------
1. Install Tomcat Server.
2. Start the server by executing the following command
	%tomcat_home%/bin/startup.bat
3. Open Tomcat manager (usually http://localhost:8080).
4. Press "Manager App" button.
5. In "War File to Deploy" section, select the application war file and press deploy.
6. Open browser and open the application URL (http://localhost:8080/BookingApplication).

# * Assumptions:
----------------
1. It is requirment to view all offer's information.

# * Known Issues:
-----------------
1. The application needs to implement exception handling.
2. The application needs to implement data validator on the filtering input boxes.
3. The UI design is basic and shall be enhanced.
