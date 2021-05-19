import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bu")
	public static String field3295;
	@ObfuscatedName("cl")
	public static String field3334;
	@ObfuscatedName("jj")
	public static String field3439;
	@ObfuscatedName("jg")
	public static String field3503;
	@ObfuscatedName("ji")
	public static String field3512;

	static {
		field3295 = "Please visit the support page for assistance.";
		field3334 = "Please visit the support page for assistance.";
		field3439 = "";
		field3503 = "Page has opened in a new window.";
		field3512 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lez;",
		garbageValue = "1535423962"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!BufferedNetSocket.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				var1.name = "Members object";
				var1.isTradable = false;
				var1.groundActions = null;
				var1.inventoryActions = null;
				var1.shiftClickIndex = -1;
				var1.team = 0;
				if (var1.params != null) {
					boolean var3 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = WorldMapElement.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var3 = true;
						}
					}

					if (!var3) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1449127026"
	)
	static final void method4801(int var0, int var1, int var2, boolean var3) {
		if (UserComparator8.loadInterface(var0)) {
			Login.resizeInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
