import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("az")
	@Export("state")
	byte state;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 609682793
	)
	@Export("id")
	public int id;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -878733949
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1914500173
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1887019745
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1745814511
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lur;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-51"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1258202259"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "612953000"
	)
	void method7146(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1305511406"
	)
	void method7133(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Llk;",
		garbageValue = "63"
	)
	public static class311[] method7148() {
		return new class311[]{class311.field3308, class311.field3302, class311.field3306, class311.field3305, class311.field3314, class311.field3307, class311.field3304, class311.field3309, class311.field3310, class311.field3311, class311.field3312}; // L: 18
	}
}
