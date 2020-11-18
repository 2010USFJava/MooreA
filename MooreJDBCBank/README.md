Java Console Banking App with JDBC and PSQL

Business Requirements:
•	A registered user can login with their username and password
•	An unregistered user can register by creating a username and password 
•	An Admin can view, create, update, and delete all users.
•	A user can view their own existing accounts and balances. 
•	A user can create an account.
•	A user can delete an account if it is empty.  
•	A user can add to or withdraw from an account. 
•	A user can execute multiple deposits or withdrawals in a session. 
•	A user can logout.`

Required components: 
•	Use Serial data types to generate USER_ID and BANK_ACCOUNT_ID.  
•	Throw custom exceptions in the event of user error (overdraft, incorrect password, etc). 
•	Provide validation messages through the console for all user actions. 
•	Use the DAO design pattern.  
•	Store Admin username/password and database connection information in a properties file.
•	PL/SQL with at least one user defined function
•	JDBC with statements and prepared statements
•	Scanner for user input
•	JUnit tests on all user defined Java methods
•	Transactions will be logged to a file with Log4J. 

Required Technologies:
			   Maven
			   PostgreSQL
			   AWS RDS
			   JUnit
			   Log4J
			   Git and GitHub
			   Markdown file
