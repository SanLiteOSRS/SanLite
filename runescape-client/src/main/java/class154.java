import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fp")
public class class154 extends class140 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2071349373
	)
	int field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class154(class143 var1) {
		this.this$0 = var1;
		this.field1728 = -1; // L: 213
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		this.field1728 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.method3203(this.field1728); // L: 222
	} // L: 223

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-1972796203"
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
							var21[var12] = BufferedFile.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = BufferedFile.loadClassFromDescriptor(var20); // L: 169
						if (BufferedFile.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 170
							throw new SecurityException();
						}

						Method[] var13 = BufferedFile.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 171
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
					if (BufferedFile.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 148
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(BufferedFile.loadClassFromDescriptor(var5), var6); // L: 149
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

		class36.reflectionChecks.addFirst(var2); // L: 214
	} // L: 215

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "0"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		AbstractWorldMapData.scrollBarSprites[0].drawAt(var0, var1); // L: 10642
		AbstractWorldMapData.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10643
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field556); // L: 10644
		int var5 = var3 * (var3 - 32) / var4; // L: 10645
		if (var5 < 8) { // L: 10646
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10647
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field555); // L: 10648
		Rasterizer2D.method8970(var0, var6 + var1 + 16, var5, Client.field559); // L: 10649
		Rasterizer2D.method8970(var0 + 1, var6 + var1 + 16, var5, Client.field559); // L: 10650
		Rasterizer2D.method8986(var0, var6 + var1 + 16, 16, Client.field559); // L: 10651
		Rasterizer2D.method8986(var0, var6 + var1 + 17, 16, Client.field559); // L: 10652
		Rasterizer2D.method8970(var0 + 15, var6 + var1 + 16, var5, Client.field558); // L: 10653
		Rasterizer2D.method8970(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field558); // L: 10654
		Rasterizer2D.method8986(var0, var6 + var5 + var1 + 15, 16, Client.field558); // L: 10655
		Rasterizer2D.method8986(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field558); // L: 10656
	} // L: 10657

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "115"
	)
	static String method3285(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12111
		if (Client.gameBuild == 1) { // L: 12112
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12113
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12114
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12115
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12116
			var0 = "local";
		}

		String var3 = ""; // L: 12117
		if (FontName.field4790 != null) { // L: 12118
			var3 = "/p=" + FontName.field4790;
		}

		String var4 = "runescape.com"; // L: 12119
		return var2 + var0 + "." + var4 + "/l=" + class69.clientLanguage + "/a=" + RouteStrategy.field2330 + var3 + "/"; // L: 12120
	}
}
