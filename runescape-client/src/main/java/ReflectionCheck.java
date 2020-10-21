import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1592667411
	)
	static int field1364;
	@ObfuscatedName("go")
	@ObfuscatedSignature(
		signature = "[Lls;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1209180911
	)
	@Export("id")
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2142089503
	)
	@Export("size")
	int size;
	@ObfuscatedName("s")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("t")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("i")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("o")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("x")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("w")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "947123708"
	)
	static final void method2380() {
		Client.field871 = Client.cycleCntr;
		class8.ClanChat_inClanChat = true;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		signature = "(Lhq;I)Lhq;",
		garbageValue = "-697509377"
	)
	static Widget method2381(Widget var0) {
		int var2 = WorldMapIcon_0.getWidgetClickMask(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = TileItem.getWidget(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
