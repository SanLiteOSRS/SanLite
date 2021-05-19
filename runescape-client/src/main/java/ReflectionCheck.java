import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = -356398607
	)
	static int field580;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1554578149
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1363104517
	)
	@Export("size")
	int size;
	@ObfuscatedName("o")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("g")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("l")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("z")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("t")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("v")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-491303444"
	)
	static int method1158(int var0, int var1) {
		FloorOverlayDefinition var2 = WorldMapSection0.method3534(var0);
		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else {
			int var3;
			if (var2.texture >= 0) {
				var3 = AbstractUserComparator.method5592(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = class374.method6359(var2.hue, var2.saturation, var2.lightness);
				int var4 = AbstractUserComparator.method5592(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "54"
	)
	public static int method1159(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1090752465"
	)
	static void method1157() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class12.clientPreferences.rememberedUsername != null) {
				Login.Login_username = class12.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
