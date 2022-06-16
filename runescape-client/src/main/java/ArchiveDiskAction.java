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
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("kv")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1477037843
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V",
		garbageValue = "206933702"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 35
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1685326414"
	)
	public static String method5777(String var0) {
		int var1 = var0.length(); // L: 167
		char[] var2 = new char[var1]; // L: 168
		byte var3 = 2; // L: 169

		for (int var4 = 0; var4 < var1; ++var4) { // L: 170
			char var5 = var0.charAt(var4); // L: 171
			if (var3 == 0) { // L: 172
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) { // L: 173
				var5 = class326.method6050(var5);
			}

			if (Character.isLetter(var5)) { // L: 174
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') { // L: 175
				if (Character.isSpaceChar(var5)) { // L: 176
					if (var3 != 2) { // L: 177
						var3 = 1;
					}
				} else {
					var3 = 1; // L: 179
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5; // L: 180
		}

		return new String(var2); // L: 182
	}
}
