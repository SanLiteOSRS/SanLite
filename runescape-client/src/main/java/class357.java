import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("nj")
public class class357 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;IB)V",
		garbageValue = "70"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 123
		var2.size = var0.readUnsignedByte(); // L: 124
		var2.id = var0.readInt(); // L: 125
		var2.operations = new int[var2.size]; // L: 126
		var2.creationErrors = new int[var2.size]; // L: 127
		var2.fields = new Field[var2.size]; // L: 128
		var2.intReplaceValues = new int[var2.size]; // L: 129
		var2.methods = new Method[var2.size]; // L: 130
		var2.arguments = new byte[var2.size][][]; // L: 131

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 132
			try {
				int var4 = var0.readUnsignedByte(); // L: 134
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 135
					if (var4 == 3 || var4 == 4) { // L: 145
						var5 = var0.readStringCp1252NullTerminated(); // L: 146
						var6 = var0.readStringCp1252NullTerminated(); // L: 147
						var7 = var0.readUnsignedByte(); // L: 148
						String[] var8 = new String[var7]; // L: 149

						for (int var9 = 0; var9 < var7; ++var9) { // L: 150
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 151
						byte[][] var10 = new byte[var7][]; // L: 152
						int var12;
						if (var4 == 3) { // L: 153
							for (int var11 = 0; var11 < var7; ++var11) { // L: 154
								var12 = var0.readInt(); // L: 155
								var10[var11] = new byte[var12]; // L: 156
								var0.readBytes(var10[var11], 0, var12); // L: 157
							}
						}

						var2.operations[var3] = var4; // L: 160
						Class[] var21 = new Class[var7]; // L: 161

						for (var12 = 0; var12 < var7; ++var12) { // L: 162
							var21[var12] = class18.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class18.loadClassFromDescriptor(var20); // L: 163
						if (class18.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 164
							throw new SecurityException();
						}

						Method[] var13 = class18.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 165
						Method[] var14 = var13; // L: 167

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 168
							Method var16 = var14[var15]; // L: 169
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 171
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 172
								if (var21.length == var17.length) { // L: 173
									boolean var18 = true; // L: 174

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 175
										if (var17[var19] != var21[var19]) { // L: 176
											var18 = false; // L: 177
											break; // L: 178
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 181
										var2.methods[var3] = var16; // L: 182
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 189
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 136
					var6 = var0.readStringCp1252NullTerminated(); // L: 137
					var7 = 0; // L: 138
					if (var4 == 1) { // L: 139
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 140
					var2.intReplaceValues[var3] = var7; // L: 141
					if (class18.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 142
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class18.loadClassFromDescriptor(var5), var6); // L: 143
				}
			} catch (ClassNotFoundException var24) { // L: 192
				var2.creationErrors[var3] = -1; // L: 193
			} catch (SecurityException var25) { // L: 195
				var2.creationErrors[var3] = -2; // L: 196
			} catch (NullPointerException var26) { // L: 198
				var2.creationErrors[var3] = -3; // L: 199
			} catch (Exception var27) { // L: 201
				var2.creationErrors[var3] = -4; // L: 202
			} catch (Throwable var28) { // L: 204
				var2.creationErrors[var3] = -5; // L: 205
			}
		}

		class36.reflectionChecks.addFirst(var2); // L: 208
	} // L: 209

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1825300957"
	)
	static final void method6796(int var0) {
		if (class33.field184.method6242(var0)) { // L: 12152
			Widget[] var1 = class33.field184.field3587[var0]; // L: 12153

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12154
				Widget var3 = var1[var2]; // L: 12155
				if (var3 != null) { // L: 12156
					var3.modelFrame = 0; // L: 12157
					var3.modelFrameCycle = 0; // L: 12158
				}
			}

		}
	} // L: 12160
}
