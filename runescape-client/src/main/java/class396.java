import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("pc")
public class class396 {
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 1266268121
	)
	static int field4466;
	@ObfuscatedName("ai")
	public char field4465;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -707418077
	)
	public int field4464;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -806688603
	)
	public int field4463;

	class396() {
		this.field4464 = 0; // L: 5
		this.field4463 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "601897150"
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
							var21[var12] = VarcInt.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = VarcInt.loadClassFromDescriptor(var20); // L: 173
						if (VarcInt.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 174
							throw new SecurityException();
						}

						Method[] var13 = VarcInt.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 175
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
					if (VarcInt.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 152
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(VarcInt.loadClassFromDescriptor(var5), var6); // L: 153
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
}
