package familyTest;

public class Family {
	private Person[] members;
	
	public Family(int size) {
		members = new Person[size];
	}
	
	public int size() {
		int count = 0;
		for (Person p : members) {
			if (p != null) count++;
		}
		return count;
	}
	
	public void add(Person p) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = p;
				break;
			}
		}
	}
	
	public Person getTallest() {
		Person tallest = null;
		for (Person p : members) {
			if (p != null && tallest.getHeight() < p.getHeight()) {
				tallest = p;
			}
		}
		return tallest;
	}
	
	public boolean isMember(Person p) {
		boolean isMember = false;
		for (int i = 0; i < members.length & !isMember; i++) {
			if (members[i] != null && members[i].equals(p)) {
				isMember = true;
			}
		}
		return isMember;
	}
}
