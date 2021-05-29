import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("v")
	@Export("state")
	byte state;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1898711
	)
	@Export("id")
	public int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1229494071
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -822093809
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1567060795
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 176369301
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lnd;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "184180839"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1399016532"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1177781475"
	)
	void method5092(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	void method5102(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
