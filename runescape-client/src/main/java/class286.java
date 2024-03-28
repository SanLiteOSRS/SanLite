import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class286 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static final class286 field3129;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	static final class286 field3128;
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field3130;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 393112575
	)
	@Export("value")
	final int value;

	static {
		field3129 = new class286(0); // L: 4
		field3128 = new class286(1); // L: 5
	}

	class286(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "-59"
	)
	public static void method5689(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "1452326065"
	)
	static boolean method5688(String var0, int var1) {
		return class360.method6859(var0, var1, "openjs"); // L: 50
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "([Lnt;II)V",
		garbageValue = "2042071131"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12027
			Widget var3 = var0[var2]; // L: 12028
			if (var3 != null) { // L: 12029
				if (var3.type == 0) { // L: 12030
					if (var3.children != null) { // L: 12031
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12032
					if (var4 != null) { // L: 12033
						Login.method2161(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 12035
					var5 = new ScriptEvent(); // L: 12036
					var5.widget = var3; // L: 12037
					var5.args = var3.onDialogAbort; // L: 12038
					AbstractWorldMapData.runScriptEvent(var5); // L: 12039
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 12041
					if (var3.childIndex >= 0) { // L: 12042
						Widget var6 = class243.field2620.method6281(var3.id); // L: 12043
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 12044
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 12048
					var5.widget = var3; // L: 12049
					var5.args = var3.onSubChange; // L: 12050
					AbstractWorldMapData.runScriptEvent(var5); // L: 12051
				}
			}
		}

	} // L: 12054
}
