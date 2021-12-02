package room;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class RoomClass {

	private int number,floor,capacity;
	private String type;
	private Date booktime;
	private double price;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getBooktime() {
		return booktime;
	}
	public void setBooktime(Date booktime) {
		this.booktime = booktime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public RoomClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoomClass(int number, int floor,  String type, int capacity,Date booktime, double price) {
		super();
		this.number = number;
		this.floor = floor;
		this.capacity = capacity;
		this.type = type;
		this.booktime = booktime;
		this.price = price;
	}
	@Override
	public String toString() {
		SimpleDateFormat formet=new SimpleDateFormat("dd-MM-yyyy");
		formet.format(booktime);
		return "number:" + number +
				"\nfloor:" + floor +
				"\ncapacity:" + capacity +
				"\ntype=" + type+
				"\nbooktime=" + booktime +
				"\nprice=" + price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(booktime, capacity, floor, number, price, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomClass other = (RoomClass) obj;
		return Objects.equals(booktime, other.booktime) && capacity == other.capacity && floor == other.floor
				&& number == other.number && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(type, other.type);
	}

	}


