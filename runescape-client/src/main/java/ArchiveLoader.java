import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1647691791
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 110039481
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lnv;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "650248761"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6681(var1) || this.archive.method6669(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltv;",
		garbageValue = "1891865156"
	)
	@Export("FillMode_values")
	public static class512[] FillMode_values() {
		return new class512[]{class512.field5096, class512.field5098, class512.SOLID}; // L: 15
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lni;IIB)[Ltt;",
		garbageValue = "18"
	)
	public static SpritePixels[] method2219(AbstractArchive var0, int var1, int var2) {
		return !WorldMapAreaData.method5599(var0, var1, var2) ? null : class133.method3025(); // L: 28 29
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "1998235968"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 92
		if (var3) { // L: 93
			var5 |= 65536L;
		}

		return var5; // L: 94
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2007446528"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4893
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4894
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4895
				int var3 = var2.x >> 7; // L: 4896
				int var4 = var2.y >> 7; // L: 4897
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4898
					if (var2.field1147 * -201388032 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4899
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4900
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4901
					}

					long var5 = calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4903
					var2.playerCycle = Client.cycle; // L: 4904
					UserComparator4.scene.drawEntity(NetFileRequest.Client_plane, var2.x, var2.y, class208.getTileHeight(var2.field1147 * -3932160 - 64 + var2.x, var2.field1147 * -3932160 - 64 + var2.y, NetFileRequest.Client_plane), var2.field1147 * -3932160 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4905
				}
			}
		}

	} // L: 4909

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Lmo;III)V",
		garbageValue = "956556823"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11705
			if (var0 != null) { // L: 11707
				Widget var5 = var0; // L: 11711
				int var6 = class454.method8347(class209.getWidgetFlags(var0)); // L: 11713
				Widget var4;
				int var7;
				if (var6 == 0) { // L: 11714
					var4 = null; // L: 11715
				} else {
					var7 = 0;

					while (true) {
						if (var7 >= var6) {
							var4 = var5; // L: 11725
							break;
						}

						var5 = ArchiveDiskActionHandler.getWidget(var5.parentId); // L: 11719
						if (var5 == null) { // L: 11720
							var4 = null; // L: 11721
							break; // L: 11722
						}

						++var7; // L: 11718
					}
				}

				Widget var8 = var4; // L: 11727
				if (var4 == null) { // L: 11728
					var8 = var0.parent;
				}

				if (var8 != null) { // L: 11731
					Client.clickedWidget = var0; // L: 11735
					var5 = var0; // L: 11739
					var6 = class454.method8347(class209.getWidgetFlags(var0)); // L: 11741
					if (var6 == 0) { // L: 11742
						var4 = null; // L: 11743
					} else {
						var7 = 0;

						while (true) {
							if (var7 >= var6) {
								var4 = var5; // L: 11753
								break;
							}

							var5 = ArchiveDiskActionHandler.getWidget(var5.parentId); // L: 11747
							if (var5 == null) { // L: 11748
								var4 = null; // L: 11749
								break; // L: 11750
							}

							++var7; // L: 11746
						}
					}

					var8 = var4; // L: 11755
					if (var4 == null) { // L: 11756
						var8 = var0.parent;
					}

					Client.clickedWidgetParent = var8; // L: 11759
					Client.widgetClickX = var1; // L: 11760
					Client.widgetClickY = var2; // L: 11761
					class302.widgetDragDuration = 0; // L: 11762
					Client.isDraggingWidget = false; // L: 11763
					int var9 = FontName.method8640(); // L: 11764
					if (var9 != -1) { // L: 11765
						class402.tempMenuAction = new MenuAction(); // L: 11766
						class402.tempMenuAction.param0 = Client.menuArguments1[var9]; // L: 11767
						class402.tempMenuAction.param1 = Client.menuArguments2[var9]; // L: 11768
						class402.tempMenuAction.opcode = Client.menuOpcodes[var9]; // L: 11769
						class402.tempMenuAction.identifier = Client.menuIdentifiers[var9]; // L: 11770
						class402.tempMenuAction.field872 = Client.field632[var9]; // L: 11771
						class402.tempMenuAction.field873 = Client.menuActions[var9]; // L: 11772
						class402.tempMenuAction.field868 = Client.menuTargets[var9]; // L: 11773
					}

					return; // L: 11775
				}
			}

		}
	} // L: 11733
}
