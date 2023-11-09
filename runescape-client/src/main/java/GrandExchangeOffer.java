import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("at")
	@Export("state")
	byte state;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1426703425
	)
	@Export("id")
	public int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -433042635
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1612225517
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -813658531
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -946900241
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Ltz;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "48362830"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1289606404"
	)
	void method6845(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-882012274"
	)
	void method6855(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
