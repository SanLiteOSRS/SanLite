import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("aj")
	@Export("state")
	byte state;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1677994713
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -445284831
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1293101251
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -315326791
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 566393859
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lsy;Z)V",
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "70"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1952832227"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-354706724"
	)
	void method6579(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1603678725"
	)
	void method6587(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("al")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 34
			if (var0 % 37L == 0L) { // L: 35
				return null;
			} else {
				int var2 = 0; // L: 36

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 37 38 40
					++var2; // L: 39
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) { // L: 42 43 52
					long var6 = var0; // L: 44
					var0 /= 37L; // L: 45
					var8 = class369.base37Table[(int)(var6 - var0 * 37L)]; // L: 46
					if (var8 == '_') { // L: 47
						int var9 = var5.length() - 1; // L: 48
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 49
						var8 = 160; // L: 50
					}
				}

				var5.reverse(); // L: 54
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 55
				return var5.toString(); // L: 56
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I[B[BB)V",
		garbageValue = "-86"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3575 == null) { // L: 1176
			if (var2 == null) { // L: 1177
				return; // L: 1183
			}

			var0.field3575 = new byte[11][]; // L: 1178
			var0.field3601 = new byte[11][]; // L: 1179
			var0.field3583 = new int[11]; // L: 1180
			var0.field3603 = new int[11]; // L: 1181
		}

		var0.field3575[var1] = var2; // L: 1185
		if (var2 != null) {
			var0.field3599 = true; // L: 1186
		} else {
			var0.field3599 = false; // L: 1188

			for (int var4 = 0; var4 < var0.field3575.length; ++var4) { // L: 1189
				if (var0.field3575[var4] != null) { // L: 1190
					var0.field3599 = true; // L: 1191
					break;
				}
			}
		}

		var0.field3601[var1] = var3; // L: 1196
	} // L: 1197
}
