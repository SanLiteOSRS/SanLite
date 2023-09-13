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

@ObfuscatedName("jg")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	static Widget field2808;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2075388299
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -694483885
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2061815829
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1181081207
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1843786241
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ai")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1448639709
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILru;Lnk;B)V",
		garbageValue = "7"
	)
	static void method4922(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 21
		var3.type = 1; // L: 22
		var3.key = (long)var0; // L: 23
		var3.archiveDisk = var1; // L: 24
		var3.archive = var2; // L: 25
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 26
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 27
		} // L: 28

		UserComparator8.method2866();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lto;I)V",
		garbageValue = "1309449245"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 29
		if (var1 != null) { // L: 30
			int var2 = var0.offset; // L: 31
			var0.writeInt(var1.id); // L: 32

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 33
				if (var1.creationErrors[var3] != 0) { // L: 34
					var0.writeByte(var1.creationErrors[var3]); // L: 35
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 39
						Field var5;
						int var6;
						if (var4 == 0) { // L: 40
							var5 = var1.fields[var3]; // L: 41
							var6 = Reflection.getInt(var5, (Object)null); // L: 42
							var0.writeByte(0); // L: 43
							var0.writeInt(var6); // L: 44
						} else if (var4 == 1) {
							var5 = var1.fields[var3]; // L: 47
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 48
							var0.writeByte(0); // L: 49
						} else if (var4 == 2) { // L: 51
							var5 = var1.fields[var3]; // L: 52
							var6 = var5.getModifiers(); // L: 53
							var0.writeByte(0); // L: 54
							var0.writeInt(var6); // L: 55
						}

						Method var25;
						if (var4 != 3) { // L: 57
							if (var4 == 4) { // L: 77
								var25 = var1.methods[var3]; // L: 78
								var6 = var25.getModifiers(); // L: 79
								var0.writeByte(0); // L: 80
								var0.writeInt(var6); // L: 81
							}
						} else {
							var25 = var1.methods[var3]; // L: 58
							byte[][] var10 = var1.arguments[var3]; // L: 59
							Object[] var7 = new Object[var10.length]; // L: 60

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 61
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 62
								var7[var8] = var9.readObject(); // L: 63
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 65
							if (var11 == null) { // L: 66
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 67
								var0.writeByte(1); // L: 68
								var0.writeLong(((Number)var11).longValue()); // L: 69
							} else if (var11 instanceof String) { // L: 71
								var0.writeByte(2); // L: 72
								var0.writeStringCp1252NullTerminated((String)var11); // L: 73
							} else {
								var0.writeByte(4); // L: 75
							}
						}
					} catch (ClassNotFoundException var13) { // L: 84
						var0.writeByte(-10); // L: 85
					} catch (InvalidClassException var14) { // L: 87
						var0.writeByte(-11); // L: 88
					} catch (StreamCorruptedException var15) { // L: 90
						var0.writeByte(-12); // L: 91
					} catch (OptionalDataException var16) { // L: 93
						var0.writeByte(-13); // L: 94
					} catch (IllegalAccessException var17) { // L: 96
						var0.writeByte(-14); // L: 97
					} catch (IllegalArgumentException var18) { // L: 99
						var0.writeByte(-15); // L: 100
					} catch (InvocationTargetException var19) { // L: 102
						var0.writeByte(-16); // L: 103
					} catch (SecurityException var20) { // L: 105
						var0.writeByte(-17); // L: 106
					} catch (IOException var21) { // L: 108
						var0.writeByte(-18); // L: 109
					} catch (NullPointerException var22) { // L: 111
						var0.writeByte(-19); // L: 112
					} catch (Exception var23) { // L: 114
						var0.writeByte(-20); // L: 115
					} catch (Throwable var24) { // L: 117
						var0.writeByte(-21); // L: 118
					}
				}
			}

			var0.writeCrc(var2); // L: 121
			var1.remove(); // L: 122
		}
	} // L: 123

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1859445774"
	)
	static char method4921(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0; // L: 45 46
	}
}
