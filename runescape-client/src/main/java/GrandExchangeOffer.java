import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("i")
	@Export("state")
	byte state;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 174142221
	)
	@Export("id")
	public int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2013850227
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1123785695
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1874435099
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 185412579
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lop;Z)V",
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "857978313"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1294725733"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-39336237"
	)
	void method5454(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-33"
	)
	void method5455(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "0"
	)
	public static boolean method5473(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class316.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}
}
