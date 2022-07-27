import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
public class class258 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lge;",
		garbageValue = "191798603"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemComposition_archive.takeFile(10, var0); // L: 86
			var1 = new ItemComposition(); // L: 87
			var1.id = var0; // L: 88
			if (var2 != null) { // L: 89
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 90
			if (var1.noteTemplate != -1) { // L: 91
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 92
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 93
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 97
					var1.groundActions[var3] = null; // L: 98
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 100
					if (var3 != 4) { // L: 101
						var1.inventoryActions[var3] = null; // L: 102
					}
				}

				var1.shiftClickIndex = -2; // L: 105
				var1.team = 0; // L: 106
				if (var1.params != null) { // L: 107
					boolean var6 = false; // L: 108

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 109
						ParamComposition var5 = class238.getParamDefinition((int)var4.key); // L: 110
						if (var5.autoDisable) { // L: 111
							var4.remove();
						} else {
							var6 = true; // L: 112
						}
					}

					if (!var6) {
						var1.params = null; // L: 114
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 117
			return var1; // L: 118
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-228948511"
	)
	public static final void method5186(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 45
			class301.field3595 = var0; // L: 46
			PcmPlayer.PcmPlayer_stereo = var1; // L: 47
			class354.field4242 = var2; // L: 48
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 49

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcd;",
		garbageValue = "177968651"
	)
	static final InterfaceParent method5185(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 11981
		var3.group = var1; // L: 11982
		var3.type = var2; // L: 11983
		Client.interfaceParents.put(var3, (long)var0); // L: 11984
		WorldMapIcon_0.Widget_resetModelFrames(var1); // L: 11985
		Widget var4 = FloorUnderlayDefinition.getWidget(var0); // L: 11986
		class220.invalidateWidget(var4); // L: 11987
		if (Client.meslayerContinueWidget != null) { // L: 11988
			class220.invalidateWidget(Client.meslayerContinueWidget); // L: 11989
			Client.meslayerContinueWidget = null; // L: 11990
		}

		class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 11992
		KeyHandler.runWidgetOnLoadListener(var1); // L: 11993
		if (Client.rootInterface != -1) { // L: 11994
			class220.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 11995
	}
}
