import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fy")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("h")
	long[] field1885;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -581410869
	)
	int field1886;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 715488613
	)
	int field1890;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -673545933242370399L
	)
	long field1888;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1067993763
	)
	int field1889;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1146826957
	)
	int field1887;

	public MilliClock() {
		this.field1885 = new long[10]; // L: 7
		this.field1886 = 256; // L: 15
		this.field1890 = 1; // L: 16
		this.field1889 = 0; // L: 17
		this.field1888 = Message.method1197(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1885[var1] = this.field1888; // L: 20
		}

	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "118747683"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1885[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1532577739"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1886; // L: 31
		int var4 = this.field1890; // L: 32
		this.field1886 = 300; // L: 33
		this.field1890 = 1; // L: 34
		this.field1888 = Message.method1197(); // L: 35
		if (this.field1885[this.field1887] == 0L) { // L: 36
			this.field1886 = var3; // L: 37
			this.field1890 = var4; // L: 38
		} else if (this.field1888 > this.field1885[this.field1887]) { // L: 40
			this.field1886 = (int)((long)(var1 * 2560) / (this.field1888 - this.field1885[this.field1887]));
		}

		if (this.field1886 < 25) { // L: 41
			this.field1886 = 25;
		}

		if (this.field1886 > 256) { // L: 42
			this.field1886 = 256; // L: 43
			this.field1890 = (int)((long)var1 - (this.field1888 - this.field1885[this.field1887]) / 10L); // L: 44
		}

		if (this.field1890 > var1) { // L: 46
			this.field1890 = var1;
		}

		this.field1885[this.field1887] = this.field1888; // L: 47
		this.field1887 = (this.field1887 + 1) % 10; // L: 48
		int var5;
		if (this.field1890 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1885[var5] != 0L) { // L: 51
					this.field1885[var5] += (long)this.field1890;
				}
			}
		}

		if (this.field1890 < var2) { // L: 54
			this.field1890 = var2;
		}

		class12.method157((long)this.field1890); // L: 55

		for (var5 = 0; this.field1889 < 256; this.field1889 += this.field1886) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1889 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "-1714610192"
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
							var21[var12] = loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = loadClassFromDescriptor(var20); // L: 163
						if (loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 164
							throw new SecurityException();
						}

						Method[] var13 = loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 165
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
					if (loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 142
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(loadClassFromDescriptor(var5), var6); // L: 143
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

		class37.reflectionChecks.addFirst(var2); // L: 208
	} // L: 209

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/lang/Class;",
		garbageValue = "-21331"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 212
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 213
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 214
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 215
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 216
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 217
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 218
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 219
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 220 221
		}
	}
}
