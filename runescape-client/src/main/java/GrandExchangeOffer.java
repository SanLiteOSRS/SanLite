import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("au")
	@Export("state")
	byte state;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1950661591
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1417966657
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 602808251
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -662672265
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1815027607
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Ltm;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-247945963"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-847011160"
	)
	void method6870(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-48"
	)
	void method6877(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "11520"
	)
	static void method6886(int var0) {
		class449.field4730 = var0; // L: 22
		class449.field4731 = new class449[var0]; // L: 23
		class338.field3816 = 0; // L: 24
	} // L: 25
}
