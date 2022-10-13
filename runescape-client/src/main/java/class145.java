import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ea")
public class class145 extends class135 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -266628335
	)
	int field1657;
	@ObfuscatedName("f")
	String field1656;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class145(class138 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		this.field1657 = var1.readInt(); // L: 326
		this.field1656 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.method3092(this.field1657, this.field1656); // L: 331
	} // L: 332

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "0"
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
							var21[var12] = LoginScreenAnimation.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = LoginScreenAnimation.loadClassFromDescriptor(var20); // L: 167
						if (LoginScreenAnimation.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 168
							throw new SecurityException();
						}

						Method[] var13 = LoginScreenAnimation.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 169
						Method[] var14 = var13; // L: 171

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 172
							Method var16 = var14[var15]; // L: 173
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 175
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 176
								if (var17.length == var21.length) { // L: 177
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
					if (LoginScreenAnimation.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 146
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(LoginScreenAnimation.loadClassFromDescriptor(var5), var6); // L: 147
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

		class37.reflectionChecks.addFirst(var2); // L: 212
	} // L: 213

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1334462471"
	)
	public static void method3072() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 409
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 410
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 411
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 412
	} // L: 413

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "115"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4544
			byte var2 = 4; // L: 4545
			int var3 = var2 + 6; // L: 4546
			int var4 = var2 + 6; // L: 4547
			int var5 = Language.fontPlain12.lineWidth(var0, 250); // L: 4548
			int var6 = Language.fontPlain12.lineCount(var0, 250) * 13; // L: 4549
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0); // L: 4550
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215); // L: 4551
			Language.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4552
			AbstractArchive.method6439(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6); // L: 4553
			if (var1) { // L: 4554
				class1.rasterProvider.drawFull(0, 0); // L: 4555
			} else {
				UserComparator8.method2749(var3, var4, var5, var6); // L: 4558
			}

		}
	} // L: 4560
}
