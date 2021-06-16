import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("f")
	@Export("state")
	byte state;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1583312423
	)
	@Export("id")
	public int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1337068893
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 85465659
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -631103109
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1719757481
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lnt;Z)V",
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-59"
	)
	void method5224(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1688062511"
	)
	void method5229(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}
}
