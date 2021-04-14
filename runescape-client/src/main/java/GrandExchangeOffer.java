import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("f")
	@Export("state")
	byte state;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -891448629
	)
	@Export("id")
	public int id;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 100433651
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1452615551
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1995124161
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1624140641
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		signature = "(Lnu;Z)V",
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-122"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-20"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "31"
	)
	void method4631(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1176196261"
	)
	void method4632(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "1"
	)
	public static void method4633(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method4633(var0, var1, var2, var5 - 1);
			method4633(var0, var1, var5 + 1, var3);
		}

	}
}
