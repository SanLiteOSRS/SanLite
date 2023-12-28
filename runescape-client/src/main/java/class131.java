import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class131 {
	@ObfuscatedName("at")
	boolean field1532;
	@ObfuscatedName("ah")
	boolean field1527;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	class129 field1535;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	class129 field1529;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Leq;"
	)
	class126[] field1530;
	@ObfuscatedName("au")
	boolean field1531;
	@ObfuscatedName("aa")
	float field1538;
	@ObfuscatedName("ac")
	float field1533;
	@ObfuscatedName("al")
	float field1534;
	@ObfuscatedName("az")
	float field1548;
	@ObfuscatedName("ap")
	float field1526;
	@ObfuscatedName("av")
	float field1537;
	@ObfuscatedName("ax")
	float field1546;
	@ObfuscatedName("as")
	float field1539;
	@ObfuscatedName("ay")
	float field1540;
	@ObfuscatedName("ak")
	float field1528;
	@ObfuscatedName("aj")
	boolean field1542;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -904675683
	)
	int field1543;
	@ObfuscatedName("aq")
	float[] field1544;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1984793267
	)
	int field1545;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1896311
	)
	int field1541;
	@ObfuscatedName("ae")
	float field1547;
	@ObfuscatedName("an")
	float field1536;

	class131() {
		this.field1542 = true; // L: 24
		this.field1543 = 0; // L: 25
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)I",
		garbageValue = "-979400309"
	)
	int method3128(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 35
		class311.method5939(var1.readUnsignedByte()); // L: 36
		this.field1535 = class72.method2135(var1.readUnsignedByte()); // L: 37
		this.field1529 = class72.method2135(var1.readUnsignedByte()); // L: 38
		this.field1532 = var1.readUnsignedByte() != 0; // L: 39
		this.field1530 = new class126[var3]; // L: 40
		class126 var4 = null; // L: 41

		for (int var5 = 0; var5 < var3; ++var5) { // L: 42
			class126 var6 = new class126(); // L: 43
			var6.method3023(var1, var2); // L: 44
			this.field1530[var5] = var6; // L: 45
			if (var4 != null) { // L: 46
				var4.field1479 = var6; // L: 47
			}

			var4 = var6; // L: 49
		}

		return var3; // L: 51
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2128707334"
	)
	void method3117() {
		this.field1545 = this.field1530[0].field1477; // L: 55
		this.field1541 = this.field1530[this.method3106() - 1].field1477; // L: 56
		this.field1544 = new float[this.method3103() + 1]; // L: 58

		for (int var1 = this.method3116(); var1 <= this.method3109(); ++var1) { // L: 59
			this.field1544[var1 - this.method3116()] = class404.method7512(this, (float)var1); // L: 60
		}

		this.field1530 = null; // L: 62
		this.field1547 = class404.method7512(this, (float)(this.method3116() - 1)); // L: 64
		this.field1536 = class404.method7512(this, (float)(this.method3109() + 1)); // L: 65
	} // L: 66

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1688546039"
	)
	public float method3100(int var1) {
		if (var1 < this.method3116()) { // L: 70
			return this.field1547; // L: 71
		} else {
			return var1 > this.method3109() ? this.field1536 : this.field1544[var1 - this.method3116()]; // L: 73 74 76
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "124775939"
	)
	int method3116() {
		return this.field1545; // L: 81
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "17"
	)
	int method3109() {
		return this.field1541; // L: 85
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "71"
	)
	int method3103() {
		return this.method3109() - this.method3116(); // L: 89
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "2092037965"
	)
	int method3098(float var1) {
		if (this.field1543 < 0 || (float)this.field1530[this.field1543].field1477 > var1 || this.field1530[this.field1543].field1479 != null && (float)this.field1530[this.field1543].field1479.field1477 <= var1) { // L: 93
			if (var1 >= (float)this.method3116() && var1 <= (float)this.method3109()) { // L: 96
				int var2 = this.method3106(); // L: 99
				int var3 = this.field1543; // L: 100
				if (var2 > 0) { // L: 101
					int var4 = 0; // L: 102
					int var5 = var2 - 1; // L: 103

					do {
						int var6 = var5 + var4 >> 1; // L: 105
						if (var1 < (float)this.field1530[var6].field1477) { // L: 106
							if (var1 > (float)this.field1530[var6 - 1].field1477) { // L: 107
								var3 = var6 - 1; // L: 108
								break;
							}

							var5 = var6 - 1; // L: 112
						} else {
							if (var1 <= (float)this.field1530[var6].field1477) { // L: 115
								var3 = var6; // L: 125
								break; // L: 126
							}

							if (var1 < (float)this.field1530[var6 + 1].field1477) { // L: 116
								var3 = var6; // L: 117
								break; // L: 118
							}

							var4 = var6 + 1; // L: 121
						}
					} while(var4 <= var5); // L: 128
				}

				if (var3 != this.field1543) { // L: 130
					this.field1543 = var3; // L: 131
					this.field1542 = true; // L: 132
				}

				return this.field1543; // L: 134
			} else {
				return -1; // L: 97
			}
		} else {
			return this.field1543; // L: 94
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)Leq;",
		garbageValue = "-1779778637"
	)
	class126 method3105(float var1) {
		int var2 = this.method3098(var1); // L: 138
		return var2 >= 0 && var2 < this.field1530.length ? this.field1530[var2] : null; // L: 139 140 143
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1866632408"
	)
	int method3106() {
		return this.field1530 == null ? 0 : this.field1530.length; // L: 148 149
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lto;",
		garbageValue = "-575413864"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 267
		if (var3.exists()) { // L: 268
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 270
				return var10; // L: 271
			} catch (IOException var9) { // L: 273
			}
		}

		String var4 = ""; // L: 275
		if (class521.cacheGamebuild == 33) { // L: 276
			var4 = "_rc";
		} else if (class521.cacheGamebuild == 34) { // L: 277
			var4 = "_wip";
		}

		File var5 = new File(Login.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 278
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 279
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 281
				return var6; // L: 282
			} catch (IOException var8) { // L: 284
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 287
			return var6; // L: 288
		} catch (IOException var7) { // L: 290
			throw new RuntimeException(); // L: 291
		}
	}
}
