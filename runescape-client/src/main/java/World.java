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

@ObfuscatedName("cc")
@Implements("World")
public class World {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lcc;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2005424633
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1068575443
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ak")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ae")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1171930841
	)
	@Export("id")
	int id;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1345521747
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -716684625
	)
	@Export("population")
	int population;
	@ObfuscatedName("ad")
	@Export("host")
	String host;
	@ObfuscatedName("ac")
	@Export("activity")
	String activity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1977312229
	)
	@Export("location")
	int location;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 350325751
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "789370022"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (65536 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1035025777"
	)
	boolean method1750() {
		return (2 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-39"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1612225517"
	)
	boolean method1752() {
		return (8 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1274309734"
	)
	boolean method1747() {
		return (536870912 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "7960"
	)
	boolean method1755() {
		return (1073741824 & this.properties) != 0; // L: 285
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1962683678"
	)
	boolean method1756() {
		return (256 & this.properties) != 0; // L: 289
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method1757() {
		return (134217728 & this.properties) != 0; // L: 293
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;I)Z",
		garbageValue = "-1800969327"
	)
	public static boolean method1798(AbstractArchive var0, AbstractArchive var1) {
		class410.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) { // L: 45
			return false;
		} else {
			class11.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[class11.WorldMapElement_count];

			for (int var2 = 0; var2 < class11.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method3591();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1405846377"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id); // L: 32

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) { // L: 34
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) { // L: 40
							var5 = var1.fields[var3]; // L: 41
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0); // L: 43
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3]; // L: 47
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 48
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3]; // L: 52
							var6 = var5.getModifiers(); // L: 53
							var0.writeByte(0); // L: 54
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) { // L: 77
								var25 = var1.methods[var3]; // L: 78
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3]; // L: 58
							byte[][] var10 = var1.arguments[var3]; // L: 59
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 61
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject(); // L: 63
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 65
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 67
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue()); // L: 69
							} else if (var11 instanceof String) { // L: 71
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11); // L: 73
							} else {
								var0.writeByte(4); // L: 75
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10); // L: 85
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) { // L: 90
						var0.writeByte(-12); // L: 91
					} catch (OptionalDataException var16) { // L: 93
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14); // L: 97
					} catch (IllegalArgumentException var18) { // L: 99
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16); // L: 103
					} catch (SecurityException var20) { // L: 105
						var0.writeByte(-17);
					} catch (IOException var21) { // L: 108
						var0.writeByte(-18);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "202686528"
	)
	static void method1753(float[] var0) {
		if (var0[0] + class125.field1463 < 1.3333334F) { // L: 322
			float var1 = var0[0] - 2.0F; // L: 323
			float var2 = var0[0] - 1.0F; // L: 324
			float var3 = (float)Math.sqrt((double)(var1 * var1 - 4.0F * var2 * var2)); // L: 325
			float var4 = (var3 + -var1) * 0.5F; // L: 326
			if (var0[1] + class125.field1463 > var4) { // L: 327
				var0[1] = var4 - class125.field1463; // L: 328
			} else {
				var4 = 0.5F * (-var1 - var3); // L: 331
				if (var0[1] < var4 + class125.field1463) { // L: 332
					var0[1] = var4 + class125.field1463; // L: 333
				}
			}
		} else {
			var0[0] = 1.3333334F - class125.field1463; // L: 338
			var0[1] = 0.33333334F - class125.field1463; // L: 339
		}

	} // L: 341

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)D",
		garbageValue = "-4"
	)
	static double method1801(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 84
			case 1:
				return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D); // L: 35
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 96
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D; // L: 94
			case 4:
				return var3 * var3; // L: 64
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 106
			case 6:
				return var3 < 0.5D ? 2.0D * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D) / 2.0D; // L: 70
			case 7:
				return var3 * var3 * var3; // L: 72
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 104
			case 9:
				return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 3.0D) / 2.0D; // L: 102
			case 10:
				return var3 * var3 * var3 * var3; // L: 74
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 66
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 4.0D) / 2.0D; // L: 92
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 100
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 44
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 5.0D) / 2.0D; // L: 76
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 46
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3); // L: 42
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, var3 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + -20.0D * var3)) / 2.0D; // L: 62
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 68
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 60
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D; // L: 98
			case 22:
				var5 = 1.70158D; // L: 79
				var7 = 2.70158D; // L: 80
				return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3; // L: 81
			case 23:
				var5 = 1.70158D; // L: 49
				var7 = 2.70158D; // L: 50
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 51
			case 24:
				var5 = 1.70158D; // L: 55
				var7 = 2.5949095D; // L: 56
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * (3.5949095D * (2.0D * var3 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D; // L: 57
			case 25:
				var5 = 2.0943951023931953D; // L: 38
				return -Math.pow(2.0D, 10.0D * var3 - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D); // L: 39
			case 26:
				var5 = 2.0943951023931953D; // L: 109
				return Math.pow(2.0D, var3 * -10.0D) * Math.sin((10.0D * var3 - 0.75D) * 2.0943951023931953D) + 1.0D; // L: 110
			case 27:
				var5 = 1.3962634015954636D; // L: 87
				var7 = Math.sin(1.3962634015954636D * (20.0D * var3 - 11.125D)); // L: 88
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, -20.0D * var3 + 10.0D) * var7 / 2.0D + 1.0D; // L: 89
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
