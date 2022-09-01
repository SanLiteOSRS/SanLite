import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public class class360 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	public static final class360 field4257;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	static final class360 field4256;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1324921489
	)
	final int field4258;

	static {
		field4257 = new class360(0); // L: 5
		field4256 = new class360(1); // L: 6
	}

	class360(int var1) {
		this.field4258 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILnk;Lln;I)V",
		garbageValue = "248614131"
	)
	static void method6484(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field3970 == 0) { // L: 28
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 31
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field3970 = 600; // L: 34
		}
	} // L: 37

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "185486591"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class268.Client_plane][var0][var1]; // L: 7830
		if (var2 == null) { // L: 7831
			class12.scene.removeGroundItemPile(class268.Client_plane, var0, var1); // L: 7832
		} else {
			long var3 = -99999999L; // L: 7835
			TileItem var5 = null; // L: 7836

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7837 7838 7846
				ItemComposition var7 = AttackOption.ItemComposition_get(var6.id); // L: 7839
				long var11 = (long)var7.price; // L: 7840
				if (var7.isStackable == 1) { // L: 7841
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 7842
					var3 = var11; // L: 7843
					var5 = var6; // L: 7844
				}
			}

			if (var5 == null) { // L: 7848
				class12.scene.removeGroundItemPile(class268.Client_plane, var0, var1); // L: 7849
			} else {
				var2.addLast(var5); // L: 7852
				TileItem var13 = null; // L: 7853
				TileItem var8 = null; // L: 7854

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 7855 7856 7861
					if (var5.id != var6.id) { // L: 7857
						if (var13 == null) { // L: 7858
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 7859
							var8 = var6;
						}
					}
				}

				long var9 = GroundObject.calculateTag(var0, var1, 3, false, 0); // L: 7863
				class12.scene.newGroundItemPile(class268.Client_plane, var0, var1, ObjectComposition.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class268.Client_plane), var5, var9, var13, var8); // L: 7864
			}
		}
	} // L: 7833 7850 7865
}
