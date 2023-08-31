import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("sh")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 820704441
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1471748283
	)
	@Export("size")
	int size;
	@ObfuscatedName("ao")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("at")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ac")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ai")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("az")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ap")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	} // L: 17

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmi;II)V",
		garbageValue = "-1454269975"
	)
	public static void method710(Widget var0, int var1) {
		ItemComposition var2 = InvDefinition.ItemComposition_get(var1); // L: 1037
		var0.field3704.equipment[var2.maleModel] = var1 + 512; // L: 1038
		if (var2.maleModel1 != -1) { // L: 1039
			var0.field3704.equipment[var2.maleModel1] = 0; // L: 1040
		}

		if (var2.maleModel2 != -1) { // L: 1042
			var0.field3704.equipment[var2.maleModel2] = 0; // L: 1043
		}

		var0.field3704.method6072(); // L: 1045
	} // L: 1046
}
