import javax.persistence.*;

@Entity
@Table(name="Gift")
public class Gift {
	@Id
	@GeneratedValue
	@Column(name="GiftId",length=5)
	int giftId;
	@Column(name="GiftName",length=15)
	String giftName;
	@Column(name="Category",length=12)
	String category;
	@Column(name="Price",length=10)
	float price;
	

	public int getGiftId() {
		return giftId;
	}

	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Gift() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gift(int giftId, String giftName, String category, float price) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Gift [giftId=" + giftId + ", giftName=" + giftName + ", category=" + category + ", price=" + price
				+ "]";
	}

}
