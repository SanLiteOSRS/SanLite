import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("s")
	@Export("state")
	byte state;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1422086043
	)
	@Export("id")
	public int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1524422837
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 591860693
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -884581949
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 277958717
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lqr;Z)V",
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "74"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1669964028"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1204353088"
	)
	void method5936(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "126"
	)
	void method5943(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
