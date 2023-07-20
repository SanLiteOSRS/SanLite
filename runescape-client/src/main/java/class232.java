import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("if")
public class class232 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1348299903
	)
	int field2608;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1106941033
	)
	int field2606;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1544653433
	)
	int field2605;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1600362799
	)
	int field2607;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1728507101
	)
	int field2609;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1339369663
	)
	int field2610;

	class232(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2608 = var1; // L: 12
		this.field2606 = var2; // L: 13
		this.field2605 = var3; // L: 14
		this.field2607 = var4; // L: 15
		this.field2609 = var5; // L: 16
		this.field2610 = var6; // L: 17
	} // L: 18

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-817024530"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 133
		var2.size = var0.readUnsignedByte(); // L: 134
		var2.id = var0.readInt(); // L: 135
		var2.operations = new int[var2.size]; // L: 136
		var2.creationErrors = new int[var2.size]; // L: 137
		var2.fields = new Field[var2.size]; // L: 138
		var2.intReplaceValues = new int[var2.size]; // L: 139
		var2.methods = new Method[var2.size]; // L: 140
		var2.arguments = new byte[var2.size][][]; // L: 141

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 142
			try {
				int var4 = var0.readUnsignedByte(); // L: 144
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 145
					if (var4 == 3 || var4 == 4) { // L: 155
						var5 = var0.readStringCp1252NullTerminated(); // L: 156
						var6 = var0.readStringCp1252NullTerminated(); // L: 157
						var7 = var0.readUnsignedByte(); // L: 158
						String[] var8 = new String[var7]; // L: 159

						for (int var9 = 0; var9 < var7; ++var9) { // L: 160
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 161
						byte[][] var10 = new byte[var7][]; // L: 162
						int var12;
						if (var4 == 3) { // L: 163
							for (int var11 = 0; var11 < var7; ++var11) { // L: 164
								var12 = var0.readInt(); // L: 165
								var10[var11] = new byte[var12]; // L: 166
								var0.readBytes(var10[var11], 0, var12); // L: 167
							}
						}

						var2.operations[var3] = var4; // L: 170
						Class[] var21 = new Class[var7]; // L: 171

						for (var12 = 0; var12 < var7; ++var12) { // L: 172
							var21[var12] = class282.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class282.loadClassFromDescriptor(var20); // L: 173
						if (class282.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 174
							throw new SecurityException();
						}

						Method[] var13 = class282.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 175
						Method[] var14 = var13; // L: 177

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 178
							Method var16 = var14[var15]; // L: 179
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 181
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 182
								if (var21.length == var17.length) { // L: 183
									boolean var18 = true; // L: 184

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 185
										if (var17[var19] != var21[var19]) { // L: 186
											var18 = false; // L: 187
											break; // L: 188
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 191
										var2.methods[var3] = var16; // L: 192
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 199
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 146
					var6 = var0.readStringCp1252NullTerminated(); // L: 147
					var7 = 0; // L: 148
					if (var4 == 1) { // L: 149
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 150
					var2.intReplaceValues[var3] = var7; // L: 151
					if (class282.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 152
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class282.loadClassFromDescriptor(var5), var6); // L: 153
				}
			} catch (ClassNotFoundException var24) { // L: 202
				var2.creationErrors[var3] = -1; // L: 203
			} catch (SecurityException var25) { // L: 205
				var2.creationErrors[var3] = -2; // L: 206
			} catch (NullPointerException var26) { // L: 208
				var2.creationErrors[var3] = -3; // L: 209
			} catch (Exception var27) { // L: 211
				var2.creationErrors[var3] = -4; // L: 212
			} catch (Throwable var28) { // L: 214
				var2.creationErrors[var3] = -5; // L: 215
			}
		}

		class36.reflectionChecks.addFirst(var2); // L: 218
	} // L: 219

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1736131350"
	)
	public static int method4739(int var0, int var1, int var2) {
		int var3 = class228.method4505(var2 - var1 + 1); // L: 56
		var3 <<= var1; // L: 57
		var0 |= var3; // L: 58
		return var0; // L: 59
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z",
		garbageValue = "692488885"
	)
	static final boolean method4740(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null; // L: 8438

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8439 8440 8445
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) { // L: 8441
				var5 = var6; // L: 8442
				break;
			}
		}

		if (var5 != null) { // L: 8447
			var5.field1172 = var4; // L: 8448
			return true; // L: 8449
		} else {
			return false; // L: 8451
		}
	}
}
