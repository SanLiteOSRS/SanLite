import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class177 {
	@ObfuscatedName("vp")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("am")
	public String field1861;
	@ObfuscatedName("as")
	public float[] field1858;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1652340875
	)
	public int field1859;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 654278663
	)
	public int field1860;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1887474799
	)
	public int field1855;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	class177(class170 var1) {
		this.this$0 = var1;
		this.field1858 = new float[4]; // L: 340
		this.field1859 = 1; // L: 341
		this.field1860 = 1; // L: 342
		this.field1855 = 0; // L: 343
	} // L: 345

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "-1653760330"
	)
	public static HitSplatDefinition method3541(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lij;I)V",
		garbageValue = "632004581"
	)
	static final void method3543(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var3 + var12] &= -16777217;
				}
			}
		}

		Buffer var29 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var17 = var13 & 7; // L: 122
						int var18 = var14 & 7; // L: 123
						int var19 = var7 & 3; // L: 126
						int var16;
						if (var19 == 0) { // L: 127
							var16 = var17; // L: 128
						} else if (var19 == 1) { // L: 131
							var16 = var18; // L: 132
						} else if (var19 == 2) { // L: 135
							var16 = 7 - var17; // L: 136
						} else {
							var16 = 7 - var18; // L: 139
						}

						int var20 = var16 + var2; // L: 141
						int var23 = var13 & 7; // L: 144
						int var24 = var14 & 7; // L: 145
						int var25 = var7 & 3; // L: 148
						int var22;
						if (var25 == 0) { // L: 149
							var22 = var24; // L: 150
						} else if (var25 == 1) { // L: 153
							var22 = 7 - var23; // L: 154
						} else if (var25 == 2) { // L: 157
							var22 = 7 - var24; // L: 158
						} else {
							var22 = var23; // L: 161
						}

						int var26 = var3 + var22; // L: 163
						int var27 = (var13 & 7) + var8 + var2; // L: 164
						int var28 = var3 + (var14 & 7) + var9; // L: 165
						ScriptEvent.loadTerrain(var29, var1, var20, var26, var27, var28, var7); // L: 166
					} else {
						ScriptEvent.loadTerrain(var29, 0, -1, -1, 0, 0, 0); // L: 168
					}
				}
			}
		}

	} // L: 172

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-814141730"
	)
	static final String method3542(int var0) {
		if (var0 < 100000) { // L: 454
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 455 456
		}
	}
}
