import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dd")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ay")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("an")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1286363739
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ab")
	static short[][][] field998;
	@ObfuscatedName("at")
	static short[][][] field993;
	@ObfuscatedName("ax")
	static byte[][][] field994;
	@ObfuscatedName("aj")
	static byte[][][] field995;
	@ObfuscatedName("ac")
	static int[][] field996;
	@ObfuscatedName("ad")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ah")
	static int[] field1004;
	@ObfuscatedName("ap")
	static int[][][] field999;
	@ObfuscatedName("af")
	static final int[] field1000;
	@ObfuscatedName("av")
	static final int[] field997;
	@ObfuscatedName("aq")
	static final int[] field1002;
	@ObfuscatedName("az")
	static final int[] field1003;
	@ObfuscatedName("ak")
	static final int[] field1007;
	@ObfuscatedName("aa")
	static final int[] field1005;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1796266941
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -839615857
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;

	static {
		Tiles_heights = new int[4][105][105]; // L: 13
		Tiles_renderFlags = new byte[4][104][104]; // L: 14
		Tiles_minPlane = 99; // L: 15
		field1000 = new int[]{1, 2, 4, 8};
		field997 = new int[]{16, 32, 64, 128};
		field1002 = new int[]{1, 0, -1, 0};
		field1003 = new int[]{0, -1, 0, 1};
		field1007 = new int[]{1, -1, -1, 1};
		field1005 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 38
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltn;I)V",
		garbageValue = "-1421886048"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 31
		if (var1 != null) { // L: 32
			int var2 = var0.offset; // L: 33
			var0.writeIntME(var1.id); // L: 34

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 35
				if (var1.creationErrors[var3] != 0) { // L: 36
					var0.writeByte(var1.creationErrors[var3]); // L: 37
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 41
						Field var5;
						int var6;
						if (var4 == 0) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							var6 = Reflection.getInt(var5, (Object)null); // L: 44
							var0.writeByte(0); // L: 45
							var0.writeIntME(var6); // L: 46
						} else if (var4 == 1) { // L: 48
							var5 = var1.fields[var3]; // L: 49
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 50
							var0.writeByte(0); // L: 51
						} else if (var4 == 2) { // L: 53
							var5 = var1.fields[var3]; // L: 54
							var6 = var5.getModifiers(); // L: 55
							var0.writeByte(0); // L: 56
							var0.writeIntME(var6); // L: 57
						}

						Method var25;
						if (var4 != 3) { // L: 59
							if (var4 == 4) { // L: 79
								var25 = var1.methods[var3]; // L: 80
								var6 = var25.getModifiers(); // L: 81
								var0.writeByte(0); // L: 82
								var0.writeIntME(var6); // L: 83
							}
						} else {
							var25 = var1.methods[var3]; // L: 60
							byte[][] var10 = var1.arguments[var3]; // L: 61
							Object[] var7 = new Object[var10.length]; // L: 62

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 63
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 64
								var7[var8] = var9.readObject(); // L: 65
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 67
							if (var11 == null) { // L: 68
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 69
								var0.writeByte(1); // L: 70
								var0.writeLong(((Number)var11).longValue()); // L: 71
							} else if (var11 instanceof String) { // L: 73
								var0.writeByte(2); // L: 74
								var0.writeStringCp1252NullTerminated((String)var11); // L: 75
							} else {
								var0.writeByte(4); // L: 77
							}
						}
					} catch (ClassNotFoundException var13) { // L: 86
						var0.writeByte(-10); // L: 87
					} catch (InvalidClassException var14) { // L: 89
						var0.writeByte(-11); // L: 90
					} catch (StreamCorruptedException var15) { // L: 92
						var0.writeByte(-12); // L: 93
					} catch (OptionalDataException var16) { // L: 95
						var0.writeByte(-13); // L: 96
					} catch (IllegalAccessException var17) { // L: 98
						var0.writeByte(-14); // L: 99
					} catch (IllegalArgumentException var18) { // L: 101
						var0.writeByte(-15); // L: 102
					} catch (InvocationTargetException var19) { // L: 104
						var0.writeByte(-16); // L: 105
					} catch (SecurityException var20) { // L: 107
						var0.writeByte(-17); // L: 108
					} catch (IOException var21) { // L: 110
						var0.writeByte(-18); // L: 111
					} catch (NullPointerException var22) { // L: 113
						var0.writeByte(-19); // L: 114
					} catch (Exception var23) { // L: 116
						var0.writeByte(-20); // L: 117
					} catch (Throwable var24) { // L: 119
						var0.writeByte(-21); // L: 120
					}
				}
			}

			var0.writeCrc(var2); // L: 123
			var1.remove(); // L: 124
		}
	} // L: 125

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILih;[Lir;)V"
	)
	static final void method2149(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 286
		int var11 = -1; // L: 287

		while (true) {
			int var12 = var10.method8981(); // L: 289
			if (var12 == 0) { // L: 290
				return; // L: 345
			}

			var11 += var12; // L: 291
			int var13 = 0; // L: 292

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 294
				if (var14 == 0) { // L: 295
					break;
				}

				var13 += var14 - 1; // L: 296
				int var15 = var13 & 63; // L: 297
				int var16 = var13 >> 6 & 63; // L: 298
				int var17 = var13 >> 12; // L: 299
				int var18 = var10.readUnsignedByte(); // L: 300
				int var19 = var18 >> 2; // L: 301
				int var20 = var18 & 3; // L: 302
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 303
					ObjectComposition var21 = class59.getObjectDefinition(var11); // L: 304
					int var22 = var2 + HorizontalAlignment.method3662(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 305
					int var25 = var16 & 7; // L: 308
					int var26 = var15 & 7; // L: 309
					int var28 = var21.sizeX; // L: 311
					int var29 = var21.sizeY; // L: 312
					int var30;
					if ((var20 & 1) == 1) { // L: 314
						var30 = var28; // L: 315
						var28 = var29; // L: 316
						var29 = var30; // L: 317
					}

					int var27 = var7 & 3; // L: 319
					int var24;
					if (var27 == 0) { // L: 320
						var24 = var26; // L: 321
					} else if (var27 == 1) { // L: 324
						var24 = 7 - var25 - (var28 - 1); // L: 325
					} else if (var27 == 2) { // L: 328
						var24 = 7 - var26 - (var29 - 1); // L: 329
					} else {
						var24 = var25; // L: 332
					}

					var30 = var3 + var24; // L: 334
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) { // L: 335
						int var31 = var1; // L: 336
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) { // L: 337
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 338
						if (var31 >= 0) { // L: 339
							var32 = var9[var31];
						}

						SecureRandomCallable.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 340
					}
				}
			}
		}
	}
}
