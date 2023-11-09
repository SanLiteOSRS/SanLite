import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ai")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12953

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lox;Lox;I)I",
		garbageValue = "688673048"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12956
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12957
				if (Client.worldId == var1.world) { // L: 12958
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12959
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12961
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12965
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12969
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2009619296"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = Login.method2150(var0); // L: 24
		int var2 = var1.baseVar; // L: 25
		int var3 = var1.startBit; // L: 26
		int var4 = var1.endBit; // L: 27
		int var5 = Varps.Varps_masks[var4 - var3]; // L: 28
		return Varps.Varps_main[var2] >> var3 & var5; // L: 29
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILrw;Lng;I)V",
		garbageValue = "2143371300"
	)
	static void method1239(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 33
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 34
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 35
				if ((long)var0 == var5.key && var1 == var5.archiveDisk && var5.type == 0) { // L: 36
					var3 = var5.data; // L: 37
					break; // L: 38
				}
			}
		}

		if (var3 != null) { // L: 42
			var2.load(var1, var0, var3, true); // L: 43
		} else {
			byte[] var4 = var1.read(var0); // L: 46
			var2.load(var1, var0, var4, true); // L: 47
		}
	} // L: 44 48

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-240114656"
	)
	static final void method1240() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12554
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12555
			var1.clearIsFriend(); // L: 12556
		}

		PendingSpawn.method2421(); // L: 12558
		if (ObjectSound.friendsChatManager != null) { // L: 12559
			ObjectSound.friendsChatManager.clearFriends(); // L: 12560
		}

	} // L: 12562
}
