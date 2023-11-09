import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public class class452 extends class455 {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -925977301
	)
	int field4791;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -970289067
	)
	int field4786;
	@ObfuscatedName("aw")
	double field4790;
	@ObfuscatedName("ac")
	double field4788;
	@ObfuscatedName("au")
	double field4789;
	@ObfuscatedName("ab")
	double field4792;
	@ObfuscatedName("aq")
	double field4785;

	public class452(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10); // L: 13
		this.field4791 = 0; // L: 4
		this.field4786 = 0; // L: 5
		this.field4790 = 0.0D; // L: 6
		this.field4788 = 0.0D; // L: 7
		this.field4789 = 0.0D; // L: 8
		this.field4792 = 0.0D; // L: 9
		this.field4785 = 0.0D; // L: 10
		this.field4791 = var3; // L: 14
		this.field4786 = var6; // L: 15
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) { // L: 16
			this.field4790 = (double)var4; // L: 17
			this.field4788 = (double)var5; // L: 18
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D; // L: 21
			double var13 = (double)((float)(var8 + var2)) / 2.0D; // L: 22
			double var15 = (double)((float)(var4 + var7)) / 2.0D; // L: 23
			double var17 = (double)((float)(var5 + var8)) / 2.0D; // L: 24
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2); // L: 25
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8); // L: 26
			this.field4790 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21); // L: 27
			this.field4788 = var13 + var19 * (this.field4790 - var11); // L: 28
			this.field4789 = Math.sqrt(Math.pow(this.field4790 - (double)var1, 2.0D) + Math.pow(this.field4788 - (double)var2, 2.0D)); // L: 29
			this.field4792 = Math.atan2((double)var2 - this.field4788, (double)var1 - this.field4790); // L: 30
			double var23 = Math.atan2((double)var8 - this.field4788, (double)var7 - this.field4790); // L: 31
			this.field4785 = Math.atan2((double)var5 - this.field4788, (double)var4 - this.field4790); // L: 32
			boolean var25 = this.field4792 <= var23 && var23 <= this.field4785 || this.field4785 <= var23 && var23 <= this.field4792; // L: 33
			if (!var25) { // L: 34
				this.field4785 += (double)(this.field4792 - this.field4785 > 0.0D ? 2 : -2) * 3.141592653589793D; // L: 35
			}

		}
	} // L: 19 37

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2116561795"
	)
	public int vmethod8438() {
		double var1 = this.method8447(); // L: 40
		double var3 = this.field4792 + var1 * (this.field4785 - this.field4792); // L: 41
		return (int)Math.round(this.field4790 + this.field4789 * Math.cos(var3)); // L: 42
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2107399454"
	)
	public int vmethod8433() {
		double var1 = this.method8447(); // L: 46
		double var3 = (this.field4785 - this.field4792) * var1 + this.field4792; // L: 47
		return (int)Math.round(this.field4788 + this.field4789 * Math.sin(var3)); // L: 48
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int vmethod8434() {
		double var1 = this.method8447(); // L: 52
		return (int)Math.round((double)(this.field4786 - this.field4791) * var1 + (double)this.field4791); // L: 53
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lnm;II)Ltc;",
		garbageValue = "988192085"
	)
	public static IndexedSprite method8415(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1); // L: 174
		boolean var2;
		if (var3 == null) { // L: 175
			var2 = false; // L: 176
		} else {
			class485.SpriteBuffer_decode(var3); // L: 179
			var2 = true; // L: 180
		}

		return !var2 ? null : Strings.method6600(); // L: 182 183
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)Z",
		garbageValue = "-1381305986"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10594
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10595
				int var2 = ArchiveLoader.method2230(var0, var1); // L: 10596
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10597
				if (var0.cs1Comparisons[var1] == 2) { // L: 10598
					if (var2 >= var3) { // L: 10599
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10601
					if (var2 <= var3) { // L: 10602
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10604
					if (var2 == var3) { // L: 10605
						return false;
					}
				} else if (var3 != var2) { // L: 10607
					return false;
				}
			}

			return true; // L: 10609
		}
	}
}
