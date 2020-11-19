import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		signature = "Liq;"
	)
	public static class248 field1895;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive18")
	static Archive archive18;

	ModelData0() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)Lcf;",
		garbageValue = "1326128676"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return FileSystem.getNextWorldListWorld();
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "-117"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		KeyHandler.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		signature = "(IIII)Lbs;",
		garbageValue = "1523932767"
	)
	static final InterfaceParent method3381(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		FontName.Widget_resetModelFrames(var1);
		Widget var4 = UserComparator4.getWidget(var0);
		GrandExchangeOfferOwnWorldComparator.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			GrandExchangeOfferOwnWorldComparator.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		for (int var5 = 0; var5 < Client.menuOptionsCount; ++var5) {
			if (DynamicObject.method2362(Client.menuOpcodes[var5])) {
				if (var5 < Client.menuOptionsCount - 1) {
					for (int var6 = var5; var6 < Client.menuOptionsCount - 1; ++var6) {
						Client.menuActions[var6] = Client.menuActions[var6 + 1];
						Client.menuTargets[var6] = Client.menuTargets[var6 + 1];
						Client.menuOpcodes[var6] = Client.menuOpcodes[var6 + 1];
						Client.menuIdentifiers[var6] = Client.menuIdentifiers[var6 + 1];
						Client.menuArguments1[var6] = Client.menuArguments1[var6 + 1];
						Client.menuArguments2[var6] = Client.menuArguments2[var6 + 1];
						Client.menuShiftClick[var6] = Client.menuShiftClick[var6 + 1];
					}
				}

				--var5;
				--Client.menuOptionsCount;
			}
		}

		ItemLayer.method2908();
		UserComparator9.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		ScriptFrame.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			WorldMapAreaData.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
