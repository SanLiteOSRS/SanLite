import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "[Lbh;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class223.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I[BLlp;I)V",
		garbageValue = "2116323284"
	)
	static void method872(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		ItemLayer.method3271();
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		signature = "(ZB)V",
		garbageValue = "-92"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1258 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = AttackOption.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					WorldMapArea.scene.drawEntity(class26.Client_plane, var2.x, var2.y, UserComparator7.getTileHeight(var2.field1258 * 64 - 64 + var2.x, var2.field1258 * 64 - 64 + var2.y, class26.Client_plane), var2.field1258 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
