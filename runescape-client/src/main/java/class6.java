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
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("av")
public enum class6 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	field18(0, 0);

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	static StudioGame field15;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field20;
	@ObfuscatedName("gp")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1534754955
	)
	final int field16;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1738838443
	)
	final int field17;

	class6(int var3, int var4) {
		this.field16 = var3; // L: 12
		this.field17 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field17; // L: 18
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "-2119659915"
	)
	static byte[] method41(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0; // L: 130
		byte[] var5 = new byte[8]; // L: 131

		while (true) {
			int var6 = var3 + var4; // L: 133
			if (var6 >= var0.length()) { // L: 134
				return null; // L: 135
			}

			char var7 = var0.charAt(var6); // L: 137
			if (var7 == ':') { // L: 138
				if (var4 == 0) { // L: 155
					return null; // L: 156
				}

				byte[] var8 = new byte[var4]; // L: 158
				System.arraycopy(var5, 0, var8, 0, var4); // L: 159
				return var8; // L: 160
			}

			if (var5.length == var4) { // L: 141
				return null; // L: 142
			}

			if (var7 >= '0' && var7 <= '9') { // L: 144
				var7 = (char)(var7 - '0'); // L: 145
			} else {
				if (var7 < 'a' || var7 > 'z') { // L: 147
					return null; // L: 151
				}

				var7 = (char)(var7 - 'W'); // L: 148
			}

			var5[var4++] = (byte)var7; // L: 153
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltf;I)V",
		garbageValue = "1675281358"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 35
		if (var1 != null) { // L: 36
			int var2 = var0.offset; // L: 37
			var0.writeInt(var1.id); // L: 38

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 39
				if (var1.creationErrors[var3] != 0) { // L: 40
					var0.writeByte(var1.creationErrors[var3]); // L: 41
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 45
						Field var5;
						int var6;
						if (var4 == 0) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							var6 = Reflection.getInt(var5, (Object)null); // L: 48
							var0.writeByte(0); // L: 49
							var0.writeInt(var6); // L: 50
						} else if (var4 == 1) { // L: 52
							var5 = var1.fields[var3]; // L: 53
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 54
							var0.writeByte(0); // L: 55
						} else if (var4 == 2) { // L: 57
							var5 = var1.fields[var3]; // L: 58
							var6 = var5.getModifiers(); // L: 59
							var0.writeByte(0); // L: 60
							var0.writeInt(var6); // L: 61
						}

						Method var25;
						if (var4 != 3) { // L: 63
							if (var4 == 4) { // L: 83
								var25 = var1.methods[var3]; // L: 84
								var6 = var25.getModifiers(); // L: 85
								var0.writeByte(0); // L: 86
								var0.writeInt(var6); // L: 87
							}
						} else {
							var25 = var1.methods[var3]; // L: 64
							byte[][] var10 = var1.arguments[var3]; // L: 65
							Object[] var7 = new Object[var10.length]; // L: 66

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 67
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 68
								var7[var8] = var9.readObject(); // L: 69
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 71
							if (var11 == null) { // L: 72
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 73
								var0.writeByte(1); // L: 74
								var0.writeLong(((Number)var11).longValue()); // L: 75
							} else if (var11 instanceof String) { // L: 77
								var0.writeByte(2); // L: 78
								var0.writeStringCp1252NullTerminated((String)var11); // L: 79
							} else {
								var0.writeByte(4); // L: 81
							}
						}
					} catch (ClassNotFoundException var13) { // L: 90
						var0.writeByte(-10); // L: 91
					} catch (InvalidClassException var14) { // L: 93
						var0.writeByte(-11); // L: 94
					} catch (StreamCorruptedException var15) { // L: 96
						var0.writeByte(-12); // L: 97
					} catch (OptionalDataException var16) { // L: 99
						var0.writeByte(-13); // L: 100
					} catch (IllegalAccessException var17) { // L: 102
						var0.writeByte(-14); // L: 103
					} catch (IllegalArgumentException var18) { // L: 105
						var0.writeByte(-15); // L: 106
					} catch (InvocationTargetException var19) { // L: 108
						var0.writeByte(-16); // L: 109
					} catch (SecurityException var20) { // L: 111
						var0.writeByte(-17); // L: 112
					} catch (IOException var21) { // L: 114
						var0.writeByte(-18); // L: 115
					} catch (NullPointerException var22) { // L: 117
						var0.writeByte(-19); // L: 118
					} catch (Exception var23) { // L: 120
						var0.writeByte(-20); // L: 121
					} catch (Throwable var24) { // L: 123
						var0.writeByte(-21); // L: 124
					}
				}
			}

			var0.writeCrc(var2); // L: 127
			var1.remove(); // L: 128
		}
	} // L: 129
}
