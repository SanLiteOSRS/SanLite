import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("AttackOption")
public enum AttackOption implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1303(2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	field1307(4);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1074537579
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12294
	} // L: 12295

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12299
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "29"
	)
	static boolean method2656(String var0) {
		if (var0 == null) { // L: 65
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 72
			} catch (MalformedURLException var2) { // L: 69
				return false; // L: 70
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1961239650"
	)
	public static int method2661(int var0) {
		return class439.field4718[var0 & 16383]; // L: 33
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldi;",
		garbageValue = "-1618920051"
	)
	static final InterfaceParent method2660(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11788
		var3.group = var1; // L: 11789
		var3.type = var2; // L: 11790
		Client.interfaceParents.put(var3, (long)var0); // L: 11791
		class287.Widget_resetModelFrames(var1); // L: 11792
		Widget var4 = class165.getWidget(var0); // L: 11793
		class144.invalidateWidget(var4); // L: 11794
		if (Client.meslayerContinueWidget != null) { // L: 11795
			class144.invalidateWidget(Client.meslayerContinueWidget); // L: 11796
			Client.meslayerContinueWidget = null; // L: 11797
		}

		DecorativeObject.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11799
		class12.runWidgetOnLoadListener(var1); // L: 11800
		if (Client.rootInterface != -1) { // L: 11801
			class127.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11802
	}
}
