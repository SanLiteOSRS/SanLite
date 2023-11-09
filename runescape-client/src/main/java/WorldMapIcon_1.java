import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("jm")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 965328937
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 123495399
	)
	@Export("element")
	int element;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1147101683
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -503730511
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lms;Lms;ILjz;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4; // L: 19
		this.init();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-420560019"
	)
	@Export("init")
	void init() {
		this.element = class59.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class147.WorldMapElement_get(this.element)); // L: 25
		WorldMapElement var1 = class147.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "530307957"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1960611596"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 50
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1025662810"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-977709388"
	)
	static int method5053(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1505632609"
	)
	static final void method5057(String var0) {
		PacketBufferNode var1 = class251.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher); // L: 178
		var1.packetBuffer.writeByte(class298.stringCp1252NullTerminatedByteSize(var0)); // L: 179
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 180
		Client.packetWriter.addNode(var1); // L: 181
	} // L: 182

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lmo;B)V",
		garbageValue = "49"
	)
	static final void method5070(Widget var0) {
		if (var0.buttonType == 1) { // L: 11032
			class150.method3163(var0.field3738, "", 24, 0, 0, var0.id, var0.itemId); // L: 11033
		}

		String var1;
		if (var0.buttonType == 2 && !Client.isSpellSelected) { // L: 11036
			var1 = class92.Widget_getSpellActionName(var0); // L: 11037
			if (var1 != null) { // L: 11038
				class150.method3163(var1, class396.colorStartTag(65280) + var0.field3737, 25, 0, -1, var0.id, var0.itemId); // L: 11039
			}
		}

		if (var0.buttonType == 3) { // L: 11043
			class388.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id); // L: 11044
		}

		if (var0.buttonType == 4) { // L: 11047
			class388.insertMenuItemNoShift(var0.field3738, "", 28, 0, 0, var0.id); // L: 11048
		}

		if (var0.buttonType == 5) { // L: 11051
			class388.insertMenuItemNoShift(var0.field3738, "", 29, 0, 0, var0.id); // L: 11052
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) { // L: 11055
			class388.insertMenuItemNoShift(var0.field3738, "", 30, 0, -1, var0.id); // L: 11056
		}

		if (var0.isIf3) { // L: 11059
			int var2;
			if (Client.isSpellSelected) { // L: 11060
				var2 = class209.getWidgetFlags(var0); // L: 11062
				boolean var6 = (var2 >> 21 & 1) != 0; // L: 11064
				if (var6 && (SoundCache.selectedSpellFlags & 32) == 32) { // L: 11066
					class150.method3163(Client.field543, Client.field649 + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId); // L: 11067
				}
			} else {
				for (int var13 = 9; var13 >= 5; --var13) { // L: 11072
					int var4 = class209.getWidgetFlags(var0); // L: 11076
					boolean var3 = (var4 >> var13 + 1 & 1) != 0; // L: 11078
					String var9;
					if (!var3 && var0.onOp == null) { // L: 11080
						var9 = null; // L: 11081
					} else if (var0.actions != null && var0.actions.length > var13 && var0.actions[var13] != null && var0.actions[var13].trim().length() != 0) { // L: 11084
						var9 = var0.actions[var13]; // L: 11088
					} else {
						var9 = null; // L: 11085
					}

					if (var9 != null) { // L: 11091
						class150.method3163(var9, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id, var0.itemId); // L: 11092
					}
				}

				var1 = class92.Widget_getSpellActionName(var0); // L: 11096
				if (var1 != null) { // L: 11097
					class150.method3163(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId); // L: 11098
				}

				for (var2 = 4; var2 >= 0; --var2) { // L: 11101
					int var5 = class209.getWidgetFlags(var0); // L: 11105
					boolean var12 = (var5 >> var2 + 1 & 1) != 0; // L: 11107
					String var7;
					if (!var12 && var0.onOp == null) { // L: 11109
						var7 = null; // L: 11110
					} else if (var0.actions != null && var0.actions.length > var2 && var0.actions[var2] != null && var0.actions[var2].trim().length() != 0) { // L: 11113
						var7 = var0.actions[var2]; // L: 11117
					} else {
						var7 = null; // L: 11114
					}

					if (var7 != null) { // L: 11120
						TileItem.method2645(var7, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry); // L: 11121
					}
				}

				int var11 = class209.getWidgetFlags(var0); // L: 11126
				boolean var10 = (var11 & 1) != 0; // L: 11128
				if (var10) { // L: 11130
					class388.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id); // L: 11131
				}
			}
		}

	} // L: 11136

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "32768"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11143
	}
}
