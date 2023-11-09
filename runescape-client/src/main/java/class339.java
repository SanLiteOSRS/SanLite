import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public enum class339 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	field3820(0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	field3818(1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	field3819(2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	field3821(3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	field3817(4);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1132792781
	)
	final int field3822;

	class339(int var3) {
		this.field3822 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3822; // L: 19
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lds;",
		garbageValue = "-800562138"
	)
	static final InterfaceParent method6591(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12403
		var3.group = var1; // L: 12404
		var3.type = var2; // L: 12405
		Client.interfaceParents.put(var3, (long)var0); // L: 12406
		class19.Widget_resetModelFrames(var1); // L: 12407
		Widget var4 = class92.getWidget(var0); // L: 12408
		class218.invalidateWidget(var4); // L: 12409
		if (Client.meslayerContinueWidget != null) { // L: 12410
			class218.invalidateWidget(Client.meslayerContinueWidget); // L: 12411
			Client.meslayerContinueWidget = null; // L: 12412
		}

		Login.revalidateWidgetScroll(PacketBufferNode.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12414
		class217.runWidgetOnLoadListener(var1); // L: 12415
		if (Client.rootInterface != -1) { // L: 12416
			class385.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12417
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	static void method6595(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12670
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 12671
				var1.remove(); // L: 12672
			}
		}

	} // L: 12675
}
