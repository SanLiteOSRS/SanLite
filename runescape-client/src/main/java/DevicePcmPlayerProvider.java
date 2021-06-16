import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class60 {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("scene")
	static Scene scene;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "2087332852"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lbk;",
		garbageValue = "-11"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return Client.getNextWorldListWorld();
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2111274300"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1225 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = UserComparator3.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					scene.drawEntity(SoundSystem.Client_plane, var2.x, var2.y, ItemContainer.getTileHeight(var2.field1225 * 64 - 64 + var2.x, var2.field1225 * 64 - 64 + var2.y, SoundSystem.Client_plane), var2.field1225 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "552902364"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class250.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					ApproximateRouteStrategy.foundItemIdCount = -1;
					ClanChannel.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		ClanChannel.foundItemIds = var2;
		PcmPlayer.foundItemIndex = 0;
		ApproximateRouteStrategy.foundItemIdCount = var3;
		String[] var8 = new String[ApproximateRouteStrategy.foundItemIdCount];

		for (int var5 = 0; var5 < ApproximateRouteStrategy.foundItemIdCount; ++var5) {
			var8[var5] = class250.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = ClanChannel.foundItemIds;
		class281.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
