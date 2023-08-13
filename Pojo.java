
public class Pojo {

	public int addno,pin;
	public String nm,em,add,state,mob,mob2;
	public Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	public Pojo(int addno, String nm, String em, String mob, String mob2, String add, int pin, String state) {
		super();
		this.addno=addno;
		this.nm=nm;
		this.em=em;
		this.mob=mob;
		this.mob2=mob2;
		this.add=add;
		this.pin=pin;
		this.state=state;
		
	}

	 
	

	public int getAddno() {
		return addno;
	}

	public void setAddno(int addno) {
		this.addno = addno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getMob2() {
		return mob2;
	}

	public void setMob2(String mob2) {
		this.mob2 = mob2;
	}

	@Override
	public String toString() {
		return "Pojo [addno=" + addno + ", mob=" + mob + ", mob2=" + mob2 + ", pin=" + pin + ", nm=" + nm + ", em=" + em
				+ ", add=" + add + ", state=" + state + "]";
	}
	 
	
	
	
}
