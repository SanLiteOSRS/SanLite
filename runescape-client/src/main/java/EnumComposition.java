import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = 377539259
	)
	static int field1983;
	@ObfuscatedName("ac")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("aw")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ay")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2142082893
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1580592865
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("an")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("au")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("az")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "537828130"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "195595626"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lca;Lca;IZI)I",
		garbageValue = "-264569282"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 222
			int var4 = var0.population; // L: 223
			int var5 = var1.population; // L: 224
			if (!var3) { // L: 225
				if (var4 == -1) { // L: 226
					var4 = 2001;
				}

				if (var5 == -1) { // L: 227
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 229
		} else if (var2 == 2) { // L: 231
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 232
			if (var0.activity.equals("-")) { // L: 233
				if (var1.activity.equals("-")) { // L: 234
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 235
				}
			} else if (var1.activity.equals("-")) { // L: 237
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 238
			}
		} else if (var2 == 4) { // L: 240
			return var0.method1816() ? (var1.method1816() ? 0 : 1) : (var1.method1816() ? -1 : 0);
		} else if (var2 == 5) { // L: 241
			return var0.method1814() ? (var1.method1814() ? 0 : 1) : (var1.method1814() ? -1 : 0);
		} else if (var2 == 6) { // L: 242
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 243
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 244
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 73
		if (var0 < 0 || var0 >= 65536) { // L: 74
			var0 >>>= 16; // L: 75
			var1 += 16; // L: 76
		}

		if (var0 >= 256) { // L: 78
			var0 >>>= 8; // L: 79
			var1 += 8; // L: 80
		}

		if (var0 >= 16) { // L: 82
			var0 >>>= 4; // L: 83
			var1 += 4; // L: 84
		}

		if (var0 >= 4) { // L: 86
			var0 >>>= 2; // L: 87
			var1 += 2; // L: 88
		}

		if (var0 >= 1) { // L: 90
			var0 >>>= 1; // L: 91
			++var1; // L: 92
		}

		return var0 + var1; // L: 94
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "31"
	)
	static final void method3787(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10970
		int var7 = var3 - var1; // L: 10971
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10972
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10973
		int var10 = var8; // L: 10974
		if (var8 < var9) { // L: 10975
			var10 = var9;
		}

		if (var10 != 0) { // L: 10976
			int var11 = (var6 << 16) / var10; // L: 10977
			int var12 = (var7 << 16) / var10; // L: 10978
			if (var12 <= var11) { // L: 10979
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10980
			}

			int var13 = var5 * var12 >> 17; // L: 10981
			int var14 = var5 * var12 + 1 >> 17; // L: 10982
			int var15 = var5 * var11 >> 17; // L: 10983
			int var16 = var5 * var11 + 1 >> 17; // L: 10984
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10985
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10986
			int var17 = var0 + var13; // L: 10987
			int var18 = var0 - var14; // L: 10988
			int var19 = var0 + var6 - var14; // L: 10989
			int var20 = var0 + var6 + var13; // L: 10990
			int var21 = var15 + var1; // L: 10991
			int var22 = var1 - var16; // L: 10992
			int var23 = var7 + var1 - var16; // L: 10993
			int var24 = var7 + var15 + var1; // L: 10994
			Rasterizer3D.method4494(var17, var18, var19); // L: 10995
			Rasterizer3D.method4544(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 10996
			Rasterizer3D.method4494(var17, var19, var20); // L: 10997
			Rasterizer3D.method4544(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 10998
		}
	} // L: 10999
}
