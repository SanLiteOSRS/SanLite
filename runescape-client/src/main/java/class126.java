import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dv")
public enum class126 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1478(3, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1472(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1475(0, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	field1471(2, 3);

	@ObfuscatedName("h")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -137966849
	)
	static int field1477;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1230952189
	)
	public final int field1476;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1895212337
	)
	@Export("id")
	final int id;

	class126(int var3, int var4) {
		this.field1476 = var3;
		this.id = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IILfv;Lfl;I)Z",
		garbageValue = "773199709"
	)
	public static final boolean method2595(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class160.directions[var6][var7] = 99;
		class160.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class160.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class160.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class160.bufferX[var11];
			var5 = class160.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(1, var4, var5, var3)) {
				Login.field1033 = var4;
				GrandExchangeOfferOwnWorldComparator.field608 = var5;
				return true;
			}

			int var15 = class160.distances[var16][var17] + 1;
			if (var16 > 0 && class160.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) {
				class160.bufferX[var18] = var4 - 1;
				class160.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class160.directions[var16 - 1][var17] = 2;
				class160.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 127 && class160.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) {
				class160.bufferX[var18] = var4 + 1;
				class160.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class160.directions[var16 + 1][var17] = 8;
				class160.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class160.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class160.bufferX[var18] = var4;
				class160.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class160.directions[var16][var17 - 1] = 1;
				class160.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 127 && class160.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class160.bufferX[var18] = var4;
				class160.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class160.directions[var16][var17 + 1] = 4;
				class160.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class160.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class160.bufferX[var18] = var4 - 1;
				class160.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class160.directions[var16 - 1][var17 - 1] = 3;
				class160.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 127 && var17 > 0 && class160.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) {
				class160.bufferX[var18] = var4 + 1;
				class160.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class160.directions[var16 + 1][var17 - 1] = 9;
				class160.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 127 && class160.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class160.bufferX[var18] = var4 - 1;
				class160.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class160.directions[var16 - 1][var17 + 1] = 6;
				class160.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 127 && var17 < 127 && class160.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) {
				class160.bufferX[var18] = var4 + 1;
				class160.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class160.directions[var16 + 1][var17 + 1] = 12;
				class160.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		Login.field1033 = var4;
		GrandExchangeOfferOwnWorldComparator.field608 = var5;
		return false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "985430780"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = FontName.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = FontName.loadClassFromDescriptor(var20);
						if (FontName.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = FontName.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var21.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (FontName.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(FontName.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class69.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-47"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}
}
