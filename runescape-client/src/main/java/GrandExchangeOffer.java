import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ai")
	@Export("state")
	byte state;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1439667963
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -266727245
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1407437511
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1137147847
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1831328919
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Ltl;Z)V",
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-594928977"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "9"
	)
	void method6959(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2011078079"
	)
	void method6958(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-817462913"
	)
	static int method6969(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 85
			boolean var3 = false; // L: 86
			boolean var4 = false; // L: 87
			int var5 = 0; // L: 88
			int var6 = var0.length(); // L: 89

			for (int var7 = 0; var7 < var6; ++var7) { // L: 90
				char var8 = var0.charAt(var7); // L: 91
				if (var7 == 0) { // L: 92
					if (var8 == '-') { // L: 93
						var3 = true; // L: 94
						continue;
					}

					if (var8 == '+') { // L: 97
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 99
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 100
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 101
						throw new NumberFormatException(); // L: 102
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 103
					throw new NumberFormatException();
				}

				if (var3) { // L: 104
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 105
				if (var9 / var1 != var5) { // L: 106
					throw new NumberFormatException();
				}

				var5 = var9; // L: 107
				var4 = true; // L: 108
			}

			if (!var4) { // L: 110
				throw new NumberFormatException();
			} else {
				return var5; // L: 111
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhu;",
		garbageValue = "-2016857885"
	)
	static HorizontalAlignment[] method6970() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1996, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1997}; // L: 14
	}
}
