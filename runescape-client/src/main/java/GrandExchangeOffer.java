import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("aq")
	@Export("state")
	byte state;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1633311873
	)
	@Export("id")
	public int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1320002079
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2024945127
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1034512637
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1962510955
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Luq;Z)V",
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1084428693"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1333755756"
	)
	void method7298(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1518975134"
	)
	void method7299(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65
}
