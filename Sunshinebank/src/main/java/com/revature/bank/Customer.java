package com.revature.bank;

public class Customer {

	private long cid;
	private String cfname;
	private String clname;
	private String caddress;
	private String ccity;
	private String cstate;
	private int czip;
	private String cphone;
	private String cssn;
	private String cemail;
	private String cusername;
	private String cpassword;

	public Customer() {
		super();
	}

	public Customer(long cid, String cfname, String clname, String caddress, String ccity, String cstate, int czip,
			String cphone, String cssn, String cemail, String cusername, String cpassword) {
		super();
		this.cid = cid;
		this.cfname = cfname;
		this.clname = clname;
		this.caddress = caddress;
		this.ccity = ccity;
		this.cstate = cstate;
		this.czip = czip;
		this.cphone = cphone;
		this.cssn = cssn;
		this.cemail = cemail;
		this.cusername = cusername;
		this.cpassword = cpassword;
	}

	/**
	 * @return the cid //
	 */
	public long getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getCfname() {
		return cfname;
	}

	/**
	 * @param cfname the cfname to set
	 */
	public void setCfname(String cfname) {
		this.cfname = cfname;
	}

	/**
	 * @return the clname
	 */
	public String getClname() {
		return clname;
	}

	/**
	 * @param clname the clname to set
	 */
	public void setClname(String clname) {
		this.clname = clname;
	}

	/**
	 * @return the caddress
	 */
	public String getCaddress() {
		return caddress;
	}

	/**
	 * @param caddress the caddress to set
	 */
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	/**
	 * @return the ccity
	 */
	public String getCcity() {
		return ccity;
	}

	/**
	 * @param ccity the ccity to set
	 */
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	/**
	 * @return the cstate
	 */
	public String getCstate() {
		return cstate;
	}

	/**
	 * @param cstate the cstate to set
	 */
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}

	/**
	 * @return the czip
	 */
	public int getCzip() {
		return czip;
	}

	/**
	 * @param czip the czip to set
	 */
	public void setCzip(int czip) {
		this.czip = czip;
	}

	/**
	 * @return the cphone
	 */
	public String getCphone() {
		return cphone;
	}

	/**
	 * @param cphone the cphone to set
	 */
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	/**
	 * @return the cssn
	 */
	public String getCssn() {
		return cssn;
	}

	/**
	 * @param cssn the cssn to set
	 */
	public void setCssn(String cssn) {
		this.cssn = cssn;
	}

	/**
	 * @return the cemail
	 */
	public String getCemail() {
		return cemail;
	}

	/**
	 * @param cemail the cemail to set
	 */
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	/**
	 * @return the cusername
	 */
	public String getCusername() {
		return cusername;
	}

	/**
	 * @param cusername the cusername to set
	 */
	public void setCusername(String cusername) {
		this.cusername = cusername;
	}

	/**
	 * @return the cpassword
	 */
	public String getCpassword() {
		return cpassword;
	}

	/**
	 * @param cpassword the cpassword to set
	 */
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	@Override
	public String toString() {
		return "Customer [cfname=" + cfname + ", clname=" + clname + ", caddress=" + caddress + ", ccity=" + ccity
				+ ", cstate=" + cstate + ", czip=" + czip + ", cphone=" + cphone + ", cssn=" + cssn + ", cemail="
				+ cemail + ", cusername=" + cusername + ", cpassword=" + cpassword + "]";
	}

//	public static void makeCust() {
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("************************");
//		System.out.println("Enter  first name");
//		String fName = scan.nextLine();
//		System.out.println("Enter last name");
//		String lName = scan.nextLine();
//		System.out.println("Enter  address");
//		String address = scan.nextLine();
//		System.out.println("Enter city");
//		String city = scan.nextLine();
//		System.out.println("Enter state");
//		String state = scan.nextLine();
//		System.out.println("Enter zip");
//		int zip = scan.nextInt();
//		System.out.println("Enter  phone");
//		int phone = scan.nextInt();
//		System.out.println("Enter social security number- (no dashes)");
//		int ssn = scan.nextInt();
//		// if(ssn!=9)
//		System.out.println("Enter email");
//		String email = scan.next();
//
//		makeUsername();
//		// User.getUsername();
//
//		Account.createAccountNum(username);
//		Account.getAccountNum();
//
//		Customer cust = new Customer(fName, lName, address, city, state, zip, phone, ssn, email);
//
//		Map<String, String> hm = new HashMap<String, String>();
//		Map<String, Integer> hm2 = new HashMap<String, Integer>();
//		hm.put(username, fName);
//		hm.put(username, lName);
//		hm.put(username, address);
//		hm.put(username, city);
//		hm.put(username, state);
//		hm2.put(username, zip);
//		hm2.put(username, phone);
//		hm2.put(username, ssn);
//		hm.put(username, email);
//		hm2.put(username, Account.accountNum);
//
//		System.out.println("Would you like to add another person to the account? y/n");
//		String ans = scan.nextLine();
//		if (ans == "y") {
//			System.out.println("************************");
//			System.out.println("Enter  first name");
//			String fName1 = scan.nextLine();
//			System.out.println("Enter last name");
//			String lName1 = scan.nextLine();
//			System.out.println("Enter  address");
//			String address1 = scan.nextLine();
//			System.out.println("Enter city");
//			String city1 = scan.nextLine();
//			System.out.println("Enter state");
//			String state1 = scan.nextLine();
//			System.out.println("Enter zip");
//			int zip1 = scan.nextInt();
//			System.out.println("Enter  phone");
//			int phone1 = scan.nextInt();
//			System.out.println("Enter social security number- (no dashes)");
//			int ssn1 = scan.nextInt();
//			System.out.println("Enter email");
//			String email1 = scan.nextLine();
//
//			System.out.println("Enter username");
//			String username1 = scan.nextLine();
//			System.out.println("Enter password");
//			String password1 = scan.nextLine();
//			System.out.println("************************");
//
//			HashMap hm1 = new HashMap();
//			hm1.put(username1, password1);
//			hm1.put(username1, fName1);
//			hm1.put(username1, lName1);
//			hm1.put(username1, address1);
//			hm1.put(username1, city1);
//			hm1.put(username1, state1);
//			hm1.put(username1, zip1);
//			hm1.put(username1, phone1);
//			hm1.put(username1, ssn1);
//			hm1.put(username1, email1);
//			hm1.put(username1, Account.accountNum);
//
//			HashMap joint = new HashMap();
//			joint.put(username, username1);
//
//		} else if (ans == "n") {
//			Menu.custSignIn();
//		} else {
//			System.out.println("Return to main menu");
//			Menu.mainMenu();
//		}
//	}

}

/*
 * customers should be able to apply for joint or indv account register with
 * username and password be able to withdraw, deposit, transfer and get balance
 */
