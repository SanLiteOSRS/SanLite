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

@ObfuscatedName("mv")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field3548;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1904391139
	)
	int field3557;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	MusicPatchNode2 field3545;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1453854541
	)
	int field3553;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -498307473
	)
	int field3568;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1106342015
	)
	int field3551;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1299660053
	)
	int field3552;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -333556033
	)
	int field3549;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 167889727
	)
	int field3567;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -180870853
	)
	int field3550;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 757081216
	)
	int field3556;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -195124119
	)
	int field3566;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1597053387
	)
	int field3558;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1426969919
	)
	int field3559;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1250059833
	)
	int field3560;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -958429645
	)
	int field3561;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1476946873
	)
	int field3562;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 729467977
	)
	int field3564;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -425741649
	)
	int field3554;

	MusicPatchNode() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	void method6288() {
		this.table = null;
		this.rawSound = null;
		this.field3545 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "25"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 29
		if (var1 != null) { // L: 30
			int var2 = var0.offset; // L: 31
			var0.method9373(var1.id); // L: 32

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
							var0.method9373(var6); // L: 44
						} else if (var4 == 1) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 48
							var0.writeByte(0); // L: 49
						} else if (var4 == 2) { // L: 51
							var5 = var1.fields[var3]; // L: 52
							var6 = var5.getModifiers(); // L: 53
							var0.writeByte(0); // L: 54
							var0.method9373(var6); // L: 55
						}

						Method var25;
						if (var4 != 3) { // L: 57
							if (var4 == 4) { // L: 77
								var25 = var1.methods[var3]; // L: 78
								var6 = var25.getModifiers(); // L: 79
								var0.writeByte(0); // L: 80
								var0.method9373(var6); // L: 81
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
}
