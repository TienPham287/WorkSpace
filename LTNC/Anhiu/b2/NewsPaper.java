package b2;

public class NewsPaper extends Document {
private int dayInssue;

public NewsPaper(String id, String nxb, int number, int dayInssue) {
	super(id, nxb, number);
	this.dayInssue = dayInssue;
}

public int getDayInssue() {
	return dayInssue;
}

public void setDayInssue(int dayInssue) {
	this.dayInssue = dayInssue;
}

@Override
public String toString() {
	return "NewsPaper [dayInssue=" + dayInssue + ", id=" + id + ", nxb=" + nxb + ", number=" + number + "]";
}

}
