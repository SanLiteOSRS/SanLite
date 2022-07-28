import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dl")
public abstract class class128 extends Node {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2004580483
	)
	static int field1543;

	class128() {
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	abstract void vmethod3155(Buffer var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	abstract void vmethod3154(ClanSettings var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-66679284"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 129
		var2.size = var0.readUnsignedByte(); // L: 130
		var2.id = var0.readInt(); // L: 131
		var2.operations = new int[var2.size]; // L: 132
		var2.creationErrors = new int[var2.size]; // L: 133
		var2.fields = new Field[var2.size]; // L: 134
		var2.intReplaceValues = new int[var2.size]; // L: 135
		var2.methods = new Method[var2.size]; // L: 136
		var2.arguments = new byte[var2.size][][]; // L: 137

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 138
			try {
				int var4 = var0.readUnsignedByte(); // L: 140
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 141
					if (var4 == 3 || var4 == 4) { // L: 151
						var5 = var0.readStringCp1252NullTerminated(); // L: 152
						var6 = var0.readStringCp1252NullTerminated(); // L: 153
						var7 = var0.readUnsignedByte(); // L: 154
						String[] var8 = new String[var7]; // L: 155

						for (int var9 = 0; var9 < var7; ++var9) { // L: 156
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 157
						byte[][] var10 = new byte[var7][]; // L: 158
						int var12;
						if (var4 == 3) { // L: 159
							for (int var11 = 0; var11 < var7; ++var11) { // L: 160
								var12 = var0.readInt(); // L: 161
								var10[var11] = new byte[var12]; // L: 162
								var0.readBytes(var10[var11], 0, var12); // L: 163
							}
						}

						var2.operations[var3] = var4; // L: 166
						Class[] var21 = new Class[var7]; // L: 167

						for (var12 = 0; var12 < var7; ++var12) { // L: 168
							var21[var12] = class141.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class141.loadClassFromDescriptor(var20); // L: 169
						if (class141.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 170
							throw new SecurityException();
						}

						Method[] var13 = class141.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 171
						Method[] var14 = var13; // L: 173

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 174
							Method var16 = var14[var15]; // L: 175
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 177
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 178
								if (var17.length == var21.length) { // L: 179
									boolean var18 = true; // L: 180

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 181
										if (var21[var19] != var17[var19]) { // L: 182
											var18 = false; // L: 183
											break; // L: 184
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 187
										var2.methods[var3] = var16; // L: 188
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 195
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 142
					var6 = var0.readStringCp1252NullTerminated(); // L: 143
					var7 = 0; // L: 144
					if (var4 == 1) { // L: 145
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 146
					var2.intReplaceValues[var3] = var7; // L: 147
					if (class141.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 148
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class141.loadClassFromDescriptor(var5), var6); // L: 149
				}
			} catch (ClassNotFoundException var24) { // L: 198
				var2.creationErrors[var3] = -1; // L: 199
			} catch (SecurityException var25) { // L: 201
				var2.creationErrors[var3] = -2; // L: 202
			} catch (NullPointerException var26) { // L: 204
				var2.creationErrors[var3] = -3; // L: 205
			} catch (Exception var27) { // L: 207
				var2.creationErrors[var3] = -4; // L: 208
			} catch (Throwable var28) { // L: 210
				var2.creationErrors[var3] = -5; // L: 211
			}
		}

		class33.reflectionChecks.addFirst(var2); // L: 214
	} // L: 215

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-97"
	)
	public static int method2897(int var0) {
		return Language.method6087(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 81
	}
}
