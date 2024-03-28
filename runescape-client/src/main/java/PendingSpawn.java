import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("dt")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	static class474 field1189;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1065772679
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1898980087
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 720418455
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -785032679
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 652811965
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1218109065
	)
	int field1187;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 216979993
	)
	int field1188;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 996436491
	)
	int field1198;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 852776241
	)
	int field1190;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -31602513
	)
	int field1191;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 356498569
	)
	int field1192;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 493837273
	)
	int field1194;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1941235439
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 992878547
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1194 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "85"
	)
	void method2387(int var1) {
		this.field1194 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "232835771"
	)
	boolean method2391(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1194 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-2048773565"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 127
		var2.size = var0.readUnsignedByte(); // L: 128
		var2.id = var0.readInt(); // L: 129
		var2.operations = new int[var2.size]; // L: 130
		var2.creationErrors = new int[var2.size]; // L: 131
		var2.fields = new Field[var2.size]; // L: 132
		var2.intReplaceValues = new int[var2.size]; // L: 133
		var2.methods = new Method[var2.size]; // L: 134
		var2.arguments = new byte[var2.size][][]; // L: 135

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 136
			try {
				int var4 = var0.readUnsignedByte(); // L: 138
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 139
					if (var4 == 3 || var4 == 4) { // L: 149
						var5 = var0.readStringCp1252NullTerminated(); // L: 150
						var6 = var0.readStringCp1252NullTerminated(); // L: 151
						var7 = var0.readUnsignedByte(); // L: 152
						String[] var8 = new String[var7]; // L: 153

						for (int var9 = 0; var9 < var7; ++var9) { // L: 154
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 155
						byte[][] var10 = new byte[var7][]; // L: 156
						int var12;
						if (var4 == 3) { // L: 157
							for (int var11 = 0; var11 < var7; ++var11) { // L: 158
								var12 = var0.readInt(); // L: 159
								var10[var11] = new byte[var12]; // L: 160
								var0.readBytes(var10[var11], 0, var12); // L: 161
							}
						}

						var2.operations[var3] = var4; // L: 164
						Class[] var21 = new Class[var7]; // L: 165

						for (var12 = 0; var12 < var7; ++var12) { // L: 166
							var21[var12] = Bounds.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = Bounds.loadClassFromDescriptor(var20); // L: 167
						if (Bounds.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 168
							throw new SecurityException();
						}

						Method[] var13 = Bounds.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 169
						Method[] var14 = var13; // L: 171

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 172
							Method var16 = var14[var15]; // L: 173
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 175
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 176
								if (var21.length == var17.length) { // L: 177
									boolean var18 = true; // L: 178

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 179
										if (var17[var19] != var21[var19]) { // L: 180
											var18 = false; // L: 181
											break; // L: 182
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 185
										var2.methods[var3] = var16; // L: 186
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 193
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 140
					var6 = var0.readStringCp1252NullTerminated(); // L: 141
					var7 = 0; // L: 142
					if (var4 == 1) { // L: 143
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 144
					var2.intReplaceValues[var3] = var7; // L: 145
					if (Bounds.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 146
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(Bounds.loadClassFromDescriptor(var5), var6); // L: 147
				}
			} catch (ClassNotFoundException var24) { // L: 196
				var2.creationErrors[var3] = -1; // L: 197
			} catch (SecurityException var25) { // L: 199
				var2.creationErrors[var3] = -2; // L: 200
			} catch (NullPointerException var26) { // L: 202
				var2.creationErrors[var3] = -3; // L: 203
			} catch (Exception var27) { // L: 205
				var2.creationErrors[var3] = -4; // L: 206
			} catch (Throwable var28) { // L: 208
				var2.creationErrors[var3] = -5; // L: 209
			}
		}

		class36.reflectionChecks.addFirst(var2); // L: 212
	} // L: 213
}
