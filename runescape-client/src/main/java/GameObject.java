import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("hz")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1006788737
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 537985055
	)
	@Export("height")
	int height;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1950826709
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1652041871
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1185454061
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -982826151
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1670448045
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 470621493
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -994471517
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -296238485
	)
	int field2543;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1322032331
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 6995464757226252125L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1823541423
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "8"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = class34.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class34.loadClassFromDescriptor(var20);
						if (class34.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = class34.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var21.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var21[var19] != var17[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (class34.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class34.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class69.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;Ljava/lang/String;B)[Lof;",
		garbageValue = "-66"
	)
	public static IndexedSprite[] method4235(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return WorldMapDecoration.method3571(var0, var3, var4);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-36"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "10491"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
