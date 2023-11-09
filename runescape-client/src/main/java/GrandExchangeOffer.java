import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("h")
	@Export("state")
	byte state;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -512398981
	)
	@Export("id")
	public int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1186373323
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -717642563
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1074991029
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1552101637
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lqy;Z)V",
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1498486537"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-125"
	)
	void method6634(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "312309253"
	)
	void method6626(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
